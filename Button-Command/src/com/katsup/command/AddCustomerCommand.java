package com.katsup.command;

import com.katsup.command.fx.Command;

// "-Command" suffix for every Command class
public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        customerService.addCustomer();
    }

    @Override
    public void execute() {

    }
}
