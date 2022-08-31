package web.dao;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    public User findById(Integer id);

    public List<User> findAll() ;
    void update( User updatedUser);

    void delete(int id);

//    public String edit (Model model, @PathVariable("id") int id);

}
