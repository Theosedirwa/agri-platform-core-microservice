package com.agri_platform.agri_core_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import com.agri_platform.agri_core_service.repository.FieldAssetRepository;
import com.agri_platform.agri_core_service.service.*;


@Controller
public class AssetController {
   
    private final AssetService assetService;

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AssetController.class);
    
    @Autowired
    public AssetController(AssetService assetService) {
        
    	this.assetService = assetService;
   
    	  
    }

     @GetMapping("/blank")
    public String hello() {
    	 log.info("AssetController");
    	 log.info("AssetController");
    	 log.info("AssetController");
    	 log.info("AssetController");
        return "blank";
    }
    
    @GetMapping("/field-assets-list")
    public String listFieldAsset(Model model) {
        model.addAttribute("field_assets_list", assetService.getAllAssets());
      
        return "fieldAssets/field-asset-list";
    }

   
    
    @GetMapping("/field_asset/{id}")
    public String viewFieldAsset(@PathVariable("id") Long id, Model model) {
        model.addAttribute("field_details", assetService.getAssetById(id));
        return "fieldAssets/field-asset-view";
    }
    

    
    @GetMapping("/field_asset_profile/{id}")
    public String viewFieldAssetProfile(@PathVariable("id") Long id, Model model) {
       // model.addAttribute("field_details", repo.findById(id).orElseThrow());
		return "fieldAssets/field-asset-profile-view";
	}
}
