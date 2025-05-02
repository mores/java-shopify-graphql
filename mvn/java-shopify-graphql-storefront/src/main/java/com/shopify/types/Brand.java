package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The store's [branding configuration](https://help.shopify.com/en/manual/promoting-marketing/managing-brand-assets).
 */
public class Brand {
  /**
   * The colors of the store's brand.
   */
  private BrandColors colors;

  /**
   * The store's cover image.
   */
  private MediaImage coverImage;

  /**
   * The store's default logo.
   */
  private MediaImage logo;

  /**
   * The store's short description.
   */
  private String shortDescription;

  /**
   * The store's slogan.
   */
  private String slogan;

  /**
   * The store's preferred logo for square UI elements.
   */
  private MediaImage squareLogo;

  public Brand() {
  }

  /**
   * The colors of the store's brand.
   */
  public BrandColors getColors() {
    return colors;
  }

  public void setColors(BrandColors colors) {
    this.colors = colors;
  }

  /**
   * The store's cover image.
   */
  public MediaImage getCoverImage() {
    return coverImage;
  }

  public void setCoverImage(MediaImage coverImage) {
    this.coverImage = coverImage;
  }

  /**
   * The store's default logo.
   */
  public MediaImage getLogo() {
    return logo;
  }

  public void setLogo(MediaImage logo) {
    this.logo = logo;
  }

  /**
   * The store's short description.
   */
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * The store's slogan.
   */
  public String getSlogan() {
    return slogan;
  }

  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }

  /**
   * The store's preferred logo for square UI elements.
   */
  public MediaImage getSquareLogo() {
    return squareLogo;
  }

  public void setSquareLogo(MediaImage squareLogo) {
    this.squareLogo = squareLogo;
  }

  @Override
  public String toString() {
    return "Brand{colors='" + colors + "', coverImage='" + coverImage + "', logo='" + logo + "', shortDescription='" + shortDescription + "', slogan='" + slogan + "', squareLogo='" + squareLogo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Brand that = (Brand) o;
    return Objects.equals(colors, that.colors) &&
        Objects.equals(coverImage, that.coverImage) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(shortDescription, that.shortDescription) &&
        Objects.equals(slogan, that.slogan) &&
        Objects.equals(squareLogo, that.squareLogo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, coverImage, logo, shortDescription, slogan, squareLogo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The colors of the store's brand.
     */
    private BrandColors colors;

    /**
     * The store's cover image.
     */
    private MediaImage coverImage;

    /**
     * The store's default logo.
     */
    private MediaImage logo;

    /**
     * The store's short description.
     */
    private String shortDescription;

    /**
     * The store's slogan.
     */
    private String slogan;

    /**
     * The store's preferred logo for square UI elements.
     */
    private MediaImage squareLogo;

    public Brand build() {
      Brand result = new Brand();
      result.colors = this.colors;
      result.coverImage = this.coverImage;
      result.logo = this.logo;
      result.shortDescription = this.shortDescription;
      result.slogan = this.slogan;
      result.squareLogo = this.squareLogo;
      return result;
    }

    /**
     * The colors of the store's brand.
     */
    public Builder colors(BrandColors colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The store's cover image.
     */
    public Builder coverImage(MediaImage coverImage) {
      this.coverImage = coverImage;
      return this;
    }

    /**
     * The store's default logo.
     */
    public Builder logo(MediaImage logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The store's short description.
     */
    public Builder shortDescription(String shortDescription) {
      this.shortDescription = shortDescription;
      return this;
    }

    /**
     * The store's slogan.
     */
    public Builder slogan(String slogan) {
      this.slogan = slogan;
      return this;
    }

    /**
     * The store's preferred logo for square UI elements.
     */
    public Builder squareLogo(MediaImage squareLogo) {
      this.squareLogo = squareLogo;
      return this;
    }
  }
}
