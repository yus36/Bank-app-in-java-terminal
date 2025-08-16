import java.util.Scanner;

class bankapp2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("You can write which Commandments you want and System will do for you:" +
                    "  " + "1.Create account" + "  " + "2.Log in" + "  " + "3.Exit");
            String pit = scn.nextLine();

            String name = null;
            String surname = null;
            String secname = null;
            int secpassword = 0;
            int balance = 0;
            int password = 0;
            int Depo = 0;
            int Wdraw = 0;

            if (pit.equals("Create account")) {
                System.out.println("Write your name");
                name = scn.nextLine();
                System.out.println("Write your surname");
                surname = scn.nextLine();
                System.out.println("Create a password (number only)");
                password = scn.nextInt();
                scn.nextLine(); // clear buffer
                System.out.println("Write your balance");
                balance = scn.nextInt();
                scn.nextLine(); // clear buffer
                System.out.println("Your account created:" + "  " + surname + "  " + name + " " + password + " " + balance + "$");
            } else if (pit.equals("Log in")) {
                if (name == null && surname == null && password == 0) {
                    System.out.println("Please create account first");
                }
            } else if (pit.equals("Exit")) {
                System.out.println("You Exit");
            } else {
                System.out.println("Something went wrong");
                return;
            }

            if (name != null && surname != null && password > 0) {
                System.out.println("You can write which Commandments you want and System will do for you:" +
                        "  " + "1.Look your account" + "  " + "2.Log in");
            } else {
                System.out.println("Create account");
            }

            String entering = scn.nextLine();

            if (entering.equals("Look your account")) {
                System.out.println("Your account created:" + "  " + surname + "  " + name + " " + password + " " + balance + "$");
            } else if (entering.equals("Log in")) {
                System.out.println("Please Enter Name and password ");
                secname = scn.nextLine();
                secpassword = scn.nextInt();
                scn.nextLine(); // clear buffer

                if (name.equals(secname) && secpassword == password) {
                    System.out.println("You Entered");
                } else {
                    while (!name.equals(secname) || secpassword != password) {
                        System.out.println("Wrong credentials, try again:");
                        secname = scn.nextLine();
                        secpassword = scn.nextInt();
                        scn.nextLine(); // clear buffer
                    }
                    System.out.println("You Entered");
                }
            } else {
                System.out.println("Something went wrong");
                return;
            }

            System.out.println("So, you Loged in and you can do:" + "1.Deposit" + " " + "2.Withdraw" + " " + "3.Log out" + " " + "and your balance are" + " " + balance + "$");
            String etr = scn.nextLine();

            if (etr.equals("Deposit")) {
                System.out.println("Please enter Deposit value");
                Depo = scn.nextInt();
                scn.nextLine();// clear buffer
                balance = balance + Depo;
                System.out.println(balance + "$");

            } else if (etr.equals("Withdraw")) {

                System.out.println("Please enter Deposit value");
                Wdraw = scn.nextInt();
                scn.nextLine();// clear buffer
                balance = balance - Wdraw;
                if (balance < 0) {
                    System.out.println("Input is wrong");
                }else{
                    System.out.println(balance + "$");}
            } else if (etr.equals("Log out")) {
                System.out.println("You Log out");
            }
            scn.close();
        }
    }
}