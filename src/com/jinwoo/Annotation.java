package com.jinwoo;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target(TYPE)
public @interface Annotation {
	public String val() default "°ª";
	public String key();
}
