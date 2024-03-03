package com.io.ATMMachine.mapper;


import com.io.ATMMachine.model.Client;
import com.io.ATMMachine.model.dto.ClientDTO;
import com.io.ATMMachine.model.dto.TokenDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    @Mapping(source = "userDTO.id", target = "id")
    @Mapping(source = "userDTO.username", target = "username")
    @Mapping(source = "userDTO.email", target = "email")
    Client userDTOToUser(ClientDTO userDTO);

    TokenDTO tokenToTokenDTO(String token);
}
