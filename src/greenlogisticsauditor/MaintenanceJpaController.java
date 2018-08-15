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
public class MaintenanceJpaController implements Serializable {

    public MaintenanceJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Maintenance maintenance) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(maintenance);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Maintenance maintenance) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            maintenance = em.merge(maintenance);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = maintenance.getMid();
                if (findMaintenance(id) == null) {
                    throw new NonexistentEntityException("The maintenance with id " + id + " no longer exists.");
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
            Maintenance maintenance;
            try {
                maintenance = em.getReference(Maintenance.class, id);
                maintenance.getMid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The maintenance with id " + id + " no longer exists.", enfe);
            }
            em.remove(maintenance);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Maintenance> findMaintenanceEntities() {
        return findMaintenanceEntities(true, -1, -1);
    }

    public List<Maintenance> findMaintenanceEntities(int maxResults, int firstResult) {
        return findMaintenanceEntities(false, maxResults, firstResult);
    }

    private List<Maintenance> findMaintenanceEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Maintenance.class));
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

    public Maintenance findMaintenance(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Maintenance.class, id);
        } finally {
            em.close();
        }
    }

    public int getMaintenanceCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Maintenance> rt = cq.from(Maintenance.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
