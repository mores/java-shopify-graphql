package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A checkout branding image.
 */
public class CheckoutBrandingImage {
  /**
   * The image details.
   */
  private Image image;

  public CheckoutBrandingImage() {
  }

  /**
   * The image details.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingImage{image='" + image + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingImage that = (CheckoutBrandingImage) o;
    return Objects.equals(image, that.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The image details.
     */
    private Image image;

    public CheckoutBrandingImage build() {
      CheckoutBrandingImage result = new CheckoutBrandingImage();
      result.image = this.image;
      return result;
    }

    /**
     * The image details.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }
  }
}
