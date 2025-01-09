package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or modify a product variant's option value.
 */
public class VariantOptionValueInput {
  /**
   * Specifies the product option value by ID.
   */
  private String id;

  /**
   * Specifies the product option value by name.
   */
  private String name;

  /**
   * Metafield value associated with an option.
   */
  private String linkedMetafieldValue;

  /**
   * Specifies the product option by ID.
   */
  private String optionId;

  /**
   * Specifies the product option by name.
   */
  private String optionName;

  public VariantOptionValueInput() {
  }

  /**
   * Specifies the product option value by ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Specifies the product option value by name.
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

  /**
   * Specifies the product option by ID.
   */
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  /**
   * Specifies the product option by name.
   */
  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  @Override
  public String toString() {
    return "VariantOptionValueInput{id='" + id + "', name='" + name + "', linkedMetafieldValue='" + linkedMetafieldValue + "', optionId='" + optionId + "', optionName='" + optionName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VariantOptionValueInput that = (VariantOptionValueInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue) &&
        Objects.equals(optionId, that.optionId) &&
        Objects.equals(optionName, that.optionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, linkedMetafieldValue, optionId, optionName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the product option value by ID.
     */
    private String id;

    /**
     * Specifies the product option value by name.
     */
    private String name;

    /**
     * Metafield value associated with an option.
     */
    private String linkedMetafieldValue;

    /**
     * Specifies the product option by ID.
     */
    private String optionId;

    /**
     * Specifies the product option by name.
     */
    private String optionName;

    public VariantOptionValueInput build() {
      VariantOptionValueInput result = new VariantOptionValueInput();
      result.id = this.id;
      result.name = this.name;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      result.optionId = this.optionId;
      result.optionName = this.optionName;
      return result;
    }

    /**
     * Specifies the product option value by ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Specifies the product option value by name.
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

    /**
     * Specifies the product option by ID.
     */
    public Builder optionId(String optionId) {
      this.optionId = optionId;
      return this;
    }

    /**
     * Specifies the product option by name.
     */
    public Builder optionName(String optionName) {
      this.optionName = optionName;
      return this;
    }
  }
}
