package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A swatch associated with a product option value.
 */
public class ProductOptionValueSwatch {
  /**
   * The color representation of the swatch.
   */
  private String color;

  /**
   * An image representation of the swatch.
   */
  private MediaImage image;

  public ProductOptionValueSwatch() {
  }

  /**
   * The color representation of the swatch.
   */
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * An image representation of the swatch.
   */
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
    /**
     * The color representation of the swatch.
     */
    private String color;

    /**
     * An image representation of the swatch.
     */
    private MediaImage image;

    public ProductOptionValueSwatch build() {
      ProductOptionValueSwatch result = new ProductOptionValueSwatch();
      result.color = this.color;
      result.image = this.image;
      return result;
    }

    /**
     * The color representation of the swatch.
     */
    public Builder color(String color) {
      this.color = color;
      return this;
    }

    /**
     * An image representation of the swatch.
     */
    public Builder image(MediaImage image) {
      this.image = image;
      return this;
    }
  }
}
