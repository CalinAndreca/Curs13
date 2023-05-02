package org.fasttrackit.Homework13.exercitiu1;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/org/fasttrackit/Homework13/exercitiu1/quotes.txt")))){
            String line;
            while ((line = br.readLine()) != null){
                String[] parts = line.split("~");
                String author = parts[0];
                String quote = parts[1];
                System.out.println("Author: " + author);
                System.out.println("quote: " + quote);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            List<String> lines = FileUtils.readLines(new File("src/main/java/org/fasttrackit/Homework13/exercitiu1/quotes.txt"),"UTF-8");
//            List<Quote> quotes = lines.stream()
//                    .map(line -> {
//                        String[] parts = line.split("~");
//                        return new Quote(Integer.parseInt(parts[0]), parts[1], parts[2]);
//                    })
//                    .collect(Collectors.toList());
//            QuoteService quoteService = new QuoteService(quotes);
//
//
//            List<String> allQuotes = quoteService.getAllQuotes();
//            System.out.println("All quotes:");
//            allQuotes.forEach(System.out::println);
//            System.out.println();
//
//
//            List<Quote> quotesForAuthor = quoteService.getQuotesForAuthor("Albert Einstein");
//            System.out.println("Quotes for Albert Einstein:");
//            quotesForAuthor.forEach(q -> System.out.println(q.getQuote()));
//            System.out.println();
//
//
//            List<String> authors = quoteService.getAuthors();
//            System.out.println("Distinct authors:");
//            authors.forEach(System.out::println);
//            System.out.println();
//
//
//            quoteService.setFavorite(2);
//
//            System.out.println("Favorite quotes:");
//            quoteService.getFavorites().forEach(q -> System.out.println(q.getQuote()));
//            System.out.println();
//
//
//            String randomQuote = quoteService.getRandomQuote();
//            System.out.println("Random quote:");
//            System.out.println(randomQuote);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    }
}
