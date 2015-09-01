package controllers;

/**
 * Created by Destion on 2015-09-01.
 */
public class Logger {

    public void log(String s){
        if (s.equals("yearly")){
            logyearly();
        } else {
            logmonthly();
        }
    }

    public void logyearly(){
        //TODO implement yearly logging
    }
    public void logmonthly(){
        //TODO implement monthly logging
    }
}
