package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the corner radius variables.
 */
public class CheckoutBrandingCornerRadiusVariablesInput {
  /**
   * The value in pixels for small corner radii. It should be greater than zero. Example: 3.
   */
  private Integer small;

  /**
   * The value in pixels for base corner radii. It should be greater than zero. Example: 5.
   */
  private Integer base;

  /**
   * The value in pixels for large corner radii. It should be greater than zero. Example: 10.
   */
  private Integer large;

  public CheckoutBrandingCornerRadiusVariablesInput() {
  }

  /**
   * The value in pixels for small corner radii. It should be greater than zero. Example: 3.
   */
  public Integer getSmall() {
    return small;
  }

  public void setSmall(Integer small) {
    this.small = small;
  }

  /**
   * The value in pixels for base corner radii. It should be greater than zero. Example: 5.
   */
  public Integer getBase() {
    return base;
  }

  public void setBase(Integer base) {
    this.base = base;
  }

  /**
   * The value in pixels for large corner radii. It should be greater than zero. Example: 10.
   */
  public Integer getLarge() {
    return large;
  }

  public void setLarge(Integer large) {
    this.large = large;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCornerRadiusVariablesInput{small='" + small + "', base='" + base + "', large='" + large + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCornerRadiusVariablesInput that = (CheckoutBrandingCornerRadiusVariablesInput) o;
    return Objects.equals(small, that.small) &&
        Objects.equals(base, that.base) &&
        Objects.equals(large, that.large);
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, base, large);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value in pixels for small corner radii. It should be greater than zero. Example: 3.
     */
    private Integer small;

    /**
     * The value in pixels for base corner radii. It should be greater than zero. Example: 5.
     */
    private Integer base;

    /**
     * The value in pixels for large corner radii. It should be greater than zero. Example: 10.
     */
    private Integer large;

    public CheckoutBrandingCornerRadiusVariablesInput build() {
      CheckoutBrandingCornerRadiusVariablesInput result = new CheckoutBrandingCornerRadiusVariablesInput();
      result.small = this.small;
      result.base = this.base;
      result.large = this.large;
      return result;
    }

    /**
     * The value in pixels for small corner radii. It should be greater than zero. Example: 3.
     */
    public Builder small(Integer small) {
      this.small = small;
      return this;
    }

    /**
     * The value in pixels for base corner radii. It should be greater than zero. Example: 5.
     */
    public Builder base(Integer base) {
      this.base = base;
      return this;
    }

    /**
     * The value in pixels for large corner radii. It should be greater than zero. Example: 10.
     */
    public Builder large(Integer large) {
      this.large = large;
      return this;
    }
  }
}
