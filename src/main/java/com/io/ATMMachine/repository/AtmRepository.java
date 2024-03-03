package com.io.ATMMachine.repository;

import com.io.ATMMachine.model.ATM;
import com.io.ATMMachine.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface AtmRepository extends JpaRepository<ATM, Long> {

    @Query("SELECT atm FROM ATM atm WHERE atm.bank.bankCode = :bankCode")
    List<ATM> findByBankCode(int bankCode);

    @Query("SELECT atm FROM ATM atm WHERE atm.atmNumber = :atmNumber")
    ATM findByAtmNumber(int atmNumber);


    @Query("SELECT atm FROM ATM atm")
    List<ATM> findAllAtmsWithBank();
}