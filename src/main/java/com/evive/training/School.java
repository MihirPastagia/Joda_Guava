/*******************************************************************************
 * Copyright (c) 2015.
 * This  code file/snippet/block, including any other configuration files,
 * is for the sole use of the Evive Health, LLC and may contain business
 * confidential and privileged information.
 * Any unauthorized review, use, disclosure or distribution is prohibited.
 ******************************************************************************/

package com.evive.training;

/**
 * @author evivehealth on 08/11/15
 */
public interface School {

    default int getSalary(int basic, int gross){
        return basic + gross;
    }
}
