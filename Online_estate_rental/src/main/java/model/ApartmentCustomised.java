package model;

public class ApartmentCustomised {
    private int apartmentId;
    private String apartmentDescription;
    private String neighborhood;
    private String apartmentPrice;

    public ApartmentCustomised(int apartmentId, String apartmentDescription,
                               String neighborhood, String apartmentPrice) {
        this.apartmentId = apartmentId;
        this.apartmentDescription = apartmentDescription;
        this.neighborhood = neighborhood;
        this.apartmentPrice = apartmentPrice;
    }

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

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getApartmentPrice() {
        return apartmentPrice;
    }

    public void setApartmentPrice(String apartmentPrice) {
        this.apartmentPrice = apartmentPrice;
    }
}
