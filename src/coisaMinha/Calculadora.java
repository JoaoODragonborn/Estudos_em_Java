package coisaMinha;

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        
        int numa;
        int numb;
        String symbol;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com a operacao a ser realizada (+, - ou *):");
        symbol = entrada.next();
        System.out.println("Entre com o primeiro numero:");
        numa = entrada.nextInt();
        System.out.println("Entre com o segundo numero:");
        numb = entrada.nextInt();
        
        entrada.close();
        
        switch(symbol){
            case "+":
                System.out.println(numa + numb);
                break;
            case "-":
                System.out.println(numa - numb);
                break;
            case "*":
                System.out.println(numa * numb);
                break;
            default:
                System.out.println("Operação invalida");
                break;
        }
        
        
    }
}