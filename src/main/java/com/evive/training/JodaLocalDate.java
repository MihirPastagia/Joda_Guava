/*******************************************************************************
 * Copyright (c) 2015.
 * This  code file/snippet/block, including any other configuration files,
 * is for the sole use of the Evive Health, LLC and may contain business
 * confidential and privileged information.
 * Any unauthorized review, use, disclosure or distribution is prohibited.
 ******************************************************************************/

package com.evive.training;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * @author evivehealth on 06/11/15
 */
public class JodaLocalDate {
    private static final Logger logger = LoggerFactory.getLogger(JodaLocalDate.class);
    /**
     * LocalDate gives current systems date without time
     */

    public static void localDateMethods(){
        LocalDate localDate = new LocalDate();
        LocalTime localTime = new LocalTime();
        org.joda.time.LocalDateTime localDateTime = new org.joda.time.LocalDateTime();

        logger.info("Localdate = {}",localDate);
        logger.info("Localdate day of month {}",localDate.dayOfMonth().get());
        logger.info("LocalTime {}",localTime);
        logger.info("LocalDateTime {}",localDateTime);
        //try other methods
    }

    public static void main(String[] args){
        localDateMethods();
    }
}
