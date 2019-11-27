/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwithmongo;

/**
 *
 * @author User
 */
public abstract class Store extends quection {
    
   @Override
   public String Atomic(String Atomic){
       String ss;
       ss=super.Atomic(Atomic);
       return ss;
       
   }
 
   public abstract int  getAtomic(String Atomic);
   public abstract double getMass(String Atomic);
   public abstract double[] isotopic(String string);  
   public  abstract int count(double[] result);
}
