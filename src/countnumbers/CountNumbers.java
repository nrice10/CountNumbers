/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countnumbers;

/**
 *
 * @author NR10
 */
public class CountNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        counter(1);
    }
    
    public static void counter(int i){
       
        while (i >= 0) {
            System.out.println(i);
            i++;
        }
    }
}
