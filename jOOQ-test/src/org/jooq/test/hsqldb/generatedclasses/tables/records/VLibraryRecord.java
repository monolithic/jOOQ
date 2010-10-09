/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import org.jooq.RecordMetaData;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.VLibrary;


/**
 * This class is generated by jOOQ.
 */
public class VLibraryRecord extends TableRecordImpl<VLibraryRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setAuthor(String value) {
		setValue(VLibrary.AUTHOR, value);
	}

	/**
	 * An uncommented item
	 */
	public String getAuthor() {
		return getValue(VLibrary.AUTHOR);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(VLibrary.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(VLibrary.TITLE);
	}

	/**
	 * This constructor has no effect, as a {@link TableFieldImpl} will always
	 * use its underlying table as a RecordMetaData descriptor
	 */
	public VLibraryRecord(RecordMetaData metaData) {
		this();
	}

	public VLibraryRecord() {
		super(VLibrary.V_LIBRARY);
	}
}
