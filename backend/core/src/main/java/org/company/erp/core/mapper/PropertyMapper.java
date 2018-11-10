package org.company.erp.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.company.erp.core.model.Property;

import java.util.List;

@Mapper
public interface PropertyMapper {
    List<Property> getPropertyList();

    Property getProperty(String name);
}
