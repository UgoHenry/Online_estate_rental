package menu;

import model.Agent;
import model.Apartment;
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
        System.out.println("1: Enter an address");
        System.out.println("2: Enter a neighborhood");
        System.out.println("3: Enter a city");
        System.out.println("4: Enter a postal code");
        System.out.println("5: Upload paid advert");
        System.out.println("6: List available apartment for rent");
        System.out.println("7: List available apartment for sale");
        System.out.println("8: List available agent");
        System.out.println("9: List all client with request");

      return input.nextInt();
    }

    public void menuChoice(Scanner input){
        int userChoice;
        do {
            userChoice = menuOption(input);
            switch (userChoice){
                case 1:
                    enterAnAddress();
                    break;
                case 2:
                    enterANeighborhood();
                    break;
                case 3:
                    enterACity();
                    break;
                case 4:
                    enterAPostalCode();
                    break;

                case 5:
                    uploadPaidAdvert();
                    break;
                case 6:
                    listAvailableApartmentForRent();
                    break;
                case 7:
                    listAvailableApartmentForSale();
                    break;
                case 8:
                    listAvailableAgent();
                    break;
                case 9:
                    listAllClientWithRequest();

            }
        }while (userChoice !=10);
        System.out.println("Whether you're buying,selling or renting we can help you");

    }

    public void enterAnAddress(){

    }

    public void enterANeighborhood(){

    }

    public void enterACity(){

    }

    public void enterAPostalCode(){

    }

    public void uploadPaidAdvert(){

    }

    public void listAvailableApartmentForRent(){

    }

    public void listAvailableApartmentForSale(){

    }

    public void listAvailableAgent(){


    }

    public void listAllClientWithRequest(){

    }

}
