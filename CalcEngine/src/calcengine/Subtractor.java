/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcengine;

/**
 *
 * @author Szilard
 */
public class Subtractor extends CalculateBase {
    public Subtractor() {}
    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    
    @Override
    public void calculate() {
        double result = getLeftVal() - getRightVal();
        setResult(result);
    }
}
