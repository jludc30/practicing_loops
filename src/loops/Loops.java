package loops;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        /*
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        1. Counting from 1 to 10
        Use a for loop to print numbers from 1 to 10.
        Then try the same exercise with a while loop and a do-while loop.
        
        int x=1;
       
        ******************************************************************
        ***************************while**********************************
        while(x<11){
            System.out.println("número: "+x);
            x++;
        }
        ******************************************************************
        ***************************do while**********************************
        do{
            System.out.println("number: "+x);
            x++;
        }while(x<11);
         */
        /*
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        2. Sum of N Natural Numbers
        Ask the user to enter a positive integer n.
        Use a for loop to calculate and print the sum of all numbers from 1 to n.
        Try this with a while loop and a do-while loop too.
        
        ******************************************************************
        ***************************while**********************************
        int x, counting=1;
        System.out.println("Please enter the final endgin of your serie. It must be positive");
        x=sc.nextInt();
        while(x<1){
            System.out.println("Please enter a positive number");
            x=sc.nextInt();
        }
        while(counting<=x){
            System.out.println("Serie: "+counting);
            counting++;
        }
        ******************************************************************
        ***************************do while**********************************
        int x = 1, stop;
        System.out.println("please, enter the number, which will be the end of series");
        stop = sc.nextInt();
        while (stop < 1) {
            System.out.println("please enter a positive number.");
            stop = sc.nextInt();
        }
        do {
            System.out.println("Number: " + x);
            x++;
        } while (x <= stop);
        */
        /*
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        3. Multiplication Table
        Ask the user for a number.
        Use a for loop to print the multiplication table for that number (e.g., for 5, it should print 5, 10, 15, ... up to 10 times the number).
        You can also try this with while and do-while loops.
        */
        /*
        ******************************************************************
        ***************************while**********************************
        
        int i=1, tab, mult;
        System.out.println("Please enter the number of your multiplitation table");
        tab=sc.nextInt();
        System.out.println("tab of: "+tab);
        while(i<=10){
            mult=(tab*i);
            System.out.println(i+".-"+mult);
            i++;
        }
        */
        /*
        ******************************************************************
        ***************************do while*******************************
        */
        /*
        int i=1, tab, mult;
        System.out.println("Please enter a number of your multiplication tab");
        tab=sc.nextInt();
        System.out.println("The tab of: "+tab);
        do{
            mult=i*tab;
            System.out.println(i+".-"+mult);
            i++;
        }while(i<=10);
        */
        /*
        ******************************************************************
        ***************************for************************************
        */
        /*
        int tab, mult;
        System.out.println("Please enter the number to do your multi tab");
        tab=sc.nextInt();
        System.out.println("Your tab of "+tab+" is: ");
        for(int i=1;i<=10;i++){
            mult=i*tab;
            System.out.println(i+".-"+mult);
        }
        */
        /*
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        4. Factorial Calculation
        Ask the user for a positive integer n.
        Use a for loop to calculate the factorial of n (e.g., 5! = 5 * 4 * 3 * 2 * 1 = 120).
        You can try calculating it using a while loop as well.
        ******************************************************************
        ***************************while**********************************
        */
        /*
        int i=1, factor, acum=1;
        System.out.println("Please enter a number to do factorial");
        factor=sc.nextInt();
        while(factor>i){
            System.out.println(factor+"*"+(factor-1));
            acum*=factor;
            factor--;
        }
        System.out.println("Total: "+acum);
        */
        /*
        
        ******************************************************************
        ***************************do while*******************************
        */
        /*
        int i=1,factor, acum=1;
        System.out.println("Please, enter a number to do its factorial");
        factor=sc.nextInt();
        System.out.println("The factorial of "+factor);
        do{
            System.out.print(factor+"*");
            acum=acum*factor;
            factor--;
        }while(factor>=i);
        System.out.println("");
        System.out.println(" is "+acum);
        */
        /*
        ******************************************************************
        ***************************for************************************
        */
        /*
        int factor, acum=1;
        System.out.println("Please enter a number to do its factorial");
        factor=sc.nextInt();
        System.out.println("The factor of "+factor);
        for (int i = 1; factor >= i; factor--) {
            acum*=factor;
            System.out.print(factor+"*");
        }
        System.out.println("is: "+acum);
        */
        /*
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        5. Guess the Number Game
        Generate a random number between 1 and 100.
        Use a do-while loop to repeatedly ask the user to guess the number until they get it right.
        Give hints after each guess (e.g., "Too high!" or "Too low!").
        ******************************************************************
        ***************************while**********************************
        */
        int ale, answer;
        System.out.println("Guess the number, type the number you think is ");
        answer=sc.nextInt();
        ale =(int)(Math.random() * 100)+1;
        System.out.println(ale);
        while(answer!=ale){
            if(answer>ale){
                System.out.println("Too high, type again");
                answer=sc.nextInt();
            }else if (answer<ale){
                System.out.println("Too low, type again");
                answer=sc.nextInt();
            }
        }
        System.out.println("you get that number right, congrats");
        /*
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        6. Reverse a Number
        Ask the user to input an integer.
        Use a while loop to reverse the digits of the number (e.g., if they enter 123, the output should be 321).
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        7. Print a Pattern
        Use nested for loops to print a simple pattern. For example:
        markdown
        Copiar código
        *
        **
        ***
        ****
        *****
        Try more patterns, like a triangle or pyramid shape.
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        8. Finding Prime Numbers within a Range
        Ask the user to enter a number n.
        Use a for loop to find and print all prime numbers up to n.
        You could also try this with a while loop by incrementing a counter until it reaches n.
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        9. Fibonacci Sequence
        Ask the user how many terms of the Fibonacci sequence they want.
        Use a for or while loop to print the Fibonacci sequence up to that many terms (e.g., 0, 1, 1, 2, 3, 5, 8,...).
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        10. Count Digits of a Number
        Ask the user for an integer.
        Use a while loop to count the number of digits in the number (e.g., 456 has 3 digits).
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        11. Number Guess with Limited Attempts
        Set a target number.
        Use a for loop to give the user a maximum of 5 attempts to guess the number correctly.
        If they guess correctly, print “Congratulations!”; otherwise, let them know they’ve used all attempts.
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        12. Calculate the Power of a Number
        Ask the user for a base number and an exponent.
        Use a for loop to calculate the result of raising the base to the power of the exponent (e.g., 2^3 = 8).
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        13. Sum of Even and Odd Numbers
        Ask the user for a positive integer n.
        Use a for loop to calculate the sum of all even and odd numbers from 1 to n.
        Print the sum of even numbers and the sum of odd numbers separately.
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        14. Menu-Driven Calculator
        Create a simple calculator program that repeats until the user chooses to exit.
        Use a do-while loop to keep showing a menu with options like addition, subtraction, multiplication, and division.
        Based on the user’s choice, perform the operation and show the result.
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        *********************************************************************************************
        15. Find the Largest and Smallest Numbers
        Ask the user to enter a series of numbers (end with -1 to stop).
        Use a while loop to keep track of the largest and smallest numbers entered.
        When the user enters -1, print the largest and smallest numbers.
        ******************************************************************
        ***************************while**********************************
        ******************************************************************
        ***************************do while*******************************
        ******************************************************************
        ***************************for************************************
        
         */ 
    }
    
}
