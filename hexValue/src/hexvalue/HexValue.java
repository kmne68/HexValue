/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexvalue;

/**
 *
 * @author kemery
 */
public class HexValue {

    /**
     * @param args the command line arguments
     */
    
    static int decimalValue;
    static String inputValue;
    static String myValue;
    static int finalValue;
    
    public static void main(String[] args) {
        
        TextIO.putln("Please enter a hex value: ");
        inputValue = TextIO.getlnString();
          
        System.out.println("The decimal value of the hex number is: " + hexValue(inputValue));
              
    }
    
    
    public static int hexValue(String value) {
        
        myValue = value.toUpperCase();
        char testValue;
        int finalValue = 0;
        
        for(int i = 0; i < myValue.length(); i++)
        {
            testValue = myValue.charAt(i);
        
            if((Character.getNumericValue(testValue) >= 0 && Character.getNumericValue(testValue) <= 9)) 
                decimalValue = Character.getNumericValue(testValue);            
            else {            
                switch (testValue) {
                    case 'A': decimalValue = 10;
                        break;
                    case 'B': decimalValue = 11;
                        break;
                    case 'C': decimalValue = 12;
                        break;
                    case 'D': decimalValue = 13;
                        break;
                    case 'E': decimalValue = 14;
                        break;
                    case 'F': decimalValue = 15;
                        break;
                    default: decimalValue = -1;                   
                }    
            }
        }
        
        return decimalValue;
    }
}
