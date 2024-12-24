package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetaobjectDefinition implements com.shopify.types.Node {
  
  private MetaobjectAccess access;

  
  private MetaobjectCapabilities capabilities;

  
  private App createdByApp;

  
  private StaffMember createdByStaff;

  
  private String description;

  
  private String displayNameKey;

  
  private List<MetaobjectFieldDefinition> fieldDefinitions;

  
  private boolean hasThumbnailField;

  
  private String id;

  
  private MetaobjectConnection metaobjects;

  
  private int metaobjectsCount;

  
  private String name;

  
  private String type;

  public MetaobjectDefinition() {
  }

  
  public MetaobjectAccess getAccess() {
    return access;
  }

  public void setAccess(MetaobjectAccess access) {
    this.access = access;
  }

  
  public MetaobjectCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  
  public App getCreatedByApp() {
    return createdByApp;
  }

  public void setCreatedByApp(App createdByApp) {
    this.createdByApp = createdByApp;
  }

  
  public StaffMember getCreatedByStaff() {
    return createdByStaff;
  }

  public void setCreatedByStaff(StaffMember createdByStaff) {
    this.createdByStaff = createdByStaff;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getDisplayNameKey() {
    return displayNameKey;
  }

  public void setDisplayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }

  
  public List<MetaobjectFieldDefinition> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<MetaobjectFieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }

  
  public boolean getHasThumbnailField() {
    return hasThumbnailField;
  }

  public void setHasThumbnailField(boolean hasThumbnailField) {
    this.hasThumbnailField = hasThumbnailField;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MetaobjectConnection getMetaobjects() {
    return metaobjects;
  }

  public void setMetaobjects(MetaobjectConnection metaobjects) {
    this.metaobjects = metaobjects;
  }

  
  public int getMetaobjectsCount() {
    return metaobjectsCount;
  }

  public void setMetaobjectsCount(int metaobjectsCount) {
    this.metaobjectsCount = metaobjectsCount;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "MetaobjectDefinition{access='" + access + "', capabilities='" + capabilities + "', createdByApp='" + createdByApp + "', createdByStaff='" + createdByStaff + "', description='" + description + "', displayNameKey='" + displayNameKey + "', fieldDefinitions='" + fieldDefinitions + "', hasThumbnailField='" + hasThumbnailField + "', id='" + id + "', metaobjects='" + metaobjects + "', metaobjectsCount='" + metaobjectsCount + "', name='" + name + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectDefinition that = (MetaobjectDefinition) o;
    return Objects.equals(access, that.access) &&
        Objects.equals(capabilities, that.capabilities) &&
        Objects.equals(createdByApp, that.createdByApp) &&
        Objects.equals(createdByStaff, that.createdByStaff) &&
        Objects.equals(description, that.description) &&
        Objects.equals(displayNameKey, that.displayNameKey) &&
        Objects.equals(fieldDefinitions, that.fieldDefinitions) &&
        hasThumbnailField == that.hasThumbnailField &&
        Objects.equals(id, that.id) &&
        Objects.equals(metaobjects, that.metaobjects) &&
        metaobjectsCount == that.metaobjectsCount &&
        Objects.equals(name, that.name) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, capabilities, createdByApp, createdByStaff, description, displayNameKey, fieldDefinitions, hasThumbnailField, id, metaobjects, metaobjectsCount, name, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetaobjectAccess access;

    
    private MetaobjectCapabilities capabilities;

    
    private App createdByApp;

    
    private StaffMember createdByStaff;

    
    private String description;

    
    private String displayNameKey;

    
    private List<MetaobjectFieldDefinition> fieldDefinitions;

    
    private boolean hasThumbnailField;

    
    private String id;

    
    private MetaobjectConnection metaobjects;

    
    private int metaobjectsCount;

    
    private String name;

    
    private String type;

    public MetaobjectDefinition build() {
      MetaobjectDefinition result = new MetaobjectDefinition();
      result.access = this.access;
      result.capabilities = this.capabilities;
      result.createdByApp = this.createdByApp;
      result.createdByStaff = this.createdByStaff;
      result.description = this.description;
      result.displayNameKey = this.displayNameKey;
      result.fieldDefinitions = this.fieldDefinitions;
      result.hasThumbnailField = this.hasThumbnailField;
      result.id = this.id;
      result.metaobjects = this.metaobjects;
      result.metaobjectsCount = this.metaobjectsCount;
      result.name = this.name;
      result.type = this.type;
      return result;
    }

    
    public Builder access(MetaobjectAccess access) {
      this.access = access;
      return this;
    }

    
    public Builder capabilities(MetaobjectCapabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    
    public Builder createdByApp(App createdByApp) {
      this.createdByApp = createdByApp;
      return this;
    }

    
    public Builder createdByStaff(StaffMember createdByStaff) {
      this.createdByStaff = createdByStaff;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder displayNameKey(String displayNameKey) {
      this.displayNameKey = displayNameKey;
      return this;
    }

    
    public Builder fieldDefinitions(List<MetaobjectFieldDefinition> fieldDefinitions) {
      this.fieldDefinitions = fieldDefinitions;
      return this;
    }

    
    public Builder hasThumbnailField(boolean hasThumbnailField) {
      this.hasThumbnailField = hasThumbnailField;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder metaobjects(MetaobjectConnection metaobjects) {
      this.metaobjects = metaobjects;
      return this;
    }

    
    public Builder metaobjectsCount(int metaobjectsCount) {
      this.metaobjectsCount = metaobjectsCount;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
