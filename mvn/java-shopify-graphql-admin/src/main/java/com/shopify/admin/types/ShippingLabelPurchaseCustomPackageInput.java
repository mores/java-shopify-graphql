package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a custom package to use for the shipping label purchase.
 */
public class ShippingLabelPurchaseCustomPackageInput {
  /**
   * The weight of the empty package.
   */
  private WeightInput weight;

  /**
   * The outside dimensions of the shipping package.
   */
  private ObjectDimensionsInput dimensions;

  /**
   * The package type. Defaults to `BOX`.
   */
  private ShippingPackageType type = ShippingPackageType.BOX;

  public ShippingLabelPurchaseCustomPackageInput() {
  }

  /**
   * The weight of the empty package.
   */
  public WeightInput getWeight() {
    return weight;
  }

  public void setWeight(WeightInput weight) {
    this.weight = weight;
  }

  /**
   * The outside dimensions of the shipping package.
   */
  public ObjectDimensionsInput getDimensions() {
    return dimensions;
  }

  public void setDimensions(ObjectDimensionsInput dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * The package type. Defaults to `BOX`.
   */
  public ShippingPackageType getType() {
    return type;
  }

  public void setType(ShippingPackageType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "ShippingLabelPurchaseCustomPackageInput{weight='" + weight + "', dimensions='" + dimensions + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLabelPurchaseCustomPackageInput that = (ShippingLabelPurchaseCustomPackageInput) o;
    return Objects.equals(weight, that.weight) &&
        Objects.equals(dimensions, that.dimensions) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, dimensions, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The weight of the empty package.
     */
    private WeightInput weight;

    /**
     * The outside dimensions of the shipping package.
     */
    private ObjectDimensionsInput dimensions;

    /**
     * The package type. Defaults to `BOX`.
     */
    private ShippingPackageType type = ShippingPackageType.BOX;

    public ShippingLabelPurchaseCustomPackageInput build() {
      ShippingLabelPurchaseCustomPackageInput result = new ShippingLabelPurchaseCustomPackageInput();
      result.weight = this.weight;
      result.dimensions = this.dimensions;
      result.type = this.type;
      return result;
    }

    /**
     * The weight of the empty package.
     */
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }

    /**
     * The outside dimensions of the shipping package.
     */
    public Builder dimensions(ObjectDimensionsInput dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    /**
     * The package type. Defaults to `BOX`.
     */
    public Builder type(ShippingPackageType type) {
      this.type = type;
      return this;
    }
  }
}
