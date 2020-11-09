package com.zyhang;

import com.zyhang.dao.ContactDao;
import com.zyhang.dao.ContactSQLDao;
import com.zyhang.pojo.Contact;
import com.zyhang.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * @author zyhang
 * @create 2020-09-30 11:48 AM
 */
public class testDao {

    @Test
    public void testConn() {
        ContactSQLDao contactSQLDao = new ContactSQLDao();
    }

    @Test
    public void testConn2() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
    }

    @Test
    public void testQuery() {
        ContactDao contactDao = new ContactDao();
        Contact contact = contactDao.getConatctById(1);
        System.out.println(contact);
    }

    @Test
    public void testQueryAll() {
        ContactDao contactDao = new ContactDao();
        List<Contact> contactList = contactDao.getAllContacts();
        System.out.println(contactList);
    }

    @Test
    public void testAdd() {
        ContactDao contactDao = new ContactDao();
        contactDao.addContact(new Contact(3, "han", "xu", "2134141", "hanq@qq.com"));
    }

    @Test
    public void testDelete() {
        ContactDao contactDao = new ContactDao();
        contactDao.deleteContactById(2);
    }

    @Test
    public void testUpdate() {
        ContactDao contactDao = new ContactDao();
        contactDao.updateContactFirstName("yiiyiuy", 1);
    }
}
