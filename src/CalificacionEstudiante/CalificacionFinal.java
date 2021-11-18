
package CalificacionEstudiante;

import java.util.Scanner;

/*La calificacion final de un estudiante de informatica se calcula con base a las calificaciones 
de cuatro aspectos de su rendimiento academico: 
1 participacion, 2 primer examen parcial, 3 segundo examen parcial y 4 examen final. 
Sabiendo que las calificaciones anteriores entran a la calificacion 
final con ponderaciones del 10% 25% 25% 40%.
Hacer un programa que calcule e imprima la calificacion 
final obtenida por un estudiante.*/

public class CalificacionFinal {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        float participacion, primerExa, segundoExa, examenFinal;// Con Float usamos poca memoria
        double calificacionFinal;
        
        System.out.println("ESTE PROGRAMA CALCULA E IMPRIME LA CALIFICACION FINAL DE UN ESTUDIANTE");
        
        //Pedimos las datos de las notas
        System.out.println("Ingrese la nota de participacion: ");
        participacion = entrada.nextFloat();
        
        System.out.println("Cual es la nota del primer parcial?: ");
        primerExa = entrada.nextFloat();
        System.out.print("\nMay I have the nota del segundo parcial?: ");
        segundoExa = entrada.nextFloat();
        System.out.print("\nLa nota del examen final es??: ");
        examenFinal = entrada.nextFloat();
        
        
        /* Este seria otra forma de hacer el calculo para encontrar LA calificacion FINAL del estudiante
        
        participacion *= 0.1f;
        primerExa *= 0.25f;
        segundoExa *= 0.25f;
        examenFinal *= 0.4f; */       
        
        
        calificacionFinal = (float) (participacion * 0.10) + (primerExa * 0.25) + (segundoExa * 0.25)+ (examenFinal * 0.40);
        
        //Mostramos en pantalla el resultado o calificacion final    15   14   17  19
        System.out.println("La Calificacion final obtenida es: "+calificacionFinal);
        
    }
}