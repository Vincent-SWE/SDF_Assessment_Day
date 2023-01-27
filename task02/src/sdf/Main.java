package sdf;

import java.io.Console;

public class Main {
    
    static Float $last = 0f;

    public static void main(String[] args) {


        Console cons = System.console();

        System.out.println("Welcome.");
        String input = cons.readLine("> ");
        String[] terms = input.trim().split(" ");

        terms[1].trim();
        float number1 = Float.parseFloat(terms[0]);
        float number2 = Float.parseFloat(terms[2]);

        if (terms[1].equals("+")) {
            float result = number1 + number2;
            System.out.println(result);
            $last = result;
            return;
            
        } 
        else if (terms[1].equals("-")) {
            float result = number1 - number2;
            System.out.println(result);
            $last = result;
            return;
            

        } else if (terms[1].equals("/")) {
            float result = number1 / number2;
            System.out.println(result);
            $last = result;
            return;
            
        } else if (terms[1].equals("*")) {
            float result = number1 * number2;
            System.out.println(result);
            $last = result;
            return;

        } else if (input.equals("exit")){
            System.out.println("Bye bye");
        }
                    
    }   
}
    
