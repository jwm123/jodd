// Copyright (c) 2003-2013, Jodd Team (jodd.org). All Rights Reserved.

package jodd.db.oom.meta;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link jodd.db.oom.DbOomManager} table (or view) name.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface DbTable {

	/**
	 * Table or view name.
	 */
	String value() default "";

	/**
	 * Schema name.
	 */
	String schema() default "";

}
