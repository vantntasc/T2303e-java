package session8.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    // talk to compile @table = table in db
    String table_name();
    boolean indexing() default false;
    boolean pattrioning() default  false;
}
