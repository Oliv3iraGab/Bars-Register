package br.com.bars_register.DAOClasses;

import java.time.LocalDateTime;
import java.util.List;

import javax.swing.JOptionPane;
import br.com.bars_register.persistence.Venda;
import br.com.bars_register.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import br.com.bars_register.persistence.ItemVenda;

public class VendaDAO {

    public void salvarVenda(Venda v) {
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

    public List<Venda> listarVendas() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Venda> vendas = null;

        try {
            String jpql = "SELECT v FROM Venda v ORDER BY v.dataVenda DESC";
            vendas = em.createQuery(jpql, Venda.class).getResultList();
            return vendas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar vendas: " + e.getMessage());
            return null;
        }
    }

    public double getTotalVendasHoje() {
        EntityManager em = JPAUtil.getEntityManager();
        double total = 0.0;

        try {
            java.time.LocalDateTime startOfDay = java.time.LocalDateTime.now().withHour(0).withMinute(0).withSecond(0);
            java.time.LocalDateTime endOfDay = java.time.LocalDateTime.now().withHour(23).withMinute(59).withSecond(59);

            String jpql = "SELECT SUM(v.total) FROM Venda v WHERE v.dataVenda BETWEEN :startOfDay AND :endOfDay";
            TypedQuery<Double> query = em.createQuery(jpql, Double.class);
            query.setParameter("startOfDay", startOfDay);
            query.setParameter("endOfDay", endOfDay);

            Double result = query.getSingleResult();
            if (result != null) {
                total = result;
            }
        } catch (Exception e) {
            System.err.println("Erro ao calcular total de vendas do dia: " + e.getMessage());
        } finally {
            em.close();
        }

        return total;
    }

    public double getTotalVendas() {
        EntityManager em = JPAUtil.getEntityManager();
        double total = 0.0;

        try {
            java.time.LocalDateTime startOfDay = java.time.LocalDateTime.now().withHour(0).withMinute(0).withSecond(0);
            java.time.LocalDateTime endOfDay = java.time.LocalDateTime.now().withHour(23).withMinute(59).withSecond(59);

            String jpql = "SELECT SUM(v.total) FROM Venda v";
            TypedQuery<Double> query = em.createQuery(jpql, Double.class);

            Double result = query.getSingleResult();
            if (result != null) {
                total = result;
            }
        } catch (Exception e) {
            System.err.println("Erro ao calcular total de vendas do dia: " + e.getMessage());
        } finally {
            em.close();
        }

        return total;
    }

    public List<Venda> buscarPorPeriodo(LocalDateTime dataInicial, LocalDateTime dataFinal) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Venda> vendas = null;

        try {
            String jpql = "SELECT v FROM Venda v WHERE v.dataVenda BETWEEN :dataInicial AND :dataFinal";
            TypedQuery<Venda> query = em.createQuery(jpql, Venda.class);
            query.setParameter("dataInicial", dataInicial);
            query.setParameter("dataFinal", dataFinal);
            vendas = query.getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar vendas: " + e.getMessage());
        } finally {
            em.close();
        }
        return vendas;
    }
}
