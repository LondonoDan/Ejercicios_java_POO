
package juego_pokemon;

import javax.swing.JOptionPane;

public class JuegoPokemon {

   
    public static void main(String[] args) {
        int puntosPokemon1=0;
        int puntosPokemon2=0;
        
        String nombrePokemon= JOptionPane.showInputDialog("Ingrese el nombre del pokemon1 " );
        pokemon pokemon1 = new pokemon(nombrePokemon);
        
        
        String nombrePokemon2= JOptionPane.showInputDialog("Ingrese el nombre del pokemon2 " );
        pokemon pokemon2 = new pokemon(nombrePokemon2);
        
        
        JOptionPane.showMessageDialog(null,"El nombre de los participantes son:  " +pokemon1.nombrePokemon+ " y " +pokemon2.nombrePokemon);
        
        for (int i=0; i<3; i++){
            pokemon1.atacar();
            pokemon2.defender();
            
            if (pokemon1.totalAtaques > pokemon2.totalDefensas){
                puntosPokemon1++;
                 
            }else{
                puntosPokemon2++;


            }

            pokemon2.atacar();
            pokemon1.defender();
            if (pokemon2.totalAtaques > pokemon1.totalDefensas){
                puntosPokemon2++;
                

            }else{
                puntosPokemon1++;


            }
        }
        
        if (puntosPokemon1 > puntosPokemon2){
            JOptionPane.showMessageDialog(null,"EL GANADOR DEL JUEGO ES: "+pokemon1.nombrePokemon+ " ¡FELICITACIONES! puntos: " +puntosPokemon1);
        }
        
        else if (puntosPokemon1 == puntosPokemon2){
            JOptionPane.showMessageDialog(null,"HUBO UN EMPATE ENTRE LOS DOS JUGADORES, NADIE GANA");
        }
        
        else{
                
               JOptionPane.showMessageDialog(null,"EL GANADOR DEL JUEGO ES: "+pokemon2.nombrePokemon+ " ¡FELICITACIONES! puntos: "+puntosPokemon2);


            }
        
        
        
       
        
        
       
    }
    
}
