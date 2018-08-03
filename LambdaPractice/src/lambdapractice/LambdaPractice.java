/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdapractice;

/**
 *
 * @author Szilard
 */
public class LambdaPractice {

    /**
     * @param args the command line arguments
     */        
    

    public static void main(String[] args) {
        
        LambdaPractice greeter = new LambdaPractice();
        HelloWorld greeting = new HelloWorld();
        greeter.greet(greeting);
        
       //greet(() -> System.out.println("Hello World")); 
       //MyLambda myLambdaFunction = () -> System.out.println("Hello world");
       Greeting myLambdaFunction = () -> System.out.println("Hello world");
       MyAdd addFunction = (int a, int b) -> a + b;
        
    }
    
    //greetingFunction = () -> System.out.print("Hello World");
    
    //doubleNumberFunction = (int a) -> a * 2;   // one-liner, 'return' not needed
    
    /*safeDivideFunction = (int a, int b) -> {
        if (b == 0) return 0;
        return a / b;
            
    };*/
    
    public void greet (HelloWorld greeting){
        greeting.perform();
    }
    
}

interface MyLambda {
    void foo();
}

interface MyAdd {
    int add (int x, int y);
}
