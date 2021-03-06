/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class CountryRegionCurrency extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> {

	private static final long serialVersionUID = -1206240430;

	/**
	 * The singleton instance of <code>Sales.CountryRegionCurrency</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency CountryRegionCurrency = new org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency.class;
	}

	/**
	 * The column <code>Sales.CountryRegionCurrency.CountryRegionCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, java.lang.String> CountryRegionCode = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Sales.CountryRegionCurrency.CurrencyCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, java.lang.String> CurrencyCode = createField("CurrencyCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Sales.CountryRegionCurrency.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Sales.CountryRegionCurrency</code> table reference
	 */
	public CountryRegionCurrency() {
		super("CountryRegionCurrency", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * Create an aliased <code>Sales.CountryRegionCurrency</code> table reference
	 */
	public CountryRegionCurrency(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CountryRegionCurrency_CountryRegionCode_CurrencyCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CountryRegionCurrency_CountryRegionCode_CurrencyCode);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CountryRegionCurrency_CountryRegion_CountryRegionCode, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CountryRegionCurrency_Currency_CurrencyCode);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency(alias);
	}
}
