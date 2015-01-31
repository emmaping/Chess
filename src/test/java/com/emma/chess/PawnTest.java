package com.emma.chess;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.emma.chess.Pawn;
import com.emma.chess.Pawn.pawnColor;

public class PawnTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreate() {
		
		Pawn pawnWhite = new Pawn(Pawn.pawnColor.White);
		assertEquals("White", pawnWhite.getColor());
	}
	
	@Test
	public void testConstuctior(){
		Pawn noColor = new Pawn();
		assertEquals("White", noColor.getColor());
	}

}
