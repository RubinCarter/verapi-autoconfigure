package org.rubin.verapi;


import java.lang.annotation.*;

/**
 *
 * @author rubin
 * @date 2017年06月06日
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiVersion {

    /**
     * 版本号
     */
    int value();

}
