/*******************************************************************************
 * Copyright (c) 2015.
 * This  code file/snippet/block, including any other configuration files,
 * is for the sole use of the Evive Health, LLC and may contain business
 * confidential and privileged information.
 * Any unauthorized review, use, disclosure or distribution is prohibited.
 ******************************************************************************/

package com.evive.training;

/**
 * @author evivehealth on 06/11/15
 */
public enum Gender {
    MALE(0),FEMALE(1);

    private int value;

    private Gender(int value) {
        this.value = value;
    }
};
