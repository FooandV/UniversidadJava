/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Freyder
 */
public interface AccesoDatos {
    // te atributo nos va simular los registros en una tabla de base de datos    
    public static int MAX_REGISTROS=10;
    
    public abstract void insertar();
    public abstract void listar();
}
