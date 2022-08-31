package web.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
@Component
public class UserServiceImpl implements  UserService {

    private final UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);

    }
    @Transactional
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);

    }
    @Transactional
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Transactional
    @Override
    public void update(User updatedUser) {
         userDao.update(updatedUser);
    }
    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
