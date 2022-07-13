package com.codewithmosh1.mediator;

public class SignUpDialogBox {
    // TODO - Change these to private. They are only public for testing.
  public  TextBox usernameBox = new TextBox();
  public  TextBox passwordBox = new TextBox();
  public  CheckBox agreeCheckBox = new CheckBox();
  public  Button signUpButton = new Button();

    public SignUpDialogBox(){
        usernameBox.attach(()-> controlChanged());
        passwordBox.attach(()-> controlChanged());
        agreeCheckBox.attach(()-> controlChanged());
    }

    private void controlChanged(){
        if(isFormValid()) signUpButton.setEnabled(true);
        else signUpButton.setEnabled(false);
    }

    private boolean isFormValid(){
        return !usernameBox.isEmpty() && !passwordBox.isEmpty() && agreeCheckBox.isChecked();

    }

}
