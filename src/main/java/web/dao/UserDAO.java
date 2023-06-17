package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUsers(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(int id);
}
