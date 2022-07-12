package src.com.katsup.command.fx;

import com.katsup.command.fx.Command;

public class Button {
    private String label;
    private Command command;

    public Button(Command command, String label){
        this.command = command;
        this.label = label;
    }


    public void click(){
        // Dependent on class where button is used
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
