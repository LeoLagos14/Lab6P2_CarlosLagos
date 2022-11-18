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
public class Alimento {
    
    private String nombre;
    private int costo,calorias;
    private Categoria cat;

    public Alimento() {
    }

    public Alimento(String nombre, int costo, int calorias, Categoria cat) {
        this.nombre = nombre;
        this.costo = costo;
        this.calorias = calorias;
        this.cat = cat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", costo=" + costo + ", calorias=" + calorias + ", cat=" + cat + '}';
    }
    
    
}//fin clase 

