package org.company.erp.core.service.impl;

import org.company.erp.core.dao.TemplateDAO;
import org.company.erp.core.model.Template;
import org.company.erp.core.model.TemplatesGroup;
import org.company.erp.core.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateDAO templateDAO;

    @Override
    public List<TemplatesGroup> getTemplatesGroupList() {
        return templateDAO.getTemplatesGroupList();
    }

    @Override
    public List<Template> getTemplateList() {
        return templateDAO.getTemplateList();
    }
}
