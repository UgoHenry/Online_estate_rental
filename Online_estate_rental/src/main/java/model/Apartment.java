package model;

import javax.persistence.*;

@Entity
@Table(name = "apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "apartment_id")
    private int apartmentId;
    @Column(name = "apartment_description")
    private String apartmentDescription;
    @Column(name = "apartment_amenities")
    private String apartmentAmenities;
    @Column(name = "apartment_for_rent")
    private String apartmentForRent;
    @Column(name = "apartment_for_sale")
    private String apartmentForSale;

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getApartmentDescription() {
        return apartmentDescription;
    }

    public void setApartmentDescription(String apartmentDescription) {
        this.apartmentDescription = apartmentDescription;
    }

    public String getApartmentAmenities() {
        return apartmentAmenities;
    }

    public void setApartmentAmenities(String apartmentAmenities) {
        this.apartmentAmenities = apartmentAmenities;
    }

    public String getApartmentForRent() {
        return apartmentForRent;
    }

    public void setApartmentForRent(String apartmentForRent) {
        this.apartmentForRent = apartmentForRent;
    }

    public String getApartmentForSale() {
        return apartmentForSale;
    }

    public void setApartmentForSale(String apartmentForSale) {
        this.apartmentForSale = apartmentForSale;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentId=" + apartmentId +
                ", apartmentDescription='" + apartmentDescription + '\'' +
                ", apartmentAmenities='" + apartmentAmenities + '\'' +
                ", apartmentForRent='" + apartmentForRent + '\'' +
                ", apartmentForSale='" + apartmentForSale + '\'' +
                '}';
    }
}
