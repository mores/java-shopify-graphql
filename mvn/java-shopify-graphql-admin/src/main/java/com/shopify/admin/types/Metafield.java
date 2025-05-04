package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Metafields enable you to attach additional information to a Shopify resource, such
 * as a [Product](https://shopify.dev/api/admin-graphql/latest/objects/product) or
 * a [Collection](https://shopify.dev/api/admin-graphql/latest/objects/collection).
 * For more information about where you can attach metafields refer to [HasMetafields](https://shopify.dev/api/admin/graphql/reference/common-objects/HasMetafields).
 * Some examples of the data that metafields enable you to store are
 * specifications, size charts, downloadable documents, release dates, images, or part numbers.
 * Metafields are identified by an owner resource, namespace, and key. and store a
 * value along with type information for that value.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Metafield implements com.shopify.admin.types.HasCompareDigest, com.shopify.admin.types.LegacyInteroperability, com.shopify.admin.types.Node {
  /**
   * The data stored in the resource, represented as a digest.
   */
  private String compareDigest;

  /**
   * The date and time when the metafield was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The metafield definition that the metafield belongs to, if any.
   */
  private MetafieldDefinition definition;

  /**
   * The description of the metafield.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The data stored in the metafield in JSON format.
   */
  private String jsonValue;

  /**
   * The unique identifier for the metafield within its namespace.
   */
  private String key;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The container for a group of metafields that the metafield is associated with.
   */
  private String namespace;

  /**
   * The resource that the metafield is attached to.
   */
  private HasMetafields owner;

  /**
   * The type of resource that the metafield is attached to.
   */
  private MetafieldOwnerType ownerType;

  /**
   * Returns a reference object if the metafield definition's type is a resource reference.
   */
  private MetafieldReference reference;

  /**
   * A list of reference objects if the metafield's type is a resource reference list.
   */
  private MetafieldReferenceConnection references;

  /**
   * The type of data that is stored in the metafield.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
   */
  private String type;

  /**
   * The date and time when the metafield was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
   */
  private String value;

  public Metafield() {
  }

  /**
   * The data stored in the resource, represented as a digest.
   */
  public String getCompareDigest() {
    return compareDigest;
  }

  public void setCompareDigest(String compareDigest) {
    this.compareDigest = compareDigest;
  }

  /**
   * The date and time when the metafield was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The metafield definition that the metafield belongs to, if any.
   */
  public MetafieldDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(MetafieldDefinition definition) {
    this.definition = definition;
  }

  /**
   * The description of the metafield.
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
   * The data stored in the metafield in JSON format.
   */
  public String getJsonValue() {
    return jsonValue;
  }

  public void setJsonValue(String jsonValue) {
    this.jsonValue = jsonValue;
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
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
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
   * The resource that the metafield is attached to.
   */
  public HasMetafields getOwner() {
    return owner;
  }

  public void setOwner(HasMetafields owner) {
    this.owner = owner;
  }

  /**
   * The type of resource that the metafield is attached to.
   */
  public MetafieldOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(MetafieldOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  /**
   * Returns a reference object if the metafield definition's type is a resource reference.
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
   * The type of data that is stored in the metafield.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The date and time when the metafield was updated.
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
    return "Metafield{compareDigest='" + compareDigest + "', createdAt='" + createdAt + "', definition='" + definition + "', description='" + description + "', id='" + id + "', jsonValue='" + jsonValue + "', key='" + key + "', legacyResourceId='" + legacyResourceId + "', namespace='" + namespace + "', owner='" + owner + "', ownerType='" + ownerType + "', reference='" + reference + "', references='" + references + "', type='" + type + "', updatedAt='" + updatedAt + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Metafield that = (Metafield) o;
    return Objects.equals(compareDigest, that.compareDigest) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(definition, that.definition) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(jsonValue, that.jsonValue) &&
        Objects.equals(key, that.key) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(owner, that.owner) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(reference, that.reference) &&
        Objects.equals(references, that.references) &&
        Objects.equals(type, that.type) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareDigest, createdAt, definition, description, id, jsonValue, key, legacyResourceId, namespace, owner, ownerType, reference, references, type, updatedAt, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The data stored in the resource, represented as a digest.
     */
    private String compareDigest;

    /**
     * The date and time when the metafield was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The metafield definition that the metafield belongs to, if any.
     */
    private MetafieldDefinition definition;

    /**
     * The description of the metafield.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The data stored in the metafield in JSON format.
     */
    private String jsonValue;

    /**
     * The unique identifier for the metafield within its namespace.
     */
    private String key;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The container for a group of metafields that the metafield is associated with.
     */
    private String namespace;

    /**
     * The resource that the metafield is attached to.
     */
    private HasMetafields owner;

    /**
     * The type of resource that the metafield is attached to.
     */
    private MetafieldOwnerType ownerType;

    /**
     * Returns a reference object if the metafield definition's type is a resource reference.
     */
    private MetafieldReference reference;

    /**
     * A list of reference objects if the metafield's type is a resource reference list.
     */
    private MetafieldReferenceConnection references;

    /**
     * The type of data that is stored in the metafield.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
     */
    private String type;

    /**
     * The date and time when the metafield was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
     */
    private String value;

    public Metafield build() {
      Metafield result = new Metafield();
      result.compareDigest = this.compareDigest;
      result.createdAt = this.createdAt;
      result.definition = this.definition;
      result.description = this.description;
      result.id = this.id;
      result.jsonValue = this.jsonValue;
      result.key = this.key;
      result.legacyResourceId = this.legacyResourceId;
      result.namespace = this.namespace;
      result.owner = this.owner;
      result.ownerType = this.ownerType;
      result.reference = this.reference;
      result.references = this.references;
      result.type = this.type;
      result.updatedAt = this.updatedAt;
      result.value = this.value;
      return result;
    }

    /**
     * The data stored in the resource, represented as a digest.
     */
    public Builder compareDigest(String compareDigest) {
      this.compareDigest = compareDigest;
      return this;
    }

    /**
     * The date and time when the metafield was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The metafield definition that the metafield belongs to, if any.
     */
    public Builder definition(MetafieldDefinition definition) {
      this.definition = definition;
      return this;
    }

    /**
     * The description of the metafield.
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
     * The data stored in the metafield in JSON format.
     */
    public Builder jsonValue(String jsonValue) {
      this.jsonValue = jsonValue;
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
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
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
     * The resource that the metafield is attached to.
     */
    public Builder owner(HasMetafields owner) {
      this.owner = owner;
      return this;
    }

    /**
     * The type of resource that the metafield is attached to.
     */
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }

    /**
     * Returns a reference object if the metafield definition's type is a resource reference.
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
     * The type of data that is stored in the metafield.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The date and time when the metafield was updated.
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
