package conn;

import Servlet.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {



    public static List<Student> queryStudent(Connection conn) throws SQLException {
        String sql = "detail.student.find(({id : \"stu_Id\", name : \"stu_Name\", address : \"stu_add\", email : \"stu_email\", telno : \"stu_Tel\", dob : \"stu_Dob\", age : \"stu_Age\", gender : \"stu_Gender\", nationality : \"stu_Nat\", religion : \"stu_Rel\"})";


        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();
        List<Student> list = new ArrayList<Student>();
        while (rs.next()) {
            String stu_Id = rs.getString("stu_id");
            String stu_Name = rs.getString("stu_name");
            String stu_Add = rs.getString("stu_add");
            String stu_Email = rs.getString("stu_email");
            int stu_Tel = rs.getInt("stu_tel");
            float stu_Dob = rs.getFloat("stu_dob");
            int stu_Age = rs.getInt("stu_age");
            String stu_Gender = rs.getString("stu_gender");
            String stu_Nat = rs.getString("stu_nat");
            String stu_Rel = rs.getString("stu_rel");

        }
        return list;
    }


    public static Student findStudent(Connection conn, String code) throws SQLException {
        String sql = "db.student.find({id : \"stu_Id\", name : \"stu_Name\", address : \"stu_add\", email : \"stu_email\", telno : \"stu_Tel\", dob : \"stu_Dob\", age : \"stu_Age\", gender : \"stu_Gender\", nationality : \"stu_Nat\", religion : \"stu_Rel\"})";

        PreparedStatement pstm = conn.prepareStatement(sql);
        String stu_Id = null;
        pstm.setString(1, stu_Id);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            stu_Id = rs.getString("stu_id");
            String stu_Name = rs.getString("stu_name");
            String stu_Add = rs.getString("stu_add");
            String stu_Email = rs.getString("stu_email");
            int stu_Tel = rs.getInt("stu_tel");
            float stu_Dob = rs.getFloat("stu_dob");
            int stu_Age = rs.getInt("stu_age");
            String stu_Gender = rs.getString("stu_gender");
            String stu_Nat = rs.getString("stu_nat");
            String stu_Rel = rs.getString("stu_rel");

            Student student = new Student(stu_Id, stu_Name, stu_Add, stu_Email, stu_Tel, stu_Dob, stu_Age, stu_Gender, stu_Nat, stu_Rel);
            return student;
        }
        return null;
    }

    public static void updateStudent(Connection conn, Student student) throws SQLException {
        String sql = "detail.student.updateMany({id : \"stu_Id\", name : \"stu_Name\", address : \"stu_add\", email : \"stu_email\", telno : \"stu_Tel\", dob : \"stu_Dob\", age : \"stu_Age\", gender : \"stu_Gender\", nationality : \"stu_Nat\", religion : \"stu_Rel\"})";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, String.valueOf(student.getstu_Id()));
        pstm.setString(2, student.getstu_Name());
        pstm.setString(3, student.getstu_Add());
        pstm.setString(4, student.getstu_Email());
        pstm.setInt(5, student.getstu_Tel());
        pstm.setFloat(6, student.getstu_Dob());
        pstm.setInt(7, student.getstu_Age());
        pstm.setString(8, student.getstu_Gender());
        pstm.setString(9, student.getstu_Nat());
        pstm.setString(10, student.getstu_Rel());
        pstm.executeUpdate();
    }

    public static void insertStudent(Connection conn, Student student) throws SQLException {
        String sql = "detail.student.insert({id : \"stu_Id\", name : \"stu_Name\", address : \"stu_add\", email : \"stu_email\", telno : \"stu_Tel\", dob : \"stu_Dob\", age : \"stu_Age\", gender : \"stu_Gender\", nationality : \"stu_Nat\", religion : \"stu_Rel\"})";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, String.valueOf(student.getstu_Id()));
        pstm.setString(2, student.getstu_Name());
        pstm.setString(3, student.getstu_Add());
        pstm.setString(4, student.getstu_Email());
        pstm.setInt(5, student.getstu_Tel());
        pstm.setFloat(6, student.getstu_Dob());
        pstm.setInt(7, student.getstu_Age());
        pstm.setString(8, student.getstu_Gender());
        pstm.setString(9, student.getstu_Nat());
        pstm.setString(10, student.getstu_Rel());
        pstm.executeUpdate();
    }

    public static void deleteStudent(Connection conn, String code) throws SQLException {
        String sql = "db.student.remove";

        PreparedStatement pstm = conn.prepareStatement(sql);
        String stu_Id = null;
        pstm.setString(1, stu_Id);

        pstm.executeUpdate();
    }

}
