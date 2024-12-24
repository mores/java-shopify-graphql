package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomShippingPackageInput {
  
  private WeightInput weight;

  
  private ObjectDimensionsInput dimensions;

  
  private Boolean _default = false;

  
  private String name;

  
  private ShippingPackageType type;

  public CustomShippingPackageInput() {
  }

  
  public WeightInput getWeight() {
    return weight;
  }

  public void setWeight(WeightInput weight) {
    this.weight = weight;
  }

  
  public ObjectDimensionsInput getDimensions() {
    return dimensions;
  }

  public void setDimensions(ObjectDimensionsInput dimensions) {
    this.dimensions = dimensions;
  }

  
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
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
    
    private WeightInput weight;

    
    private ObjectDimensionsInput dimensions;

    
    private Boolean _default = false;

    
    private String name;

    
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

    
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }

    
    public Builder dimensions(ObjectDimensionsInput dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    
    public Builder _default(Boolean _default) {
      this._default = _default;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder type(ShippingPackageType type) {
      this.type = type;
      return this;
    }
  }
}
