
package vistas;

import controllers.MatriculaController;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatriculaView {
    private MatriculaController matriculaController;

    public MatriculaView() {
        matriculaController = new MatriculaController();
    }        
        
    public void evaluarOpcion(char opcion){
        String codigo = " ";
        String nombre = " ";
        String apellido= " ";
        if (opcion == '1'){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("ingrese el código");
                codigo = in.readLine();
                System.out.println("ingrese el nombre");
                nombre = in.readLine();
                System.out.println("ingrese el apellido");
                apellido = in.readLine();                                
            } catch (Exception e) {
           
        }
         matriculaController.matricular(codigo, nombre, apellido);   
        }
        else if(opcion == '2'){
            System.out.println(matriculaController.reporteMatricula());
        }
        
        else{
          System.out.println("No válido");
        }
            
    }
    
    
    public void matricular(){
        char opcion;
        opcion = ' ';
        while(opcion != '3'){
          mostrarMenu();
          opcion = leerOpcion();
          evaluarOpcion(opcion);
        }
    }
    
    public char leerOpcion(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char opcion = ' ';
        try {
            opcion = in.readLine().charAt(0);
        } catch (Exception e) {
        }
        
       return opcion;
    }
    
    
    public void mostrarMenu(){
        String menu = "Bienvenido al sistema \n";
        menu += "1 para matricular a un alumno \n";
        menu += "2 para listar alumnos matriculados \n";
        menu += "3 para salir";
        System.out.println(menu);        
    }
}
