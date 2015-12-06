/*******************************************************************************
 * Copyright (c) 2015.
 * This  code file/snippet/block, including any other configuration files,
 * is for the sole use of the Evive Health, LLC and may contain business
 * confidential and privileged information.
 * Any unauthorized review, use, disclosure or distribution is prohibited.
 ******************************************************************************/

package com.evive.training;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author evivehealth on 06/11/15
 * @see http://joda-time.sourceforge.net/api-release/org/joda/time/format/DateTimeFormatter.html
 */
public class ExampleDateTimeFormatter {
    private static final Logger logger = LoggerFactory.getLogger(ExampleDateTimeFormatter.class);

    public static void main(String[] args){

        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd/MM/YYYY HH:mm:ss");
        DateTime dateTime = new DateTime();
       logger.info("DateTime {}",dateTimeFormatter.print(dateTime));

        // String to datetime
        String dateTime1 = "11/15/2013 08:00:00";
        DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/YYYY HH:mm:ss");
        DateTime jodatime = dtf.parseDateTime(dateTime1);
        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy");
        logger.info("{}",dtfOut.print(jodatime));


        //long to dateTime
        long date = jodatime.getMillis();
       logger.info("Long to date {}, {}",date,dtfOut.print(date));
//        logger.error("Error message");
//        logger.debug("Debug log");
//        logger.warn("Warning log");
    }
}
