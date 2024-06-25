package com.victor_alencar.games.api_games.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.victor_alencar.games.api_games.domain.Game;

@Service
public class GameService {

    public List<Game> getGames() {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Game>> typeReference = new TypeReference<List<Game>>() {};

        try {
            InputStream inputStream = getClass().getResourceAsStream("/static/games.json");
            List<Game> games = objectMapper.readValue(inputStream, typeReference);
            return games;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
