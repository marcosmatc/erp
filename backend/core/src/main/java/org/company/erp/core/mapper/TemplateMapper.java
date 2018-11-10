package org.company.erp.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.company.erp.core.model.Template;
import org.company.erp.core.model.TemplatesGroup;

import java.util.List;

@Mapper
public interface TemplateMapper {

    List<Template> getTemplateList();

    List<TemplatesGroup> getTemplatesGroupList();
}
