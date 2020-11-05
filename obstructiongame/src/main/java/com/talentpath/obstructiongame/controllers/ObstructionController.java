package com.talentpath.obstructiongame.controllers;

import com.talentpath.obstructiongame.models.ObstructionBoard;
import com.talentpath.obstructiongame.services.ObstructionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class ObstructionController {
    
    @Autowired
    ObstructionService service;

    //starts a game
    @PostMapping(value="/start")
    public Integer startGame() {
        //TODO: process POST request
        //? should I pass in x and y coord to set the size of the game board
        //? or do that somewhere else or set a default size unless specified.
        return service.startGame();
    }
    
    //gets back a gameboard with 
    @GetMapping(value="/game/{gameId}")
    public ObstructionBoard getGame(@RequestParam Integer gameId) {
        //TODO: set up getGame request
        return service.getGameById(gameId);
    }

    //place player token
    
}
