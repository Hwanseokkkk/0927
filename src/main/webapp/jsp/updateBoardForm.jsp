<%@page import="myboard.dao.impl.BoardFileListDAOImpl"%>
<%@page import="myboard.dto.BoardFileDTO"%>
<%@page import="java.util.List"%>
<%@page import="myboard.service.BoardFileService"%>
<%@page import="myboard.dto.BoardDTO"%>
<%@page import="myboard.dao.impl.BoardViewDAOImpl"%>
<%@page import="myboard.service.BoardViewService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<%
	String bidParam = request.getParameter("bid")==null ? "" : request.getParameter("bid");
	BoardViewService boardViewService = new BoardViewDAOImpl();
	BoardDTO boardDTO = boardViewService.viewBoard(Integer.parseInt(bidParam));
	pageContext.setAttribute("boardDTO", boardDTO);
	
	BoardFileService boardFileService = new BoardFileListDAOImpl();
	List<BoardFileDTO> boardFileDTOList = boardFileService.listBoardFile(Integer.parseInt(bidParam));
	pageContext.setAttribute("boardFileDTOList", boardFileDTOList);	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<h3>게시물 수정화면</h3>
</div>
<div>
	<form method="post" action="/MyBoard/fileupload" enctype="multipart/form-data">
	<input type="hidden" name="command" value="update" />
	<input type="hidden" name="bid" value="${boardDTO.bid}" />
		분류 : 
		<select name="bdomain">
			<option value="notice" ${boardDTO.bdomain=='notice' ? 'selected' : ''}>공지</option>
			<option value="humour" ${boardDTO.bdomain=='humour' ? 'selected' : ''}>유머</option>
			<option value="free" ${boardDTO.bdomain=='free' ? 'selected' : ''}>자유</option>
		</select><br />
		제목 : <input type="text" name="btitle" style="width: 600px;" value="${boardDTO.btitle}" /><br />
		내용 : <textarea name="bcontent" rows="10" cols="80">${boardDTO.bcontent}</textarea><br />
		
		<c:forEach var="boardFileDTO" items="${boardFileDTOList}" varStatus="stat">		
		첨부파일${stat.count} : 
			<input type="file" name="file${stat.count}" value="${boardFileDTO.bfcfn}" />
		    ${boardFileDTO.bfcfn} (${boardFileDTO.bfsize} bytes)<br />
		</c:forEach>
		<input type="button" value="수정" onclick="this.form.submit();" />	
	</form>
</div>
</body>
</html>












