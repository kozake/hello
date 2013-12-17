package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void stop(String id) {
    	if ("SECRET".equals(id)) {
	        Logger.info("shutdown processing write here...");

    		System.exit(0);
		}
    }
}
