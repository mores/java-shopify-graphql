package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Define the pixel size of corner radius options.
 */
public class CheckoutBrandingCornerRadiusVariables {
  /**
   * The value in pixels for base corner radii. Example: 5.
   */
  private Integer base;

  /**
   * The value in pixels for large corner radii. Example: 10.
   */
  private Integer large;

  /**
   * The value in pixels for small corner radii. Example: 3.
   */
  private Integer small;

  public CheckoutBrandingCornerRadiusVariables() {
  }

  /**
   * The value in pixels for base corner radii. Example: 5.
   */
  public Integer getBase() {
    return base;
  }

  public void setBase(Integer base) {
    this.base = base;
  }

  /**
   * The value in pixels for large corner radii. Example: 10.
   */
  public Integer getLarge() {
    return large;
  }

  public void setLarge(Integer large) {
    this.large = large;
  }

  /**
   * The value in pixels for small corner radii. Example: 3.
   */
  public Integer getSmall() {
    return small;
  }

  public void setSmall(Integer small) {
    this.small = small;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCornerRadiusVariables{base='" + base + "', large='" + large + "', small='" + small + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCornerRadiusVariables that = (CheckoutBrandingCornerRadiusVariables) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(large, that.large) &&
        Objects.equals(small, that.small);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, large, small);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value in pixels for base corner radii. Example: 5.
     */
    private Integer base;

    /**
     * The value in pixels for large corner radii. Example: 10.
     */
    private Integer large;

    /**
     * The value in pixels for small corner radii. Example: 3.
     */
    private Integer small;

    public CheckoutBrandingCornerRadiusVariables build() {
      CheckoutBrandingCornerRadiusVariables result = new CheckoutBrandingCornerRadiusVariables();
      result.base = this.base;
      result.large = this.large;
      result.small = this.small;
      return result;
    }

    /**
     * The value in pixels for base corner radii. Example: 5.
     */
    public Builder base(Integer base) {
      this.base = base;
      return this;
    }

    /**
     * The value in pixels for large corner radii. Example: 10.
     */
    public Builder large(Integer large) {
      this.large = large;
      return this;
    }

    /**
     * The value in pixels for small corner radii. Example: 3.
     */
    public Builder small(Integer small) {
      this.small = small;
      return this;
    }
  }
}
