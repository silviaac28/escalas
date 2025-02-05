package com.agencia.escala.application;

import com.agencia.escala.domain.entity.Escala;
import com.agencia.escala.domain.service.EscalaService;

public class FindEscalaUseCase {
    private final EscalaService escalaService;

    public FindEscalaUseCase(EscalaService escalaService) {
        this.escalaService = escalaService;
    }

    public Escala execute (int id){
        return escalaService.findEscala(id);
        //aaaa//
    }

    
}
