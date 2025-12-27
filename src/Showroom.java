import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name ;
    String showroom_add ;
    String manager_name;
    int total_employees;
    int total_cars_in_stock = 0;

    @Override
    public void get_details(){
        System.out.println("Showroom Name: " + showroom_name);
        System.out.println("Showroom Address: " + showroom_add);
        System.out.println("Manager Name: "+ manager_name);
        System.out.println("Total No. of Employee: " + total_employees);
        System.out.println("Total cars in Stock: "+ total_cars_in_stock);
    }

    @Override
    public void set_details (){
        Scanner sc = new Scanner(System.in);
        System.out.println("============================== *** Enter Showroom Details *** ==============================");
        System.out.println();
        System.out.print("Showroom Name: ");
        showroom_name = sc.nextLine();
        System.out.print("Showroom Address: ");
        showroom_add = sc.nextLine();
        System.out.print("Manager Name: ");
        manager_name = sc.nextLine();
        System.out.print("Total No. of Employee: ");
        total_employees = sc.nextInt();
        System.out.print("Total cars in Stock: ");
        total_cars_in_stock = sc.nextInt();
    }

}

