package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductOptionValueSwatch {
  
  private String color;

  
  private MediaImage image;

  public ProductOptionValueSwatch() {
  }

  
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  
  public MediaImage getImage() {
    return image;
  }

  public void setImage(MediaImage image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "ProductOptionValueSwatch{color='" + color + "', image='" + image + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionValueSwatch that = (ProductOptionValueSwatch) o;
    return Objects.equals(color, that.color) &&
        Objects.equals(image, that.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, image);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String color;

    
    private MediaImage image;

    public ProductOptionValueSwatch build() {
      ProductOptionValueSwatch result = new ProductOptionValueSwatch();
      result.color = this.color;
      result.image = this.image;
      return result;
    }

    
    public Builder color(String color) {
      this.color = color;
      return this;
    }

    
    public Builder image(MediaImage image) {
      this.image = image;
      return this;
    }
  }
}
