package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A group of related colors for the shop's brand.
 */
public class BrandColorGroup {
  /**
   * The background color.
   */
  private String background;

  /**
   * The foreground color.
   */
  private String foreground;

  public BrandColorGroup() {
  }

  /**
   * The background color.
   */
  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }

  /**
   * The foreground color.
   */
  public String getForeground() {
    return foreground;
  }

  public void setForeground(String foreground) {
    this.foreground = foreground;
  }

  @Override
  public String toString() {
    return "BrandColorGroup{background='" + background + "', foreground='" + foreground + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BrandColorGroup that = (BrandColorGroup) o;
    return Objects.equals(background, that.background) &&
        Objects.equals(foreground, that.foreground);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, foreground);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background color.
     */
    private String background;

    /**
     * The foreground color.
     */
    private String foreground;

    public BrandColorGroup build() {
      BrandColorGroup result = new BrandColorGroup();
      result.background = this.background;
      result.foreground = this.foreground;
      return result;
    }

    /**
     * The background color.
     */
    public Builder background(String background) {
      this.background = background;
      return this;
    }

    /**
     * The foreground color.
     */
    public Builder foreground(String foreground) {
      this.foreground = foreground;
      return this;
    }
  }
}
