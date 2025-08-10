package com.agri_platform.agri_core_service.dao;

import com.agri_platform.agri_core_service.entities.AssetModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class AssetDao {

    @PersistenceContext
    private EntityManager entityManager;

    public AssetModel findById(Long id) {
        return entityManager.find(AssetModel.class, id);
    }

    public List<AssetModel> findAll() {
        TypedQuery<AssetModel> query = entityManager.createQuery("SELECT c FROM AssetModel c", AssetModel.class);
        return query.getResultList();
    }

    public AssetModel save(AssetModel asset) {
        if (asset.getId() == null) {
            entityManager.persist(asset);
        } else {
            entityManager.merge(asset);
        }
        return asset;
    }

    public void delete(Long id) {
        AssetModel asset = findById(id);
        if (asset != null) {
            entityManager.remove(asset);
        }
    }

    public AssetModel findByEmail(String email) {
        TypedQuery<AssetModel> query = entityManager.createQuery(
            "SELECT c FROM FieldAssetModel c WHERE c.email = :email", AssetModel.class);
        query.setParameter("email", email);
        return query.getSingleResult();
    }
}