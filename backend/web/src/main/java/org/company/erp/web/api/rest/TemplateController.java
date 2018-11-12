package org.company.erp.web.api.rest;

import org.company.erp.core.model.Property;
import org.company.erp.core.model.Template;
import org.company.erp.core.model.TemplatesGroup;
import org.company.erp.core.service.PropertyService;
import org.company.erp.core.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:3001"})
@RestController
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @Autowired
    private PropertyService propertyService;

    @RequestMapping(produces = "application/json" ,method = RequestMethod.GET, path = "/templates")
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

    @GetMapping(path = "/templateByGroup/{groupId}")
    public List<Template>  getTemplateByGroup(@PathVariable(name = "groupId") Long groupId){
        return templateService.getTemplateListByGroup(groupId);
    }

    @GetMapping(path = "/templatesGroups")
    public List<TemplatesGroup> getTemplatesGroupList(){
        return templateService.getTemplatesGroupList();
    }

    @GetMapping(path = "/templates/{templateId}/properties")
    public List<Property> getPropertiesByTemplate(@PathVariable(name = "templateId") Long templateId){
        return propertyService.getPropertiesByTemplate(templateId);
    }

    @GetMapping(path = "/notLinkedProperties/{templateId}")
    public List<Property> getNotLinkedPropertiesByTemplate(@PathVariable(name = "templateId") Long templateId){
        return propertyService.getNotLinkedPropertiesByTemplate(templateId);
    }
}
