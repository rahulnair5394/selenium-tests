package com.wikia.webdriver.common.core.geoedge;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface GeoEdgeBrowserMobProxy {

  String country() default "";
}
