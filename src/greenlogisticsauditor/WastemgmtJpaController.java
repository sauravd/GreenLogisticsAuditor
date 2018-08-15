/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenlogisticsauditor;

import greenlogisticsauditor.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Saurav Dahal <www.sauravdahal.com>
 */
public class WastemgmtJpaController implements Serializable {

    public WastemgmtJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Wastemgmt wastemgmt) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(wastemgmt);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Wastemgmt wastemgmt) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            wastemgmt = em.merge(wastemgmt);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = wastemgmt.getWid();
                if (findWastemgmt(id) == null) {
                    throw new NonexistentEntityException("The wastemgmt with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Wastemgmt wastemgmt;
            try {
                wastemgmt = em.getReference(Wastemgmt.class, id);
                wastemgmt.getWid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The wastemgmt with id " + id + " no longer exists.", enfe);
            }
            em.remove(wastemgmt);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Wastemgmt> findWastemgmtEntities() {
        return findWastemgmtEntities(true, -1, -1);
    }

    public List<Wastemgmt> findWastemgmtEntities(int maxResults, int firstResult) {
        return findWastemgmtEntities(false, maxResults, firstResult);
    }

    private List<Wastemgmt> findWastemgmtEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Wastemgmt.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Wastemgmt findWastemgmt(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Wastemgmt.class, id);
        } finally {
            em.close();
        }
    }

    public int getWastemgmtCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Wastemgmt> rt = cq.from(Wastemgmt.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
