import java.util.Random;
/////imprime un numero entre 1 a 10 
public class Main{
    public static void main(String[] args)
    {
        
        Random numeroaletorio1 = new Random();
        int numVuelta;
        numVuelta= (numeroaletorio1.nextInt(1000-500+1)+500);
        System.out.println(numVuelta);
    
    

}
}