import java.util.Random;
public class Main{
    public static void main(String[] args)
    {
        //Objetos de la clase Monoplaza con su respectivo metodo
        Random numeroaletorio1 = new Random();
        int numVuelta=0, primerLugar=0, segundoLugar=0, tercerLugar=0;
            numVuelta=numeroaletorio1.nextInt();
            numVuelta= (numeroaletorio1.nextInt(1000-500+1)+500);
            
            int tiempoMclaren=numVuelta;

            monoplaza mclaren = new monoplaza("mclaren", true, numVuelta);
            mclaren.encender();
            mclaren.darvuelta();
            mclaren.detener();


            numVuelta=numeroaletorio1.nextInt();
            numVuelta= (numeroaletorio1.nextInt(1000-500+1)+500);

            int tiempoFerrari=numVuelta;

            monoplaza ferrari = new monoplaza("ferrari", true, numVuelta);
            ferrari.encender();
            ferrari.darvuelta();
            ferrari.detener();


            numVuelta=numeroaletorio1.nextInt();
            numVuelta= (numeroaletorio1.nextInt(1000-500+1)+500);

            int tiempoRedbull=numVuelta;

            monoplaza redBull = new monoplaza("RedBull", true,numVuelta);
            redBull.encender();
            redBull.darvuelta();
            redBull.detener();

        //sacar el primer lugar
        if (tiempoMclaren < tiempoFerrari && tiempoMclaren < tiempoRedbull) {
            numVuelta=tiempoMclaren;
            primerLugar=tiempoMclaren;
             
        } else if (tiempoFerrari < tiempoMclaren && tiempoFerrari < tiempoRedbull) {
            numVuelta=tiempoFerrari;
            primerLugar=tiempoFerrari;
            
        } else if (tiempoRedbull < tiempoMclaren && tiempoRedbull < tiempoFerrari) {
            numVuelta=tiempoRedbull;
            primerLugar=tiempoRedbull;
            
        } else {
            numVuelta=0;
            System.out.println("Hubo un empate entre los monoplazas.");
        }

         // sacar el tercer lugar
        if (tiempoMclaren > tiempoFerrari && tiempoMclaren > tiempoRedbull) {
            numVuelta=tiempoMclaren;
            tercerLugar=tiempoMclaren;
        } else if (tiempoFerrari > tiempoMclaren && tiempoFerrari > tiempoRedbull) {
            numVuelta=tiempoFerrari;
            tercerLugar=tiempoFerrari;
            
        } else if (tiempoRedbull > tiempoMclaren && tiempoRedbull > tiempoFerrari) {
            numVuelta=tiempoRedbull;
            tercerLugar=tiempoRedbull;
        } else {
            numVuelta=0;
            System.out.println("Hubo un empate entre los monoplazas.");
        }

        //Segundo lugar
        segundoLugar= (tiempoMclaren+tiempoFerrari+tiempoRedbull) - (primerLugar + tercerLugar);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.println("TABLA DE POSICIONES");
        System.out.println("tercer lugar: " + tercerLugar);
        System.out.println("segundo lugar: " + segundoLugar );
        System.out.println("primer lugar: " + primerLugar );
        System.out.println(marca+ "La vuelta del monoplaza mas rapido fue: " + primerLugar);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        }
        
        
    }
    
    // Clase monoplaza con sus metodos.   
    public class monoplaza{
        public String marca;
        public boolean motor=true; 
        public int numVuelta;

    public monoplaza(String marca, boolean motor, int numVuelta){
        this.marca= marca;
        this.motor= motor;
        this.numVuelta = numVuelta;
    }
    public void encender(){
        if(this.motor == true){
            this.motor =true;
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println(this.marca + " apagado, iniciando encendido");
            System.out.println("El " + this.marca + " esta encedido");
        }
        else{
            this.motor=false;
            //System.out.println("El vehiculo " +this.marca+ " esta apagado");
        }
    }
    public void darvuelta(){
        if (this.motor==true){
            this.motor =true;
            System.out.println("El " +this.marca+ " esta dando la vuelta" );
            System.out.println("la vuelta del " + this.marca + " fue: " + numVuelta);
        }
    }  
    public void detener(){
            //System.out.println("Vehiculo en movimiento" );
            if (this.motor== true){
            System.out.println("El " + this.marca + " esta detenido" );
            this.motor =true;
            System.out.println("El " + this.marca + " esta apagado, fin de la prueba" );
        }       
         
    }    

}