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
    if(exponent == 0){
            return 1;
        }
        return (int) (base * power(base,exponent - 1));
 

}
    public static void main(String[] args) {
        int temp = power (4,3);
        System.out.println(temp);
    }
    
}
