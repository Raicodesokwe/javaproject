package oveloading;

import java.util.Scanner;

public class Overload {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f_name =  scanner.next();
        System.out.println("Enter the number of characters in your first name: ");
        int f = scanner.nextInt();
        System.out.println("Enter your second name: ");
        String s_name = scanner.next();
        System.out.println("Enter the number of characters in your second name: ");
        int s = scanner.nextInt();
        System.out.println("Enter your last name: ");
        String l_name = scanner.next();
        System.out.println("Enter the number of characters in your last name: ");
        int l = scanner.nextInt();


        System.out.println("Your name is "+details(f_name, s_name, l_name));
        System.out.println("The number of characters in your name is "+details(f,s,l));

    }
    public static String details(String fname,String sname, String lname){
        return fname+sname+lname;
    }
    public static Integer details(int char_fname, int char_sname, int char_lname){

        return char_fname + char_sname +char_lname;

    }
}
