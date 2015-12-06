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

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author evivehealth on 06/11/15
 */
public class ReadingFromFile {

    private static final Logger logger = LoggerFactory.getLogger(ReadingFromFile.class);

    /**
     * With BufferedReader, if you wish to read single character, it will store the contents to fill its buffer (if it is empty)
     * and for further requests, characters will directly be read from buffer, and hence achieves greater efficiency.
     *
     * Use try with resource.It will close the reader.
     */
    public static void readFromFile(){
        try(FileReader fileReader = new FileReader("/Users/evivehealth/Desktop/java Training/File.txt");
                BufferedReader reader = new BufferedReader(fileReader)){

            String str = "";

            while ((str = reader.readLine()) != null){
                logger.info("{}",str);
            }
        }catch(Exception e){
            logger.error(e.getMessage());
        }
    }


    public static void main(String []args){
        readFromFile();
    }
}
