/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programameada;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author salcu
 */
public class ProgramameAda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        Pattern pattern=null;
            try{
                pattern  = Pattern.compile("\\d+");
            }catch(PatternSyntaxException e){            
                System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
              
            }
        int n=Integer.valueOf(ent.next(pattern));
        int p=Integer.valueOf(ent.next(pattern));
            
        while (n!=0 || p!=0) {
            int numero=0;
            for (int i = 1; i <=n; i++) {
                int termino=1;
                for (int j = 0; j < p; j++) {
                    //int factor=;
                    termino=((termino%46337)*i)%46337;
                }
                numero%=46337;
                numero=(numero+termino)%46337;
            }
            System.out.println(numero);
            n=Integer.valueOf(ent.next(pattern));
            p=Integer.valueOf(ent.next(pattern));
        }
        ent.close();
    }
    
}
 