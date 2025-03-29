package br.com.bars_register.DAOClasses;

import br.com.bars_register.persistence.ItemVenda;
import br.com.bars_register.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class ItemVendaDAO {
    EntityManager em = JPAUtil.getEntityManager();

    public void cadastrarItemVenda(ItemVenda iv){
        try{
            em.getTransaction().begin();
            em.persist(iv);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
