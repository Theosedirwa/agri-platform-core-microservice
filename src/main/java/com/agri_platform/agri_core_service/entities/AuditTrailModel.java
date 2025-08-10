package com.agri_platform.agri_core_service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Embeddable
public class AuditTrailModel {

	private String createdBy;
	
	@Column(name = "created_at", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdAt;
	
	@Column(name = "modified_at", columnDefinition = "TIMESTAMP")
	private LocalDateTime modifiedAt;

	public AuditTrailModel(String createdBy, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		super();
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}
