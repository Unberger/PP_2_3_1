package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> showAllUser ();

    User getUserById(int id);

    void save(User user);
    void update(int id, User user);
    void delete(int id);
}
