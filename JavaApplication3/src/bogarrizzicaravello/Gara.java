/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bogarrizzicaravello;

/**
 *
 * @author 4ib
 */
public class Gara {
    private int data;
    private int oraInizio;
    Pista pisteDisponibili[]= new Pista[];
    Atleta atleti[] = new Atleta[];

    public Gara() {
    }

    public Gara(int data, int oraInizio) {
        this.data = data;
        this.oraInizio = oraInizio;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getOraInizio() {
        return oraInizio;
    }

    public void setOraInizio(int oraInizio) {
        this.oraInizio = oraInizio;
    }
    //xx
    
    
}
