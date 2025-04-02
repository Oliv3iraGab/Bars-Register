package br.com.bars_register.DAOClasses;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.bars_register.persistence.Fornecedor;
import br.com.bars_register.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class FornecedorDAO {
    
    public void salvarFornecedor(Fornecedor novoFornecedor) {
        EntityManager em = JPAUtil.getEntityManager();      
        
        try {
            em.getTransaction().begin();
            
            String jpql = "SELECT f FROM Fornecedor f WHERE f.cnpj = :cnpj";
            TypedQuery<Fornecedor> query = em.createQuery(jpql, Fornecedor.class);
            query.setParameter("cnpj", novoFornecedor.getCnpj());
            
            try {
                Fornecedor fornecedorExistente = query.getSingleResult();
                fornecedorExistente.setNome(novoFornecedor.getNome());
                fornecedorExistente.setContato(novoFornecedor.getContato());
                fornecedorExistente.setEndereco(novoFornecedor.getEndereco());
                fornecedorExistente.setCnpj(novoFornecedor.getCnpj());
                em.merge(fornecedorExistente);
            } catch (Exception e) {
                em.persist(novoFornecedor);
            }
            
            em.getTransaction().commit(); 
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao salvar Fornecedor: " + e.getMessage()); 
        } finally {
            em.close();
        }
    }

    public void excluirFornecedor(String cnpj){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            String jpql = "SELECT f FROM Fornecedor f WHERE f.cnpj = :cnpj";
            TypedQuery<Fornecedor> query = em.createQuery(jpql, Fornecedor.class);
            query.setParameter("cnpj", cnpj);
            Fornecedor f = query.getSingleResult();
            em.remove(f);
            em.getTransaction().commit();
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
