package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "RECORD", schema = "CHILDRENS")

public class Record implements java.io.Serializable {

	// Fields

	private Long recordId;
	private String founder;
	private Long archivesId;
	private Date receptionTime;
	private String recordName;
	private Long templateId;

	// Constructors

	/** default constructor */
	public Record() {
	}

	/** minimal constructor */
	public Record(Long recordId) {
		this.recordId = recordId;
	}

	/** full constructor */
	public Record(Long recordId, String founder, Long archivesId, Date receptionTime, String recordName,
			Long templateId) {
		this.recordId = recordId;
		this.founder = founder;
		this.archivesId = archivesId;
		this.receptionTime = receptionTime;
		this.recordName = recordName;
		this.templateId = templateId;
	}

	// Property accessors
	@Id

	@Column(name = "RECORD_ID", unique = true, nullable = false, precision = 10, scale = 0)

	public Long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	@Column(name = "FOUNDER", length = 20)

	public String getFounder() {
		return this.founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	@Column(name = "ARCHIVES_ID", precision = 10, scale = 0)

	public Long getArchivesId() {
		return this.archivesId;
	}

	public void setArchivesId(Long archivesId) {
		this.archivesId = archivesId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RECEPTION_TIME", length = 7)

	public Date getReceptionTime() {
		return this.receptionTime;
	}

	public void setReceptionTime(Date receptionTime) {
		this.receptionTime = receptionTime;
	}

	@Column(name = "RECORD_NAME", length = 20)

	public String getRecordName() {
		return this.recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	@Column(name = "TEMPLATE_ID", precision = 10, scale = 0)

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}