package com.io.ATMMachine.controller;

import com.io.ATMMachine.mapper.ClientMapper;
import com.io.ATMMachine.model.dto.TokenDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/security")
public class ClientRegistrationController {
    @PostMapping("/login")
    public ResponseEntity<TokenDTO> login(@RequestBody ClientMapper userDTO) {

        return null;
    }

}
