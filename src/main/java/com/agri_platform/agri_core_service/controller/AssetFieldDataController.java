package com.agri_platform.agri_core_service.controller;

import com.agri_platform.agri_core_service.entities.AssetFieldData;
import com.agri_platform.agri_core_service.service.AssetFieldDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/asset-field-data")
public class AssetFieldDataController {

    @Autowired
    private AssetFieldDataService assetFieldDataService;

    @GetMapping
    public String getAll(Model model) {
        List<AssetFieldData> assetFieldDataList = assetFieldDataService.getAll();
        model.addAttribute("assetFieldDataList", assetFieldDataList);
        return "assetFieldData/list";
    }

    @GetMapping("/details/{id}")
    public String getById(@PathVariable Long id, Model model) {
        Optional<AssetFieldData> assetFieldData = assetFieldDataService.getById(id);
        if (assetFieldData.isPresent()) {
            model.addAttribute("assetFieldData", assetFieldData.get());
            return "assetFieldData/details";
        } else {
            return "error";
        }
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("assetFieldData", new AssetFieldData());
        return "assetFieldData/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute AssetFieldData assetFieldData) {
        assetFieldDataService.save(assetFieldData);
        return "redirect:/asset-field-data";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<AssetFieldData> assetFieldData = assetFieldDataService.getById(id);
        if (assetFieldData.isPresent()) {
            model.addAttribute("assetFieldData", assetFieldData.get());
            return "assetFieldData/edit";
        } else {
            return "error";
        }
    }

    @PostMapping("/edit/{id}")
    public String update(@PathVariable Long id, @ModelAttribute AssetFieldData assetFieldData) {
        assetFieldDataService.save(assetFieldData);
        return "redirect:/asset-field-data";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        assetFieldDataService.deleteById(id);
        return "redirect:/asset-field-data";
    }
}