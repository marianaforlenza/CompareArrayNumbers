
package comparearraynumbers;

import java.util.Scanner;

public class CompareArrayNumbers {

    
    public static void main(String[] args) {
        int n=0;
        int mayor=0;
        int num=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números que desea comparar");
        n=sc.nextInt();
        int Vector []=new int [n];
        
        
       for (int i=0;i<Vector.length;i++){
        
        System.out.println("Ingrese un número");
        num=sc.nextInt();
        if (i==0){
        mayor=num;
        }
        
        if (num>mayor){
        mayor=num;
    }
    
}
       
        System.out.println("El número mas grande es: "+mayor);
}
}