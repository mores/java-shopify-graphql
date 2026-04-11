package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the image.
 */
public class CheckoutAndAccountsConfigurationBrandingImageInput {
  /**
   * A globally-unique ID.
   */
  private String mediaImageId;

  public CheckoutAndAccountsConfigurationBrandingImageInput() {
  }

  /**
   * A globally-unique ID.
   */
  public String getMediaImageId() {
    return mediaImageId;
  }

  public void setMediaImageId(String mediaImageId) {
    this.mediaImageId = mediaImageId;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingImageInput{mediaImageId='" + mediaImageId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingImageInput that = (CheckoutAndAccountsConfigurationBrandingImageInput) o;
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
    /**
     * A globally-unique ID.
     */
    private String mediaImageId;

    public CheckoutAndAccountsConfigurationBrandingImageInput build() {
      CheckoutAndAccountsConfigurationBrandingImageInput result = new CheckoutAndAccountsConfigurationBrandingImageInput();
      result.mediaImageId = this.mediaImageId;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder mediaImageId(String mediaImageId) {
      this.mediaImageId = mediaImageId;
      return this;
    }
  }
}
