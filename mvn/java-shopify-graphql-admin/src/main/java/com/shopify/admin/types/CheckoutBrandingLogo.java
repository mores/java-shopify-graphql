package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The store logo customizations.
 */
public class CheckoutBrandingLogo {
  /**
   * The logo image.
   */
  private Image image;

  /**
   * The maximum width of the logo.
   */
  private Integer maxWidth;

  /**
   * The visibility of the logo.
   */
  private CheckoutBrandingVisibility visibility;

  public CheckoutBrandingLogo() {
  }

  /**
   * The logo image.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
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

  /**
   * The visibility of the logo.
   */
  public CheckoutBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingLogo{image='" + image + "', maxWidth='" + maxWidth + "', visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingLogo that = (CheckoutBrandingLogo) o;
    return Objects.equals(image, that.image) &&
        Objects.equals(maxWidth, that.maxWidth) &&
        Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, maxWidth, visibility);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The logo image.
     */
    private Image image;

    /**
     * The maximum width of the logo.
     */
    private Integer maxWidth;

    /**
     * The visibility of the logo.
     */
    private CheckoutBrandingVisibility visibility;

    public CheckoutBrandingLogo build() {
      CheckoutBrandingLogo result = new CheckoutBrandingLogo();
      result.image = this.image;
      result.maxWidth = this.maxWidth;
      result.visibility = this.visibility;
      return result;
    }

    /**
     * The logo image.
     */
    public Builder image(Image image) {
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

    /**
     * The visibility of the logo.
     */
    public Builder visibility(CheckoutBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}
