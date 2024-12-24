package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingHeaderCartLinkInput {
  
  private CheckoutBrandingCartLinkContentType contentType;

  
  private CheckoutBrandingImageInput image;

  public CheckoutBrandingHeaderCartLinkInput() {
  }

  
  public CheckoutBrandingCartLinkContentType getContentType() {
    return contentType;
  }

  public void setContentType(CheckoutBrandingCartLinkContentType contentType) {
    this.contentType = contentType;
  }

  
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
    
    private CheckoutBrandingCartLinkContentType contentType;

    
    private CheckoutBrandingImageInput image;

    public CheckoutBrandingHeaderCartLinkInput build() {
      CheckoutBrandingHeaderCartLinkInput result = new CheckoutBrandingHeaderCartLinkInput();
      result.contentType = this.contentType;
      result.image = this.image;
      return result;
    }

    
    public Builder contentType(CheckoutBrandingCartLinkContentType contentType) {
      this.contentType = contentType;
      return this;
    }

    
    public Builder image(CheckoutBrandingImageInput image) {
      this.image = image;
      return this;
    }
  }
}
