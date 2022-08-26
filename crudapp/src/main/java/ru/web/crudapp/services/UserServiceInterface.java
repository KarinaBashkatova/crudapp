package ru.web.crudapp.services;

import ru.web.crudapp.model.User;

import java.util.List;

/**
 * @author Karina Bashkatova.
 */
public interface UserServiceInterface {
    List<User> showAllUsers ();
    User showUser (int id);
    void saveUser(User user);
    void update (int id, User updatedUser);
    void delete (int id);
}
