package org.company.erp.core.model;

public class Template {
    private long id;
    private long groupId;
    private String description;
    private Long parentTemplateId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParentTemplateId() {
        return parentTemplateId;
    }

    public void setParentTemplateId(Long parentTemplateId) {
        this.parentTemplateId = parentTemplateId;
    }

}
