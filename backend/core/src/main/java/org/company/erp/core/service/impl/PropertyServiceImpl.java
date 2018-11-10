package org.company.erp.core.service.impl;

import org.company.erp.core.dao.PropertyDAO;
import org.company.erp.core.model.Property;
import org.company.erp.core.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    PropertyDAO propertyDAO;

    @Override
    public List<Property> getPropertyList() {
        return propertyDAO.getPropertyList();
    }

    @Override
    public Property getProperty(String name) {
        return propertyDAO.getProperty(name);
    }
}
