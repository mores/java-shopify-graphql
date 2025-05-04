package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A quantity option related to a bundle.
 */
public class ProductBundleComponentQuantityOption {
  /**
   * The name of the option value.
   */
  private String name;

  /**
   * The option that was created on the parent product.
   */
  private ProductOption parentOption;

  /**
   * The quantity values of the option.
   */
  private List<ProductBundleComponentQuantityOptionValue> values;

  public ProductBundleComponentQuantityOption() {
  }

  /**
   * The name of the option value.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * The quantity values of the option.
   */
  public List<ProductBundleComponentQuantityOptionValue> getValues() {
    return values;
  }

  public void setValues(List<ProductBundleComponentQuantityOptionValue> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentQuantityOption{name='" + name + "', parentOption='" + parentOption + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentQuantityOption that = (ProductBundleComponentQuantityOption) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(parentOption, that.parentOption) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentOption, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the option value.
     */
    private String name;

    /**
     * The option that was created on the parent product.
     */
    private ProductOption parentOption;

    /**
     * The quantity values of the option.
     */
    private List<ProductBundleComponentQuantityOptionValue> values;

    public ProductBundleComponentQuantityOption build() {
      ProductBundleComponentQuantityOption result = new ProductBundleComponentQuantityOption();
      result.name = this.name;
      result.parentOption = this.parentOption;
      result.values = this.values;
      return result;
    }

    /**
     * The name of the option value.
     */
    public Builder name(String name) {
      this.name = name;
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
     * The quantity values of the option.
     */
    public Builder values(List<ProductBundleComponentQuantityOptionValue> values) {
      this.values = values;
      return this;
    }
  }
}
