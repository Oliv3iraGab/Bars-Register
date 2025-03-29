package br.com.bars_register.DAOClasses;

import java.util.List;

import javax.swing.JOptionPane;
import br.com.bars_register.persistence.Venda;
import br.com.bars_register.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class VendaDAO {

    public void salvarVenda(Venda v){
        EntityManager em = JPAUtil.getEntityManager(); 
        try {
            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao salvar venda: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public List<Venda> listarVendas(){
        EntityManager em = JPAUtil.getEntityManager();
        List<Venda> vendas = null;

        try {
            String jpql = "SELECT v FROM Venda v";
            vendas = em.createQuery(jpql, Venda.class).getResultList();
            return vendas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar vendas: " + e.getMessage());
            return null;
        }
    }
}
