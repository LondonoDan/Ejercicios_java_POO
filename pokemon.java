package juego_pokemon;


public class pokemon extends abstractPokemon{

  

    public pokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
        for(int i=0; i<this.habilidades.length; i++){
            this.habilidades[i]= (int)(Math.random()*40+1);
        }
        
    }
   
  
    

   
    
}
