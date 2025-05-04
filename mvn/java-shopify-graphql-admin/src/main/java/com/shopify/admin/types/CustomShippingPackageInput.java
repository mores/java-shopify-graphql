package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a custom shipping package used to pack shipment.
 */
public class CustomShippingPackageInput {
  /**
   * Weight of the empty shipping package.
   */
  private WeightInput weight;

  /**
   * Outside dimensions of the empty shipping package.
   */
  private ObjectDimensionsInput dimensions;

  /**
   * The default package is the one used to calculate shipping costs on checkout.
   */
  private Boolean _default = false;

  /**
   * Descriptive name for the package.
   */
  private String name;

  /**
   * Type of package.
   */
  private ShippingPackageType type;

  public CustomShippingPackageInput() {
  }

  /**
   * Weight of the empty shipping package.
   */
  public WeightInput getWeight() {
    return weight;
  }

  public void setWeight(WeightInput weight) {
    this.weight = weight;
  }

  /**
   * Outside dimensions of the empty shipping package.
   */
  public ObjectDimensionsInput getDimensions() {
    return dimensions;
  }

  public void setDimensions(ObjectDimensionsInput dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * The default package is the one used to calculate shipping costs on checkout.
   */
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  /**
   * Descriptive name for the package.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Type of package.
   */
  public ShippingPackageType getType() {
    return type;
  }

  public void setType(ShippingPackageType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "CustomShippingPackageInput{weight='" + weight + "', dimensions='" + dimensions + "', default='" + _default + "', name='" + name + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomShippingPackageInput that = (CustomShippingPackageInput) o;
    return Objects.equals(weight, that.weight) &&
        Objects.equals(dimensions, that.dimensions) &&
        Objects.equals(_default, that._default) &&
        Objects.equals(name, that.name) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, dimensions, _default, name, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Weight of the empty shipping package.
     */
    private WeightInput weight;

    /**
     * Outside dimensions of the empty shipping package.
     */
    private ObjectDimensionsInput dimensions;

    /**
     * The default package is the one used to calculate shipping costs on checkout.
     */
    private Boolean _default = false;

    /**
     * Descriptive name for the package.
     */
    private String name;

    /**
     * Type of package.
     */
    private ShippingPackageType type;

    public CustomShippingPackageInput build() {
      CustomShippingPackageInput result = new CustomShippingPackageInput();
      result.weight = this.weight;
      result.dimensions = this.dimensions;
      result._default = this._default;
      result.name = this.name;
      result.type = this.type;
      return result;
    }

    /**
     * Weight of the empty shipping package.
     */
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }

    /**
     * Outside dimensions of the empty shipping package.
     */
    public Builder dimensions(ObjectDimensionsInput dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    /**
     * The default package is the one used to calculate shipping costs on checkout.
     */
    public Builder _default(Boolean _default) {
      this._default = _default;
      return this;
    }

    /**
     * Descriptive name for the package.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Type of package.
     */
    public Builder type(ShippingPackageType type) {
      this.type = type;
      return this;
    }
  }
}
