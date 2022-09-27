package myboard.test;

import java.sql.SQLException;

import myboard.dao.impl.BoardDeleteDAOImpl;
import myboard.service.BoardDeleteService;

public class TestBoardDelete {
	
	public static void main(String[] args) {
		try {
			new BoardDeleteDAOImpl().deleteBoard(5);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main

} // class
