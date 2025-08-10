
package com.agri_platform.agri_core_service.entities;

import jakarta.persistence.*;


@Entity
public class SoilAnalysisModel {
   
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    
    private Long   analysisId;          // Unique identifier (UUID or custom)
    private String pHLevel;        // "North Wheat Field", "South Orchard"
    private String nitrogenPpm;          // Links to parent Farm entity
    private String potassiumPpm;     // Optional notes
    private String testDate;     // Optional notes

   
    
   
    
}
