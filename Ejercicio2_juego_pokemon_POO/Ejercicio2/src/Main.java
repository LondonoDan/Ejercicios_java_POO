import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        String nombrePokemon1= JOptionPane.showInputDialog("Ingrese el nombre del pokemon");
        String nombrePokemon2= JOptionPane.showInputDialog("Ingrese el nombre del pokemon");

        pokemon1 Pokemon1 = new pokemon1(nombrePokemon1);
        Pokemon1.atacarAraniazo();
        Pokemon1.atacarAraniazo();
        Pokemon1.atacarAraniazo();



        pokemon2 Pokemon2= new pokemon2(nombrePokemon2);
        Pokemon2.defender();


        JOptionPane.showMessageDialog(null,"El nombre del pokemon participante es " +nombrePokemon1);
        JOptionPane.showMessageDialog(null,"El nombre del pokemon participante es " +nombrePokemon2);


        int puntospokemon1 = Pokemon1.totalpuntos();
        int puntospoken2 = Pokemon2.totalpuntos();

        if (puntospokemon1 > puntospoken2){
            JOptionPane.showMessageDialog(null,nombrePokemon1+ " Es el ganador de la partida");
        }else if (puntospokemon1 == puntospoken2){
            JOptionPane.showMessageDialog(null, "Hubo un empate entre los dos jugadores");
        }else{
            JOptionPane.showMessageDialog(null,nombrePokemon2+ " Es el ganador");
        }




    }
}