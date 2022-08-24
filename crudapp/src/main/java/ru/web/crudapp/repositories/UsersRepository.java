package ru.web.crudapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.web.crudapp.model.User;

/**
 * @author Karina Bashkatova.
 */
@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

}
