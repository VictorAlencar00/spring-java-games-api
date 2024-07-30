package com.victor_alencar.games.api_games.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.victor_alencar.games.api_games.domain.Game;
import com.victor_alencar.games.api_games.services.GameService;

@RestController
@RequestMapping("/api/games")
public class GameController {
    
    @Autowired
    private GameService gameService;
    @CrossOrigin(origins = "http://localhost:4200")
     @GetMapping
    public List<Game> getGames(@RequestParam(required = false) String name) {
        List<Game> games = gameService.getGames();
        
        if (name != null && !name.isEmpty()) {
            return games.stream()
                        .filter(game -> game.name.equalsIgnoreCase(name))
                        .collect(Collectors.toList());
        } else {
            return games;
        }
    }
}
