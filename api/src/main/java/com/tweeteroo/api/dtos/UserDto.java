package com.tweeteroo.api.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto {
    @NotBlank(message = "Avatar Obrigatório")
    private String avatar;
   
    @NotBlank(message = "Username requerido")
    @Size(max = 100, message = "Tamanho excedido")
    private String username;
    
}
