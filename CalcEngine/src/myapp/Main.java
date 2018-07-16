/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import calcengine.Adder;
import calcengine.CalculateBase;
import calcengine.CalculateHelper;
import calcengine.Divider;
import calcengine.DynamicHelper;
import calcengine.InvalidStatementException;
import calcengine.MathEquation;
import calcengine.MathProcessing;
import calcengine.Multiplier;
import calcengine.PowerOf;
import calcengine.Subtractor;

/**
 *
 * @author Szilard
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //useCalculateHelper();
        
        String[] statements = {
            "add 25 92",         // 25.0 + 92.0 = 117.0
            "power 5 2"          // 5.0 ^ 2.0 = 25.0
        };
        
        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
            new Adder(),
            new PowerOf()
        });
        
        for (String statement : statements) {
            String output = helper.process(statement);
            System.out.println(output);
        }
        
        System.out.println();
        
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100, 50, 'd');
        equations[1] = new MathEquation(25, 92, 'a');
        equations[2] = new MathEquation(225, 17, 's');
        equations[3] = new MathEquation(11, 3, 'm');
        
        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
        
        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();
        
        CalculateBase[] calculators = {
            new Divider(100, 50),
            new Adder(25, 92),
            new Subtractor(225, 17),
            new Multiplier(11, 3)
        };
        
        for (CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.print("result= ");
            System.out.println(calculator.getResult());
        }
    }
    static void useCalculateHelper() {
        String[] statements = {
            "add 1",
            "add xx 25",
            "addX 0.0 0.0",
            "divide 100 50",
            "add 25.0 92.0",
            "subtract 225.0 17.0",
            "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();

        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);                
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println("  Original exception: " + e.getCause().getMessage());
            }
            //System.out.print("result = ");
            //System.out.println(helper.result);
        }
    }
}
