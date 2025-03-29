package br.com.bars_register.DAOClasses;

import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Entity;

import br.com.bars_register.persistence.Usuario;
import br.com.bars_register.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class UsuarioDAO {
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
