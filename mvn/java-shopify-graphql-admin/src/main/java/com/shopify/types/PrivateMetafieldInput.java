package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a private metafield.
 */
public class PrivateMetafieldInput {
  /**
   * The resource that owns the metafield. If the field is blank, then the `Shop` resource owns the metafield.
   */
  private String owner;

  /**
   * The namespace of the private metafield.
   */
  private String namespace;

  /**
   * The key of the private metafield.
   */
  private String key;

  /**
   * The `value` and `valueType` of the private metafield, wrapped in a `ValueInput` object.
   */
  private PrivateMetafieldValueInput valueInput;

  public PrivateMetafieldInput() {
  }

  /**
   * The resource that owns the metafield. If the field is blank, then the `Shop` resource owns the metafield.
   */
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
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
   * The key of the private metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The `value` and `valueType` of the private metafield, wrapped in a `ValueInput` object.
   */
  public PrivateMetafieldValueInput getValueInput() {
    return valueInput;
  }

  public void setValueInput(PrivateMetafieldValueInput valueInput) {
    this.valueInput = valueInput;
  }

  @Override
  public String toString() {
    return "PrivateMetafieldInput{owner='" + owner + "', namespace='" + namespace + "', key='" + key + "', valueInput='" + valueInput + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldInput that = (PrivateMetafieldInput) o;
    return Objects.equals(owner, that.owner) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(valueInput, that.valueInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, namespace, key, valueInput);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The resource that owns the metafield. If the field is blank, then the `Shop` resource owns the metafield.
     */
    private String owner;

    /**
     * The namespace of the private metafield.
     */
    private String namespace;

    /**
     * The key of the private metafield.
     */
    private String key;

    /**
     * The `value` and `valueType` of the private metafield, wrapped in a `ValueInput` object.
     */
    private PrivateMetafieldValueInput valueInput;

    public PrivateMetafieldInput build() {
      PrivateMetafieldInput result = new PrivateMetafieldInput();
      result.owner = this.owner;
      result.namespace = this.namespace;
      result.key = this.key;
      result.valueInput = this.valueInput;
      return result;
    }

    /**
     * The resource that owns the metafield. If the field is blank, then the `Shop` resource owns the metafield.
     */
    public Builder owner(String owner) {
      this.owner = owner;
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
     * The key of the private metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The `value` and `valueType` of the private metafield, wrapped in a `ValueInput` object.
     */
    public Builder valueInput(PrivateMetafieldValueInput valueInput) {
      this.valueInput = valueInput;
      return this;
    }
  }
}
