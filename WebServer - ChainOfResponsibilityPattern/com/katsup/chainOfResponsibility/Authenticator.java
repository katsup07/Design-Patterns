package com.katsup.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authenticating...");

        var isValid = (request.getUsername() == "admin" && request.getPassword() == "1234");
        if(!isValid) System.out.println("Incorrect username or password. Authentication failed!");
        return !isValid;// valid users will make this false so the processing continues and the next handler is called.
                        // invalid users will make it true so the processing stops.
    }
}
