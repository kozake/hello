package controllers;

import play.*;
import play.jobs.*;
 
@OnApplicationStart
public class Bootstrap extends Job {
    
    public void doJob() {
        Logger.info("Hello startup.");
    }
    
}
