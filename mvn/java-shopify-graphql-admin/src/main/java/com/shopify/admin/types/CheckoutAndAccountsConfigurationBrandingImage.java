package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The image.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CheckoutAndAccountsConfigurationBrandingImage implements CheckoutAndAccountsConfigurationBrandingImageValue {
  /**
   * The image details.
   */
  private Image image;

  public CheckoutAndAccountsConfigurationBrandingImage() {
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
    return "CheckoutAndAccountsConfigurationBrandingImage{image='" + image + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingImage that = (CheckoutAndAccountsConfigurationBrandingImage) o;
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

    public CheckoutAndAccountsConfigurationBrandingImage build() {
      CheckoutAndAccountsConfigurationBrandingImage result = new CheckoutAndAccountsConfigurationBrandingImage();
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
