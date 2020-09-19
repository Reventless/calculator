import operators.Addition;

import java.util.Scanner;

class CalculatorMenu {

    public void chooseoption(){
        System.out.println("Hello user, please state the option:\n(1) addition\n(2) subtraction\n(3) multiplication\n(4) division");

        switch (Userinput.handleinput()){

            case 1:{
                Addition();

                break;
            }
            case 2:{
                Subtraction();

                break;
            }
        }
    }
}