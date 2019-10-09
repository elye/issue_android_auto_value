package com.elyeproj.autovalue;

import com.google.auto.value.AutoAnnotation;

class MyComponent {
    @AutoAnnotation
    static MyKey createMyKey(String name, Class<?> implementingClass, int[] thresholds) {
        return new AutoAnnotation_MyComponent_createMyKey(name, implementingClass, thresholds);
    }
}
