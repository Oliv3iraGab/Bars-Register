package br.com.bars_register.DAOClasses;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.bars_register.persistence.Usuario;
import br.com.bars_register.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class UsuarioDAO {
    
   public void salvarUsuario(Usuario usuario) {
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
         String jpql = "SELECT u FROM Usuario u";  // Simplified query
         TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
         List<Usuario> results = query.getResultList();
         usuarios.addAll(results);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os usuários: " + e.getMessage());
        } finally {
            em.close();
        }
        return usuarios;
   }

   public void excluirUsuario(String email) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            String jpql = "SELECT u FROM Usuario u WHERE u.email = :email";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            query.setParameter("email", email);
            Usuario usuarioEncontrado = query.getSingleResult();
            em.remove(usuarioEncontrado);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Erro ao excluir o usuário: " + e.getMessage()); 
        } finally {
            em.close(); 
        }
   }
   
   public static Usuario validarUsuario(String login, String senha) {
        String jql = "SELECT u FROM Usuario u WHERE u.login = :login";
        EntityManager em = JPAUtil.getEntityManager();
        try {
           TypedQuery<Usuario> query = em.createQuery(jql, Usuario.class); 
           query.setParameter("login", login);

           Usuario usuario = query.getSingleResult();
           
           try {
               if (org.mindrot.jbcrypt.BCrypt.checkpw(senha, usuario.getSenha())) {
                   if (!usuario.isStatus()) {
                       JOptionPane.showMessageDialog(null, "Usuário está inativo, fale com um administrador!");
                       return null;
                   }
                   return usuario;
               }
               JOptionPane.showMessageDialog(null, "Senha inválida!");
               return null;
           } catch (IllegalArgumentException e) {
               JOptionPane.showMessageDialog(null, "Erro na verificação da senha. Entre em contato com o administrador.");
               return null;
           }

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
    
    public void atualizarStatus(String nome, boolean novoStatus) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            
            String jpql = "UPDATE Usuario u SET u.status = :status WHERE u.nome = :nome";
            em.createQuery(jpql)
                .setParameter("status", novoStatus)
                .setParameter("nome", nome)
                .executeUpdate();
                
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Status atualizado com sucesso!");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Erro ao atualizar status: " + e.getMessage());
        } finally {
            em.close();
        }
    }
}
