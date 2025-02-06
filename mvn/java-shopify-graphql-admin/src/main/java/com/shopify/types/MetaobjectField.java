package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provides a field definition and the data value assigned to it.
 */
public class MetaobjectField {
  /**
   * The field definition for this object key.
   */
  private MetaobjectFieldDefinition definition;

  /**
   * The assigned field value in JSON format.
   */
  private String jsonValue;

  /**
   * The object key of this field.
   */
  private String key;

  /**
   * For resource reference fields, provides the referenced object.
   */
  private MetafieldReference reference;

  /**
   * For resource reference list fields, provides the list of referenced objects.
   */
  private MetafieldReferenceConnection references;

  /**
   * For file reference or color fields, provides visual attributes for this field.
   */
  private MetaobjectThumbnail thumbnail;

  /**
   * The type of the field.
   */
  private String type;

  /**
   * The assigned field value, always stored as a string regardless of the field type.
   */
  private String value;

  public MetaobjectField() {
  }

  /**
   * The field definition for this object key.
   */
  public MetaobjectFieldDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(MetaobjectFieldDefinition definition) {
    this.definition = definition;
  }

  /**
   * The assigned field value in JSON format.
   */
  public String getJsonValue() {
    return jsonValue;
  }

  public void setJsonValue(String jsonValue) {
    this.jsonValue = jsonValue;
  }

  /**
   * The object key of this field.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * For resource reference fields, provides the referenced object.
   */
  public MetafieldReference getReference() {
    return reference;
  }

  public void setReference(MetafieldReference reference) {
    this.reference = reference;
  }

  /**
   * For resource reference list fields, provides the list of referenced objects.
   */
  public MetafieldReferenceConnection getReferences() {
    return references;
  }

  public void setReferences(MetafieldReferenceConnection references) {
    this.references = references;
  }

  /**
   * For file reference or color fields, provides visual attributes for this field.
   */
  public MetaobjectThumbnail getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(MetaobjectThumbnail thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   * The type of the field.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The assigned field value, always stored as a string regardless of the field type.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MetaobjectField{definition='" + definition + "', jsonValue='" + jsonValue + "', key='" + key + "', reference='" + reference + "', references='" + references + "', thumbnail='" + thumbnail + "', type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectField that = (MetaobjectField) o;
    return Objects.equals(definition, that.definition) &&
        Objects.equals(jsonValue, that.jsonValue) &&
        Objects.equals(key, that.key) &&
        Objects.equals(reference, that.reference) &&
        Objects.equals(references, that.references) &&
        Objects.equals(thumbnail, that.thumbnail) &&
        Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, jsonValue, key, reference, references, thumbnail, type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The field definition for this object key.
     */
    private MetaobjectFieldDefinition definition;

    /**
     * The assigned field value in JSON format.
     */
    private String jsonValue;

    /**
     * The object key of this field.
     */
    private String key;

    /**
     * For resource reference fields, provides the referenced object.
     */
    private MetafieldReference reference;

    /**
     * For resource reference list fields, provides the list of referenced objects.
     */
    private MetafieldReferenceConnection references;

    /**
     * For file reference or color fields, provides visual attributes for this field.
     */
    private MetaobjectThumbnail thumbnail;

    /**
     * The type of the field.
     */
    private String type;

    /**
     * The assigned field value, always stored as a string regardless of the field type.
     */
    private String value;

    public MetaobjectField build() {
      MetaobjectField result = new MetaobjectField();
      result.definition = this.definition;
      result.jsonValue = this.jsonValue;
      result.key = this.key;
      result.reference = this.reference;
      result.references = this.references;
      result.thumbnail = this.thumbnail;
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The field definition for this object key.
     */
    public Builder definition(MetaobjectFieldDefinition definition) {
      this.definition = definition;
      return this;
    }

    /**
     * The assigned field value in JSON format.
     */
    public Builder jsonValue(String jsonValue) {
      this.jsonValue = jsonValue;
      return this;
    }

    /**
     * The object key of this field.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * For resource reference fields, provides the referenced object.
     */
    public Builder reference(MetafieldReference reference) {
      this.reference = reference;
      return this;
    }

    /**
     * For resource reference list fields, provides the list of referenced objects.
     */
    public Builder references(MetafieldReferenceConnection references) {
      this.references = references;
      return this;
    }

    /**
     * For file reference or color fields, provides visual attributes for this field.
     */
    public Builder thumbnail(MetaobjectThumbnail thumbnail) {
      this.thumbnail = thumbnail;
      return this;
    }

    /**
     * The type of the field.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The assigned field value, always stored as a string regardless of the field type.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
