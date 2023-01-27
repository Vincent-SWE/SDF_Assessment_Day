package sdf;

import java.io.Console;



public class Main {

    
   
    public static void main(String[] args) {


        Console cons = System.console();
        boolean stop = false;

        
        System.out.println("Welcome.");

        while (!stop) {

            String $last;          

            String input = cons.readLine("> ");
            String exiting = input;
            String[] terms = input.trim().split(" ");
            


            if (exiting.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye");
                System.exit(0);
            }


            terms[1].trim();
            String input1 = terms[0];
            String input2 = terms[2];
            Float number1 = Float.valueOf(input1).floatValue();
            Float number2 = Float.valueOf(input2).floatValue();
            // Float number2 = Float.parseFloat(input2);
            

            if (terms[1].equals("+")) {
                float result = number1 + number2;
                System.out.println(result);
                $last = Float.toString(result);

                
            } 
            else if (terms[1].equals("-")) {
                float result = number1 - number2;
                System.out.println(result);
                $last = Float.toString(result);
                
                

            } else if (terms[1].equals("/")) {
                float result = number1 / number2;
                System.out.println(result);
                $last = Float.toString(result);
                
                
                
            } else if (terms[1].equals("*")) {
                float result = number1 * number2;
                System.out.println(result);
                $last = Float.toString(result);
                
            } 

            
        }       
                    
    }   
}
    
