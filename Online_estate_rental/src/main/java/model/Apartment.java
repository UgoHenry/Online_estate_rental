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
    @Column(name = "apartment_price")
    private String apartmentPrice;
    @Column(name = "apartment_Quantity")
    private String apartmentQuantity;
    @ManyToOne
    @JoinColumn(name = "online_portal_id")
    private OnlinePortal onlinePortal;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

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

    public String getApartmentPrice() {
        return apartmentPrice;
    }

    public void setApartmentPrice(String apartmentPrice) {
        this.apartmentPrice = apartmentPrice;
    }

    public String getApartmentQuantity() {
        return apartmentQuantity;
    }

    public void setApartmentQuantity(String apartmentQuantity) {
        this.apartmentQuantity = apartmentQuantity;
    }

    public OnlinePortal getOnlinePortal() {
        return onlinePortal;
    }

    public void setOnlinePortal(OnlinePortal onlinePortal) {
        this.onlinePortal = onlinePortal;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentId=" + apartmentId +
                ", apartmentDescription='" + apartmentDescription + '\'' +
                ", apartmentAmenities='" + apartmentAmenities + '\'' +
                ", apartmentForRent='" + apartmentForRent + '\'' +
                ", apartmentForSale='" + apartmentForSale + '\'' +
                ", apartmentPrice='" + apartmentPrice + '\'' +
                ", apartmentQuantity='" + apartmentQuantity + '\'' +
                ", onlinePortal=" + onlinePortal +
                ", address=" + address +
                '}';
    }
}
