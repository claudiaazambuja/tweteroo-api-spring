package com.tweeteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TweetDto {
    @NotBlank(message = "Texto requerido")
    @Size(max = 280, message = "Tamanho excedido")
    private String text;

    @NotNull
    private Long userId;
}
