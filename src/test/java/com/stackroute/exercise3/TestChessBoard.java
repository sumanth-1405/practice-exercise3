package com.stackroute.exercise3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestChessBoard {
	ChessBoard obj=new ChessBoard();
	@Test
	void test() {
		String[][] arr1= {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
		assertArrayEquals(arr1,obj.printingBoard(8));
	}
}


