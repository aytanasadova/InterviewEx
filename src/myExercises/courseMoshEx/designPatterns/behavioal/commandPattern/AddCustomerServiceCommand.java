package myExercises.courseMoshEx.designPatterns.behavioal.commandPattern;

import myExercises.courseMoshEx.designPatterns.behavioal.commandPattern.framework.Command;

public class AddCustomerServiceCommand implements Command {
    CustomerService customerService;

    public AddCustomerServiceCommand(CustomerService customerService){
        this.customerService=customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
