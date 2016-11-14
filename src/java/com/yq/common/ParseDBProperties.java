package com.yq.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ParseDBProperties {

    public static void main(String[] args) {
        System.out.println("parsing complete!");

    }

    public Properties read(String propFilePathName) {
        Properties prop = new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream(propFilePathName);
            prop.load(in);
            in.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        return prop;
    }

}
