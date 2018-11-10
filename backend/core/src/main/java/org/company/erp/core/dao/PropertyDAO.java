package org.company.erp.core.dao;

import org.company.erp.core.model.Property;

import java.util.List;

public interface PropertyDAO {

    List<Property> getPropertyList();

    Property getProperty(String name);
}
