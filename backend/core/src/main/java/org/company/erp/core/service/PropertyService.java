package org.company.erp.core.service;

import org.company.erp.core.model.Property;

import java.util.List;

public interface PropertyService {
    List<Property> getPropertyList();
    List<Property> getPropertiesByTemplate(Long templateId);
    List<Property> getNotLinkedPropertiesByTemplate (Long templateId);
    Property getProperty(String name);
}
