/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author TOSMIC
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=3;
        int c,d=0;
        int b= 4;
       int i=0;
        while(i<100){
            c=a+b;
            d=d+c;
                    System.out.println("The answer is "+ d);

            i++;
        }
    }
    
}
