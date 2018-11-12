package org.company.erp.core.dao;

import org.company.erp.core.model.Template;
import org.company.erp.core.model.TemplatesGroup;

import java.util.List;

public interface TemplateDAO {
    List<Template> getTemplateList();

    List<TemplatesGroup> getTemplatesGroupList();

    List<Template> getTemplateListByGroup(long groupId);
}
