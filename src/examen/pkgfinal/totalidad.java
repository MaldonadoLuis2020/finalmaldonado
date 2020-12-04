/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkgfinal;

/**
 *
 * @author Andrea
 */
public class totalidad {
   public int cantidad;
    public float precio;
     public float resultado;

    public totalidad(float resultado) {
        this.resultado = resultado;
        
    }

    public totalidad(int cantidad, float precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        resultado = cantidad*precio; 
    }
}
