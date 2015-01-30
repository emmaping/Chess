public class PawnTest extends junit.framework.TestCase{
	final String colorWhite = "White";
	final String colorBlack = "Black";

	public void testCreate(){	
		Pawn pawnWhite = new Pawn(colorWhite);
		assertEquals(colorWhite, pawnWhite.getColor());
		
		Pawn pawnBlack = new Pawn(colorBlack);
		assertEquals(colorBlack, pawnBlack.getColor());
	}
	

}