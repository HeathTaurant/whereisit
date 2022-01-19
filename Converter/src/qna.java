import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//test and Q&A file this is dummy
public class qna {
    //2022-01-19 
    public int insertMember(Member m) {
      
        int result = 0;
        
        Connection conn = null;//DB연결할 객체 sql.resultset임포트
        Statement stmt = null;//실행할쿼리 sql statement 임포트
        
        String sql = "INSERT INTO MEMBER VALUES (";
                    //  +"'"+m.getUserId() +"',"
                    //  +"'"+m.getPassword()+ "',"
                    //  +"'"+m.getUserName()+"',"
                    //  +"'"+m.getGender()+"',"
                    //  +m.getAge()+","
                    //  +"'"+m.getEmail()+"',"
                    //  +"'"+m.getPhone()+"',"
                    //  +"'"+m.getAddress()+"',"
                    //  +"'"+m.getHobby()+"',"
                    //  + "sysdate )";
  
        System.out.println(sql);
        
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
        
        System.out.println("드라이버 등록 성공");
         
           conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "STUDENT", "STUDENT");
           System.out.println("conn = " + conn);
           
           stmt = conn.createStatement();
           
           conn.setAutoCommit(false);
           result = stmt.executeUpdate(sql);//처리한 행의 갯수 리턴
           
           if(result>0 ) conn.commit();
           else conn.rollback();
           System.out.println(result);
  
           
        }catch (ClassNotFoundException e) {
           
           e.printStackTrace();
        } catch (SQLException e) {
        
              e.printStackTrace();
        }finally {
           
           try {
              stmt.close();
              conn.close();
           } catch (SQLException e) {
              
              e.printStackTrace();
           }
        }
        return result;
     }
}
