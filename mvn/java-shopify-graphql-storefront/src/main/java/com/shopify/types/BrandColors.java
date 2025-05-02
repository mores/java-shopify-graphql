package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The colors of the shop's brand.
 */
public class BrandColors {
  /**
   * The shop's primary brand colors.
   */
  private List<BrandColorGroup> primary;

  /**
   * The shop's secondary brand colors.
   */
  private List<BrandColorGroup> secondary;

  public BrandColors() {
  }

  /**
   * The shop's primary brand colors.
   */
  public List<BrandColorGroup> getPrimary() {
    return primary;
  }

  public void setPrimary(List<BrandColorGroup> primary) {
    this.primary = primary;
  }

  /**
   * The shop's secondary brand colors.
   */
  public List<BrandColorGroup> getSecondary() {
    return secondary;
  }

  public void setSecondary(List<BrandColorGroup> secondary) {
    this.secondary = secondary;
  }

  @Override
  public String toString() {
    return "BrandColors{primary='" + primary + "', secondary='" + secondary + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BrandColors that = (BrandColors) o;
    return Objects.equals(primary, that.primary) &&
        Objects.equals(secondary, that.secondary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, secondary);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shop's primary brand colors.
     */
    private List<BrandColorGroup> primary;

    /**
     * The shop's secondary brand colors.
     */
    private List<BrandColorGroup> secondary;

    public BrandColors build() {
      BrandColors result = new BrandColors();
      result.primary = this.primary;
      result.secondary = this.secondary;
      return result;
    }

    /**
     * The shop's primary brand colors.
     */
    public Builder primary(List<BrandColorGroup> primary) {
      this.primary = primary;
      return this;
    }

    /**
     * The shop's secondary brand colors.
     */
    public Builder secondary(List<BrandColorGroup> secondary) {
      this.secondary = secondary;
      return this;
    }
  }
}
