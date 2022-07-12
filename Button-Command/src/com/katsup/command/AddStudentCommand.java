package com.katsup.command;

import com.katsup.command.fx.Command;

public class AddStudentCommand implements Command {
    private StudentService studentService;
    public AddStudentCommand(StudentService studentService){
        studentService.addStudent();
    }
    @Override
    public void execute() {

    }
}
