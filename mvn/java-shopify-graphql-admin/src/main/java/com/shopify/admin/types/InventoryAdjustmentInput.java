package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to adjust the available quantity of a product variant at a location.
 */
public class InventoryAdjustmentInput {
  /**
   * The ID of the location where the available quantity should be adjusted.
   */
  private String locationId;

  /**
   * The adjustment of the available quantity at the location. If the value is
   * `null`, then the product variant is no longer stocked at the location.
   */
  private Integer adjustment;

  /**
   * The quantity to compare against before applying the delta. This field is
   * mandatory- you must explicitly pass in a value (even if it's `null`), or else
   * you will get an error.
   */
  private Integer changeFromQuantity;

  public InventoryAdjustmentInput() {
  }

  /**
   * The ID of the location where the available quantity should be adjusted.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The adjustment of the available quantity at the location. If the value is
   * `null`, then the product variant is no longer stocked at the location.
   */
  public Integer getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(Integer adjustment) {
    this.adjustment = adjustment;
  }

  /**
   * The quantity to compare against before applying the delta. This field is
   * mandatory- you must explicitly pass in a value (even if it's `null`), or else
   * you will get an error.
   */
  public Integer getChangeFromQuantity() {
    return changeFromQuantity;
  }

  public void setChangeFromQuantity(Integer changeFromQuantity) {
    this.changeFromQuantity = changeFromQuantity;
  }

  @Override
  public String toString() {
    return "InventoryAdjustmentInput{locationId='" + locationId + "', adjustment='" + adjustment + "', changeFromQuantity='" + changeFromQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustmentInput that = (InventoryAdjustmentInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(adjustment, that.adjustment) &&
        Objects.equals(changeFromQuantity, that.changeFromQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, adjustment, changeFromQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the location where the available quantity should be adjusted.
     */
    private String locationId;

    /**
     * The adjustment of the available quantity at the location. If the value is
     * `null`, then the product variant is no longer stocked at the location.
     */
    private Integer adjustment;

    /**
     * The quantity to compare against before applying the delta. This field is
     * mandatory- you must explicitly pass in a value (even if it's `null`), or else
     * you will get an error.
     */
    private Integer changeFromQuantity;

    public InventoryAdjustmentInput build() {
      InventoryAdjustmentInput result = new InventoryAdjustmentInput();
      result.locationId = this.locationId;
      result.adjustment = this.adjustment;
      result.changeFromQuantity = this.changeFromQuantity;
      return result;
    }

    /**
     * The ID of the location where the available quantity should be adjusted.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The adjustment of the available quantity at the location. If the value is
     * `null`, then the product variant is no longer stocked at the location.
     */
    public Builder adjustment(Integer adjustment) {
      this.adjustment = adjustment;
      return this;
    }

    /**
     * The quantity to compare against before applying the delta. This field is
     * mandatory- you must explicitly pass in a value (even if it's `null`), or else
     * you will get an error.
     */
    public Builder changeFromQuantity(Integer changeFromQuantity) {
      this.changeFromQuantity = changeFromQuantity;
      return this;
    }
  }
}
