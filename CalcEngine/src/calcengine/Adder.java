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
public class Adder extends CalculateBase implements MathProcessing{
    public Adder(){}
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }
    
    @Override
    public void calculate() {
        double result = getLeftVal() + getRightVal();
        setResult(result);
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        
        return getResult();
    }
}
