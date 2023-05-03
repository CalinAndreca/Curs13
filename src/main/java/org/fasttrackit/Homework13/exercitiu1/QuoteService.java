package org.fasttrackit.Homework13.exercitiu1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class QuoteService {
    private List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {

        return quotes.stream()
                .map(Quote::getQuote)
                .collect(Collectors.toList());
    }

    public List<Quote> getQuotesForAuthor(String author) {

        return quotes.stream()
                .filter(q -> q.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<String> getAuthors() {

        return quotes.stream()
                .map(Quote::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }

    public void setFavorite(int id) {
        quotes.stream()
                .filter(q -> q.getId() == id)
                .findFirst()
                .ifPresent(q -> q.setFavorite(true));
    }

    public List<Quote> getFavorites() {
        return quotes.stream()
                .filter(Quote::isFavorite)
                .collect(Collectors.toList());
    }

    public String getRandomQuote() {
        int randomIndex = new Random().nextInt(quotes.size());
        return quotes.get(randomIndex).getQuote();
    }
}
