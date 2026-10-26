package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * One of a sequence of adjustments applied to determine a price.
 */
public class AuditTrailAdjustment {
  /**
   * The human-readable description of the adjustment.
   * > **Note:** This field is **localized display text** and **not a stable contract**.
   * > Don't build business logic that parses or matches on this text because it can change at any time.
   * > No stable per-adjustment identifier is currently exposed.
   */
  private String label;

  /**
   * The price after the adjustment was applied.
   */
  private MoneyV2 price;

  /**
   * The type of the adjustment.
   */
  private AuditTrailAdjustmentType type;

  /**
   * The value of the adjustment.
   */
  private String value;

  public AuditTrailAdjustment() {
  }

  /**
   * The human-readable description of the adjustment.
   * > **Note:** This field is **localized display text** and **not a stable contract**.
   * > Don't build business logic that parses or matches on this text because it can change at any time.
   * > No stable per-adjustment identifier is currently exposed.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The price after the adjustment was applied.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  /**
   * The type of the adjustment.
   */
  public AuditTrailAdjustmentType getType() {
    return type;
  }

  public void setType(AuditTrailAdjustmentType type) {
    this.type = type;
  }

  /**
   * The value of the adjustment.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "AuditTrailAdjustment{label='" + label + "', price='" + price + "', type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AuditTrailAdjustment that = (AuditTrailAdjustment) o;
    return Objects.equals(label, that.label) &&
        Objects.equals(price, that.price) &&
        Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, price, type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The human-readable description of the adjustment.
     * > **Note:** This field is **localized display text** and **not a stable contract**.
     * > Don't build business logic that parses or matches on this text because it can change at any time.
     * > No stable per-adjustment identifier is currently exposed.
     */
    private String label;

    /**
     * The price after the adjustment was applied.
     */
    private MoneyV2 price;

    /**
     * The type of the adjustment.
     */
    private AuditTrailAdjustmentType type;

    /**
     * The value of the adjustment.
     */
    private String value;

    public AuditTrailAdjustment build() {
      AuditTrailAdjustment result = new AuditTrailAdjustment();
      result.label = this.label;
      result.price = this.price;
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The human-readable description of the adjustment.
     * > **Note:** This field is **localized display text** and **not a stable contract**.
     * > Don't build business logic that parses or matches on this text because it can change at any time.
     * > No stable per-adjustment identifier is currently exposed.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * The price after the adjustment was applied.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * The type of the adjustment.
     */
    public Builder type(AuditTrailAdjustmentType type) {
      this.type = type;
      return this;
    }

    /**
     * The value of the adjustment.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
