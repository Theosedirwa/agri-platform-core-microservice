package com.agri_platform.agri_core_service.repository;

import com.agri_platform.agri_core_service.entities.AssetFieldData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetFieldDataRepository extends JpaRepository<AssetFieldData, Long> {
    // Custom query methods can be added here
}
