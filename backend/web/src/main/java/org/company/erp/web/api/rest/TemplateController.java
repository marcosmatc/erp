package org.company.erp.web.api.rest;

import org.company.erp.core.model.Property;
import org.company.erp.core.model.Template;
import org.company.erp.core.model.TemplatesGroup;
import org.company.erp.core.service.PropertyService;
import org.company.erp.core.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @Autowired
    private PropertyService propertyService;

    @GetMapping(path = "/templates")
    public List<Template> getTemplateList(){
        return templateService.getTemplateList();
    }

    @GetMapping(path = "/properties")
    public List<Property> getPropertyList(){
        return propertyService.getPropertyList();
    }

    @GetMapping(path = "/properties/{name}")
    public Property getProperty(@PathVariable(name = "name") String name){
        return propertyService.getProperty(name);
    }


    @GetMapping(path = "/templatesGroups")
    public List<TemplatesGroup> getTemplatesGroupList(){
        return templateService.getTemplatesGroupList();
    }
}
