/*******************************************************************************
 * Copyright (c) 2015.
 * This  code file/snippet/block, including any other configuration files,
 * is for the sole use of the Evive Health, LLC and may contain business
 * confidential and privileged information.
 * Any unauthorized review, use, disclosure or distribution is prohibited.
 ******************************************************************************/

package com.evive.training;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;

/**
 * @author evivehealth on 06/11/15
 * @see http://joda-time.sourceforge.net/apidocs/org/joda/time/DateTime.html
 * DateTime
 */
public class JodaDateTime {

    private static final Logger logger = LoggerFactory.getLogger(JodaDateTime.class);

    public static void main(String[] args) {
        DateTime dateTime;

        //
        // Creates DateTime object using the default constructor will
        // give you the current system date.
        //
        dateTime = new DateTime();
        logger.info("dateTime = {}", dateTime);

        //
        // Creates DateTime object with information like year, month,
        // day, hour, minute, second and milliseconds
        //
        dateTime = new DateTime(2012, 2, 3, 0, 0, 0, 0);
        logger.info("dateTime = {}", dateTime);

        //
        // Create DateTime object from JDK's Date milliseconds.
        //
        Date date = new Date();
        dateTime = new DateTime(date.getTime());
        logger.info("dateTime = {}", dateTime);

        //
        // Create DateTime object from JDK's Date object.
        //
        date = new Date();
        dateTime = new DateTime(date);
        logger.info("dateTime = {}", dateTime);

        //
        // Create DateTime object from JDK's Calendar object.
        //
        Calendar calendar = Calendar.getInstance();
        dateTime = new DateTime(calendar);
        logger.info("dateTime = {}", dateTime);

        //
        // Create DateTime object from string. The format of the
        // string  should be precise.
        //
        dateTime = new DateTime("2012-02-03T14:15:00.000+08:00");
        logger.info("dateTime 1 = {} ", dateTime);
        dateTime = new DateTime("2012-02-03");
        logger.info("dateTime = {}", dateTime);

        dateTimeMethod();
    }


    public static void dateTimeMethod(){
        DateTime dateTime = new DateTime();

        logger.info("datetime centuryofera {}",dateTime.centuryOfEra().get());
        logger.info("datetime date {}",dateTime.dayOfMonth().getDateTime());
        logger.info("datetime day {}",dateTime.dayOfWeek().get());
        logger.info("datetime year {}",dateTime.dayOfYear().getField());
        logger.info("datetime hour {}",dateTime.hourOfDay().get());
        logger.info("date minus 2 days {}",dateTime.minusDays(2));
        logger.info("hours minus 4 {}",dateTime.minusHours(4));
        logger.info("date plus 2 {}",dateTime.plusDays(2));

    }
}
