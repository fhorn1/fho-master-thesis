package org.fho.master.thesis.crossfunctional;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.*;


@Inherited
@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface DurationLog {
}