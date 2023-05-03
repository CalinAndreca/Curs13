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

    public static void main(String[] args)  {
        List<Quote> quotes = new ArrayList<>();
        int id =1;
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/fasttrackit/Homework13/exercitiu1/quotes.txt"))){
            String line;
            while((line = br.readLine()) !=null){
                String[] parts = line.split("~");
                if (parts.length !=2){
                    System.err.println("Invalid line: " + line);
                    continue;
                }
                String author = parts[0];
                String quote = parts[1];
                Quote newQuote = new Quote(id, author, quote);
                quotes.add(newQuote);
                id++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        QuoteService quoteService = new QuoteService(quotes);
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            List<String> lines = FileUtils.readLines(new File("src/main/java/org/fasttrackit/Homework13/exercitiu1/quotes.txt"), "UTF-8");
//            List<Quote> quotes = lines.stream()
//                    .map(line -> {
//                        String[] parts = line.split("~");
//                        return new Quote(Integer.parseInt(parts[0]), parts[1], parts[2]);
//                    })
//                    .collect(Collectors.toList());
//            QuoteService quoteService = new QuoteService(quotes);
//
//
            List<String> allQuotes = quoteService.getAllQuotes();
            System.out.println("All quotes:");
            allQuotes.forEach(System.out::println);


            List<Quote> quotesForAuthor = quoteService.getQuotesForAuthor("Albert Einstein");
            System.out.println("\nQuotes for Albert Einstein:");
            quotesForAuthor.forEach(q -> System.out.println(q.getQuote()));


            List<String> authors = quoteService.getAuthors();
            System.out.println("\nAuthors:");
            authors.forEach(System.out::println);


            quoteService.setFavorite(2);


            List<Quote> favorites = quoteService.getFavorites();
            System.out.println("\nFavorites:");
            favorites.forEach(q -> System.out.println(q.getQuote()));


            String randomQuote = quoteService.getRandomQuote();
            System.out.println("\nRandom quote:");
            System.out.println(randomQuote);
        }
    }

