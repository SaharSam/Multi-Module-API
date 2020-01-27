package me.sahar.dao;

import me.sahar.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public User find() {

        return new User("Ali");
    }
}
