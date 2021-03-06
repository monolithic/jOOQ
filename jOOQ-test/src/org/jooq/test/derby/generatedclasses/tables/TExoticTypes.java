/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TExoticTypes extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.derby.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 1609745691;

	/**
	 * The singleton instance of <code>TEST.T_EXOTIC_TYPES</code>
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.derby.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.derby.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_EXOTIC_TYPES);

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.UU</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID, T_EXOTIC_TYPES);

	/**
	 * No further instances allowed
	 */
	private TExoticTypes() {
		super("T_EXOTIC_TYPES", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.derby.generatedclasses.Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.derby.generatedclasses.Keys.PK_T_EXOTIC_TYPES);
	}
}
