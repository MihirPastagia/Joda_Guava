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

/**
 * @author evivehealth on 06/11/15
 */
public class EnumUsage {

    private static final Logger logger = LoggerFactory.getLogger(EnumUsage.class);
    /**
     * Enums in Java are type-safe and has there own name-space.
     * It means your enum will have a type for example "Gender"
     * in below example and you can not assign any value other than specified in Enum Constant.
     */

    public static void setEnum() {
        Gender gender = Gender.FEMALE;
//            Gender gender = 1;

//        Gender.FEMALE = Gender.MALE;

        switch (gender){
            case MALE:logger.info("{}",gender);
                        break;

            case FEMALE:logger.info("{}",gender);
                        break;
        }
    }

    /**
     * equals or compareTo methods can used to compare enums
     */
    public static void compareEnums(){
        Gender gender = Gender.MALE;

        if(gender.equals(Gender.FEMALE)){
            logger.info("Gender is {}",gender);
        }
        else {
            logger.info("Gender is {}",gender);
        }
    }

    /**
     * Values() method returns array of Enum constants in the same order they have listed in Enum
     * valueOf() method returns name of enum
     * name() returns the name of the enum
     * ordinal() returns the value of the enum
     */
    public static void usageOfValues(){
        logger.info("Values  enum {}",Gender.values());
        logger.info("Valueof enum {}",Gender.valueOf("MALE"));
        logger.info("name of enum {}",Gender.FEMALE.name());
        logger.info("ordinal enum {}",Gender.MALE.ordinal());

    }



    public static void main(String[] args){
        setEnum();
        compareEnums();
        usageOfValues();
    }
}
