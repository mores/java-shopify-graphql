package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingHeaderCartLink {
  
  private CheckoutBrandingCartLinkContentType contentType;

  
  private Image image;

  public CheckoutBrandingHeaderCartLink() {
  }

  
  public CheckoutBrandingCartLinkContentType getContentType() {
    return contentType;
  }

  public void setContentType(CheckoutBrandingCartLinkContentType contentType) {
    this.contentType = contentType;
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeaderCartLink{contentType='" + contentType + "', image='" + image + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeaderCartLink that = (CheckoutBrandingHeaderCartLink) o;
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

    
    private Image image;

    public CheckoutBrandingHeaderCartLink build() {
      CheckoutBrandingHeaderCartLink result = new CheckoutBrandingHeaderCartLink();
      result.contentType = this.contentType;
      result.image = this.image;
      return result;
    }

    
    public Builder contentType(CheckoutBrandingCartLinkContentType contentType) {
      this.contentType = contentType;
      return this;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }
  }
}
