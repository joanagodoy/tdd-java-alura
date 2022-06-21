package com.alura.javatestes;

import com.alura.javatestes.modelo.Funcionario;
import com.alura.javatestes.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BunusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaSalarioMuitoAlto(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Joana", LocalDate.now(), new BigDecimal("25000")));

        assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    void bonusDeveriaDezPorCento(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Joana", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaDezPorCentoParaSalarioExatamenteDezMilReais(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Joana", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
