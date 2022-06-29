package com.alura.javatestes;

import com.alura.javatestes.modelo.Desempenho;
import com.alura.javatestes.modelo.Funcionario;
import com.alura.javatestes.service.ReajusteService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerTresPorCentoQuandoDesempenhoDesejar(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Joana", LocalDate.now(), new BigDecimal("1000"));

        reajusteService.concederReajuste(funcionario, Desempenho.ADESEJAR);

        assertEquals(funcionario.getSalario(), new BigDecimal("1030.00"));
    }

    @Test
    public void reajusteDeveriaSerQuinzePorCentoQuandoDesempenhoBom(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Joana", LocalDate.now(), new BigDecimal("1000"));

        reajusteService.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(funcionario.getSalario(), new BigDecimal("1150.00"));
    }

    @Test
    public void reajusteDeveriaSerVintePorCentoQuandoDesempenhoOtimo(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Joana", LocalDate.now(), new BigDecimal("1000"));

        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(funcionario.getSalario(), new BigDecimal("1200.00"));
    }
}
