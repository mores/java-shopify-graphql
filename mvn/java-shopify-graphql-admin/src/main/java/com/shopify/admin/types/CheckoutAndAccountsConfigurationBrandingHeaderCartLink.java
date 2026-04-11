package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The header cart link customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingHeaderCartLink {
  /**
   * The content type for the header back to cart link in 1-page checkout. Setting
   * this to image will render the custom image provided using the image field on
   * the header cart_link object. If no image is provided, the default cart icon will be used.
   */
  private CheckoutAndAccountsConfigurationBrandingCartLinkContentType contentType;

  /**
   * The image that's used for the header back to cart link in 1-page checkout when the content type is set to image.
   */
  private CheckoutAndAccountsConfigurationBrandingImageValue image;

  public CheckoutAndAccountsConfigurationBrandingHeaderCartLink() {
  }

  /**
   * The content type for the header back to cart link in 1-page checkout. Setting
   * this to image will render the custom image provided using the image field on
   * the header cart_link object. If no image is provided, the default cart icon will be used.
   */
  public CheckoutAndAccountsConfigurationBrandingCartLinkContentType getContentType() {
    return contentType;
  }

  public void setContentType(
      CheckoutAndAccountsConfigurationBrandingCartLinkContentType contentType) {
    this.contentType = contentType;
  }

  /**
   * The image that's used for the header back to cart link in 1-page checkout when the content type is set to image.
   */
  public CheckoutAndAccountsConfigurationBrandingImageValue getImage() {
    return image;
  }

  public void setImage(CheckoutAndAccountsConfigurationBrandingImageValue image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingHeaderCartLink{contentType='" + contentType + "', image='" + image + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingHeaderCartLink that = (CheckoutAndAccountsConfigurationBrandingHeaderCartLink) o;
    return Objects.equals(contentType, that.contentType) &&
        Objects.equals(image, that.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, image);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The content type for the header back to cart link in 1-page checkout. Setting
     * this to image will render the custom image provided using the image field on
     * the header cart_link object. If no image is provided, the default cart icon will be used.
     */
    private CheckoutAndAccountsConfigurationBrandingCartLinkContentType contentType;

    /**
     * The image that's used for the header back to cart link in 1-page checkout when the content type is set to image.
     */
    private CheckoutAndAccountsConfigurationBrandingImageValue image;

    public CheckoutAndAccountsConfigurationBrandingHeaderCartLink build() {
      CheckoutAndAccountsConfigurationBrandingHeaderCartLink result = new CheckoutAndAccountsConfigurationBrandingHeaderCartLink();
      result.contentType = this.contentType;
      result.image = this.image;
      return result;
    }

    /**
     * The content type for the header back to cart link in 1-page checkout. Setting
     * this to image will render the custom image provided using the image field on
     * the header cart_link object. If no image is provided, the default cart icon will be used.
     */
    public Builder contentType(
        CheckoutAndAccountsConfigurationBrandingCartLinkContentType contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * The image that's used for the header back to cart link in 1-page checkout when the content type is set to image.
     */
    public Builder image(CheckoutAndAccountsConfigurationBrandingImageValue image) {
      this.image = image;
      return this;
    }
  }
}
