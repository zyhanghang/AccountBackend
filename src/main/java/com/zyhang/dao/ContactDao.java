package com.zyhang.dao;

import com.zyhang.pojo.Contact;

import java.util.List;

/**
 * @author zyhang
 * @create 2020-09-30 1:36 PM
 */
public class ContactDao {

    private ContactSQLDao contactSQLDao = new ContactSQLDao();

    public ContactDao() {
    }

    public Contact getConatctById(int id) {
        String sql = "select contact_id id, contact_firstname firstName, contact_lastname lastName " +
                "contact_phone phone, contact_email email from contact where contact_id = ?";
        return contactSQLDao.queryContact(sql, id);
    }

    public List<Contact> getAllContacts() {
        String sql = "select contact_id id, contact_firstname firstName, contact_lastname lastName, " +
                "contact_phone phone, contact_email email from contact";
        return contactSQLDao.queryAllContacts(sql);
    }

    public void addContact(Contact contact) {
        int id = contact.getId();
        String firstName = contact.getFirstName();
        String lastName = contact.getLastName();
        String phone = contact.getPhone();
        String email = contact.getEmail();

        String sql = "insert into contact values(?,?,?,?,?)";
        contactSQLDao.updateContact(sql, id, firstName, lastName, phone, email);
    }

    public void deleteContactById(int id) {
        String sql = "delete from contact where contact_id = ?";
        contactSQLDao.updateContact(sql, id);
    }

    public void updateContactFirstName(String firstName, int id) {
        String sql = "update contact set contact_firstname = ? where contact_id = ?";
        contactSQLDao.updateContact(sql, firstName, id);
    }
    public void updateContactLastName(String lastName, int id) {
        String sql = "update contact set contact_lastname = ? where contact_id = ?";
        contactSQLDao.updateContact(sql, lastName, id);
    }
    public void updateContactPhone(String phone, int id) {
        String sql = "update contact set contact_phone = ? where contact_id = ?";
        contactSQLDao.updateContact(sql, phone, id);
    }
    public void updateContactEmail(String email, int id) {
        String sql = "update contact set contact_email = ? where contact_id = ?";
        contactSQLDao.updateContact(sql, email, id);
    }

}
