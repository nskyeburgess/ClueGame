package clueGame;

import java.util.HashSet;

import java.util.Set;

import clueGame.Board;

import clueGame.BoardCell;

public class Room {


	private String name;

	private BoardCell labelCell;

	private BoardCell centerCell;

	public String toString() {

		return name;

	}


	boolean isRoom() {

		return true;

	}

	public void setOccupied(boolean occ) {

		boolean occupied = occ;

	}

	boolean getOccupied() {

		return false;

	}

	public void setIsRoom(boolean b) {

		boolean room = b;

	}

	public String getName() {

		//return "";

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setLabelCell(BoardCell lcell) {

		labelCell = lcell;

	}

	public void getCenterCell(BoardCell ccell) {

		centerCell = ccell;

	}

	public BoardCell getLabelCell() {

		return labelCell;

	}

	public BoardCell getCenterCell() {

		return centerCell;

	}

}
