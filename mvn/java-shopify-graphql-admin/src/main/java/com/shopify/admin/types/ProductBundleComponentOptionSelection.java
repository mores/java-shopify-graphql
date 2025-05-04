package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A relationship between a component option and a parent option.
 */
public class ProductBundleComponentOptionSelection {
  /**
   * The option that existed on the component product prior to the fixed bundle creation.
   */
  private ProductOption componentOption;

  /**
   * The option that was created on the parent product.
   */
  private ProductOption parentOption;

  /**
   * The component option values that are actively selected for this relationship.
   */
  private List<ProductBundleComponentOptionSelectionValue> values;

  public ProductBundleComponentOptionSelection() {
  }

  /**
   * The option that existed on the component product prior to the fixed bundle creation.
   */
  public ProductOption getComponentOption() {
    return componentOption;
  }

  public void setComponentOption(ProductOption componentOption) {
    this.componentOption = componentOption;
  }

  /**
   * The option that was created on the parent product.
   */
  public ProductOption getParentOption() {
    return parentOption;
  }

  public void setParentOption(ProductOption parentOption) {
    this.parentOption = parentOption;
  }

  /**
   * The component option values that are actively selected for this relationship.
   */
  public List<ProductBundleComponentOptionSelectionValue> getValues() {
    return values;
  }

  public void setValues(List<ProductBundleComponentOptionSelectionValue> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentOptionSelection{componentOption='" + componentOption + "', parentOption='" + parentOption + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentOptionSelection that = (ProductBundleComponentOptionSelection) o;
    return Objects.equals(componentOption, that.componentOption) &&
        Objects.equals(parentOption, that.parentOption) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentOption, parentOption, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The option that existed on the component product prior to the fixed bundle creation.
     */
    private ProductOption componentOption;

    /**
     * The option that was created on the parent product.
     */
    private ProductOption parentOption;

    /**
     * The component option values that are actively selected for this relationship.
     */
    private List<ProductBundleComponentOptionSelectionValue> values;

    public ProductBundleComponentOptionSelection build() {
      ProductBundleComponentOptionSelection result = new ProductBundleComponentOptionSelection();
      result.componentOption = this.componentOption;
      result.parentOption = this.parentOption;
      result.values = this.values;
      return result;
    }

    /**
     * The option that existed on the component product prior to the fixed bundle creation.
     */
    public Builder componentOption(ProductOption componentOption) {
      this.componentOption = componentOption;
      return this;
    }

    /**
     * The option that was created on the parent product.
     */
    public Builder parentOption(ProductOption parentOption) {
      this.parentOption = parentOption;
      return this;
    }

    /**
     * The component option values that are actively selected for this relationship.
     */
    public Builder values(List<ProductBundleComponentOptionSelectionValue> values) {
      this.values = values;
      return this;
    }
  }
}
