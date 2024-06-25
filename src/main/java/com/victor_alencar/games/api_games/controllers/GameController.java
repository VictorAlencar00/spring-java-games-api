package com.victor_alencar.games.api_games.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor_alencar.games.api_games.domain.Game;
import com.victor_alencar.games.api_games.services.GameService;

@RestController
@RequestMapping("/api/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> getGames() {
        return gameService.getGames();
    }
}
