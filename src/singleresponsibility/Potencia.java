/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility;

import java.util.Scanner;

/**
 *
 * @author almaangelica
 */
public class Potencia {
    //lleva a cabo las operaciones aritmeticasss
    
    public void potenciaNums(){
        Scanner CherryMx =new Scanner(System.in);
        datosNumeros Nums=new datosNumeros();
        System.out.println("Ingresa el numero a elevar");
        Nums.setNum1(CherryMx.nextInt());
        System.out.println("Ingresa la potencia");
        Nums.setNum2(CherryMx.nextInt());

        
        double resultado = Math.pow(Nums.getNum1(),Nums.getNum2());
        System.out.println("La potencia del numero es: "+resultado);
        
    }
}
