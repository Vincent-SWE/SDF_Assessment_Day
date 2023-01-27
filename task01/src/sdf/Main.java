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
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        FileReader rnt = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(rnt);
        
        HashMap<String, Integer> wordFrequency = new HashMap<String, Integer>();


        try {

            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                    if (line == null) {
                        break;
                    }

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

        } catch (IOException e) {
            System.out.println("Could not find file....");
            e.printStackTrace();
        } 

        br.close();

        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": the count of this word is " + wordFrequency.get(word));
        }
        







    }

}
