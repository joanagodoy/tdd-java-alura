package com.alura.javatestes;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int soma = calc.somar(3, 7);
        System.out.println(soma);

        soma = calc.somar(3, 0);
        System.out.println(soma);

        soma = calc.somar(0, 0);
        System.out.println(soma);

        soma = calc.somar(3, -2);
        System.out.println(soma);

    }
}
