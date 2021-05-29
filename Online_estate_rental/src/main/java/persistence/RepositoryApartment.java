package persistence;

import model.Apartment;
import model.ApartmentCustomised;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryApartment {
    private EntityManager em;

    public RepositoryApartment() {
        em = DBUtil.getEntityManager();

    }

    public List<ApartmentCustomised> listAvailableApartmentForRentWithNeighborhood(){
        String sql = "SELECT new model.ApartmentCustomised(a.apartmentId," +
                " a.apartmentDescription, a.neighborhood) FROM Apartment a";

        return em.createQuery(sql).getResultList();
    }

    public List<ApartmentCustomised> listApartmentForSellWithNeighborhoodAndPrice(){
        String sql = "SELECT new model.ApartmentCustomised(a.apartmentId," +
                " a.apartmentDescription, a.neighborhood, a.apartmentPrice) FROM Apartment a";
        return null;
    }
}
