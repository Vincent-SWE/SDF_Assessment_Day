package sdf;

import java.io.Console;

public class Main {


    public static void main(String[] args) {


        Console cons = System.console();
        boolean stop = false;
        Float $last = 0f;
        
        System.out.println("Welcome.");

        while (!stop) {

            String input = cons.readLine("> ");
            String exiting = input;
            String[] terms = input.trim().split(" ");

            if (exiting.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye");
                System.exit(0);
            }


            terms[1].trim();
            float number1 = Float.parseFloat(terms[0]);
            float number2 = Float.parseFloat(terms[2]);


            if (terms[1].equals("+")) {
                float result = number1 + number2;
                System.out.println(result);
                $last = result;
                
                
            } 
            else if (terms[1].equals("-")) {
                float result = number1 - number2;
                System.out.println(result);
                $last = result;
                

            } else if (terms[1].equals("/")) {
                float result = number1 / number2;
                System.out.println(result);
                $last = result;
                
                
            } else if (terms[1].equals("*")) {
                float result = number1 * number2;
                System.out.println(result);
                $last = result;
                
            } 

        }       
                    
    }   
}
    
