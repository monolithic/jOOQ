/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_959 extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.T_959Record> {

	private static final long serialVersionUID = 743283617;

	/**
	 * The singleton instance of <code>t_959</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.T_959 T_959 = new org.jooq.test.cubrid.generatedclasses.tables.T_959();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.T_959Record> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.T_959Record.class;
	}

	/**
	 * The column <code>t_959.java_keywords</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.T_959Record, org.jooq.test.cubrid.generatedclasses.enums.T_959JavaKeywords> JAVA_KEYWORDS = createField("java_keywords", org.jooq.util.cubrid.CUBRIDDataType.VARCHAR.asEnumDataType(org.jooq.test.cubrid.generatedclasses.enums.T_959JavaKeywords.class), T_959);

	/**
	 * The column <code>t_959.special_characters</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.T_959Record, org.jooq.test.cubrid.generatedclasses.enums.T_959SpecialCharacters> SPECIAL_CHARACTERS = createField("special_characters", org.jooq.util.cubrid.CUBRIDDataType.VARCHAR.asEnumDataType(org.jooq.test.cubrid.generatedclasses.enums.T_959SpecialCharacters.class), T_959);

	/**
	 * No further instances allowed
	 */
	private T_959() {
		super("t_959", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}
}
