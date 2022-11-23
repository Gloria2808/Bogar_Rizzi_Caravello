/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bogarrizzicaravello;

public class Pista {
    
    private int numero;
    private String condizioni;
    private int lunghezza;
    private int nCorsie;
    
    public Pista(){} //Costruttore vuoto
    
    public Pista(int numero, String condizioni, int lunghezza, int nCorsie){
        this.numero=numero;
        this.condizioni=condizioni;
        this.lunghezza=lunghezza;
        this.nCorsie=nCorsie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCondizioni() {
        return condizioni;
    }

    public void setCondizioni(String condizioni) {
        this.condizioni = condizioni;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getnCorsie() {
        return nCorsie;
    }

    public void setnCorsie(int nCorsie) {
        this.nCorsie = nCorsie;
    }
    
    
    
}
