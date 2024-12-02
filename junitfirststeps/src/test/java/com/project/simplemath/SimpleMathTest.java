package com.project.simplemath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.project.simpleMath.SimpleMath;

@DisplayName("Testes na classe SimpleMath")
public class SimpleMathTest {

    SimpleMath math = new SimpleMath();

    @Test
    @DisplayName("Soma 6.2 + 2 = 8.2")
    void testeSoma_seis_ponto_dois_mais_dois_is_oito_ponto_dois() {
        Double actual = math.sum(6.2D, 2D);
        Double expected = 8.2D;

        Assertions.assertEquals(expected, actual, () -> "The TestSum did not produce expect result");

        Assertions.assertNotNull(actual);

        Assertions.assertNotEquals(12.4, actual);
    }

    @Test
    @DisplayName("Subtração 6.2 - 2 = 4.2")
    void testeSubtracao_seis_ponto_dois_menos_dois_is_quatro_ponto_dois() {
        Double actual = math.subtraction(6.2D, 2D);

        Double expected = 4.2D;

        Assertions.assertEquals(expected, actual, () -> "The subtraction did not produce expected result");

        Assertions.assertNotEquals(0, actual);

        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Multiplicação 6.2 * 2 = 12.4")
    void testeMultiplicacao_seis_ponto_dois_vezes_dois_is_doze_ponto_quatro() {
        Double actual = math.multiplication(6.2D, 2D);

        Double expected = 12.4D;

        Assertions.assertEquals(expected, actual, () -> "The multiplication did not produce expected result");

        Assertions.assertNotEquals(4, actual);

        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Divisão 6 / 2 = 3")
    void testeDivisao_seis_divididopor_dois_is_tres() {
        Double actual = math.division(6D, 2D);

        Double expected = 3D;

        Assertions.assertEquals(expected, actual, () -> "The division did not produce expected result");

        Assertions.assertNotEquals(2, actual);

        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Divisão por zero")
    void testeDivisao_por_zero() {
        Double firstNumber = 6D;
        Double secondNumber = 0D;

        var expectedMessage = "Impossível dividir por zero";

        ArithmeticException actual = Assertions.assertThrows(ArithmeticException.class, () -> {
            math.division(firstNumber, secondNumber);
        }, () -> "divisão por zero pode capturar uma exceção");

        Assertions.assertEquals(expectedMessage, actual.getMessage(), () -> "mensagem de exceção inesperada.");
    }

    @Test
    @DisplayName("Media 6 + 2 / 2 = 4")
    void testeMedia_seis_and_dois_is_quatro() {
        Double actual = math.mean(6D, 2D);

        Double expected = 4D;

        Assertions.assertEquals(expected, actual, () -> "The mean did not produce expected result");

        Assertions.assertNotEquals(8, actual);

        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Raiz quadrada 25 = 5")
    void testeRaizQuadrada_vinte_e_cinco() {
        Double actual = math.squareRoot(25D);

        Double expected = 5D;

        Assertions.assertEquals(expected, actual, () -> "The squareRoot did not produce expected result");

        Assertions.assertNotEquals(6, actual);

        Assertions.assertNotNull(actual);
    }

}
