/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author Student
 */
public class Review {
public static int power(double base, int exponent){
    int total = 1;
        for (int i = 1; i <= exponent; i++) {
            total *= base;
 
            
        }
        return total;
 

}
    public static void main(String[] args) {
        int temp = power (4,3);
        System.out.println(temp);
    }
    
}
