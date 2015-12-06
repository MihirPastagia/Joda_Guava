/*******************************************************************************
 * Copyright (c) 2015.
 * This  code file/snippet/block, including any other configuration files,
 * is for the sole use of the Evive Health, LLC and may contain business
 * confidential and privileged information.
 * Any unauthorized review, use, disclosure or distribution is prohibited.
 ******************************************************************************/

package com.evive.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * @author evivehealth on 06/11/15
 */
public class GuavaOptional {
    private static final Logger logger = LoggerFactory.getLogger(GuavaOptional.class);

    public static Optional<String> getOptionalString(Optional<String> stringOptional){

        /**
         * isPresent() - Return true if there is a value present, otherwise false.
         * .get() - If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
         * .of() - Returns an Optional with the specified present non-null value.
         * .empty() - Returns an empty Optional instance.
         */
        if (stringOptional.isPresent()){
            return Optional.of(stringOptional.get());
        }else{
            return Optional.empty();
        }
    }

    public static void main(String[] args){
        String nullString = null;
        String string = "Hello";
        /**
         * ofNullable() - Returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional
         */

        Optional<String> optionalOfnullString = Optional.ofNullable(nullString);

        /**
         * of() - Returns an Optional with the specified present non-null value.
         */
//        Optional<String> optionalOfnullString1 = Optional.of(nullString);

        logger.info("{} non null 123 String",getOptionalString(Optional.of(string)));
        logger.info("{} null 456 String",getOptionalString(optionalOfnullString));
        logger.info("{} get() 567 on non null String",getOptionalString(Optional.of(string)).get());
//        logger.info("{} get() on null  String",getOptionalString(optionalOfnullString).get());
    }
}
