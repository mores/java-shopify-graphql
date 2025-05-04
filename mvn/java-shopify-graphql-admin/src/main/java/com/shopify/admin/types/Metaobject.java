package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Provides an object instance represented by a MetaobjectDefinition.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Metaobject implements MetafieldReference, MetafieldReferencer, com.shopify.admin.types.Node {
  /**
   * Metaobject capabilities for this Metaobject.
   */
  private MetaobjectCapabilityData capabilities;

  /**
   * The app used to create the object.
   */
  private App createdBy;

  /**
   * The app used to create the object.
   */
  private App createdByApp;

  /**
   * The staff member who created the metaobject.
   */
  private StaffMember createdByStaff;

  /**
   * The MetaobjectDefinition that models this object type.
   */
  private MetaobjectDefinition definition;

  /**
   * The preferred display name field value of the metaobject.
   */
  private String displayName;

  /**
   * The field for an object key, or null if the key has no field definition.
   */
  private MetaobjectField field;

  /**
   * All ordered fields of the metaobject with their definitions and values.
   */
  private List<MetaobjectField> fields;

  /**
   * The unique handle of the object, useful as a custom ID.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * List of back references metafields that belong to the resource.
   */
  private MetafieldRelationConnection referencedBy;

  /**
   * The staff member who created the metaobject.
   */
  private StaffMember staffMember;

  /**
   * The recommended field to visually represent this metaobject. May be a file reference or color         field.
   */
  private MetaobjectField thumbnailField;

  /**
   * The type of the metaobject.
   */
  private String type;

  /**
   * When the object was last updated.
   */
  private OffsetDateTime updatedAt;

  public Metaobject() {
  }

  /**
   * Metaobject capabilities for this Metaobject.
   */
  public MetaobjectCapabilityData getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilityData capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * The app used to create the object.
   */
  public App getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(App createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * The app used to create the object.
   */
  public App getCreatedByApp() {
    return createdByApp;
  }

  public void setCreatedByApp(App createdByApp) {
    this.createdByApp = createdByApp;
  }

  /**
   * The staff member who created the metaobject.
   */
  public StaffMember getCreatedByStaff() {
    return createdByStaff;
  }

  public void setCreatedByStaff(StaffMember createdByStaff) {
    this.createdByStaff = createdByStaff;
  }

  /**
   * The MetaobjectDefinition that models this object type.
   */
  public MetaobjectDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(MetaobjectDefinition definition) {
    this.definition = definition;
  }

  /**
   * The preferred display name field value of the metaobject.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The field for an object key, or null if the key has no field definition.
   */
  public MetaobjectField getField() {
    return field;
  }

  public void setField(MetaobjectField field) {
    this.field = field;
  }

  /**
   * All ordered fields of the metaobject with their definitions and values.
   */
  public List<MetaobjectField> getFields() {
    return fields;
  }

  public void setFields(List<MetaobjectField> fields) {
    this.fields = fields;
  }

  /**
   * The unique handle of the object, useful as a custom ID.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * List of back references metafields that belong to the resource.
   */
  public MetafieldRelationConnection getReferencedBy() {
    return referencedBy;
  }

  public void setReferencedBy(MetafieldRelationConnection referencedBy) {
    this.referencedBy = referencedBy;
  }

  /**
   * The staff member who created the metaobject.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The recommended field to visually represent this metaobject. May be a file reference or color         field.
   */
  public MetaobjectField getThumbnailField() {
    return thumbnailField;
  }

  public void setThumbnailField(MetaobjectField thumbnailField) {
    this.thumbnailField = thumbnailField;
  }

  /**
   * The type of the metaobject.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * When the object was last updated.
   */
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
    /**
     * Metaobject capabilities for this Metaobject.
     */
    private MetaobjectCapabilityData capabilities;

    /**
     * The app used to create the object.
     */
    private App createdBy;

    /**
     * The app used to create the object.
     */
    private App createdByApp;

    /**
     * The staff member who created the metaobject.
     */
    private StaffMember createdByStaff;

    /**
     * The MetaobjectDefinition that models this object type.
     */
    private MetaobjectDefinition definition;

    /**
     * The preferred display name field value of the metaobject.
     */
    private String displayName;

    /**
     * The field for an object key, or null if the key has no field definition.
     */
    private MetaobjectField field;

    /**
     * All ordered fields of the metaobject with their definitions and values.
     */
    private List<MetaobjectField> fields;

    /**
     * The unique handle of the object, useful as a custom ID.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * List of back references metafields that belong to the resource.
     */
    private MetafieldRelationConnection referencedBy;

    /**
     * The staff member who created the metaobject.
     */
    private StaffMember staffMember;

    /**
     * The recommended field to visually represent this metaobject. May be a file reference or color         field.
     */
    private MetaobjectField thumbnailField;

    /**
     * The type of the metaobject.
     */
    private String type;

    /**
     * When the object was last updated.
     */
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

    /**
     * Metaobject capabilities for this Metaobject.
     */
    public Builder capabilities(MetaobjectCapabilityData capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    /**
     * The app used to create the object.
     */
    public Builder createdBy(App createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * The app used to create the object.
     */
    public Builder createdByApp(App createdByApp) {
      this.createdByApp = createdByApp;
      return this;
    }

    /**
     * The staff member who created the metaobject.
     */
    public Builder createdByStaff(StaffMember createdByStaff) {
      this.createdByStaff = createdByStaff;
      return this;
    }

    /**
     * The MetaobjectDefinition that models this object type.
     */
    public Builder definition(MetaobjectDefinition definition) {
      this.definition = definition;
      return this;
    }

    /**
     * The preferred display name field value of the metaobject.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The field for an object key, or null if the key has no field definition.
     */
    public Builder field(MetaobjectField field) {
      this.field = field;
      return this;
    }

    /**
     * All ordered fields of the metaobject with their definitions and values.
     */
    public Builder fields(List<MetaobjectField> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * The unique handle of the object, useful as a custom ID.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * List of back references metafields that belong to the resource.
     */
    public Builder referencedBy(MetafieldRelationConnection referencedBy) {
      this.referencedBy = referencedBy;
      return this;
    }

    /**
     * The staff member who created the metaobject.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The recommended field to visually represent this metaobject. May be a file reference or color         field.
     */
    public Builder thumbnailField(MetaobjectField thumbnailField) {
      this.thumbnailField = thumbnailField;
      return this;
    }

    /**
     * The type of the metaobject.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * When the object was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
