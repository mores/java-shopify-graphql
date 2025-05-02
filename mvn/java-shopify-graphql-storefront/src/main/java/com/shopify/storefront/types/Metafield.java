package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Metafields represent custom metadata attached to a resource. Metafields can be sorted into namespaces and are
 * comprised of keys, values, and value types.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Metafield implements com.shopify.storefront.types.Node {
  /**
   * The date and time when the storefront metafield was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The description of a metafield.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The unique identifier for the metafield within its namespace.
   */
  private String key;

  /**
   * The container for a group of metafields that the metafield is associated with.
   */
  private String namespace;

  /**
   * The type of resource that the metafield is attached to.
   */
  private MetafieldParentResource parentResource;

  /**
   * Returns a reference object if the metafield's type is a resource reference.
   */
  private MetafieldReference reference;

  /**
   * A list of reference objects if the metafield's type is a resource reference list.
   */
  private MetafieldReferenceConnection references;

  /**
   * The type name of the metafield.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/definitions/types).
   */
  private String type;

  /**
   * The date and time when the metafield was last updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
   */
  private String value;

  public Metafield() {
  }

  /**
   * The date and time when the storefront metafield was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The description of a metafield.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * The unique identifier for the metafield within its namespace.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The container for a group of metafields that the metafield is associated with.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The type of resource that the metafield is attached to.
   */
  public MetafieldParentResource getParentResource() {
    return parentResource;
  }

  public void setParentResource(MetafieldParentResource parentResource) {
    this.parentResource = parentResource;
  }

  /**
   * Returns a reference object if the metafield's type is a resource reference.
   */
  public MetafieldReference getReference() {
    return reference;
  }

  public void setReference(MetafieldReference reference) {
    this.reference = reference;
  }

  /**
   * A list of reference objects if the metafield's type is a resource reference list.
   */
  public MetafieldReferenceConnection getReferences() {
    return references;
  }

  public void setReferences(MetafieldReferenceConnection references) {
    this.references = references;
  }

  /**
   * The type name of the metafield.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/definitions/types).
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The date and time when the metafield was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Metafield{createdAt='" + createdAt + "', description='" + description + "', id='" + id + "', key='" + key + "', namespace='" + namespace + "', parentResource='" + parentResource + "', reference='" + reference + "', references='" + references + "', type='" + type + "', updatedAt='" + updatedAt + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Metafield that = (Metafield) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(parentResource, that.parentResource) &&
        Objects.equals(reference, that.reference) &&
        Objects.equals(references, that.references) &&
        Objects.equals(type, that.type) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, id, key, namespace, parentResource, reference, references, type, updatedAt, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the storefront metafield was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The description of a metafield.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The unique identifier for the metafield within its namespace.
     */
    private String key;

    /**
     * The container for a group of metafields that the metafield is associated with.
     */
    private String namespace;

    /**
     * The type of resource that the metafield is attached to.
     */
    private MetafieldParentResource parentResource;

    /**
     * Returns a reference object if the metafield's type is a resource reference.
     */
    private MetafieldReference reference;

    /**
     * A list of reference objects if the metafield's type is a resource reference list.
     */
    private MetafieldReferenceConnection references;

    /**
     * The type name of the metafield.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/definitions/types).
     */
    private String type;

    /**
     * The date and time when the metafield was last updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
     */
    private String value;

    public Metafield build() {
      Metafield result = new Metafield();
      result.createdAt = this.createdAt;
      result.description = this.description;
      result.id = this.id;
      result.key = this.key;
      result.namespace = this.namespace;
      result.parentResource = this.parentResource;
      result.reference = this.reference;
      result.references = this.references;
      result.type = this.type;
      result.updatedAt = this.updatedAt;
      result.value = this.value;
      return result;
    }

    /**
     * The date and time when the storefront metafield was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The description of a metafield.
     */
    public Builder description(String description) {
      this.description = description;
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
     * The unique identifier for the metafield within its namespace.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The container for a group of metafields that the metafield is associated with.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The type of resource that the metafield is attached to.
     */
    public Builder parentResource(MetafieldParentResource parentResource) {
      this.parentResource = parentResource;
      return this;
    }

    /**
     * Returns a reference object if the metafield's type is a resource reference.
     */
    public Builder reference(MetafieldReference reference) {
      this.reference = reference;
      return this;
    }

    /**
     * A list of reference objects if the metafield's type is a resource reference list.
     */
    public Builder references(MetafieldReferenceConnection references) {
      this.references = references;
      return this;
    }

    /**
     * The type name of the metafield.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/definitions/types).
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The date and time when the metafield was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
