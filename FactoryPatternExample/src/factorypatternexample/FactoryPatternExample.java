
package factorypatternexample;

import java.util.Scanner;


public class FactoryPatternExample {

    
    public static void main(String[] args) {
        
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.print("What type of ship (U / R / B)");
        
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
            
            theEnemy = shipFactory.makeEnemyShip(enemyShipOption);
        }
        
        if (theEnemy != null){
            doStuffEnemy(theEnemy);
        }else System.out.println("Enter a U, R or B!!!");
        
      /*  EnemyShip ufoShip = new UFOEnemyShip();
        EnemyShip theEnemy = null;
        
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.print("What type of ship (U / R)");
        
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
            
        }
        
        if(enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        }else if(enemyShipOption.equals("R")){
            theEnemy = new RocketEnemyShip();
        }
             
        
        doStuffEnemy(theEnemy);
        * 
        * */
    }
    
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
        
    }
         
}
