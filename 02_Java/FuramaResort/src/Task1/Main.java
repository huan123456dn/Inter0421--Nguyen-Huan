package Task1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten id: ");
        String id= scanner.nextLine();
        System.out.println("ten id : " + id);
        System.out.println("nhap ten dichvu: ");
        String nameService = scanner.nextLine();
        System.out.println("tên dịch vụ : " + nameService);
        Room room1 = new Room(id,nameService, 15000, "10",  "month","Đào");
        System.out.println(room1.toString());
        Villa villa = new Villa(id,nameService,10000,"8","day","2","8","500",2);
        System.out.println(villa.toString());

    }

}

