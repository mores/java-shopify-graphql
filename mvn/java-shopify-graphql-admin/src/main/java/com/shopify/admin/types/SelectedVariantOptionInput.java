package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the selected variant option of the combined listing.
 */
public class SelectedVariantOptionInput {
  /**
   * The name of the parent product's option.
   */
  private String name;

  /**
   * The selected option value of the parent product's option.
   */
  private String value;

  /**
   * The metaobject value of the linked metafield.
   */
  private String linkedMetafieldValue;

  public SelectedVariantOptionInput() {
  }

  /**
   * The name of the parent product's option.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The selected option value of the parent product's option.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The metaobject value of the linked metafield.
   */
  public String getLinkedMetafieldValue() {
    return linkedMetafieldValue;
  }

  public void setLinkedMetafieldValue(String linkedMetafieldValue) {
    this.linkedMetafieldValue = linkedMetafieldValue;
  }

  @Override
  public String toString() {
    return "SelectedVariantOptionInput{name='" + name + "', value='" + value + "', linkedMetafieldValue='" + linkedMetafieldValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SelectedVariantOptionInput that = (SelectedVariantOptionInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(value, that.value) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, linkedMetafieldValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the parent product's option.
     */
    private String name;

    /**
     * The selected option value of the parent product's option.
     */
    private String value;

    /**
     * The metaobject value of the linked metafield.
     */
    private String linkedMetafieldValue;

    public SelectedVariantOptionInput build() {
      SelectedVariantOptionInput result = new SelectedVariantOptionInput();
      result.name = this.name;
      result.value = this.value;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      return result;
    }

    /**
     * The name of the parent product's option.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The selected option value of the parent product's option.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * The metaobject value of the linked metafield.
     */
    public Builder linkedMetafieldValue(String linkedMetafieldValue) {
      this.linkedMetafieldValue = linkedMetafieldValue;
      return this;
    }
  }
}
