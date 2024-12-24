package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Metaobject implements MetafieldReference, MetafieldReferencer, com.shopify.types.Node {
  
  private MetaobjectCapabilityData capabilities;

  
  private App createdBy;

  
  private App createdByApp;

  
  private StaffMember createdByStaff;

  
  private MetaobjectDefinition definition;

  
  private String displayName;

  
  private MetaobjectField field;

  
  private List<MetaobjectField> fields;

  
  private String handle;

  
  private String id;

  
  private MetafieldRelationConnection referencedBy;

  
  private StaffMember staffMember;

  
  private MetaobjectField thumbnailField;

  
  private String type;

  
  private OffsetDateTime updatedAt;

  public Metaobject() {
  }

  
  public MetaobjectCapabilityData getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilityData capabilities) {
    this.capabilities = capabilities;
  }

  
  public App getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(App createdBy) {
    this.createdBy = createdBy;
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

  
  public MetaobjectDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(MetaobjectDefinition definition) {
    this.definition = definition;
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  public MetaobjectField getField() {
    return field;
  }

  public void setField(MetaobjectField field) {
    this.field = field;
  }

  
  public List<MetaobjectField> getFields() {
    return fields;
  }

  public void setFields(List<MetaobjectField> fields) {
    this.fields = fields;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MetafieldRelationConnection getReferencedBy() {
    return referencedBy;
  }

  public void setReferencedBy(MetafieldRelationConnection referencedBy) {
    this.referencedBy = referencedBy;
  }

  
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  
  public MetaobjectField getThumbnailField() {
    return thumbnailField;
  }

  public void setThumbnailField(MetaobjectField thumbnailField) {
    this.thumbnailField = thumbnailField;
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Metaobject{capabilities='" + capabilities + "', createdBy='" + createdBy + "', createdByApp='" + createdByApp + "', createdByStaff='" + createdByStaff + "', definition='" + definition + "', displayName='" + displayName + "', field='" + field + "', fields='" + fields + "', handle='" + handle + "', id='" + id + "', referencedBy='" + referencedBy + "', staffMember='" + staffMember + "', thumbnailField='" + thumbnailField + "', type='" + type + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Metaobject that = (Metaobject) o;
    return Objects.equals(capabilities, that.capabilities) &&
        Objects.equals(createdBy, that.createdBy) &&
        Objects.equals(createdByApp, that.createdByApp) &&
        Objects.equals(createdByStaff, that.createdByStaff) &&
        Objects.equals(definition, that.definition) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(field, that.field) &&
        Objects.equals(fields, that.fields) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(referencedBy, that.referencedBy) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(thumbnailField, that.thumbnailField) &&
        Objects.equals(type, that.type) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, createdBy, createdByApp, createdByStaff, definition, displayName, field, fields, handle, id, referencedBy, staffMember, thumbnailField, type, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetaobjectCapabilityData capabilities;

    
    private App createdBy;

    
    private App createdByApp;

    
    private StaffMember createdByStaff;

    
    private MetaobjectDefinition definition;

    
    private String displayName;

    
    private MetaobjectField field;

    
    private List<MetaobjectField> fields;

    
    private String handle;

    
    private String id;

    
    private MetafieldRelationConnection referencedBy;

    
    private StaffMember staffMember;

    
    private MetaobjectField thumbnailField;

    
    private String type;

    
    private OffsetDateTime updatedAt;

    public Metaobject build() {
      Metaobject result = new Metaobject();
      result.capabilities = this.capabilities;
      result.createdBy = this.createdBy;
      result.createdByApp = this.createdByApp;
      result.createdByStaff = this.createdByStaff;
      result.definition = this.definition;
      result.displayName = this.displayName;
      result.field = this.field;
      result.fields = this.fields;
      result.handle = this.handle;
      result.id = this.id;
      result.referencedBy = this.referencedBy;
      result.staffMember = this.staffMember;
      result.thumbnailField = this.thumbnailField;
      result.type = this.type;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder capabilities(MetaobjectCapabilityData capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    
    public Builder createdBy(App createdBy) {
      this.createdBy = createdBy;
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

    
    public Builder definition(MetaobjectDefinition definition) {
      this.definition = definition;
      return this;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    
    public Builder field(MetaobjectField field) {
      this.field = field;
      return this;
    }

    
    public Builder fields(List<MetaobjectField> fields) {
      this.fields = fields;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder referencedBy(MetafieldRelationConnection referencedBy) {
      this.referencedBy = referencedBy;
      return this;
    }

    
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    
    public Builder thumbnailField(MetaobjectField thumbnailField) {
      this.thumbnailField = thumbnailField;
      return this;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
