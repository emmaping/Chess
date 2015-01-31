package com.emma.chess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.emma.chess.Pawn.pawnColor;

public class BoardTest {
	private Board board;

	@Before
	public void setUp() throws Exception {
		board = new Board();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreate() {
		
		assertEquals(true, board.IsEmpty());
	}
	
	@Test
	public void testAddPawn(){
		Pawn pawn = new Pawn(pawnColor.White);
		board.addPawn(pawn, 0, 0);
		assertEquals(pawn, board.getPawn(0,0));
	}
	

}
