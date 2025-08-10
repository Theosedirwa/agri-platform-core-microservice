package com.agri_platform.agri_core_service.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "asset_field_data")
public class AssetFieldData {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "revision_id", nullable = false)
    private Long revisionId;

    @Column(name = "type", nullable = false, length = 32)
    private String type;

    @Column(name = "uid", nullable = false)
    private Long uid;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "status", length = 255)
    private String status;

    @Column(name = "created")
    private Integer created;

    @Column(name = "changed")
    private Integer changed;

    @Column(name = "archived")
    private Integer archived;

    @Column(name = "default_langcode", nullable = false)
    private Short defaultLangcode;

    @Column(name = "revision_translation_affected")
    private Short revisionTranslationAffected;

    @Column(name = "is_location")
    private Short isLocation;

    @Column(name = "is_fixed")
    private Short isFixed;

    @Column(name = "data", columnDefinition = "text")
    private String data;

    @Column(name = "notes__value", columnDefinition = "text")
    private String notesValue;

    @Column(name = "notes__format", length = 255)
    private String notesFormat;

    // Getters and setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getRevisionId() { return revisionId; }
    public void setRevisionId(Long revisionId) { this.revisionId = revisionId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Long getUid() { return uid; }
    public void setUid(Long uid) { this.uid = uid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getCreated() { return created; }
    public void setCreated(Integer created) { this.created = created; }

    public Integer getChanged() { return changed; }
    public void setChanged(Integer changed) { this.changed = changed; }

    public Integer getArchived() { return archived; }
    public void setArchived(Integer archived) { this.archived = archived; }

    public Short getDefaultLangcode() { return defaultLangcode; }
    public void setDefaultLangcode(Short defaultLangcode) { this.defaultLangcode = defaultLangcode; }

    public Short getRevisionTranslationAffected() { return revisionTranslationAffected; }
    public void setRevisionTranslationAffected(Short revisionTranslationAffected) { this.revisionTranslationAffected = revisionTranslationAffected; }

    public Short getIsLocation() { return isLocation; }
    public void setIsLocation(Short isLocation) { this.isLocation = isLocation; }

    public Short getIsFixed() { return isFixed; }
    public void setIsFixed(Short isFixed) { this.isFixed = isFixed; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getNotesValue() { return notesValue; }
    public void setNotesValue(String notesValue) { this.notesValue = notesValue; }

    public String getNotesFormat() { return notesFormat; }
    public void setNotesFormat(String notesFormat) { this.notesFormat = notesFormat; }
}
