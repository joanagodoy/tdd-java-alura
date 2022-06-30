package com.alura.javatestes;

import com.alura.javatestes.modelo.Desempenho;
import com.alura.javatestes.modelo.Funcionario;
import com.alura.javatestes.service.ReajusteService;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {
    ReajusteService reajusteService;
    Funcionario funcionario;

    @BeforeEach
    private void inicializar(){
        reajusteService = new ReajusteService();
        funcionario = new Funcionario("Joana", LocalDate.now(), new BigDecimal("1000"));
    }

    @AfterEach
    private void afterEach(){
        System.out.println("After Each");
    }

    @BeforeAll
    private static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    private static void afterAll(){
        System.out.println("After All");
    }

    @Test
    public void reajusteDeveriaSerTresPorCentoQuandoDesempenhoDesejar(){
        reajusteService.concederReajuste(funcionario, Desempenho.ADESEJAR);
        assertEquals(funcionario.getSalario(), new BigDecimal("1030.00"));
    }

    @Test
    public void reajusteDeveriaSerQuinzePorCentoQuandoDesempenhoBom(){
        reajusteService.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(funcionario.getSalario(), new BigDecimal("1150.00"));
    }

    @Test
    public void reajusteDeveriaSerVintePorCentoQuandoDesempenhoOtimo(){
        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(funcionario.getSalario(), new BigDecimal("1200.00"));
    }
}
