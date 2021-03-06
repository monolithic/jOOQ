/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductCategory", schema = "Production")
public class ProductCategory extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCategory> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -2092585343;

	/**
	 * Setter for <code>Production.ProductCategory.ProductCategoryID</code>. 
	 */
	public void setProductCategoryID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.ProductCategoryID, value);
	}

	/**
	 * Getter for <code>Production.ProductCategory.ProductCategoryID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductCategoryID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductCategoryID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.ProductCategoryID);
	}

	/**
	 * Setter for <code>Production.ProductCategory.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.Name, value);
	}

	/**
	 * Getter for <code>Production.ProductCategory.Name</code>. 
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.Name);
	}

	/**
	 * Setter for <code>Production.ProductCategory.rowguid</code>. 
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.rowguid, value);
	}

	/**
	 * Getter for <code>Production.ProductCategory.rowguid</code>. 
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.rowguid);
	}

	/**
	 * Setter for <code>Production.ProductCategory.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Production.ProductCategory.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.ProductCategoryID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.Name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.rowguid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getProductCategoryID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getrowguid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProductCategory
	 */
	public ProductCategory() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory);
	}
}
