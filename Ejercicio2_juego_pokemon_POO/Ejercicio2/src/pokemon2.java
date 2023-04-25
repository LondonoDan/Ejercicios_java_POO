import javax.swing.*;

public class pokemon2 extends Pokemon {
    protected String nombrePokemon2;
    protected int puntos;
    protected int resultado;

    public pokemon2(String nombrePokemon2) {
        this.nombrePokemon2 = nombrePokemon2;
    }


    @Override
    protected void atacarAraniazo() {
        puntos+=2;
        JOptionPane.showMessageDialog(null,this.nombrePokemon2+ ": Tienes " +puntos+ " Puntos por ataque arañazo");


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
        JOptionPane.showMessageDialog(null,this.nombrePokemon2 + ": Tienes " +puntos+ " Puntos por defenderte");


    }

    @Override
    protected int totalpuntos() {
        resultado = resultado+puntos;
        JOptionPane.showMessageDialog(null,this.nombrePokemon2+ ": Total de puntos obtenidos son:" +resultado);
        return resultado;
    }
}
