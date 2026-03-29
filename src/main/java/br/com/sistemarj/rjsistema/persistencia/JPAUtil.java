package br.com.sistemarj.rjsistema.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    //constante para centralizar o nome da unidade de persistência
    // se o nome mudar, precisaremos alterar em um só lugar
    private static final String PERSISTENCE_UNIT = "RJSistema-PU";

    private static EntityManager manager;
    private static EntityManagerFactory factory;

    //cria a entidade se estiver nula e a retorna
    public static EntityManager conectar() {
        if (factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (manager == null || !manager.isOpen()) //cria se em nulo ou se o entity manager foi fechado
        {
            manager = factory.createEntityManager();
        }

        return manager;
    }
    
    public static EntityManager getEntityManager() {
        return conectar();
    }

    //fecha o EntityManager e o factory
    public static void desconectar() {
        if (manager != null && manager.isOpen()) {
            manager.close();
        }
        if (factory != null && factory.isOpen()) {
            factory.close();
        }
    }
}
