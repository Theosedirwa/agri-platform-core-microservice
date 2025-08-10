package com.agri_platform.agri_core_service.service;

import com.agri_platform.agri_core_service.entities.AssetFieldData;
import com.agri_platform.agri_core_service.repository.AssetFieldDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssetFieldDataService {

    @Autowired
    private AssetFieldDataRepository assetFieldDataRepository;

    public List<AssetFieldData> getAll() {
        return assetFieldDataRepository.findAll();
    }

    public Optional<AssetFieldData> getById(Long id) {
        return assetFieldDataRepository.findById(id);
    }

    public AssetFieldData save(AssetFieldData assetFieldData) {
        return assetFieldDataRepository.save(assetFieldData);
    }

    public void deleteById(Long id) {
        assetFieldDataRepository.deleteById(id);
    }
}
