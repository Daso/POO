package guerrainterestelar;

import java.util.Scanner;


public class GuerraInterestelar {

    
    public static void main(String[] args) {
       
        ZergFactory zergFactory = new ZergFactory();
        
       Zerg enemigo = null;
       
       Scanner userInput = new Scanner(System.in);
       String opcionEnemigo = "";
       System.out.println("Qué enemigo? Z / U / M");
       
       if(userInput.hasNextLine()){
          opcionEnemigo = userInput.nextLine();
          enemigo = zergFactory.creadoraZerg(opcionEnemigo);
       }
       
       if(enemigo != null){
           accionesEnemigo(enemigo);
       }else System.out.println("Colocar Z o U o M");
       
       
       /* Esto debe desaparecer
       if(opcionEnemigo.equals("Z")){
           enemigo = new Zerling();
       }else if (opcionEnemigo.equals("U")){
           enemigo = new Ultralisk();
       }
       
        accionesEnemigo(enemigo);
       */
    }
    
    public static void accionesEnemigo(Zerg zerg){
        System.out.println(zerg.mostrarme());
        System.out.println(zerg.acechando());
        System.out.println(zerg.atacar());
    }
    
}
