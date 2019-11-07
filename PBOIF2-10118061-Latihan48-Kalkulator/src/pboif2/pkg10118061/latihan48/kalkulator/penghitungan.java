/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan48.kalkulator;

/**
 *
 * @author Iqbal
 */
public class penghitungan {
    private double value1,value2,add,minus,multipe,division;

    penghitungan(double value1, double value2) {
        this.value1 = value1;
        this.value2 =value2;
            }

    
    public double getValue1() {
        
        return value1 ;
    }

    public double getValue2() {
        return value2 ;
    }

    public double getAdd() {
        return add = value1+value2;
    }

    public double getMinus() {
        return minus = value1-value2;
    }

    public double getMultipe() {
        return multipe=value1*value2;
    }

    public double getDivision() {
        return division= (value1/value2);
    }
    
   public void hasil(){
       System.out.println("Project Calculator");
       System.out.println("This project shown you how to manage method in java");
       System.out.println("Result Add is = "+getAdd());
        System.out.println("Result Minus is = "+getMinus());
         System.out.println("Result Multipele is = "+getMultipe());
          System.out.println("Result Division is = "+getDivision());
   }
    
}
