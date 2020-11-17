/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinaredad;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class DeterminarEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar Fecha = Calendar.getInstance(); 
        Scanner leer = new Scanner(System.in); 
        
        //Declaracion de Variables
        
        int ano , dia, mes , AnoActual, DiaActual,
            MesActual, AnoSalida, DiaSalida, MesSalida;
        
        //Ingreso de datos
        
        System.out.println("Ingrese el año: ");
        ano = leer.nextInt();
        
        System.out.println("Ingrese el dia: ");
        dia = leer.nextInt();
        
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        
        AnoActual = Fecha.get(Calendar.YEAR); 
        DiaActual = Fecha.get(Calendar.DAY_OF_MONTH);
        MesActual = Fecha.get(Calendar.MONTH); 
        
        AnoSalida = ano - AnoActual; 
        DiaSalida = DiaActual - dia;
        MesSalida = MesActual - mes;
        
        //Salida de datos
        System.out.println("Su edad es: " +String.valueOf(Math.abs(AnoSalida))+ "\nTiene:" 
                + String.valueOf(Math.abs(MesSalida) + " meses y " 
                        + String.valueOf(Math.abs(DiaSalida)) ) +" dias ");        
    }
    
}
