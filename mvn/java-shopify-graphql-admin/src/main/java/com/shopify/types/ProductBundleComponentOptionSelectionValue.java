package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A component option value related to a bundle line.
 */
public class ProductBundleComponentOptionSelectionValue {
  /**
   * Selection status of the option.
   */
  private ProductBundleComponentOptionSelectionStatus selectionStatus;

  /**
   * The value of the option.
   */
  private String value;

  public ProductBundleComponentOptionSelectionValue() {
  }

  /**
   * Selection status of the option.
   */
  public ProductBundleComponentOptionSelectionStatus getSelectionStatus() {
    return selectionStatus;
  }

  public void setSelectionStatus(ProductBundleComponentOptionSelectionStatus selectionStatus) {
    this.selectionStatus = selectionStatus;
  }

  /**
   * The value of the option.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentOptionSelectionValue{selectionStatus='" + selectionStatus + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentOptionSelectionValue that = (ProductBundleComponentOptionSelectionValue) o;
    return Objects.equals(selectionStatus, that.selectionStatus) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectionStatus, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Selection status of the option.
     */
    private ProductBundleComponentOptionSelectionStatus selectionStatus;

    /**
     * The value of the option.
     */
    private String value;

    public ProductBundleComponentOptionSelectionValue build() {
      ProductBundleComponentOptionSelectionValue result = new ProductBundleComponentOptionSelectionValue();
      result.selectionStatus = this.selectionStatus;
      result.value = this.value;
      return result;
    }

    /**
     * Selection status of the option.
     */
    public Builder selectionStatus(ProductBundleComponentOptionSelectionStatus selectionStatus) {
      this.selectionStatus = selectionStatus;
      return this;
    }

    /**
     * The value of the option.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
