package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern;

import myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.framework.Button;

public class Main {
    public static void main(String[] args) {

        CustomerService customerService=new CustomerService();
        AddCustomerServiceCommand command=new AddCustomerServiceCommand(customerService);
        Button button=new Button(command);
        button.click();
    }
}
