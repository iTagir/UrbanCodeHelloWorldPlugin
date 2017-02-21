package com.timalika.UCDHelloWorldPlugin;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world plugin for UrbanCode deploy!
 *
 */
public class UCDHelloWorld 
{
    public static void main( String[] args )
    {
    	//get the working directory first
    	String workingDir = System.getProperty("user.dir");
    	System.out.println("Working Directory : " + workingDir);
    	
    	String propsFilePath = args[0];
    	Properties prop = new Properties();
    	InputStream input = null;

    	try {
    		input = new FileInputStream(propsFilePath);    		
    		// load a properties file
    		prop.load(input);
    		// get the property value and print it out
    		System.out.println("Message : " + prop.getProperty("message"));
    		
    	} catch (IOException ex) {
    		ex.printStackTrace();
    		System.exit(1);
    	} finally {
    		if (input != null) {
    			try {
    				input.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    				System.exit(1);
    			}
    		}
    	}
    	System.exit(0);
    }
}
