package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ObjectDimensionsInput {
  
  private double length;

  
  private double width;

  
  private double height;

  
  private LengthUnit unit;

  public ObjectDimensionsInput() {
  }

  
  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  
  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  
  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  
  public LengthUnit getUnit() {
    return unit;
  }

  public void setUnit(LengthUnit unit) {
    this.unit = unit;
  }

  @Override
  public String toString() {
    return "ObjectDimensionsInput{length='" + length + "', width='" + width + "', height='" + height + "', unit='" + unit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ObjectDimensionsInput that = (ObjectDimensionsInput) o;
    return length == that.length &&
        width == that.width &&
        height == that.height &&
        Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, unit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private double length;

    
    private double width;

    
    private double height;

    
    private LengthUnit unit;

    public ObjectDimensionsInput build() {
      ObjectDimensionsInput result = new ObjectDimensionsInput();
      result.length = this.length;
      result.width = this.width;
      result.height = this.height;
      result.unit = this.unit;
      return result;
    }

    
    public Builder length(double length) {
      this.length = length;
      return this;
    }

    
    public Builder width(double width) {
      this.width = width;
      return this;
    }

    
    public Builder height(double height) {
      this.height = height;
      return this;
    }

    
    public Builder unit(LengthUnit unit) {
      this.unit = unit;
      return this;
    }
  }
}
