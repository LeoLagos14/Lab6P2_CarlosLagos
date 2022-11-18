/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_carloslagos;

/**
 *
 * @author clago
 */
public class Billetera {
    
    private int conmax, costo;

    public Billetera() {
    }

    public Billetera(int conmax, int costo) {
        this.conmax = conmax;
        this.costo = costo;
    }

    public int getConmax() {
        return conmax;
    }

    public void setConmax(int conmax) {
        this.conmax = conmax;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Billetera{" + "conmax=" + conmax + ", costo=" + costo + '}';
    }
    
    
}//fin clase 
