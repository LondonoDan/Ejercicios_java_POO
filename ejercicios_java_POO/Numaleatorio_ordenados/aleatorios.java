
import java.util.Random;
public class Main{
    public static void main(String[] args)
    {
       
    

    int tabla[]=new int[6];
    int i, j,x=0, aux;
 
    for(i=0; i<6; i++) {
	x=(int)(Math.random()*(49-1)+1);
	tabla[i]=x;
 
}
 
    for(i=0; i<6-1; i++) {
 
	    for(j=0; j<6-i-1; j++) {
 
		    if(tabla[j]>tabla[j+1]) {
 
			    aux=tabla[j];
			    tabla[j]=tabla[j+1];
			    tabla[j+1]=aux;
 
		}
	}
}
 
    for(i=0;i<tabla.length;i++) {
	System.out.println("Aleatorio=" +tabla[i]);
    }
}
}