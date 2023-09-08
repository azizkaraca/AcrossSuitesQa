package Pages;

import java.util.*;


public class WorkOut {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a text: ");
        String  text = sc.nextLine();

        String reverse="";

        for (int i = text.length()-1; i >=0 ; i--) {
            reverse+=text.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }

}
