
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // using do-while
        Scanner scan = new Scanner(System.in);
        int a,customer,password,adminID,p,b;

        Input i = new Input();  // creating object of Input class

        System.out.println("Create A Password.");
        p = scan.nextInt();
        System.out.println("Give an Admin ID : ");
        b = scan.nextInt();
        System.out.println("Enter Password and user name to log in :");
        System.out.println("Password : ");
        password = scan.nextInt();
        System.out.println("Admin ID : ");
        adminID = scan.nextInt();

        if(password ==p & adminID == b)
        {
            System.out.println("Login Successful \n");


            System.out.println("");
            System.out.println("Welcome to Hotel Management System ");
            System.out.println("");



            System.out.println("Number of customer you want to checkin : ");
            customer = scan.nextInt();
            i.add(customer);




            do {



                System.out.println("Which you want to do");
                System.out.println("");
                System.out.println("Enter 1 to See Customer information");
                System.out.println("Enter 2 to delete Customer ");
                System.out.println("Enter 3 to update Customer information");
                System.out.println("Enter 4 to Exit");
                //using swtich case
                int ch = scan.nextInt();
                switch (ch) {



                    case 1:
                        i.search();
                        break;



                    case 2:
                        i.delete();
                        break;



                    case 3:
                        i.update();
                        break;




                    case 4:
                        System.exit(0);
                }



                System.out.println("press any key other than 0 to do more operations else press 0 to exit");

                a = scan.nextInt();
            }


            //0 to exit
            while(a!=0);
            System.out.println("You've Exited The System");






        }

        else{System.out.println("invalid pass or admin id");}
    }






}










