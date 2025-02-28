/*Write a program to calculate a discount based on the purchase amount:

Purchase above $1000: 20% discount
Purchase between $500 and $1000: 10% discount
Purchase below $500: No discount
 */

 import java.util.Scanner;

    class CalculateDiscount{
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);

        System.out.println("Enter the bill amount: ");
        long a = s.nextInt();

        if(a >= 1000){
            System.out.println("20 % Discount");
            }
        else if (a > 500 && a < 1000){
            System.out.println("10 % Discount");
            }
        else if(a < 500){
            System.out.println("No Discount");
            }
        }
 }