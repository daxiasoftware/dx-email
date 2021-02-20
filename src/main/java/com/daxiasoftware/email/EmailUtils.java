package com.daxiasoftware.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class EmailUtils {
    
    private static String host = "smtp.qq.com";
    private static int port = 587;
    private static String auth = "true";
    private static String timeout = "25000";
    private static String from = "441868461@qq.com";
    private static String username = "441868461@qq.com";
    private static String password = "rmvermbleowqbgeh";
    private static int retry = 3;
    private static int retryInterval = 5000;
    private static String socketFactoryClass = "javax.net.SocketFactory";
    private static String socketFactoryFallback = "false";
    
    public static void sendTextMsg() {
        
    }
    
    public static void sendHtmlMsg() {
        
    }
    
    public static void main(String[] args) throws Exception {
        Email email = new SimpleEmail();
        email.setHostName(host);
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(username, password));
        email.setSSL(true);
        email.setFrom(username);
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("441868461@qq.com");
        email.send();    
    }
}
