import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class CCDC {
    public static void main(String[] args) {
	System.out.println("Enter Credit/Debit card details : ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] ch = new String[a.length()];
        int o,e,s,t;
        o=0;
        e=0;
        int q = a.charAt(0)- '0';
        int w =a.charAt(1)- '0';
        if((a.charAt(0)- '0')==5){
        for(int p=1;p<a.length();p+=2){
            
            t=(a.charAt(p)- '0');
            o+=t;
        }
        for(int p=0;p<a.length();p+=2){
            
            t=(a.charAt(p)- '0')*2;
            
            e =e+(t/10) + (t%10);
            //System.out.println (e);
        }
        if((o+e)%10 == 0){
            
             System.out.println("Card is valid and it is master  card");}
 
         else
         System.out.println("Card is not valid");}


            
        else if((a.charAt(0)-'0')==4){
            for(int p=0;p<a.length();p+=2){
                
                t=(a.charAt(p)- '0');
                o+=t;
            }
            for(int p=1;p<a.length();p+=2){
               
                t=(a.charAt(p)- '0')*2;
                e =e+(t/10) + (t%10);
                //System.out.println (e);
            }      
            
            if((o+e)%10 == 0){         

                System.out.println("Card is valid and it is visa card");}
                
               else
                System.out.println("Card is not valid");}

                else
                System.out.println("Card is not valid");



            ///
           
        
    
}
    }