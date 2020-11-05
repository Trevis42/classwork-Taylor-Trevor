package com.talentpath.obstructiongame.services;

import java.util.ArrayList;
import java.util.List;

import com.talentpath.obstructiongame.daos.ObstructionDao;
import com.talentpath.obstructiongame.models.ObstructionBoard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObstructionService {
	
	ObstructionDao dao;

	@Autowired
	public ObstructionService(ObstructionDao dao) {
		this.dao = dao;
	}


	public ObstructionBoard getGameById(Integer gameId) {
		ObstructionBoard game = dao.getGameById( gameId );

        List<Character> occupiedLocations = dao.getOccupiedLocations( gameId );

        game.setOccupiedLocations( occupiedLocations );
        return game;
	}

	public Integer startGame() {
		Integer xCord = 6;
		Integer yCord = 6;
		ObstructionBoard toAdd = new ObstructionBoard();
		toAdd.setPlayerOneToken('X');
		toAdd.setPlayerTwoToken('O');
		toAdd.setOccupiedLocations(new ArrayList<>());
		toAdd.setBoardSize(xCord*yCord);

        toAdd = dao.addGame( toAdd );

        return toAdd.getGameId();
	}
}
