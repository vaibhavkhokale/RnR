package cgi.rnr.security;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@SuppressWarnings("serial")
@Entity(name = "Pages")
@Table(name = "Pages", uniqueConstraints = { @UniqueConstraint(columnNames = { "PAGE_NM" }) })
public class Pages implements Serializable {

	@Id
	@TableGenerator(name = "pageId", table = "UNID", pkColumnName = "unidKey", pkColumnValue = "pageId", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "pageId")
	@Column(name = "PAGE_ID", length = 20, nullable = false)
	private long id;

	@Column(name = "PAGE_NM", length = 120, nullable = false)
	private String pageName = "Home";

	@Column(name = "PAGE_DISP", length = 120, nullable = false)
	private String pageDisplayName = "Home Page";

	@Column(name = "path", length = 500, nullable = false)
	private String path;

	@Column(name = "active", length = 1, nullable = false)
	private char activeFl = 'Y';

	@Column(name = "LAST_UP_DT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdateDate = new Date();

	@Column(name = "LAST_UP_UID", nullable = true, length = 50)
	private String lastUpdateUID;

	@Column(name = "VERS_NO", nullable = true)
	private int rowVersionNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public char getActiveFl() {
		return activeFl;
	}

	public void setActiveFl(char activeFl) {
		this.activeFl = activeFl;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdateUID() {
		return lastUpdateUID;
	}

	public void setLastUpdateUID(String lastUpdateUID) {
		this.lastUpdateUID = lastUpdateUID;
	}

	public int getRowVersionNumber() {
		return rowVersionNumber;
	}

	public void setRowVersionNumber(int rowVersionNumber) {
		this.rowVersionNumber = rowVersionNumber;
	}

	public String getPageDisplayName() {
		return pageDisplayName;
	}

	public void setPageDisplayName(String pageDisplayName) {
		this.pageDisplayName = pageDisplayName;
	}

}
