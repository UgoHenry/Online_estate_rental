package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryAddress {
    private EntityManager em;

    public RepositoryAddress() {
        em = DBUtil.getEntityManager();
    }

    public void enterAnAddress(){

    }

    public void enterANeighborhood(){

    }

    public void enterACity(){

    }

    public void enterAPostalCode(){

    }


}
