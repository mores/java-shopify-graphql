package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provides the value of a Metaobject field.
 */
public class MetaobjectField {
  /**
   * The field key.
   */
  private String key;

  /**
   * A referenced object if the field type is a resource reference.
   */
  private MetafieldReference reference;

  /**
   * A list of referenced objects if the field type is a resource reference list.
   */
  private MetafieldReferenceConnection references;

  /**
   * The type name of the field.
   * See the list of [supported types](https://shopify.dev/apps/metafields/definitions/types).
   */
  private String type;

  /**
   * The field value.
   */
  private String value;

  public MetaobjectField() {
  }

  /**
   * The field key.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * A referenced object if the field type is a resource reference.
   */
  public MetafieldReference getReference() {
    return reference;
  }

  public void setReference(MetafieldReference reference) {
    this.reference = reference;
  }

  /**
   * A list of referenced objects if the field type is a resource reference list.
   */
  public MetafieldReferenceConnection getReferences() {
    return references;
  }

  public void setReferences(MetafieldReferenceConnection references) {
    this.references = references;
  }

  /**
   * The type name of the field.
   * See the list of [supported types](https://shopify.dev/apps/metafields/definitions/types).
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The field value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MetaobjectField{key='" + key + "', reference='" + reference + "', references='" + references + "', type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectField that = (MetaobjectField) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(reference, that.reference) &&
        Objects.equals(references, that.references) &&
        Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, reference, references, type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The field key.
     */
    private String key;

    /**
     * A referenced object if the field type is a resource reference.
     */
    private MetafieldReference reference;

    /**
     * A list of referenced objects if the field type is a resource reference list.
     */
    private MetafieldReferenceConnection references;

    /**
     * The type name of the field.
     * See the list of [supported types](https://shopify.dev/apps/metafields/definitions/types).
     */
    private String type;

    /**
     * The field value.
     */
    private String value;

    public MetaobjectField build() {
      MetaobjectField result = new MetaobjectField();
      result.key = this.key;
      result.reference = this.reference;
      result.references = this.references;
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The field key.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * A referenced object if the field type is a resource reference.
     */
    public Builder reference(MetafieldReference reference) {
      this.reference = reference;
      return this;
    }

    /**
     * A list of referenced objects if the field type is a resource reference list.
     */
    public Builder references(MetafieldReferenceConnection references) {
      this.references = references;
      return this;
    }

    /**
     * The type name of the field.
     * See the list of [supported types](https://shopify.dev/apps/metafields/definitions/types).
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The field value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
