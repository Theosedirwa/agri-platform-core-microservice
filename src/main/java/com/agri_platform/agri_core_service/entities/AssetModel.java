
package com.agri_platform.agri_core_service.entities;

import jakarta.persistence.*;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;

    

@Entity
@Table(name = "asset")
public class AssetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String description;
    
    @Column(nullable = false, unique = true)
    private String status;
    
    @Embedded
    private AuditTrailModel atm;

  
   /* 
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;
*/
    // Constructors, getters, setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AuditTrailModel getAuditTrailModel() {
		return atm;
	}

	public void setAuditTrailModel(AuditTrailModel atm) {
		this.atm = atm;
	}
	
}


/*
@Id
@GeneratedValue(generator = "UUID")
@GenericGenerator(
    name = "UUID",
    strategy = "org.hibernate.id.UUIDGenerator"
)
@Column(updatable = false, nullable = false)
*/
