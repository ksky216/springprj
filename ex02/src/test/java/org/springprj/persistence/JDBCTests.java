package org.springprj.persistence;									
									
import static org.junit.Assert.fail;									
import java.sql.Connection;									
import java.sql.DriverManager;									
import org.junit.Test;									
import lombok.extern.log4j.Log4j;									
									
@Log4j									
public class JDBCTests {									
	static {								
		try {							
			Class.forName("oracle.jdbc.driver.OracleDriver");						
		} catch (ClassNotFoundException e) {							
			// TODO Auto-generated catch block						
			e.printStackTrace();						
		}							
	}								
									
	//@Test								
	public void testConnection() {								
									
		String url = "jdbc:oracle:thin:@119.175.76.61:1521:minodb";							
		String user = "scott";							
		String password = "tiger";							
									
		try{							
			Connection conn = DriverManager.getConnection(url,user,password);						
			log.info(conn);						
									
		}catch(Exception e) {							
			fail(e.getMessage());						
		}finally {							
									
		}							
	}								
}									
