package calculatortutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculationListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          int firstNumber, secondNumber = 0;
          
            try {
                firstNumber =  theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                
                theModel.addTwoNumbers(firstNumber, secondNumber);
                
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (Exception ex) {
                theView.displayErrorMessage("Error in data");
            }
        }
        
    }
}
