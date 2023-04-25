import javax.swing.*;

public abstract class Pokemon {
    protected String nombrePokemon;
    protected String tipoPokemon;

    protected abstract void atacarAraniazo();
    protected abstract void atacarMordizco();
    protected abstract void atacarRugido();

    protected abstract void defender();

    protected abstract int totalpuntos();


}
