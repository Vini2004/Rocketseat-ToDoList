package br.com.todolist.user;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {


    UserModel findByUsername(String username);

}
