package edu.dan.DesafioControleFluxo;

public class ParametrosInvalidosException extends Throwable {
    public static void throwError() throws ParametrosInvalidosException {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
}
