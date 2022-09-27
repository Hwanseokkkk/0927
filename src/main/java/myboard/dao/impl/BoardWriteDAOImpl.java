package myboard.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import myboard.constants.MyboardConstants;
import myboard.dao.BoardWriteDAO;
import myboard.dto.BoardDTO;
import myboard.util.ConnectionManager;

public class BoardWriteDAOImpl extends BoardDAOImpl implements BoardWriteDAO {

	@Override
	public int writeBoard(BoardDTO boardDTO) throws Exception {
		PreparedStatement pstmt 
			= getConnection().prepareStatement(MyboardConstants.querys.getProperty("WRITE_SQL"));
		pstmt.setString(1, boardDTO.getBtitle());
		pstmt.setString(2, boardDTO.getBcontent());
		pstmt.setString(3, boardDTO.getBdomain());
		pstmt.setString(4, boardDTO.getBwriterid());
		int result = pstmt.executeUpdate();
		closeConnection(pstmt, getConnection());
		return result;
	} // writeBoard

} // class
















