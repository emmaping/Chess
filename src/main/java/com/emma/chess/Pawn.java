package com.emma.chess;
public class Pawn{
	private String color;
	public final static String White = "White";
	public final static String Black = "Black";
	public enum pawnColor {White, Black}
	public Pawn() {
		this.color = pawnColor.values()[0].toString();
	}
	public Pawn(pawnColor color) {
		this.color = color.name();
	}
	
	String getColor(){
		return this.color;
	}
}