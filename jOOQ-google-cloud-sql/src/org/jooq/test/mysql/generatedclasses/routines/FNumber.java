/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 *
 * echo n
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class FNumber extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -40498086;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = new org.jooq.impl.ParameterImpl<java.lang.Integer>("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> N = new org.jooq.impl.ParameterImpl<java.lang.Integer>("n", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FNumber() {
		super(org.jooq.SQLDialect.MYSQL, "f_number", org.jooq.test.mysql.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(N);
	}

	/**
	 * Set the <code>n</code> parameter to the routine
	 */
	public void setN(java.lang.Integer value) {
		setValue(N, value);
	}

	/**
	 * Set the <code>n</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setN(org.jooq.Field<java.lang.Integer> field) {
		setField(N, field);
	}
}