/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables.records;


import org.jooq.RecordMetaData;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.hsqldb.information_schema.tables.TableConstraints;


/**
 * This class is generated by jOOQ.
 */
public class TableConstraintsRecord extends TableRecordImpl<TableConstraintsRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setConstraintCatalog(String value) {
		setValue(TableConstraints.CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintCatalog() {
		return getValue(TableConstraints.CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintSchema(String value) {
		setValue(TableConstraints.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintSchema() {
		return getValue(TableConstraints.CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintName(String value) {
		setValue(TableConstraints.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintName() {
		return getValue(TableConstraints.CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintType(String value) {
		setValue(TableConstraints.CONSTRAINT_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintType() {
		return getValue(TableConstraints.CONSTRAINT_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(String value) {
		setValue(TableConstraints.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableCatalog() {
		return getValue(TableConstraints.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(String value) {
		setValue(TableConstraints.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableSchema() {
		return getValue(TableConstraints.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(TableConstraints.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(TableConstraints.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setIsDeferrable(String value) {
		setValue(TableConstraints.IS_DEFERRABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIsDeferrable() {
		return getValue(TableConstraints.IS_DEFERRABLE);
	}

	/**
	 * An uncommented item
	 */
	public void setInitiallyDeferred(String value) {
		setValue(TableConstraints.INITIALLY_DEFERRED, value);
	}

	/**
	 * An uncommented item
	 */
	public String getInitiallyDeferred() {
		return getValue(TableConstraints.INITIALLY_DEFERRED);
	}

	/**
	 * This constructor has no effect, as a {@link TableFieldImpl} will always
	 * use its underlying table as a RecordMetaData descriptor
	 */
	public TableConstraintsRecord(RecordMetaData metaData) {
		this();
	}

	public TableConstraintsRecord() {
		super(TableConstraints.TABLE_CONSTRAINTS);
	}
}
