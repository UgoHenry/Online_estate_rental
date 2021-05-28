package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryOnlinePortal {
    private EntityManager em;

    public RepositoryOnlinePortal() {
        em = DBUtil.getEntityManager();
    }

    public void UploadPaidAdvert(){

    }
}
