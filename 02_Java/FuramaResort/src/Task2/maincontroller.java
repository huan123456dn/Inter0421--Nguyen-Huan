package Task2;


import Task1.House;
import Task1.Room;
import Task1.Villa;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maincontroller {

    public static void main(String[] args) {
        displayMainMenu();

    }


    public static void displayMainMenu(){
        System.out.println("\n1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Exit");
        switch(Integer.valueOf(GetStr()))
        {
            case 1 :
                addNewServies();
                break;
            case 2 :
                showServies();
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            case 6 :
                break;
            case 7 :
                break;
        }
    }

    public static void showServies(){
        System.out.println("\n1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show All Name Villa Not Duplicate");
        System.out.println("5.Show All Name House Not Duplicate");
        System.out.println("6.Show All Name Name Not Duplicate");
        System.out.println("7.Back to menu");
        System.out.println("8.Exit");
        switch(Integer.valueOf(GetStr()))
        {
            case 1 :
                showVilla();
                break;
            case 2 :
                showHouse();
                break;
            case 3 :
                showRoom();
                break;
            case 4 :
                displayMainMenu();
                break;
            case 5 :
                break;
            case 6 :
                break;
            case 7 :
                break;
            case 8 :
                break;
        }
    }


    public static void addNewServies(){

        System.out.println("\n1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to menu");
        System.out.println("5.Exit");
        switch(Integer.valueOf(GetStr()))
        {
            case 1 :
                addNewVilla();
                break;
            case 2 :
                addNewHouse();
                break;
            case 3 :
                addNewRoom();
                break;
            case 4 :
                displayMainMenu();
            case 5 :
                break;
        }
    }
    public static void addNewVilla(){
        System.out.println("ID: ");
        String id = GetStr();

        System.out.println("Name: ");
        String nameService = GetStr();

        System.out.println("cost: ");
        float cost = Integer.parseInt(GetStr());

        System.out.println("maxNumberOfPeople: ");
        String maxNumberOfPeople = GetStr();

        System.out.println("rentType:");
        String rentType = GetStr();

        System.out.println("standardRoom:");
        String standardRoom = GetStr();

        System.out.println("convenient: ");
        String convenient = GetStr();

        System.out.println("area:");
        String area = GetStr();

        System.out.println("floors:");
        int floors = Integer.parseInt(GetStr());

        Villa villa = new Villa(id, nameService, cost, maxNumberOfPeople, rentType, standardRoom, convenient, area, floors);
        System.out.println("ID: " + villa.getId());
        System.out.println("Name: " + villa.getNameService());
        System.out.println("cost: " + villa.getCost());
        System.out.println(" rentType: " + villa.getRentType());
        System.out.println("standardRoom:" + villa.getStandardRoom());
        System.out.println("Rent Type: " + villa.getRentType());
        System.out.println("convenient: " + villa.getConvenient());
        System.out.println("area: " + villa.getArea());
        System.out.println("floors: " + villa.getFloors());
    }
    public static void addNewHouse(){
        System.out.println("ID: ");
        String id = GetStr();

        System.out.println("Name: ");
        String nameService = GetStr();

        System.out.println("cost: ");
        float cost = Integer.parseInt(GetStr());

        System.out.println("maxNumberOfPeople: ");
        String maxNumberOfPeople = GetStr();

        System.out.println("rentType:");
        String rentType = GetStr();

        System.out.println("standardRoom:");
        String standardRoom = GetStr();

        System.out.println("convenient: ");
        String convenient = GetStr();

        System.out.println("floors:");
        int floors = Integer.parseInt(GetStr());

        House house = new House(id, nameService, cost, maxNumberOfPeople, rentType, standardRoom, convenient, floors);
        System.out.println("ID: " + house.getId());
        System.out.println("Name: " + house.getNameService());
        System.out.println("Area: " + house.getCost());
        System.out.println("Rent pirce: " + house.getMaxNumberOfPeople());
        System.out.println("Number People Max:" + house.getRentType());
        System.out.println("Rent Type: " + house.getStandardRoom());
        System.out.println("Room Criterion: " + house.getConvenient());
        System.out.println("Convenient Description: " + house.getFloors());

    }
    public static void addNewRoom(){
        System.out.println("ID: ");
        String id = GetStr();

        System.out.println("Name: ");
        String nameService = GetStr();

        System.out.println("cost: ");
        float cost = Integer.parseInt(GetStr());

        System.out.println("maxNumberOfPeople: ");
        String maxNumberOfPeople = GetStr();

        System.out.println("rentType:");
        String rentType = GetStr();

        System.out.println("accompaniedService:");
        String accompaniedService = GetStr();


        Room room = new Room(id, nameService, cost, maxNumberOfPeople, rentType, accompaniedService);
        System.out.println("ID: " + room.getId());
        System.out.println("Name: " + room.getNameService());
        System.out.println("Area: " + room.getCost());
        System.out.println("Rent pirce: " + room.getMaxNumberOfPeople());
        System.out.println("Number People Max:" + room.getRentType());
        System.out.println("Rent Type: " + room.getAccompaniedService());


    }
    private static String GetStr() {
        DataInputStream stream = new DataInputStream(System.in);
        try {
            return stream.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    public static void showVilla() {
            Villa villa1 = new Villa("1", "Villa", 15000,"12","2","3","2","100",1);
            Villa villa2 = new Villa("2", "Villa", 1500000,"10","8","5","1","5000",1);
            Villa villa3 = new Villa("3", "Villa", 150000000,"3","8","3","2","120",10);
            List<Villa> villas = new ArrayList<>();
            villas.add(villa1);
            villas.add(villa2);
            villas.add(villa3);
            for(Villa villa : villas){

                System.out.println("id: " + villa.getId());
                System.out.println("name: " + villa.getNameService());
                System.out.println("cost: " + villa.getCost());
                System.out.println("max number of people: " + villa.getMaxNumberOfPeople());
                System.out.println("rent type: " + villa.getRentType());
                System.out.println("standard room: " + villa.getStandardRoom());
                System.out.println("convenient: " + villa.getConvenient());
                System.out.println("are: " + villa.getArea());
                System.out.println("floors: " + villa.getFloors());
            }
        }
    public static void showHouse() {
        House house1= new House("1","House",4400000,"5","2","12","50",20);
        House house2= new House("2","House",333333,"13","20","3","10",20);
        House house3= new House("3","House",150000,"5","3","3","3",20);
        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        for(House house : houses){
            System.out.println("id: " + house.getId());
            System.out.println("name: " + house.getNameService());
            System.out.println("cost: " + house.getCost());
            System.out.println("max number of people: " + house.getMaxNumberOfPeople());
            System.out.println("rent type: " + house.getRentType());
            System.out.println("standard room: " + house.getStandardRoom());
            System.out.println("convenient: " + house.getConvenient());
            System.out.println("floors: " + house.getFloors());
        }
      }
      public  static  void showRoom(){
        Room room1 = new Room("1","Room",15000000,"10","3","3");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        for (Room room:rooms){
            System.out.println("id: " + room.getId());
            System.out.println("name: " + room.getNameService());
            System.out.println("cost: " + room.getCost());
            System.out.println("people: " + room.getMaxNumberOfPeople());
            System.out.println("rent type: " + room.getRentType());
            System.out.println("acc: " + room.getAccompaniedService());
        }
      }

    }

