package com.io.ATMMachine.controller;

import com.io.ATMMachine.model.Bank;
import com.io.ATMMachine.model.dto.BankDto;
import com.io.ATMMachine.service.BankService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/banks")
public class BankController {
    private final BankService bankService;

    @PostMapping
    public ResponseEntity<Bank> saveBank(@RequestBody Bank bank) {
        Bank savedBank = bankService.save(bank);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBank);
    }

    @GetMapping
    public ResponseEntity<Iterable<Bank>> findAllBanks() {
        Iterable<Bank> banks = bankService.findAllBanks();
        return ResponseEntity.ok(banks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BankDto> findBankById(@PathVariable Long id) {
        Optional<BankDto> bank = bankService.findBankById(id);
        return bank.map(b -> ResponseEntity.ok().body(b))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
