package com.io.ATMMachine.repository;

import com.io.ATMMachine.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcClientRepository implements ClientRepository {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public JdbcClientRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<Client> findAll() {
        return null;
    }




    @Override
    public Optional<Client> findById(String id) {

        return null;
    }

    @Override
    public Client save(Client ingredient) {
        return null;
    }
}
