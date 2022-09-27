package myboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import myboard.constants.MyboardConstants;
import myboard.dao.impl.BoardDAOImpl;

public class BoardIDDAOImpl extends BoardDAOImpl implements BoardIDDAO {

	@Override
	public int getBID() throws Exception {
		
		Connection conn = getConnection();
		String sql = MyboardConstants.querys.getProperty("BID_SQL");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		int result = 0;
		if (rs.next()) {
			result = rs.getInt("bid");
		}
		closeConnection(rs, pstmt, conn);
		return result;
		
	} // getBID()

} // class






