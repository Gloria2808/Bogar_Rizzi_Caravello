/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bogarrizzicaravello;

public class Atleta {
    
    String nome;
    String cognome;
    String dataDiNascita;
    int specialità[];
    


public Atleta(){

}

public  Atleta(String nome, String cognome, String dataDiNAscita, int specialità[]){

    this.nome=nome;
    this.cognome=cognome;
    this.dataDiNascita=dataDiNascita;
    this.specialità=specialità;  
}

public String getNome(){ //getnome
    return nome;
}
public String getCognome(){
    return cognome;
}

public String getDataDiNascita(){
    return dataDiNascita ;
}

public int[] getSpecialità(){
    return specialità;
}

public void setNome(String nome){
    this.nome=nome;
}

public void setCognome(String cognome){
    this.cognome=cognome;
}
public void setDataDiNascita(String dataDiNascita){
    this.dataDiNascita=dataDiNascita;
}
public void setSpecialità(int specialità[]) {
    this.specialità=specialità;
}

}

