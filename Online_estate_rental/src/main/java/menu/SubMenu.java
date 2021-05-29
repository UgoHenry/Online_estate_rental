package menu;

import model.Agent;
import model.ApartmentCustomised;
import model.Client;
import persistence.*;

import java.util.List;
import java.util.Scanner;

public class SubMenu {

    private RepositoryRole repositoryRole;
    private RepositoryAddress repositoryAddress;
    private RepositoryAgent repositoryAgent;
    private RepositoryApartment repositoryApartment;
    private RepositoryOnlinePortal repositoryOnlinePortal;
    private RepositoryClient repositoryClient;

    public SubMenu() {
        this.repositoryRole = new RepositoryRole();
        this.repositoryAddress = new RepositoryAddress();
        this.repositoryAgent = new RepositoryAgent();
        this.repositoryClient = new RepositoryClient();
        this.repositoryApartment = new RepositoryApartment();
        this.repositoryOnlinePortal = new RepositoryOnlinePortal();
    }

    private int menuOption(Scanner input){
        System.out.println("\n/*****************/");
        System.out.println("Select the option menu: ");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("1: List apartment for rent with neighbourhood");
        System.out.println("2: List apartment for sell with neighborhood and price");
        System.out.println("3: List client online filter by roleId");
        System.out.println("4: List agent online filter by roleId");
        System.out.println("5: List client search filter by portal Search");
        System.out.println("6: List number of apartment with amenities");
        System.out.println("7: List available apartment for sale");
        System.out.println("8: Update online portal");
        System.out.println("9: List all client with request");

      return input.nextInt();
    }

    public void menuChoice(Scanner input){
        int userChoice;
        do {
            userChoice = menuOption(input);
            switch (userChoice){
                case 1:
                    listApartmentForRentWithNeighbourhood();
                    break;
                case 2:
                    listApartmentForSellWithNeighborhoodAndPrice();
                    break;
                case 3:
                    listClientOnlineFilterByRoleId(input);
                    break;
                case 4:
                    listAgentOnlineFilterByRoleId();
                    break;

                case 5:
                    listClientFilterByPortalSearch();
                    break;
                case 6:
                    listNumberOfApartmentWithAmenities();
                    break;
                case 7:
                    listAvailableApartmentForSale();
                    break;
                case 8:
                    updateOnlinePortal();
                    break;
                case 9:
                    listAllClientWithRequest();

            }
        }while (userChoice !=10);
        System.out.println("Whether you're buying,selling or renting we can help you");

    }

    public void listApartmentForRentWithNeighbourhood(){
        List<ApartmentCustomised> listAptCustom = repositoryApartment.listAvailableApartmentForRentWithNeighborhood();
        System.out.println(" List apartment for rent by neighborhood");
        for (ApartmentCustomised apt:listAptCustom
             ) {
            System.out.println("Apartment: "+apt.getApartmentId()+" "+apt.getApartmentDescription()+" "+apt.getNeighborhood());

        }

    }

    public void listApartmentForSellWithNeighborhoodAndPrice(){
        List<ApartmentCustomised> listAptCustom = repositoryApartment.listApartmentForSellWithNeighborhoodAndPrice();
        System.out.println(" List apartment for sale by neighborhood and price");
        for (ApartmentCustomised apt:listAptCustom
        ) {
            System.out.println("Apartment: "+apt.getApartmentId()+" "
                    +apt.getApartmentDescription()+" "+apt.getNeighborhood()+" "+apt.getApartmentPrice());

        }

    }

    public void listClientOnlineFilterByRoleId(Scanner input){
        System.out.println("Enter RoleId");
        int roleId = input.nextInt();
        List<Client> listClient = repositoryClient.listClientOnlineFilterByRoleId(roleId);
        System.out.println("List of client online using role Id");
        for (Client clt:listClient
             ) {
            System.out.println("Client: "+clt.getName()+" "+clt.getPhoneNumber()+" "+clt.getRole());

        }

    }

    public void listAgentOnlineFilterByRoleId(){
        List<Agent> listAgent = repositoryAgent.listAgentOnlineFilterByRoleId();
        System.out.println("List of client online using role Id");
        for (Agent agt:listAgent) {
            System.out.println("Client: "+agt.getFirstName()+" "+agt.getPhoneNumber()+" "+agt.getRole());

        }

    }

    public void listClientFilterByPortalSearch(){

    }

    public void listNumberOfApartmentWithAmenities(){

    }

    public void listAvailableApartmentForSale(){

    }

    public void updateOnlinePortal(){


    }

    public void listAllClientWithRequest(){

    }

}
