/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85 extends org.jooq.impl.TableImpl<org.jooq.test.jdbc.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -1031773527;

	/**
	 * The singleton instance of <code>PUBLIC.X_TEST_CASE_85</code>
	 */
	public static final org.jooq.test.jdbc.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.jdbc.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbc.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.jdbc.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_85.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbc.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbc.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("X_UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbc.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("X_UNUSED_NAME", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("X_TEST_CASE_85", org.jooq.test.jdbc.generatedclasses.Public.PUBLIC);
	}
}
