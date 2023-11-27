package com.maxeeko.mvchiber.dao;

import com.maxeeko.mvchiber.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> getAllUsers() {
        var session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM User ", User.class)
                .getResultList();
    }

    @Override
    public void createUser(User user) {
        var session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public User getUserById(int id) {
        var session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        var session = sessionFactory.getCurrentSession();
        session.remove(session.get(User.class, id));
    }

    @Override
    public void updateUser(int id, User user) {
        var session = sessionFactory.getCurrentSession();
        var userToBeUpdated = session.get(User.class, id);
        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setSurname(user.getSurname());
        userToBeUpdated.setEmail(user.getEmail());
        userToBeUpdated.setPhoneNumber(user.getPhoneNumber());
    }
}
