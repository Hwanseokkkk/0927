package myboard.constants;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class MyboardConstants {
	
	public static Properties querys;
	
	static {
		querys = new Properties();
		try {
			File file = new File("C:/eclipse_workspace/MyBoard/src/main/webapp/WEB-INF/props/query.properties");
			Reader reader = new FileReader(file);
			querys.load(reader);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // static 초기화 블록

} // class





