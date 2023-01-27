package sdf;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        FileReader rnt = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(rnt);
        
        HashMap<String, Integer> wordFrequency = new HashMap<String, Integer>();
   
        
    
        try {

            int countofallwords = 0;

            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                    if (line == null) {
                        break;
                    }


                String[] words = line.split("\\s+");
                countofallwords += words.length;
                System.out.println("The count of all words is: " + countofallwords);

                line = line.replaceAll("\\.", "").toLowerCase();
                line = line.replaceAll("\\,", "").toLowerCase();
                line = line.replaceAll("\\:", "").toLowerCase();
                line = line.replaceAll("\\!", "").toLowerCase();
                line = line.replaceAll("\\-", "").toLowerCase();
                line = line.replaceAll("\\(", "").toLowerCase();
                line = line.replaceAll("\\)", "").toLowerCase();
                line = line.replaceAll("\\{", "").toLowerCase();
                line = line.replaceAll("\\}", "").toLowerCase();
                line = line.replaceAll("\\'", "").toLowerCase();
                line = line.replaceAll("\"\"", "").toLowerCase();
                line = line.replaceAll("\\?", "").toLowerCase();

                
                

                StringTokenizer stringtoken = new StringTokenizer(line);
                while (stringtoken.hasMoreTokens()) {
                    String word = stringtoken.nextToken();
                    if (wordFrequency.containsKey(word)) {
                        int count = wordFrequency.get(word);
                        wordFrequency.put(word, count +1);
                    } 
                    else {
                        wordFrequency.put(word, 1);
                    }
                }

            }
        
            List<Map.Entry<String, Integer>> list = new ArrayList<>(wordFrequency.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                    return b.getValue() - a.getValue();
                }
            });
    
            for (int i = 0; i < 10 && i < list.size(); i++) {
                Map.Entry<String, Integer> entry = list.get(i);
                DecimalFormat df = new DecimalFormat("#0.000");
                // Float rating = Float.valueOf(entry.getValue() / countofallwords);
                // System.out.println(entry.getKey() + ": the count of this word is " + (entry.getValue() / countofallwords));
                System.out.println(entry.getKey() + ": the count of this word is " + df.format((entry.getValue())));
            }



        } catch (IOException e) {
            System.out.println("Could not find file....");
            e.printStackTrace();
        } 

        br.close();

        // checking to see that frequency is able to detect
        // for (String word : wordFrequency.keySet()) {
        //     System.out.println(word + ": the count of this word is " + wordFrequency.get(word));
        // }
        

    }

}
