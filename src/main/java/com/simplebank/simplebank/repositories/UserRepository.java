package com.simplebank.simplebank.repositories;

import com.simplebank.simplebank.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, String> {


}


