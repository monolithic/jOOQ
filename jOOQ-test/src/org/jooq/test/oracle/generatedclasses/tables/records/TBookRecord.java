/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;


import org.jooq.RecordMetaData;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.oracle.generatedclasses.tables.TBook;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBookRecord extends TableRecordImpl<TBookRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The book ID
	 */
	public void setId(Integer value) {
		setValue(TBook.ID, value);
	}

	/**
	 * The book ID
	 */
	public Integer getId() {
		return getValue(TBook.ID);
	}

	/**
	 * The author ID in entity 'author'
	 */
	public void setAuthorId(Integer value) {
		setValue(TBook.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 */
	public Integer getAuthorId() {
		return getValue(TBook.AUTHOR_ID);
	}

	/**
	 * The book's title
	 */
	public void setTitle(String value) {
		setValue(TBook.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public String getTitle() {
		return getValue(TBook.TITLE);
	}

	public TBookRecord(RecordMetaData metaData) {
		super(TBook.T_BOOK);
	}
}
