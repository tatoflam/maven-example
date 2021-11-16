package io.hommalab.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LogManager.getLogger("Logger");
        int ans =  4 * 5;

        System.out.println( "Hello World!:" +  ans );

        logger.info(ans);
        logger.warn("WARNING");
        logger.error("ERROR");
    }
}
