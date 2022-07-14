package com.katsup.chainOfResponsibility;

public class WebServer {// Has the first handler in the chain for processing requests
    private Handler handler;

    public WebServer(Handler handler) {
        // In real app would check to make sure the handler is not null first
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        handler.handle(request);
    }
}
// Originally were going to do this here
//Auth
//Logging
//Compression