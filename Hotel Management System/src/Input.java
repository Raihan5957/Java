

import java.util.Scanner;

public class Input extends Hotel{
    int customer=0;
    Scanner scan = new Scanner(System.in);
    int i=0,room=0;
    Input(){

        customerName = new String[10];
        roomNumber = new int[10];
        customerID = new int[10];
        checkIn= new String[10];
    }
    public void add(int customer){
        this.customer=customer;

        for(int i=0;i<customer;i++){
            System.out.println("CUSTOMER NUMBER "+(i+1)+"\n");
            {
                System.out.println("Enter Customer's Name : ");
                customerName[i]=scan.next();
                System.out.println("Enter Customer's Room number : ");
                roomNumber[i]=scan.nextInt();
                System.out.println("Enter Customer's ID : ");
                customerID[i]=scan.nextInt();
                System.out.println("Enter Customer's checkin date : ");
                checkIn[i]=scan.next();
            }
        }
        display();

    }


    public void search(){
        System.out.println("Enter The Room number to Search");
        room = scan.nextInt();
        for(i=0;i<roomNumber.length;i++){
            if(roomNumber[i]==room){
                break;
            }
        }

        System.out.print("");
        System.out.print("");
        System.out.println("DETAILS OF THE CUSTOMER");
        System.out.print("NAME : ");
        System.out.println(customerName[i]);
        System.out.print("Room : ");
        System.out.println(roomNumber[i]);
        System.out.print("ID : ");
        System.out.println(customerID[i]);
        System.out.print("Chekin date : ");
        System.out.println(checkIn[i]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }
    public void delete(){
        System.out.println("Enter the Room Number to be delete");
        room=scan.nextInt();
        for(i=0;i<roomNumber.length;i++){
            if(roomNumber[i]==room){
                roomNumber[i]=0;
                customerName[i]="";
                customerID[i]=0;
                checkIn[i]="";

            }
        }
        display();
    }
    public void update(){
        System.out.println("Enter the Room number of the customer to be updated");
        room=scan.nextInt();
        for(i=0;i<roomNumber.length;i++){

            if(roomNumber[i]==room){
                System.out.println("New Name : ");
                customerName[i]=scan.next();
                System.out.println("New Room : ");
                roomNumber[i]=scan.nextInt();
                System.out.println("New ID : ");
                customerID[i]=scan.nextInt();
                System.out.println("New Date : ");
                checkIn[i]=scan.next();
            }

        }
        display();
    }
    @Override
        //call display method
    void display(){
        System.out.println("The Updated informations are :");


        for(i=0;i<roomNumber.length;i++){
            if(roomNumber[i]!=0){
                System.out.println("For customer "+(i+1));
                System.out.print("Customer Name : ");
                System.out.println(customerName[i]+"      ");
                System.out.print("Customer Room number : ");
                System.out.println(roomNumber[i]+"      ");
                System.out.print("Customer ID : ");
                System.out.println(customerID[i]+"      ");
                System.out.print("Customer checkin date : ");
                System.out.println(checkIn[i]);
                System.out.print(" \n\n");
            }
        }
    }
}
