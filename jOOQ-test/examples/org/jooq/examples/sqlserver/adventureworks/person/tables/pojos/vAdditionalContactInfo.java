/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vAdditionalContactInfo", schema = "Person")
public class vAdditionalContactInfo implements java.io.Serializable {

	private static final long serialVersionUID = -1861307589;

	private java.lang.Integer  ContactID;
	private java.lang.String   FirstName;
	private java.lang.String   MiddleName;
	private java.lang.String   LastName;
	private java.lang.String   TelephoneNumber;
	private java.lang.String   TelephoneSpecialInstructions;
	private java.lang.String   Street;
	private java.lang.String   City;
	private java.lang.String   StateProvince;
	private java.lang.String   PostalCode;
	private java.lang.String   CountryRegion;
	private java.lang.String   HomeAddressSpecialInstructions;
	private java.lang.String   EMailAddress;
	private java.lang.String   EMailSpecialInstructions;
	private java.lang.String   EMailTelephoneNumber;
	private java.lang.String   rowguid;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "ContactID", nullable = false)
	public java.lang.Integer getContactID() {
		return this.ContactID;
	}

	public void setContactID(java.lang.Integer ContactID) {
		this.ContactID = ContactID;
	}

	@javax.persistence.Column(name = "FirstName", nullable = false)
	public java.lang.String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(java.lang.String FirstName) {
		this.FirstName = FirstName;
	}

	@javax.persistence.Column(name = "MiddleName")
	public java.lang.String getMiddleName() {
		return this.MiddleName;
	}

	public void setMiddleName(java.lang.String MiddleName) {
		this.MiddleName = MiddleName;
	}

	@javax.persistence.Column(name = "LastName", nullable = false)
	public java.lang.String getLastName() {
		return this.LastName;
	}

	public void setLastName(java.lang.String LastName) {
		this.LastName = LastName;
	}

	@javax.persistence.Column(name = "TelephoneNumber")
	public java.lang.String getTelephoneNumber() {
		return this.TelephoneNumber;
	}

	public void setTelephoneNumber(java.lang.String TelephoneNumber) {
		this.TelephoneNumber = TelephoneNumber;
	}

	@javax.persistence.Column(name = "TelephoneSpecialInstructions")
	public java.lang.String getTelephoneSpecialInstructions() {
		return this.TelephoneSpecialInstructions;
	}

	public void setTelephoneSpecialInstructions(java.lang.String TelephoneSpecialInstructions) {
		this.TelephoneSpecialInstructions = TelephoneSpecialInstructions;
	}

	@javax.persistence.Column(name = "Street")
	public java.lang.String getStreet() {
		return this.Street;
	}

	public void setStreet(java.lang.String Street) {
		this.Street = Street;
	}

	@javax.persistence.Column(name = "City")
	public java.lang.String getCity() {
		return this.City;
	}

	public void setCity(java.lang.String City) {
		this.City = City;
	}

	@javax.persistence.Column(name = "StateProvince")
	public java.lang.String getStateProvince() {
		return this.StateProvince;
	}

	public void setStateProvince(java.lang.String StateProvince) {
		this.StateProvince = StateProvince;
	}

	@javax.persistence.Column(name = "PostalCode")
	public java.lang.String getPostalCode() {
		return this.PostalCode;
	}

	public void setPostalCode(java.lang.String PostalCode) {
		this.PostalCode = PostalCode;
	}

	@javax.persistence.Column(name = "CountryRegion")
	public java.lang.String getCountryRegion() {
		return this.CountryRegion;
	}

	public void setCountryRegion(java.lang.String CountryRegion) {
		this.CountryRegion = CountryRegion;
	}

	@javax.persistence.Column(name = "HomeAddressSpecialInstructions")
	public java.lang.String getHomeAddressSpecialInstructions() {
		return this.HomeAddressSpecialInstructions;
	}

	public void setHomeAddressSpecialInstructions(java.lang.String HomeAddressSpecialInstructions) {
		this.HomeAddressSpecialInstructions = HomeAddressSpecialInstructions;
	}

	@javax.persistence.Column(name = "EMailAddress")
	public java.lang.String getEMailAddress() {
		return this.EMailAddress;
	}

	public void setEMailAddress(java.lang.String EMailAddress) {
		this.EMailAddress = EMailAddress;
	}

	@javax.persistence.Column(name = "EMailSpecialInstructions")
	public java.lang.String getEMailSpecialInstructions() {
		return this.EMailSpecialInstructions;
	}

	public void setEMailSpecialInstructions(java.lang.String EMailSpecialInstructions) {
		this.EMailSpecialInstructions = EMailSpecialInstructions;
	}

	@javax.persistence.Column(name = "EMailTelephoneNumber")
	public java.lang.String getEMailTelephoneNumber() {
		return this.EMailTelephoneNumber;
	}

	public void setEMailTelephoneNumber(java.lang.String EMailTelephoneNumber) {
		this.EMailTelephoneNumber = EMailTelephoneNumber;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}