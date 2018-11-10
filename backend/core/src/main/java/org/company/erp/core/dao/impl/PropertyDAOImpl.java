package org.company.erp.core.dao.impl;

import org.company.erp.core.dao.PropertyDAO;
import org.company.erp.core.mapper.PropertyMapper;
import org.company.erp.core.model.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyDAOImpl implements PropertyDAO {

    @Autowired
    private PropertyMapper propertyMapper;

    @Override
    public List<Property> getPropertyList() {
        return propertyMapper.getPropertyList();
    }

    @Override
    public Property getProperty(String name) {
        return propertyMapper.getProperty(name);
    }
}
