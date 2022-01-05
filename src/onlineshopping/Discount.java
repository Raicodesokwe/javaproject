package onlineshopping;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Scanner;

public class Discount extends Validation {

    public Discount(String password, String username) {
        super(password, username);
    }

    public static void main(String[] args) {

        Scanner enter_values;

        Validation dan = new Validation("DAN", "dan");
        Validation susan= new Validation("SUSAN", "susan");

       enter_values =new Scanner(System.in);

        System.out.println("Enter your username : ");
        String valid_username= enter_values.next();


        System.out.println("Enter your password: ");
       String valid_password = enter_values.next();

        ArrayList<Items>goods;
        goods = new ArrayList<>();
        Items flour= new Items("hostess","flour", 130);
        Items juice= new Items("delmonte", "juice", 90);
        Items milk = new Items("fresha", "milk", 50);
        Items bread= new Items("supaloaf", "bread", 50);
        Items milk2 = new Items("brookside", "milk", 60);
        Items pwani = new Items("pwani", "cooking oil", 130);

        goods.add(pwani);
        goods.add(flour);
        goods.add(milk);
        goods.add(milk2);
        goods.add(bread);
        goods.add(juice);


        System.out.println("This are the currently available items:\n"+goods.toString());
        System.out.println("type 'purchase' to purchase the goods");



        if(valid_password==valid_password && valid_username==valid_username){

            boolean running = true;
            int total_amount=0;
            while (running){

                //initialize total amount


                System.out.println("Enter the Item to purchase");
                String item = enter_values.next();
                switch (item){
                    case "hostess":
                         total_amount += 130;
                    case  "delmonte":
                        total_amount += 90;
                        break;
                    case  "fresha":
                        total_amount += 50;
                        break;
                    case "supaloaf":
                        total_amount += 50;
                        break;
                    case "brookiside":
                        total_amount += 60;
                        break;
                    case "pwani":
                        total_amount += 130;
                        break;
                    case "purchase":

                        running = false;
                        System.out.println("purchasing ,quit");
                        break;
                    default:
                        System.out.println("that item is not available currently try another one");

                }
                System.out.println("total amount:"+total_amount);

            }
            if(total_amount<500){
                System.out.println("no discount for items less than 500 the amount payable is "+total_amount);
            }

            else if ( total_amount>= 500 && total_amount<=1000){
                total_amount-=100;
                System.out.println("Total payable amount after discount is "+ total_amount);
            }
            else if(total_amount<=2000&& total_amount>1000){
                total_amount-=200;
                System.out.println("Total payable amount after discount is "+ total_amount);
            }
            else if(total_amount<=3000 && total_amount>2000){
                total_amount-=300;
                System.out.println("Total payable amount after discount is "+ total_amount);
            }
            else if(total_amount<=4000&& total_amount>3000){
                total_amount-=400;
                System.out.println("Total payable amount after discount is "+ total_amount);
            }
            else if(total_amount<=5000&& total_amount>4000){
                total_amount-=500;
                System.out.println("Total payable amount after discount is "+ total_amount);
            }
            else {
                total_amount-=900;
                System.out.println("Total payable amount after discount is "+ total_amount);
            }


       }else if(valid_password==susan.Password && valid_username==susan.Username){



    }else{
           System.out.println("Error!, Check your password or username");
       }
}

}

