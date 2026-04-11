package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the logo.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoInput {
  /**
   * The logo image.
   */
  private CheckoutAndAccountsConfigurationBrandingImageInput image;

  /**
   * The maximum width of the logo.
   */
  private Integer maxWidth;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoInput() {
  }

  /**
   * The logo image.
   */
  public CheckoutAndAccountsConfigurationBrandingImageInput getImage() {
    return image;
  }

  public void setImage(CheckoutAndAccountsConfigurationBrandingImageInput image) {
    this.image = image;
  }

  /**
   * The maximum width of the logo.
   */
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoInput{image='" + image + "', maxWidth='" + maxWidth + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoInput that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoInput) o;
    return Objects.equals(image, that.image) &&
        Objects.equals(maxWidth, that.maxWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, maxWidth);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The logo image.
     */
    private CheckoutAndAccountsConfigurationBrandingImageInput image;

    /**
     * The maximum width of the logo.
     */
    private Integer maxWidth;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoInput build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoInput result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoInput();
      result.image = this.image;
      result.maxWidth = this.maxWidth;
      return result;
    }

    /**
     * The logo image.
     */
    public Builder image(CheckoutAndAccountsConfigurationBrandingImageInput image) {
      this.image = image;
      return this;
    }

    /**
     * The maximum width of the logo.
     */
    public Builder maxWidth(Integer maxWidth) {
      this.maxWidth = maxWidth;
      return this;
    }
  }
}
