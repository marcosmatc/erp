package org.company.erp.core.dao.impl;

import org.company.erp.core.dao.TemplateDAO;
import org.company.erp.core.mapper.TemplateMapper;
import org.company.erp.core.model.Template;
import org.company.erp.core.model.TemplatesGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TemplateDAOImpl implements TemplateDAO {

    @Autowired
    private TemplateMapper templateMapper;

    @Override
    public List<Template> getTemplateList() {
        return templateMapper.getTemplateList();
    }

    @Override
    public List<TemplatesGroup> getTemplatesGroupList() {
        return templateMapper.getTemplatesGroupList();
    }
}
