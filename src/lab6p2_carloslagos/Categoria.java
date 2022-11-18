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
public class Categoria {
    
    private String cat;

    public Categoria() {
    }

    public Categoria(String cat) {
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Categoria{" + "cat=" + cat + '}';
    }
    
    
}//fin clase
