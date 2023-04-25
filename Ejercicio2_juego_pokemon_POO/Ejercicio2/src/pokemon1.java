import javax.swing.*;

public class pokemon1 extends Pokemon {

    protected int resultado;
    protected String nombrePokemon1;
    protected int puntos;

    public pokemon1(String nombrePokemon1) {
        this.nombrePokemon1 = nombrePokemon1;


    }

    @Override
    protected void atacarAraniazo() {
        puntos+=2;
        JOptionPane.showMessageDialog(null,this.nombrePokemon1+ ": Tienes " +puntos+ " Puntos por ataque arañazo");


    }
    @Override
    protected void atacarMordizco() {

    }

    @Override
    protected void atacarRugido() {

    }

    @Override
    protected void defender() {
        puntos+=1;
        JOptionPane.showMessageDialog(null,this.nombrePokemon1+ "Tienes " +puntos+ " Puntos por defenderte");

    }

    @Override
    protected int totalpuntos() {
        resultado = resultado+puntos;
        JOptionPane.showMessageDialog(null,this.nombrePokemon1+ ": Total de puntos obtenidos por ataques son:" +resultado);
        return resultado;


    }



}
