/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwithmongo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author User
 */
public class Quections  {
    
    int Proton;
    double Massnumber;
    String Atomic;
   
    
  public List<String> getAtom(){
      
       List<String> list = new ArrayList<>(); 
       
       list.add("H");
       list.add("He");
       list.add("Li");
       list.add("Be");
       list.add("B");
       list.add("C");
       list.add("N");
       list.add("O");
       list.add("F");
       list.add("Ne");
       list.add("Na");
       list.add("Mg");
       list.add("Al");
       list.add("Si");
       list.add("P");
       list.add("S");
       list.add("Cl");
       list.add("Ar");
       list.add("K");
       list.add("Ca");
       
       
        return list;
      
      
       
      
  }
  
  public List<String> getQuection(){
      
       List<String> list = new ArrayList<>(); 
       
       list.add("What is the Atomic value of:");
       list.add("Find number of electron:");
       list.add("Find the number of nutrons:");
      
       
       
       
        return list;
      
      
       
      
  }
  
 
  
  public String getRandomElement(List<String> list) 
    { 
        Random rand = new Random(); 
        return list.get(rand.nextInt(list.size())); 
    } 
  
   
  
    
}
