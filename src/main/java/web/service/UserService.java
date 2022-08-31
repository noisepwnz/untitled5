package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    public User findById(Integer id);

    public List<User> findAll() ;
    void update( User updatedUser);

    void delete(int id);
}
