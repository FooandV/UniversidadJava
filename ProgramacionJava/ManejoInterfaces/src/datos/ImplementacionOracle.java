/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Freyder
 * esta clase va simular las operaciones de insertar() y listar()
 * NOta: A diferencia del extends de una clase abstracta, una interface puede implementar
 * varias interfaces, ejemplo:
 * public class ImplementacionOracle implements  Interface1, Interface2..
 * 
 * en cambio una clase en java solamente puede extender de una clase
 * ya sea abstracta o no,
 */
public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("insertar desde Oracle"); ;
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");;
    }
    
}
