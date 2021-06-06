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
        return em.createQuery(sql).getResultList();
    }

    public List<Object[]> listNumberOfApartmentWithAmenities(){
        String sql = "SELECT count(a.apartmentAmenities), a.apartmentAmenities " +
                "FROM Apartment a GROUP BY a.apartmentAmenities";
        return em.createQuery(sql).getResultList();
    }

    public List<Apartment> listAvailableApartmentForSale(){
        String sql = "SELECT a.apartmentId, a.apartmentDescription, a.apartmentPrice," +
                " a.apartmentForSale FROM Apartment a ORDER BY a.apartmentForSale";
        return em.createQuery(sql).getResultList();

    }
}
