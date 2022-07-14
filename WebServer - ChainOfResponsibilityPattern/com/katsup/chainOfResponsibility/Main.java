package com.katsup.chainOfResponsibility;

public class Main {
  
    public static void main(String[] args) {
       // Case 1
       // authenticator -> logger -> compressor
       var compressor = new Compressor(null);
       var logger = new Logger(compressor);
       var authenticator = new Authenticator(logger);

       var server = new WebServer(authenticator);
       server.handle(new HttpRequest("admin", "1234"));

       System.out.println("----------------------------");

       // Case 2
       // This system is open to extensions and closed to modifications.
       // No need to modify the source code
       // Can simply bypass the logging step if need be as follows.
       // authenticator -> compressor
       var compressor2 = new Compressor(null);
       var authenticator2 = new Authenticator(compressor2);
       var server2 = new WebServer(authenticator2);
       server2.handle(new HttpRequest("admin", "1234"));

       System.out.println("-----------------------------");

       // Case 3
       // Can add a new handler easily
       // authenticator -> logger -> compressor -> encrypter
       var encrypter3 = new Encrypter(null);
       var compressor3 = new Compressor(encrypter3);
       var logger3 = new Logger(compressor3);
       var authenticator3 = new Authenticator(logger3);
       var server3 = new WebServer(authenticator3);
       server3.handle(new HttpRequest("admin", "1234"));
    }
}

