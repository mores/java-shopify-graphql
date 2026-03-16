package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a consolidated option selection that maps to component options.
 */
public class ProductBundleConsolidatedOptionSelectionInput {
  /**
   * The value for this consolidated option selection (e.g., 'Small', 'Medium', 'Large').
   */
  private String optionValue;

  /**
   * The component mappings that define how this option value maps to specific component options.
   */
  private List<ProductBundleConsolidatedOptionComponentInput> components;

  public ProductBundleConsolidatedOptionSelectionInput() {
  }

  /**
   * The value for this consolidated option selection (e.g., 'Small', 'Medium', 'Large').
   */
  public String getOptionValue() {
    return optionValue;
  }

  public void setOptionValue(String optionValue) {
    this.optionValue = optionValue;
  }

  /**
   * The component mappings that define how this option value maps to specific component options.
   */
  public List<ProductBundleConsolidatedOptionComponentInput> getComponents() {
    return components;
  }

  public void setComponents(List<ProductBundleConsolidatedOptionComponentInput> components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "ProductBundleConsolidatedOptionSelectionInput{optionValue='" + optionValue + "', components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleConsolidatedOptionSelectionInput that = (ProductBundleConsolidatedOptionSelectionInput) o;
    return Objects.equals(optionValue, that.optionValue) &&
        Objects.equals(components, that.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionValue, components);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value for this consolidated option selection (e.g., 'Small', 'Medium', 'Large').
     */
    private String optionValue;

    /**
     * The component mappings that define how this option value maps to specific component options.
     */
    private List<ProductBundleConsolidatedOptionComponentInput> components;

    public ProductBundleConsolidatedOptionSelectionInput build() {
      ProductBundleConsolidatedOptionSelectionInput result = new ProductBundleConsolidatedOptionSelectionInput();
      result.optionValue = this.optionValue;
      result.components = this.components;
      return result;
    }

    /**
     * The value for this consolidated option selection (e.g., 'Small', 'Medium', 'Large').
     */
    public Builder optionValue(String optionValue) {
      this.optionValue = optionValue;
      return this;
    }

    /**
     * The component mappings that define how this option value maps to specific component options.
     */
    public Builder components(List<ProductBundleConsolidatedOptionComponentInput> components) {
      this.components = components;
      return this;
    }
  }
}
