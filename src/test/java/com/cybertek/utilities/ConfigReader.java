package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // create properties object

   private static Properties properties = new Properties();

     static {

         // load the file using FileInputStream


         try {
          FileInputStream  file = new FileInputStream("configuration.properties");

             properties.load(file);

             //close the file
             file.close();

         } catch (IOException e) {

             System.out.println("File not found in configuration properties");

         }

         // load the properties object with our file




    }

    // Use the above created logic to create a re-usable static Method

    public static String getProperty(String keyWord) {

        return properties.getProperty(keyWord);

    }











}
