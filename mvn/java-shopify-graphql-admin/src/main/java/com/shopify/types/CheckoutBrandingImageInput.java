package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingImageInput {
  
  private String mediaImageId;

  public CheckoutBrandingImageInput() {
  }

  
  public String getMediaImageId() {
    return mediaImageId;
  }

  public void setMediaImageId(String mediaImageId) {
    this.mediaImageId = mediaImageId;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingImageInput{mediaImageId='" + mediaImageId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingImageInput that = (CheckoutBrandingImageInput) o;
    return Objects.equals(mediaImageId, that.mediaImageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaImageId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String mediaImageId;

    public CheckoutBrandingImageInput build() {
      CheckoutBrandingImageInput result = new CheckoutBrandingImageInput();
      result.mediaImageId = this.mediaImageId;
      return result;
    }

    
    public Builder mediaImageId(String mediaImageId) {
      this.mediaImageId = mediaImageId;
      return this;
    }
  }
}
