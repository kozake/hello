package controllers;

import play.*;
import play.jobs.*;
 
@OnApplicationStop
public class Shutdown extends Job {
    
    public void doJob() {
        Logger.info("Hello shutdown.");
    }
    
}
