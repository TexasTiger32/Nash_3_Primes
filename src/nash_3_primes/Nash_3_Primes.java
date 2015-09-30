/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nash_3_primes;

/**
 *
 * @author TexasTiger32
 */
public class Nash_3_Primes {

   public static void main(String[] args) {
        
       
       
       
       
       int evens = 0;
        for(int i = 0;i < 101; i++){
            if(isEven(i)){
             
            
            
            
            if(i % 2 == 0){
                 evens++;
                 
       isEven(i);
               
             }
        }   
        System.out.println(isPrime(i));
        
           
/* 
    What Is A Method?
      A method is a function * Like a Little Program That communicates with other programs by returning values * , e.g. 
    Like Square Root, something you might want to do again and again
*/
    

        
            // a return value is the type of
            // value you are giving back to the program
        }
}             
   static boolean isEven(int number){
        return (number % 2 == 0);  
        
 }
 static boolean isOdd(int number){
        return (number % 2 != 0); 
 }
 static boolean isPrime(int number){
     boolean prime = true;
     int divisors = 0;
     for(int i =2; i < number/2; i++){
         if(number % i == 0){
             prime = false;
         }
     }
 return prime;
 } 
 
 
 

        
     
      

                 
                 
                 
                 
                 
                 
                 
 //       for (int i = 0;i < 100;i++){
 //        if(i % 2 != 0){
  //              if(i % 3 != 0){
   //                 if(i % 5 != 0){
    //                    if(i % 7 != 0){
     //                       if(i % 11 != 0){
                        
                
     //           System.out.println(i+"Is not even");
            
        
            
          
