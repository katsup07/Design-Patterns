import com.katsup.mediatorWithObserver;

public class Main {

    public static void main(String[] args) {
        SignUpDialogBox dialogBox = new SignUpDialogBox();
        dialogBox.usernameBox.setContent("Luke");
        dialogBox.passwordBox.setContent("123");
        dialogBox.agreeCheckBox.setChecked(true);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be true");
        System.out.println("1 ------------------------");
        dialogBox.usernameBox.setContent("Luke");
        dialogBox.passwordBox.setContent("");
        dialogBox.agreeCheckBox.setChecked(true);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be false");
        System.out.println("2 ------------------------");
        dialogBox.usernameBox.setContent("Luke");
        dialogBox.passwordBox.setContent("123");
        dialogBox.agreeCheckBox.setChecked(false);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be false");
        System.out.println("3 ------------------------");
        dialogBox.usernameBox.setContent("");
        dialogBox.passwordBox.setContent("123");
        dialogBox.agreeCheckBox.setChecked(true);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be false");
        System.out.println("4 ------------------------");dialogBox.usernameBox.setContent("");
        dialogBox.usernameBox.setContent("Luke");
        dialogBox.passwordBox.setContent("123");
        dialogBox.agreeCheckBox.setChecked(false);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be false");
        System.out.println("5 ------------------------");
        dialogBox.usernameBox.setContent("");
        dialogBox.passwordBox.setContent("123");
        dialogBox.agreeCheckBox.setChecked(false);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be false");
        System.out.println("6 ------------------------");
        dialogBox.usernameBox.setContent("Luke");
        dialogBox.passwordBox.setContent("");
        dialogBox.agreeCheckBox.setChecked(false);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be false");
        System.out.println("7 ------------------------");
        dialogBox.usernameBox.setContent("");
        dialogBox.passwordBox.setContent("");
        dialogBox.agreeCheckBox.setChecked(false);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be false");
        System.out.println("8 ------------------------");
        dialogBox.usernameBox.setContent("Luke");
        dialogBox.passwordBox.setContent("123");
        dialogBox.agreeCheckBox.setChecked(true);
        System.out.println(dialogBox.signUpButton.isEnabled());
        System.out.println("The above should be true");
        System.out.println("9 ------------------------");
        }


    }
