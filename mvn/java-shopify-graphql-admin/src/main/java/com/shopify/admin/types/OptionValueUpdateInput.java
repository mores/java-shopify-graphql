package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a product option value.
 */
public class OptionValueUpdateInput {
  /**
   * Specifies the product option value.
   */
  private String id;

  /**
   * Value associated with an option.
   */
  private String name;

  /**
   * Metafield value associated with an option.
   */
  private String linkedMetafieldValue;

  public OptionValueUpdateInput() {
  }

  /**
   * Specifies the product option value.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Value associated with an option.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Metafield value associated with an option.
   */
  public String getLinkedMetafieldValue() {
    return linkedMetafieldValue;
  }

  public void setLinkedMetafieldValue(String linkedMetafieldValue) {
    this.linkedMetafieldValue = linkedMetafieldValue;
  }

  @Override
  public String toString() {
    return "OptionValueUpdateInput{id='" + id + "', name='" + name + "', linkedMetafieldValue='" + linkedMetafieldValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionValueUpdateInput that = (OptionValueUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, linkedMetafieldValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the product option value.
     */
    private String id;

    /**
     * Value associated with an option.
     */
    private String name;

    /**
     * Metafield value associated with an option.
     */
    private String linkedMetafieldValue;

    public OptionValueUpdateInput build() {
      OptionValueUpdateInput result = new OptionValueUpdateInput();
      result.id = this.id;
      result.name = this.name;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      return result;
    }

    /**
     * Specifies the product option value.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Value associated with an option.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Metafield value associated with an option.
     */
    public Builder linkedMetafieldValue(String linkedMetafieldValue) {
      this.linkedMetafieldValue = linkedMetafieldValue;
      return this;
    }
  }
}
