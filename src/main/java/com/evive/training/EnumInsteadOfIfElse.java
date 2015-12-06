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
public class EnumInsteadOfIfElse {
    private static final Logger logger = LoggerFactory.getLogger(EnumInsteadOfIfElse.class);

    enum Shapes {
        SQUARE {
            @Override
            void draw() {
                logger.info("Draw Square");
                //Draw square
            }
        },
        TRIANGLE {
            @Override
            void draw() {
                logger.info("Draw Triangle");
                //draw triangle
            }
        },
        CIRCLE {
            @Override
            void draw() {
                logger.info("Draw Circle");
                //draw circle
            }
        };

        abstract void draw();


    public static void drawShapes(String name) {
        if ("square".equalsIgnoreCase(name)) {
            Shapes.SQUARE.draw();
        } else if ("trinagle".equalsIgnoreCase(name)) {
            Shapes.TRIANGLE.draw();
        } else {
            Shapes.CIRCLE.draw();
        }
    }
    }


    public static void main(String[] args){
        Shapes.drawShapes(Shapes.CIRCLE.name());
    }
}
