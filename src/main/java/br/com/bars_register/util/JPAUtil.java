package br.com.bars_register.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class JPAUtil {

    // Constante para centralizar o nome da unidade de persistência
    private static final String PERSISTENCE_UNIT = "Bars-Register-PU";

    private static EntityManager em;
    private static EntityManagerFactory fabrica;

    /**
     * Cria a entidade
     *
     * @return entidade
     */
    public static EntityManager getEntityManager() {
        if (fabrica == null || !fabrica.isOpen()) {
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (em == null || !em.isOpen()) //cria se em nulo ou se o entity manager foi fechado
        {
            em = fabrica.createEntityManager();
        }

        return em;
    }

    /**
     * Fecha o EntityManager e o factory
     */
    public static void closeEtityManager() {
        if (em.isOpen() && em != null) {
            em.close();
            fabrica.close();
        }
    }
}
