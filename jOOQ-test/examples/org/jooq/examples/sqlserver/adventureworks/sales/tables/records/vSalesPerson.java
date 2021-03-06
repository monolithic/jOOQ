/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "vSalesPerson", schema = "Sales")
public class vSalesPerson extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vSalesPerson> implements org.jooq.Record21<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> {

	private static final long serialVersionUID = -1667267136;

	/**
	 * Setter for <code>Sales.vSalesPerson.SalesPersonID</code>. 
	 */
	public void setSalesPersonID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesPersonID, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.SalesPersonID</code>. 
	 */
	@javax.persistence.Column(name = "SalesPersonID", nullable = false, precision = 10)
	public java.lang.Integer getSalesPersonID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesPersonID);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.Title</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Title, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.Title</code>. 
	 */
	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Title);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.FirstName</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.FirstName, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.FirstName</code>. 
	 */
	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.FirstName);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.MiddleName</code>. 
	 */
	public void setMiddleName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.MiddleName, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.MiddleName</code>. 
	 */
	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.MiddleName);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.LastName</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.LastName, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.LastName</code>. 
	 */
	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.LastName);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.Suffix</code>. 
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Suffix, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.Suffix</code>. 
	 */
	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Suffix);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.JobTitle</code>. 
	 */
	public void setJobTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.JobTitle, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.JobTitle</code>. 
	 */
	@javax.persistence.Column(name = "JobTitle", nullable = false, length = 50)
	public java.lang.String getJobTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.JobTitle);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.Phone</code>. 
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Phone, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.Phone</code>. 
	 */
	@javax.persistence.Column(name = "Phone", length = 25)
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Phone);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.EmailAddress</code>. 
	 */
	public void setEmailAddress(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.EmailAddress, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.EmailAddress</code>. 
	 */
	@javax.persistence.Column(name = "EmailAddress", length = 50)
	public java.lang.String getEmailAddress() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.EmailAddress);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.EmailPromotion</code>. 
	 */
	public void setEmailPromotion(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.EmailPromotion, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.EmailPromotion</code>. 
	 */
	@javax.persistence.Column(name = "EmailPromotion", nullable = false, precision = 10)
	public java.lang.Integer getEmailPromotion() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.EmailPromotion);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.AddressLine1</code>. 
	 */
	public void setAddressLine1(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.AddressLine1, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.AddressLine1</code>. 
	 */
	@javax.persistence.Column(name = "AddressLine1", nullable = false, length = 60)
	public java.lang.String getAddressLine1() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.AddressLine1);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.AddressLine2</code>. 
	 */
	public void setAddressLine2(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.AddressLine2, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.AddressLine2</code>. 
	 */
	@javax.persistence.Column(name = "AddressLine2", length = 60)
	public java.lang.String getAddressLine2() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.AddressLine2);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.City</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.City, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.City</code>. 
	 */
	@javax.persistence.Column(name = "City", nullable = false, length = 30)
	public java.lang.String getCity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.City);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.StateProvinceName</code>. 
	 */
	public void setStateProvinceName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.StateProvinceName, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.StateProvinceName</code>. 
	 */
	@javax.persistence.Column(name = "StateProvinceName", nullable = false, length = 50)
	public java.lang.String getStateProvinceName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.StateProvinceName);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.PostalCode</code>. 
	 */
	public void setPostalCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.PostalCode, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.PostalCode</code>. 
	 */
	@javax.persistence.Column(name = "PostalCode", nullable = false, length = 15)
	public java.lang.String getPostalCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.PostalCode);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.CountryRegionName</code>. 
	 */
	public void setCountryRegionName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.CountryRegionName, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.CountryRegionName</code>. 
	 */
	@javax.persistence.Column(name = "CountryRegionName", nullable = false, length = 50)
	public java.lang.String getCountryRegionName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.CountryRegionName);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.TerritoryName</code>. 
	 */
	public void setTerritoryName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.TerritoryName, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.TerritoryName</code>. 
	 */
	@javax.persistence.Column(name = "TerritoryName", length = 50)
	public java.lang.String getTerritoryName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.TerritoryName);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.TerritoryGroup</code>. 
	 */
	public void setTerritoryGroup(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.TerritoryGroup, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.TerritoryGroup</code>. 
	 */
	@javax.persistence.Column(name = "TerritoryGroup", length = 50)
	public java.lang.String getTerritoryGroup() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.TerritoryGroup);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.SalesQuota</code>. 
	 */
	public void setSalesQuota(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesQuota, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.SalesQuota</code>. 
	 */
	@javax.persistence.Column(name = "SalesQuota", precision = 19, scale = 4)
	public java.math.BigDecimal getSalesQuota() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesQuota);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.SalesYTD</code>. 
	 */
	public void setSalesYTD(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesYTD, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.SalesYTD</code>. 
	 */
	@javax.persistence.Column(name = "SalesYTD", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getSalesYTD() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesYTD);
	}

	/**
	 * Setter for <code>Sales.vSalesPerson.SalesLastYear</code>. 
	 */
	public void setSalesLastYear(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesLastYear, value);
	}

	/**
	 * Getter for <code>Sales.vSalesPerson.SalesLastYear</code>. 
	 */
	@javax.persistence.Column(name = "SalesLastYear", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getSalesLastYear() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesLastYear);
	}

	// -------------------------------------------------------------------------
	// Record21 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row21<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10(), field11(), field12(), field13(), field14(), field15(), field16(), field17(), field18(), field19(), field20(), field21());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row21<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9(), value10(), value11(), value12(), value13(), value14(), value15(), value16(), value17(), value18(), value19(), value20(), value21());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesPersonID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Title;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.FirstName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.MiddleName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.LastName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Suffix;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.JobTitle;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.Phone;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.EmailAddress;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.EmailPromotion;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.AddressLine1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.AddressLine2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.City;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.StateProvinceName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.PostalCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.CountryRegionName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.TerritoryName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field18() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.TerritoryGroup;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field19() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesQuota;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field20() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesYTD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field21() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson.SalesLastYear;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getSalesPersonID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getMiddleName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getSuffix();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getJobTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getEmailAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getEmailPromotion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getAddressLine1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getAddressLine2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getStateProvinceName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getPostalCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getCountryRegionName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getTerritoryName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value18() {
		return getTerritoryGroup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value19() {
		return getSalesQuota();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value20() {
		return getSalesYTD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value21() {
		return getSalesLastYear();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached vSalesPerson
	 */
	public vSalesPerson() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.vSalesPerson.vSalesPerson);
	}
}
