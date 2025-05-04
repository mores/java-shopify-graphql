package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for a scheduled change of an inventory item.
 */
public class InventoryScheduledChangeInput {
  /**
   * The date and time that the scheduled change is expected to happen.
   */
  private OffsetDateTime expectedAt;

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
   * to transition from.
   */
  private String fromName;

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
   * to transition to.
   */
  private String toName;

  public InventoryScheduledChangeInput() {
  }

  /**
   * The date and time that the scheduled change is expected to happen.
   */
  public OffsetDateTime getExpectedAt() {
    return expectedAt;
  }

  public void setExpectedAt(OffsetDateTime expectedAt) {
    this.expectedAt = expectedAt;
  }

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
   * to transition from.
   */
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  /**
   * The quantity
   * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
   * to transition to.
   */
  public String getToName() {
    return toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  @Override
  public String toString() {
    return "InventoryScheduledChangeInput{expectedAt='" + expectedAt + "', fromName='" + fromName + "', toName='" + toName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryScheduledChangeInput that = (InventoryScheduledChangeInput) o;
    return Objects.equals(expectedAt, that.expectedAt) &&
        Objects.equals(fromName, that.fromName) &&
        Objects.equals(toName, that.toName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedAt, fromName, toName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time that the scheduled change is expected to happen.
     */
    private OffsetDateTime expectedAt;

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
     * to transition from.
     */
    private String fromName;

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
     * to transition to.
     */
    private String toName;

    public InventoryScheduledChangeInput build() {
      InventoryScheduledChangeInput result = new InventoryScheduledChangeInput();
      result.expectedAt = this.expectedAt;
      result.fromName = this.fromName;
      result.toName = this.toName;
      return result;
    }

    /**
     * The date and time that the scheduled change is expected to happen.
     */
    public Builder expectedAt(OffsetDateTime expectedAt) {
      this.expectedAt = expectedAt;
      return this;
    }

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
     * to transition from.
     */
    public Builder fromName(String fromName) {
      this.fromName = fromName;
      return this;
    }

    /**
     * The quantity
     * [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps/quantities-states#move-inventory-quantities-between-states)
     * to transition to.
     */
    public Builder toName(String toName) {
      this.toName = toName;
      return this;
    }
  }
}
