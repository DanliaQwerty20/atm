package com.io.ATMMachine.controller;

import com.io.ATMMachine.model.ATM;
import com.io.ATMMachine.model.dto.ATMDto;
import com.io.ATMMachine.model.dto.AtmWithBankDto;
import com.io.ATMMachine.service.AtmService;
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
@RequestMapping("/atm")
public class AtmController {


    private final AtmService atmService;

    @PostMapping
    public ResponseEntity<ATM> saveAtm(@RequestBody ATM atm) {
        ATM savedAtm = atmService.save(atm);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAtm);
    }

    @GetMapping
    public ResponseEntity<List<ATM>> findAllAtm() {
        List<ATM> atms = atmService.findAllBanks();
        return ResponseEntity.ok(atms);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ATMDto> findAtmById(@PathVariable Long id) {
        Optional<ATMDto> atm = atmService.findBankById(id);
        return atm.map(b -> ResponseEntity.ok().body(b))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/with-bank")
    public List<AtmWithBankDto> findAllAtmsWithBank() {
        return atmService.findAllAtmsWithBank();
    }
}