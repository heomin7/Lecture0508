package kr.re.kitri.northwind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-05-08.
 */
public class NorthwindMain {

    public static void main(String[] args){
        //1.postgreSQL 데이터베이스 JDBC 드라이버를 로딩한다.
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("driver loading ok..");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //2. 데이터 베이스와 연결을 수행한다.
        //즉, Connection 객체를 만든다.
        String dburl = "jdbc:postgresql://localhost/test";
        String username = "postgres";
        String password = "12345678";
        try {


            Connection conn =
                    DriverManager.getConnection(dburl, username, password);
            System.out.println("Connection ok..");
            //do job

            //3. SQL문을 DB로 전달한다.
            String sql = "INSERT INTO public.sample(\n" +
                    "\tfirst_name, last_name, age)\n" +
                    "\tVALUES (?, ?, ?); ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "연아");
            pstmt.setString(2, "김");
            pstmt.setInt(3, 30);

            pstmt.executeUpdate();
            conn.close();
            System.out.println("Connection closed..");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
