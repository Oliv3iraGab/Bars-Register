package br.com.bars_register.DAOClasses;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Entity;

import br.com.bars_register.persistence.Usuario;
import br.com.bars_register.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class UsuarioDAO {
    
   public static void salvarUsuario(Usuario usuario) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
           em.getTransaction().begin();
               em.persist(usuario);
           em.getTransaction().commit();
           JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro ao salvar o usuário: " + e.getMessage()); 
        } finally {
           em.close();
        }
   }

   public ArrayList<Usuario> listarUsuario() {
        EntityManager em = JPAUtil.getEntityManager();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try {
            String jpql = "SELECT u FROM Usuario u ORDER BY u.nome";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            usuarios = new ArrayList<>(query.getResultList());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os usuários: " + e.getMessage());
        } finally {
            em.close();
        }
        return usuarios;
   }

   
   public static Usuario validarUsuario(String login, String senha) {
        String jql = "SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha";
        EntityManager em = JPAUtil.getEntityManager();
        try {
           TypedQuery<Usuario> query = em.createQuery(jql, Usuario.class); 
           query.setParameter("login", login);
           query.setParameter("senha", senha);

           Usuario usuario = query.getSingleResult();

           return usuario;
        } catch (NoResultException e) {
           JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
           return null; 
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro ao validar usuário: " + e.getMessage());
           return null; 
        } finally {
           em.close();
        }
    }
}
