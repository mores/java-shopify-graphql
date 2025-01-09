package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for header cart link customizations.
 */
public class CheckoutBrandingHeaderCartLinkInput {
  /**
   * The input for the content type for the header back to cart link in 1-page
   * checkout. Setting this to image will render the custom image provided using
   * the image field on the header cart_link object. If no image is provided, the
   * default cart icon will be used.
   */
  private CheckoutBrandingCartLinkContentType contentType;

  /**
   * The input for the image that's used for the header back to cart link in 1-page
   * checkout when the content type is set to image.
   */
  private CheckoutBrandingImageInput image;

  public CheckoutBrandingHeaderCartLinkInput() {
  }

  /**
   * The input for the content type for the header back to cart link in 1-page
   * checkout. Setting this to image will render the custom image provided using
   * the image field on the header cart_link object. If no image is provided, the
   * default cart icon will be used.
   */
  public CheckoutBrandingCartLinkContentType getContentType() {
    return contentType;
  }

  public void setContentType(CheckoutBrandingCartLinkContentType contentType) {
    this.contentType = contentType;
  }

  /**
   * The input for the image that's used for the header back to cart link in 1-page
   * checkout when the content type is set to image.
   */
  public CheckoutBrandingImageInput getImage() {
    return image;
  }

  public void setImage(CheckoutBrandingImageInput image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeaderCartLinkInput{contentType='" + contentType + "', image='" + image + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeaderCartLinkInput that = (CheckoutBrandingHeaderCartLinkInput) o;
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
    private CheckoutBrandingCartLinkContentType contentType;

    /**
     * The input for the image that's used for the header back to cart link in 1-page
     * checkout when the content type is set to image.
     */
    private CheckoutBrandingImageInput image;

    public CheckoutBrandingHeaderCartLinkInput build() {
      CheckoutBrandingHeaderCartLinkInput result = new CheckoutBrandingHeaderCartLinkInput();
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
    public Builder contentType(CheckoutBrandingCartLinkContentType contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * The input for the image that's used for the header back to cart link in 1-page
     * checkout when the content type is set to image.
     */
    public Builder image(CheckoutBrandingImageInput image) {
      this.image = image;
      return this;
    }
  }
}
