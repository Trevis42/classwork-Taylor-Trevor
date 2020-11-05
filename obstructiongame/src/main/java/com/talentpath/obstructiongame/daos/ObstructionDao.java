package com.talentpath.obstructiongame.daos;

import java.util.List;

import com.talentpath.obstructiongame.models.ObstructionBoard;

public interface ObstructionDao {

	public ObstructionBoard addGame(ObstructionBoard toAdd);

	public ObstructionBoard getGameById(Integer gameId);

	public List<Character> getOccupiedLocations(Integer gameId);
}
