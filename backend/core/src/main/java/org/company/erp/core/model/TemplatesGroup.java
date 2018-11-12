package org.company.erp.core.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class TemplatesGroup implements Serializable {
    private long id;
    private String description;
    @JsonProperty("children")
    private List<Template> templateList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Template> getTemplateList() {
        return templateList;
    }

    public void setTemplateList(List<Template> templateList) {
        this.templateList = templateList;
    }
}
