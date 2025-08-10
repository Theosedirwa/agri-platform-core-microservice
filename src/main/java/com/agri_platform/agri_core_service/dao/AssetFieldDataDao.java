package com.agri_platform.agri_core_service.dao;

import com.agri_platform.agri_core_service.entities.AssetFieldData;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class AssetFieldDataDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<AssetFieldData> findById(AssetFieldData id) {
        return Optional.ofNullable(entityManager.find(AssetFieldData.class, id));
    }

    public List<AssetFieldData> findAll() {
        TypedQuery<AssetFieldData> query = entityManager.createQuery("SELECT a FROM AssetFieldData a", AssetFieldData.class);
        return query.getResultList();
    }

    public AssetFieldData save(AssetFieldData assetFieldData) {
        if (findById(assetFieldData.getId()).isEmpty()) {
            entityManager.persist(assetFieldData);
        } else {
            entityManager.merge(assetFieldData);
        }
        return assetFieldData;
    }

    public void delete(AssetFieldData id) {
        findById(id).ifPresent(entityManager::remove);
    }
}
