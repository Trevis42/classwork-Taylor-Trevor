package com.talentpath.obstructiongame.daos;

import java.util.ArrayList;
import java.util.List;

import com.talentpath.obstructiongame.models.ObstructionBoard;

public class InMemObstructionDao implements ObstructionDao {

    List<Character> occupiedLocations;
	@Override
    public ObstructionBoard addGame(ObstructionBoard toAdd) {
        Integer boardSize = 6 * 6;
        occupiedLocations = new ArrayList<>(boardSize);
        toAdd.setBoardSize(boardSize);
        toAdd.setPlayerOneToken('X');
        toAdd.setPlayerTwoToken('O');
        occupiedLocations.add(4, toAdd.getPlayerOneToken());
        occupiedLocations.add(12, toAdd.getPlayerTwoToken());
        occupiedLocations.add(32, toAdd.getPlayerOneToken());
        occupiedLocations.add(25, toAdd.getPlayerTwoToken());
        toAdd.setOccupiedLocations(occupiedLocations);
		return null;
	}

	@Override
	public ObstructionBoard getGameById(Integer gameId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Character> getOccupiedLocations(Integer gameId) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
