package myboard.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import myboard.constants.MyboardConstants;
import myboard.dao.BoardDeleteDAO;
import myboard.util.ConnectionManager;

public class BoardDeleteDAOImpl 
	extends BoardDAOImpl implements BoardDeleteDAO {

	@Override
	public int deleteBoard(int bid) throws Exception {
		PreparedStatement pstmt 
			= getConnection().prepareStatement(MyboardConstants.querys.getProperty("DELETE_SQL"));
		pstmt.setInt(1, bid);
		int result = pstmt.executeUpdate();
		closeConnection(pstmt, getConnection());
		return result;
	} // deleteBoard

} // class











