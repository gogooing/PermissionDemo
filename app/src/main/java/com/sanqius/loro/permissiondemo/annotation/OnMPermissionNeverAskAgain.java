package com.sanqius.loro.permissiondemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author loro
 * register some methods handling the user's choice to permanently deny permissions checking never ask again.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OnMPermissionNeverAskAgain {
    int value();
}
