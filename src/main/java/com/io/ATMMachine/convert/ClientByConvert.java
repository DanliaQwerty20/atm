package com.io.ATMMachine.convert;


import com.io.ATMMachine.model.Client;
import com.io.ATMMachine.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClientByConvert implements Converter<String, Optional<Client>> {
    private ClientRepository clientRepository;
    @Autowired
    public ClientByConvert(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @Override
    public Optional<Client> convert(String id) {
        return clientRepository.findById(id);
    }


}
