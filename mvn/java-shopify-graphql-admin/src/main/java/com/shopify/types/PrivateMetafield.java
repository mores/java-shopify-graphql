package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Private metafields represent custom metadata that is attached to a resource.
 * Private metafields are accessible only by the application that created them and only from the GraphQL Admin API.
 *
 * An application can create a maximum of 10 private metafields per shop resource.
 *
 * Private metafields are deprecated. Metafields created using a reserved namespace are private by default. See our guide for
 * [migrating private metafields](https://shopify.dev/docs/apps/custom-data/metafields/migrate-private-metafields).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PrivateMetafield implements com.shopify.types.Node {
  /**
   * The date and time when the private metafield was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The ID of the private metafield.
   */
  private String id;

  /**
   * The key name of the private metafield.
   */
  private String key;

  /**
   * The namespace of the private metafield.
   */
  private String namespace;

  /**
   * The date and time when the private metafield was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The value of a private metafield.
   */
  private String value;

  /**
   * Represents the private metafield value type.
   */
  private PrivateMetafieldValueType valueType;

  public PrivateMetafield() {
  }

  /**
   * The date and time when the private metafield was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the private metafield.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The key name of the private metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The namespace of the private metafield.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The date and time when the private metafield was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The value of a private metafield.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Represents the private metafield value type.
   */
  public PrivateMetafieldValueType getValueType() {
    return valueType;
  }

  public void setValueType(PrivateMetafieldValueType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "PrivateMetafield{createdAt='" + createdAt + "', id='" + id + "', key='" + key + "', namespace='" + namespace + "', updatedAt='" + updatedAt + "', value='" + value + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafield that = (PrivateMetafield) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(value, that.value) &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, key, namespace, updatedAt, value, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the private metafield was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The ID of the private metafield.
     */
    private String id;

    /**
     * The key name of the private metafield.
     */
    private String key;

    /**
     * The namespace of the private metafield.
     */
    private String namespace;

    /**
     * The date and time when the private metafield was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The value of a private metafield.
     */
    private String value;

    /**
     * Represents the private metafield value type.
     */
    private PrivateMetafieldValueType valueType;

    public PrivateMetafield build() {
      PrivateMetafield result = new PrivateMetafield();
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.key = this.key;
      result.namespace = this.namespace;
      result.updatedAt = this.updatedAt;
      result.value = this.value;
      result.valueType = this.valueType;
      return result;
    }

    /**
     * The date and time when the private metafield was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The ID of the private metafield.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The key name of the private metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The namespace of the private metafield.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The date and time when the private metafield was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The value of a private metafield.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Represents the private metafield value type.
     */
    public Builder valueType(PrivateMetafieldValueType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
