package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the cart link for 1-page checkout. This field
 * allows to customize the cart icon that renders by default on 1-page checkout.
 */
public class CheckoutAndAccountsConfigurationBrandingHeaderCartLinkInput {
  /**
   * The input for the content type for the header back to cart link in 1-page
   * checkout. Setting this to image will render the custom image provided using
   * the image field on the header cart_link object. If no image is provided, the
   * default cart icon will be used.
   */
  private CheckoutAndAccountsConfigurationBrandingCartLinkContentType contentType;

  /**
   * The input for the image that's used for the header back to cart link in 1-page
   * checkout when the content type is set to image.
   */
  private CheckoutAndAccountsConfigurationBrandingImageInput image;

  public CheckoutAndAccountsConfigurationBrandingHeaderCartLinkInput() {
  }

  /**
   * The input for the content type for the header back to cart link in 1-page
   * checkout. Setting this to image will render the custom image provided using
   * the image field on the header cart_link object. If no image is provided, the
   * default cart icon will be used.
   */
  public CheckoutAndAccountsConfigurationBrandingCartLinkContentType getContentType() {
    return contentType;
  }

  public void setContentType(
      CheckoutAndAccountsConfigurationBrandingCartLinkContentType contentType) {
    this.contentType = contentType;
  }

  /**
   * The input for the image that's used for the header back to cart link in 1-page
   * checkout when the content type is set to image.
   */
  public CheckoutAndAccountsConfigurationBrandingImageInput getImage() {
    return image;
  }

  public void setImage(CheckoutAndAccountsConfigurationBrandingImageInput image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingHeaderCartLinkInput{contentType='" + contentType + "', image='" + image + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingHeaderCartLinkInput that = (CheckoutAndAccountsConfigurationBrandingHeaderCartLinkInput) o;
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
     * The input for the content type for the header back to cart link in 1-page
     * checkout. Setting this to image will render the custom image provided using
     * the image field on the header cart_link object. If no image is provided, the
     * default cart icon will be used.
     */
    private CheckoutAndAccountsConfigurationBrandingCartLinkContentType contentType;

    /**
     * The input for the image that's used for the header back to cart link in 1-page
     * checkout when the content type is set to image.
     */
    private CheckoutAndAccountsConfigurationBrandingImageInput image;

    public CheckoutAndAccountsConfigurationBrandingHeaderCartLinkInput build() {
      CheckoutAndAccountsConfigurationBrandingHeaderCartLinkInput result = new CheckoutAndAccountsConfigurationBrandingHeaderCartLinkInput();
      result.contentType = this.contentType;
      result.image = this.image;
      return result;
    }

    /**
     * The input for the content type for the header back to cart link in 1-page
     * checkout. Setting this to image will render the custom image provided using
     * the image field on the header cart_link object. If no image is provided, the
     * default cart icon will be used.
     */
    public Builder contentType(
        CheckoutAndAccountsConfigurationBrandingCartLinkContentType contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * The input for the image that's used for the header back to cart link in 1-page
     * checkout when the content type is set to image.
     */
    public Builder image(CheckoutAndAccountsConfigurationBrandingImageInput image) {
      this.image = image;
      return this;
    }
  }
}
