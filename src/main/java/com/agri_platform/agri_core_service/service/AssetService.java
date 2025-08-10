package com.agri_platform.agri_core_service.service;

import com.agri_platform.agri_core_service.dao.AssetDao;
import com.agri_platform.agri_core_service.entities.AssetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    private final AssetDao fieldAssetDao;

    @Autowired
    public AssetService(AssetDao fieldAssetDao) {
        this.fieldAssetDao = fieldAssetDao;
    }

    public AssetModel getAssetById(Long id) {
        return fieldAssetDao.findById(id);
    }

    public List<AssetModel> getAllAssets() {
        return fieldAssetDao.findAll();
    }

    public AssetModel saveAssets(AssetModel customer) {
        return fieldAssetDao.save(customer);
    }

    public void deleteAssets(Long id) {
    	fieldAssetDao.delete(id);
    }

    public AssetModel getCustomerByEmail(String email) {
        return fieldAssetDao.findByEmail(email);
    }
}