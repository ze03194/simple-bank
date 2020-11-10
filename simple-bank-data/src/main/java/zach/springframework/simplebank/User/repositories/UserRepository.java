package zach.springframework.simplebank.User.repositories;

import zach.springframework.simplebank.User.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, String> {
    public User findByUserName(String name);


}


