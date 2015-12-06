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
 * @author evivehealth on 08/11/15
 */
public class Employee implements Company{

    private static final Logger logger = LoggerFactory.getLogger(Employee.class);
    @Override
    public void getEmployeeDetails() {

    }

    public static void main(String[] args){
        Employee employee = new Employee();

       logger.info("{} = Salary",employee.getSalary(12000,10000));
    }
}
