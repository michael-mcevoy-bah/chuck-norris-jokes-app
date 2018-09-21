package com.michaelmcevoy.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
@Component
public class ChuckNorrisJokeService implements JokeService {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
