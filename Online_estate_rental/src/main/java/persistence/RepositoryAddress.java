package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryAddress {
    private EntityManager em;

    public RepositoryAddress() {
        em = DBUtil.getEntityManager();
    }

    public void EnterAnAddress(){

    }

    public void EnterANeighborhood(){

    }

    public void EnterACity(){

    }

    public void EnterAPostalCode(){

    }


}
