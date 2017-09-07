/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility;

/**
 *
 * @author almaangelica
 */
public class datosNumeros {
    private double Num1;
    private double Num2;
//los datos son declarados
    //se encapsulan  para que no sea posible acceder a ellos de forma directa

    public double getNum1() {
        return Num1;
    }

    public void setNum1(double Num1) {
        this.Num1 = Num1;
    }

    public double getNum2() {
        return Num2;
    }

    public void setNum2(double Num2) {
        this.Num2 = Num2;
    }
   
    
}
