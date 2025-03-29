package br.com.bars_register.DAOClasses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.bars_register.persistence.Produto;
import br.com.bars_register.util.JPAUtil;

public class ProdutoDAO {
    
    public void  cadastrarProduto(Produto p){
        EntityManager em = JPAUtil.getEntityManager();      
        
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit(); 
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto: " + e.getMessage()); 
        } finally {
            em.close();
        }
    }

    public void excluirProduto(int id){
        EntityManager em = JPAUtil.getEntityManager();
        
        try {
            em.getTransaction().begin();
            Produto p = em.find(Produto.class, id);
            em.remove(p);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public void editarProduto(Produto p){
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();  
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao editar produto: " + e.getMessage()); 
        } finally {
            em.close();
        }
    }

    public List<Produto> listarProdutos(String produto){
        EntityManager em = JPAUtil.getEntityManager();
        List<Produto> produtos = null;

        try {
            String jpql = "SELECT p FROM Produto p";
            if (produto != null && !produto.isEmpty()) {
                jpql += " WHERE p.nome LIKE :nome"; 
            }

            TypedQuery<Produto> query = em.createQuery(jpql, Produto.class);
            
            if (produto != null && !produto.isEmpty()) {
               query.setParameter("nome", "%" + produto.trim() + "%"); 
            }

            produtos = query.getResultList();
        } catch (Exception e) {
           throw e; 
        } finally {
            em.close();
        }
        return produtos;
    }
}
