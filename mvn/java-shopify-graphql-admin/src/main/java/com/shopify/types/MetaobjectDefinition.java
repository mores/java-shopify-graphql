package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Provides the definition of a generic object structure composed of metafields.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetaobjectDefinition implements com.shopify.types.Node {
  /**
   * Access configuration for the metaobject definition.
   */
  private MetaobjectAccess access;

  /**
   * The capabilities of the metaobject definition.
   */
  private MetaobjectCapabilities capabilities;

  /**
   * The app used to create the metaobject definition.
   */
  private App createdByApp;

  /**
   * The staff member who created the metaobject definition.
   */
  private StaffMember createdByStaff;

  /**
   * The administrative description.
   */
  private String description;

  /**
   * The key of a field to reference as the display name for each object.
   */
  private String displayNameKey;

  /**
   * The fields defined for this object type.
   */
  private List<MetaobjectFieldDefinition> fieldDefinitions;

  /**
   * Whether this metaobject definition has field whose type can visually represent
   * a metaobject with        the `thumbnailField`.
   */
  private boolean hasThumbnailField;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A paginated connection to the metaobjects associated with the definition.
   */
  private MetaobjectConnection metaobjects;

  /**
   * The count of metaobjects created for the definition.
   */
  private int metaobjectsCount;

  /**
   * The human-readable name.
   */
  private String name;

  /**
   * The type of the object definition. Defines the namespace of associated metafields.
   */
  private String type;

  public MetaobjectDefinition() {
  }

  /**
   * Access configuration for the metaobject definition.
   */
  public MetaobjectAccess getAccess() {
    return access;
  }

  public void setAccess(MetaobjectAccess access) {
    this.access = access;
  }

  /**
   * The capabilities of the metaobject definition.
   */
  public MetaobjectCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(MetaobjectCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * The app used to create the metaobject definition.
   */
  public App getCreatedByApp() {
    return createdByApp;
  }

  public void setCreatedByApp(App createdByApp) {
    this.createdByApp = createdByApp;
  }

  /**
   * The staff member who created the metaobject definition.
   */
  public StaffMember getCreatedByStaff() {
    return createdByStaff;
  }

  public void setCreatedByStaff(StaffMember createdByStaff) {
    this.createdByStaff = createdByStaff;
  }

  /**
   * The administrative description.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The key of a field to reference as the display name for each object.
   */
  public String getDisplayNameKey() {
    return displayNameKey;
  }

  public void setDisplayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }

  /**
   * The fields defined for this object type.
   */
  public List<MetaobjectFieldDefinition> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<MetaobjectFieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }

  /**
   * Whether this metaobject definition has field whose type can visually represent
   * a metaobject with        the `thumbnailField`.
   */
  public boolean getHasThumbnailField() {
    return hasThumbnailField;
  }

  public void setHasThumbnailField(boolean hasThumbnailField) {
    this.hasThumbnailField = hasThumbnailField;
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
   * A paginated connection to the metaobjects associated with the definition.
   */
  public MetaobjectConnection getMetaobjects() {
    return metaobjects;
  }

  public void setMetaobjects(MetaobjectConnection metaobjects) {
    this.metaobjects = metaobjects;
  }

  /**
   * The count of metaobjects created for the definition.
   */
  public int getMetaobjectsCount() {
    return metaobjectsCount;
  }

  public void setMetaobjectsCount(int metaobjectsCount) {
    this.metaobjectsCount = metaobjectsCount;
  }

  /**
   * The human-readable name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of the object definition. Defines the namespace of associated metafields.
   */
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
    /**
     * Access configuration for the metaobject definition.
     */
    private MetaobjectAccess access;

    /**
     * The capabilities of the metaobject definition.
     */
    private MetaobjectCapabilities capabilities;

    /**
     * The app used to create the metaobject definition.
     */
    private App createdByApp;

    /**
     * The staff member who created the metaobject definition.
     */
    private StaffMember createdByStaff;

    /**
     * The administrative description.
     */
    private String description;

    /**
     * The key of a field to reference as the display name for each object.
     */
    private String displayNameKey;

    /**
     * The fields defined for this object type.
     */
    private List<MetaobjectFieldDefinition> fieldDefinitions;

    /**
     * Whether this metaobject definition has field whose type can visually represent
     * a metaobject with        the `thumbnailField`.
     */
    private boolean hasThumbnailField;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A paginated connection to the metaobjects associated with the definition.
     */
    private MetaobjectConnection metaobjects;

    /**
     * The count of metaobjects created for the definition.
     */
    private int metaobjectsCount;

    /**
     * The human-readable name.
     */
    private String name;

    /**
     * The type of the object definition. Defines the namespace of associated metafields.
     */
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

    /**
     * Access configuration for the metaobject definition.
     */
    public Builder access(MetaobjectAccess access) {
      this.access = access;
      return this;
    }

    /**
     * The capabilities of the metaobject definition.
     */
    public Builder capabilities(MetaobjectCapabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    /**
     * The app used to create the metaobject definition.
     */
    public Builder createdByApp(App createdByApp) {
      this.createdByApp = createdByApp;
      return this;
    }

    /**
     * The staff member who created the metaobject definition.
     */
    public Builder createdByStaff(StaffMember createdByStaff) {
      this.createdByStaff = createdByStaff;
      return this;
    }

    /**
     * The administrative description.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The key of a field to reference as the display name for each object.
     */
    public Builder displayNameKey(String displayNameKey) {
      this.displayNameKey = displayNameKey;
      return this;
    }

    /**
     * The fields defined for this object type.
     */
    public Builder fieldDefinitions(List<MetaobjectFieldDefinition> fieldDefinitions) {
      this.fieldDefinitions = fieldDefinitions;
      return this;
    }

    /**
     * Whether this metaobject definition has field whose type can visually represent
     * a metaobject with        the `thumbnailField`.
     */
    public Builder hasThumbnailField(boolean hasThumbnailField) {
      this.hasThumbnailField = hasThumbnailField;
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
     * A paginated connection to the metaobjects associated with the definition.
     */
    public Builder metaobjects(MetaobjectConnection metaobjects) {
      this.metaobjects = metaobjects;
      return this;
    }

    /**
     * The count of metaobjects created for the definition.
     */
    public Builder metaobjectsCount(int metaobjectsCount) {
      this.metaobjectsCount = metaobjectsCount;
      return this;
    }

    /**
     * The human-readable name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The type of the object definition. Defines the namespace of associated metafields.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
