
package Classes;

import br.com.sistemarj.rjsistema.persistencia.JPAUtil;
import jakarta.persistence.EntityManager;

public class ClienteDAO {
    
    public void salvar(Cliente cliente) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        em.getTransaction().begin(); // Inicia
        em.persist(cliente);         // Prepara
        em.getTransaction().commit(); // Manda pro disco (CRUCIAL)
    } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback(); // Volta atrás se der erro
        }
        e.printStackTrace();
    } finally {
        em.close(); // Libera a conexão
    }
}
}
