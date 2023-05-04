
package juego_pokemon;

import javax.swing.JOptionPane;


public abstract class abstractPokemon implements Ipokemon{
    protected String nombrePokemon;
    public int totalAtaques=0;
    public int totalDefensas=0;
    protected String tipoPokemon;
    protected int defensa;
    protected int[] habilidades = new int[4];
    
    
   
    public int atacar() {
        JOptionPane.showMessageDialog(null,"Esta atacando : "+this.nombrePokemon);
        this.totalAtaques = this.habilidades[(int)(Math.random()*3)];
        JOptionPane.showMessageDialog(null,"Mis puntos de ataque son: "+this.totalAtaques);
        return this.totalAtaques;
        
    }

  
   
    public int defender() {
       
        JOptionPane.showMessageDialog(null," Esta defendiendo " +this.nombrePokemon);
        this.totalDefensas = (int)(Math.random()*15+1);
        JOptionPane.showMessageDialog(null,"Mis puntos de defensa son: "+this.totalDefensas);
        return this.totalDefensas;
    }
    
     
}
