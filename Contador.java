package edu.dan.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int firstParam = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o segundo parâmetro: ");
        int secondParam = scanner.nextInt();

        try {
            count(firstParam, secondParam);
        }catch (ParametrosInvalidosException e){}
    }

    static void count(int firstParam, int secondParam) throws ParametrosInvalidosException {
        if(firstParam > secondParam){
            ParametrosInvalidosException.throwError();
        }

        int count = secondParam - firstParam;

        for(int i = 1; i <= count; i++){
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }
}