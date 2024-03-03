package com.io.ATMMachine.repository;

import com.io.ATMMachine.model.ATM;
import com.io.ATMMachine.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface AtmRepository extends JpaRepository<ATM,Long > {

    @Query("SELECT b FROM ATM b")
    List<ATM> readAll();

}
