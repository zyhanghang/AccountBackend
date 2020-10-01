package com.zyhang.dao;



import com.zyhang.pojo.Contact;
import com.zyhang.utils.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zyhang
 * @create 2020-09-30 11:41 AM
 */
public class ContactSQLDao {

    public ContactSQLDao() {
    }

//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "root";
//    private static final String CONN_STRING = "jdbc:mysql://54.153.20.234:3306/flex?serverTimezone=GMT&useSSL=false";

//    public void printContacts(){
//        Connection conn = null;
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = (Connection) DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
//            System.out.println(conn);
//
//
//            String query = "SELECT * FROM contact";
//
//            Statement st = (Statement) conn.createStatement();
//
//            // execute the query, and get a java resultset
//            ResultSet rs = st.executeQuery(query);
//
//            //meta data
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnCount = rsmd.getColumnCount();
//            System.out.println("the number of columns: " + columnCount);
//
//            // iterate through the java resultset
//            while (rs.next())
//            {
//                System.out.println("test");
//                int id = rs.getInt("contact_id");
//                String firstName = rs.getString("contact_firstname");
//                String lastName = rs.getString("contact_lastname");
//                String phone = rs.getString("contact_phone");
//                String email = rs.getString("contact_email");
//                System.out.format("%s, %s, %s, %s, %s\n", id, firstName, lastName, phone, email);
//            }
//            st.close();
//
//        }catch (SQLException e){
//            System.err.println(e);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    public Contact queryContact(String sql, Object ...args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            rs = ps.executeQuery();
            //get meta data
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            if (rs.next()) {
               Contact contact = new Contact();
               for (int i = 0; i < columnCount; i++) {
                   Object columnValue = rs.getObject(i+1);
                   String columnLabel = rsmd.getColumnLabel(i+1);
                   //use reflection
                   Field field = Contact.class.getDeclaredField(columnLabel);
                   field.setAccessible(true);
                   field.set(contact, columnValue);
               }
               return contact;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps, rs);
        }
        return null;
    }

    public List<Contact> queryAllContacts(String sql, Object ...args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            rs = ps.executeQuery();
            //get meta data
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            List<Contact> contacts = new ArrayList<>();
            while (rs.next()) {
                Contact contact = new Contact();
                for (int i = 0; i < columnCount; i++) {
                    Object columnValue = rs.getObject(i+1);
                    String columnLabel = rsmd.getColumnLabel(i+1);
                    //use reflection
                    Field field = Contact.class.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(contact, columnValue);
                }
                contacts.add(contact);
            }
            return contacts;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps, rs);
        }
        return null;
    }

    //common use for insert, delete, update, becasue it does not require result set
    public void updateContact(String sql, Object ...args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps);
        }
    }

}
