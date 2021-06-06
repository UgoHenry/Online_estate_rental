package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryOnlinePortal {
    private EntityManager em;

    public RepositoryOnlinePortal() {
        em = DBUtil.getEntityManager();
    }

    public void updateOnlinePortal(int onlinePortalId, String uploadAdvert){
        em.getTransaction().begin();
        int result = em.createQuery("UPDATE OnlinePortal o SET o.uploadPaidAdvert = " +
                ":newValue WHERE o.onlinePortalId = :id")
                .setParameter("newValue", uploadAdvert)
                .setParameter("id", onlinePortalId).executeUpdate();
        if (result > 0){
            System.out.println("\nAdvert updated successfully");
        }
        em.getTransaction().commit();

    }
}
