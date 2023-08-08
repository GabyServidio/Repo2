/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author USUARIO
 */
public class Ej2G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Lavadora lava1= new Lavadora(6, 100900, "azul", 'B', 50);
    Televisor TV1= new Televisor(42, true, 89600.50, "negro", 'A', 8);
    
    lava1.precioFinal();
        System.out.println("el precio final de la lavadora es " + lava1.precioFinal());
    TV1.precioFinal();
        System.out.println("el precio final de la Tv es " + TV1.precioFinal());
    }
    
}
