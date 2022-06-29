package com.alura.javatestes.service;

import com.alura.javatestes.modelo.Desempenho;
import com.alura.javatestes.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {


    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if(desempenho.equals(Desempenho.ADESEJAR)){
            funcionario.aplicaReajuste(new BigDecimal("0.03"));
        }else if(desempenho.equals(Desempenho.BOM)){
            funcionario.aplicaReajuste(new BigDecimal("0.15"));
        }else if(desempenho.equals(Desempenho.OTIMO)){
            funcionario.aplicaReajuste(new BigDecimal("0.20"));
        }
    }
}
