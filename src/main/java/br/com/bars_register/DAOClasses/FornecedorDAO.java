package br.com.bars_register.DAOClasses;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.bars_register.persistence.Fornecedor;
import br.com.bars_register.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class FornecedorDAO {
    
    public void salvarFornecedor(Fornecedor f){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();  
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao salvar fornecedor: " + e.getMessage()); 
        } finally {
            em.close();
        }
    }

    public void atualizarFornecedor(Fornecedor f){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(f);
            em.getTransaction().commit(); 
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor: " + e.getMessage()); 
        } finally {
            em.close(); 
        }
    }

    public void excluirFornecedor(Fornecedor f){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            f = em.merge(f);
            em.remove(f);  
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor: " + e.getMessage()); 
        } finally {
            em.close();
        }
    }

    public List <Fornecedor> listarFornecedores(String nome){
        EntityManager em = JPAUtil.getEntityManager();
        List <Fornecedor> fornecedores = null;

        try {
            String jpql = "SELECT f FROM Fornecedor f";
            if (nome != null && !nome.isEmpty()) {
                jpql += " WHERE f.nome LIKE :nome";
            }

            TypedQuery<Fornecedor> query = em.createQuery(jpql, Fornecedor.class);
            if (nome!= null &&!nome.isEmpty()) {
                query.setParameter("nome", "%" + nome + "%");
            }

            fornecedores = query.getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar fornecedores: " + e.getMessage()); 
        } finally {
            em.close();
        }

        return fornecedores;
    }
}
