package org.company.erp.core.service;

import org.company.erp.core.model.Property;

import java.util.List;

public interface PropertyService {
    List<Property> getPropertyList();
    Property getProperty(String name);
}
