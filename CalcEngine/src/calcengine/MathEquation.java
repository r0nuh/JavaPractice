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
public class MathEquation {
    private double leftVal, rightVal, result;
    private char opCode = 'a';
    
    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double righVal) {this.rightVal = righVal;}
    public char getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}
    
    public double getResult() {return result;}
    
    public MathEquation() {}
    
    public MathEquation(char opCode){
        this.opCode = opCode;
    }
    
    public MathEquation(double leftVal, double rightVal, char opCode){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    
    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        
        execute();
    }
    
    public void execute(){
        switch(opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Erro - invalid opCode");
                result = 0.0d;
                break;
        }
    }
    
}
