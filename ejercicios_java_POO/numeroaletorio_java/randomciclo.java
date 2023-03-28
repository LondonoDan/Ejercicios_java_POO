import java.util.Random;
/////imprime numeros en cilos de 1 a 10 
public class Main{
    public static void main(String[] args)
    {
        Random numeroaletorio = new Random();
        int numVuelta;

        for (int i= 1; i<10; i++){
            numVuelta=numeroaletorio.nextInt(10);
            System.out.println(numVuelta);
        }
    

        
        

    }
    }