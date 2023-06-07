
package ageif;

import java.util.*;
public class AgeIf {

    
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of a person :");
        age = sc.nextInt();
        
        if (age >=14 && age<=55)
        {
            System.out.println("Young");
        }
        else
            System.out.println("Old");
        }
        
    }
    
}
