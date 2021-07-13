package com.cybertek.utilities;

public class BrowserUtils {


    /**
     * Method will accept in
     * Wait for given seconds duration
     */

        public static void sleep(int second)  {
            second *=1000;

            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {
                System.out.println("Something happened in the sleep");
            }


        }












}
