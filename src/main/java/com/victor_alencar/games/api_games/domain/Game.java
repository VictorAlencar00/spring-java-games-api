package com.victor_alencar.games.api_games.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Game {
    public long id;
    public String name;
    public String verticalsrc;
    public String horizontalsrc;
    public String genre;
    public String publisher;
    public String developer;
    public boolean liked;
    public String releaseDate;
    public double price;
    
}
