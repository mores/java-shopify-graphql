package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for mapping a consolidated option to a specific component option.
 */
public class ProductBundleConsolidatedOptionComponentInput {
  /**
   * The value to use for the component option (e.g., 'Small', 'Red').
   */
  private String componentOptionValue;

  /**
   * The ID of the component option that this consolidated option maps to.
   * If null, this selection targets the component's quantity option with the given name.
   */
  private String componentOptionId;

  public ProductBundleConsolidatedOptionComponentInput() {
  }

  /**
   * The value to use for the component option (e.g., 'Small', 'Red').
   */
  public String getComponentOptionValue() {
    return componentOptionValue;
  }

  public void setComponentOptionValue(String componentOptionValue) {
    this.componentOptionValue = componentOptionValue;
  }

  /**
   * The ID of the component option that this consolidated option maps to.
   * If null, this selection targets the component's quantity option with the given name.
   */
  public String getComponentOptionId() {
    return componentOptionId;
  }

  public void setComponentOptionId(String componentOptionId) {
    this.componentOptionId = componentOptionId;
  }

  @Override
  public String toString() {
    return "ProductBundleConsolidatedOptionComponentInput{componentOptionValue='" + componentOptionValue + "', componentOptionId='" + componentOptionId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleConsolidatedOptionComponentInput that = (ProductBundleConsolidatedOptionComponentInput) o;
    return Objects.equals(componentOptionValue, that.componentOptionValue) &&
        Objects.equals(componentOptionId, that.componentOptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentOptionValue, componentOptionId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value to use for the component option (e.g., 'Small', 'Red').
     */
    private String componentOptionValue;

    /**
     * The ID of the component option that this consolidated option maps to.
     * If null, this selection targets the component's quantity option with the given name.
     */
    private String componentOptionId;

    public ProductBundleConsolidatedOptionComponentInput build() {
      ProductBundleConsolidatedOptionComponentInput result = new ProductBundleConsolidatedOptionComponentInput();
      result.componentOptionValue = this.componentOptionValue;
      result.componentOptionId = this.componentOptionId;
      return result;
    }

    /**
     * The value to use for the component option (e.g., 'Small', 'Red').
     */
    public Builder componentOptionValue(String componentOptionValue) {
      this.componentOptionValue = componentOptionValue;
      return this;
    }

    /**
     * The ID of the component option that this consolidated option maps to.
     * If null, this selection targets the component's quantity option with the given name.
     */
    public Builder componentOptionId(String componentOptionId) {
      this.componentOptionId = componentOptionId;
      return this;
    }
  }
}
