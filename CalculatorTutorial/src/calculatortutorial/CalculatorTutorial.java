/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatortutorial;

/**
 *
 * @author Daso
 */
public class CalculatorTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        
        CalculatorController theController = new CalculatorController(theView, theModel);
        
        theView.setVisible(true);
    }
}
