package myboard.test;

import myboard.dao.impl.BoardListDAOImpl;
import myboard.service.BoardListService;

public class TestBoardList {
	
	public static void main(String[] args) {
		
		BoardListService boardListService = new BoardListDAOImpl();
		try {
			System.out.println(boardListService.listBoard());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	} // main

}	// class
