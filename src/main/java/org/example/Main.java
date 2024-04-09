package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rates rates = new Rates();

        while (true){
            System.out.println("INGRESE EL NOMBRE DE LA MONEDA A LA CUAL QUIERE INTERCAMBIAR");
            rates.setCurrencyName(scanner.next());
            System.out.println("INGRESE EL MONTO QUE QUIERE INTERCAMBIAR");

            double amountExchange = Double.parseDouble(scanner.next());
            rates.setAmountExchange(amountExchange);

            System.out.println("INGRESE EL CAMBIO ACTUAL DE DICHA MONEDA (o 0 para cerrar el programa)");

            double exchangeRate = Double.parseDouble(scanner.next());
            try {
                if (exchangeRate == 0){
                    break;
                } else {
                    rates.setExchangeRate(exchangeRate);
                    double value = rates.calcExchange(rates.getExchangeRate(), rates.getAmountExchange());
                    System.out.println("SU CAMBIO ES EL SIGUIENTE:" + value);
                }
            } catch (Exception e){
                System.out.println("error " + e);
            }

        }
    }
}
