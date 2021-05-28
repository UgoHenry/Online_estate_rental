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

    public List<Apartment> ListAvailableApartmentForRent(){

        return null;
    }

    public List<Apartment> ListAvailableApartmentForSale(){
        return null;
    }
}
