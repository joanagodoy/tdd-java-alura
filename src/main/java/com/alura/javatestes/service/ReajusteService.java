package com.alura.javatestes.service;

import com.alura.javatestes.modelo.Desempenho;
import com.alura.javatestes.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {


    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        funcionario.aplicaReajuste(desempenho.percentualReajuste());
    }
}
