/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_carloslagos;

import java.util.ArrayList;

/**
 *
 * @author clago
 */
public class Jugadores {
    
    private String nombre, usuario;
    private int nivel,punto;
    private Alimento alimento;
    private ArrayList<Jugadores> amigos = new ArrayList();
    private ArrayList<Jugadores> solicitudes = new ArrayList();

    public Jugadores() {
    }

    public Jugadores(String nombre, String usuario, int nivel, int punto, Alimento alimento) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.nivel = nivel;
        this.punto = punto;
        this.alimento = alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPunto() {
        return punto;
    }

    public void setPunto(int punto) {
        this.punto = punto;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public ArrayList<Jugadores> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Jugadores> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Jugadores> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Jugadores> solicitudes) {
        this.solicitudes = solicitudes;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", usuario=" + usuario + ", nivel=" + nivel + ", punto=" + punto + ", alimento=" + alimento + ", amigos=" + amigos + ", solicitudes=" + solicitudes + '}';
    }
    
    
    
    
}//fin clase
