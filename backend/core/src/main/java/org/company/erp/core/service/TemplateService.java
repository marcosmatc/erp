package org.company.erp.core.service;

import org.company.erp.core.model.Template;
import org.company.erp.core.model.TemplatesGroup;

import java.util.List;

public interface TemplateService {
    List<TemplatesGroup> getTemplatesGroupList();
    List<Template> getTemplateList();
}
