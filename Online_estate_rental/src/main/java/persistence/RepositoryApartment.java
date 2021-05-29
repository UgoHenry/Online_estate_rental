package persistence;

import model.Apartment;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryApartment {
    private EntityManager em;

    public RepositoryApartment() {
        em = DBUtil.getEntityManager();

    }

    public List<Apartment> listAvailableApartmentForRent(){

        return null;
    }

    public List<Apartment> listAvailableApartmentForSale(){
        return null;
    }
}
