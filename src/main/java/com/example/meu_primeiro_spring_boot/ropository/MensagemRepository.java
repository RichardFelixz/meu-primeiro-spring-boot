package com.example.meu_primeiro_spring_boot.ropository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {

    public String obterMensagem() {
        return "Olá repositório";
    }
}
