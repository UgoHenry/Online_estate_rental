package menu;

import model.Agent;
import model.Apartment;
import model.Client;

import java.util.List;
import java.util.Scanner;

public class SubMenu {

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
        System.out.println("9: list all client with request");

      return input.nextInt();
    }

    public void menuChoice(Scanner input){
        int userChoice;
        do {
            userChoice = menuOption(input);
            switch (userChoice){
                case 1:
                    EnterAnAddress();
                    break;
                case 2:
                    EnterANeighborhood();
                    break;
                case 3:
                    EnterACity();
                    break;
                case 4:
                    EnterAPostalCode();
                    break;

                case 5:
                    UploadPaidAdvert();
                    break;
                case 6:
                    ListAvailableApartmentForRent();
                    break;
                case 7:
                    ListAvailableApartmentForSale();
                    break;
                case 8:
                    ListAvailableAgent();
                    break;
                case 9:
                    listAllClientWithRequest();

            }
        }while (userChoice !=10);
        System.out.println("Whether you're buying,selling or renting we can help you");

    }

    public void EnterAnAddress(){

    }

    public void EnterANeighborhood(){

    }

    public void EnterACity(){

    }

    public void EnterAPostalCode(){

    }

    public void UploadPaidAdvert(){

    }

    public List<Apartment> ListAvailableApartmentForRent(){

        return null;
    }

    public List<Apartment> ListAvailableApartmentForSale(){
        return null;
    }

    public List<Agent> ListAvailableAgent(){

        return null;
    }

    public List<Client> listAllClientWithRequest(){
        return null;
    }

}
