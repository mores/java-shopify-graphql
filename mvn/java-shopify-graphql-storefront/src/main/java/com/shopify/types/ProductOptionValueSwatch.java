package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The product option value swatch.
 */
public class ProductOptionValueSwatch {
  /**
   * The swatch color.
   */
  private String color;

  /**
   * The swatch image.
   */
  private Media image;

  public ProductOptionValueSwatch() {
  }

  /**
   * The swatch color.
   */
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The swatch image.
   */
  public Media getImage() {
    return image;
  }

  public void setImage(Media image) {
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
    /**
     * The swatch color.
     */
    private String color;

    /**
     * The swatch image.
     */
    private Media image;

    public ProductOptionValueSwatch build() {
      ProductOptionValueSwatch result = new ProductOptionValueSwatch();
      result.color = this.color;
      result.image = this.image;
      return result;
    }

    /**
     * The swatch color.
     */
    public Builder color(String color) {
      this.color = color;
      return this;
    }

    /**
     * The swatch image.
     */
    public Builder image(Media image) {
      this.image = image;
      return this;
    }
  }
}
