package org.fasttrackit.Homework13.exercitiu1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuoteFileReader {
    public List<Quote> readQuotesFromFile(String filePath){
        List<Quote> quotes = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/fasttrackit/Homework13/exercitiu1/quotes.txt"))){
            String line;
            int id =1;
            while((line = br.readLine()) != null){
                String[] parts = line.split("~");
                if (parts.length == 2){
                    String author = parts[0];
                    String quoteText = parts[1];

                    Quote quote = new Quote(id,author,quoteText);
                    quotes.add(quote);
                    id++;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return quotes;
    }
}
