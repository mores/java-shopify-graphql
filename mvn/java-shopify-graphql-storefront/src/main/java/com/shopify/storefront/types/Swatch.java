package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Color and image for visual representation.
 */
public class Swatch {
  /**
   * The swatch color.
   */
  private String color;

  /**
   * The swatch image.
   */
  private MediaImage image;

  public Swatch() {
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
  public MediaImage getImage() {
    return image;
  }

  public void setImage(MediaImage image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "Swatch{color='" + color + "', image='" + image + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Swatch that = (Swatch) o;
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
    private MediaImage image;

    public Swatch build() {
      Swatch result = new Swatch();
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
    public Builder image(MediaImage image) {
      this.image = image;
      return this;
    }
  }
}
