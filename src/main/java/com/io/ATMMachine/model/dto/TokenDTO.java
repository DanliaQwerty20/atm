package com.io.ATMMachine.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Builder
@Getter
public class TokenDTO {
    private String accessToken;
}
