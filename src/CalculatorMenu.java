import operators.*;

class CalculatorMenu {

    public void chooseoption(){
        System.out.println("Hello user, please state the option:"  +
                "\n(1) addition\n(2) subtraction\n(3) multiplication\n(4) division" +
                "\n(0) end program");
        Operation operation;
        var userInput = Userinput.handleinput();

        switch (userInput){
            case 1:
                operation = (new Addition()); //Der Variablen operation wird das neu erzeugte Objekt vom Typ Addition zugewiesen
                break;

            case 2:
                operation = new Substraction();
                break;

            case 3:
                operation = new Multiplication();
                break;

            case 4:
                operation = new Division();
                break;

            case 0:
                return;

            default:
                throw new IllegalStateException("Unexpected value: " + userInput);
        }
        System.out.println("Please input the first Number");
        double testNumberOne = Userinput.handleinput();
        System.out.println("Please input the second Number");
        double testNumberTwo = Userinput.handleinput();
        double testResult;
        testResult = operation.calc(testNumberOne,testNumberTwo);
        System.out.println(testResult);
    }

}
