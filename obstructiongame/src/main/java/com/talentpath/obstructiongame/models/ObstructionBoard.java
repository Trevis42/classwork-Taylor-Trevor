package com.talentpath.obstructiongame.models;

import java.util.List;

public class ObstructionBoard {
    private List<Character> occupiedLocations;
    private Integer gameId;
    private Character playerOneToken;
    private Character playerTwoToken;
    private Integer boardSize;
    //!might need to store xcoord and ycoord and then calculate boardsize off of those.
    // (the above) is because we can have rectangle boards as well as square,
    // and need to know at least xcoord for adjacency calculations later on.

    public ObstructionBoard() {
    }

    public ObstructionBoard(List<Character> occupiedLocations, Integer gameId, Character playerOneToken, Character playerTwoToken, Integer boardSize) {
        this.occupiedLocations = occupiedLocations;
        this.gameId = gameId;
        this.playerOneToken = playerOneToken;
        this.playerTwoToken = playerTwoToken;
        this.boardSize = boardSize;
    }

    public Integer getBoardSize() {
        return this.boardSize;
    }

    public void setBoardSize(Integer boardSize) {
        this.boardSize = boardSize;
    }
    

    public List<Character> getOccupiedLocations() {
        return this.occupiedLocations;
    }

    public Integer getGameId() {
		return gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public void setOccupiedLocations(List<Character> occupiedLocations) {
        this.occupiedLocations = occupiedLocations;
    }

    public Character getPlayerOneToken() {
        return this.playerOneToken;
    }

    public void setPlayerOneToken(Character playerOneToken) {
        this.playerOneToken = playerOneToken;
    }

    public Character getPlayerTwoToken() {
        return this.playerTwoToken;
    }

    public void setPlayerTwoToken(Character playerTwoToken) {
        this.playerTwoToken = playerTwoToken;
    }
}
