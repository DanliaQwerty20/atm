package com.io.ATMMachine.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.io.ATMMachine.model.Client;

import java.util.Optional;


public interface ClientRepository  {

    Iterable<Client> findAll();

    Optional<Client> findById(String id);
    Client save(Client ingredient);

}

