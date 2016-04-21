
package bl;

import ejb.Statusi;
import java.util.List;
import javax.persistence.Query;

public class StatusiRepository extends EntMngClass implements StatusiInterface{

    @Override
    public void create(Statusi s) {
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    @Override
    public void edit(Statusi s) {
        em.getTransaction().begin();
        em.merge(s);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Statusi s) {
        em.getTransaction().begin();
        em.remove(s);
        em.getTransaction().commit();
    }

    @Override
    public List<Statusi> findAll() {
        return em.createNamedQuery("Statusi.findAll").getResultList();
    }

    @Override
    public Statusi findByID(int id) {
        Query query=em.createQuery("SELECT object(s) FROM Statusi s WHERE s.ID = :UBT");
        query.setParameter("UBT", id);
        return (Statusi)query.getSingleResult();
    }
    
}
