
package com.agriplatform.fieldmap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agriplatform.fieldmap.entities.AssetModel;

public interface FieldAssetRepository extends JpaRepository<AssetModel, Long> {}
