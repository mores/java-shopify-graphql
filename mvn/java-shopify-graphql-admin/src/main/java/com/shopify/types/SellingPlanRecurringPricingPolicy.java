package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a recurring selling plan pricing policy. It applies after the fixed
 * pricing policy. By using the afterCycle parameter, you can specify the cycle
 * when the recurring pricing policy comes into effect. Recurring pricing policies
 * are not available for deferred purchase options.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanRecurringPricingPolicy implements SellingPlanPricingPolicy, com.shopify.types.SellingPlanPricingPolicyBase {
  /**
   * The price adjustment type.
   */
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  /**
   * The price adjustment value.
   */
  private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

  /**
   * Cycle after which this pricing policy applies.
   */
  private Integer afterCycle;

  /**
   * The date and time when the recurring selling plan pricing policy was created.
   */
  private OffsetDateTime createdAt;

  public SellingPlanRecurringPricingPolicy() {
  }

  /**
   * The price adjustment type.
   */
  public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  /**
   * The price adjustment value.
   */
  public SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(SellingPlanPricingPolicyAdjustmentValue adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  /**
   * Cycle after which this pricing policy applies.
   */
  public Integer getAfterCycle() {
    return afterCycle;
  }

  public void setAfterCycle(Integer afterCycle) {
    this.afterCycle = afterCycle;
  }

  /**
   * The date and time when the recurring selling plan pricing policy was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringPricingPolicy{adjustmentType='" + adjustmentType + "', adjustmentValue='" + adjustmentValue + "', afterCycle='" + afterCycle + "', createdAt='" + createdAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringPricingPolicy that = (SellingPlanRecurringPricingPolicy) o;
    return Objects.equals(adjustmentType, that.adjustmentType) &&
        Objects.equals(adjustmentValue, that.adjustmentValue) &&
        Objects.equals(afterCycle, that.afterCycle) &&
        Objects.equals(createdAt, that.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentType, adjustmentValue, afterCycle, createdAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The price adjustment type.
     */
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    /**
     * The price adjustment value.
     */
    private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

    /**
     * Cycle after which this pricing policy applies.
     */
    private Integer afterCycle;

    /**
     * The date and time when the recurring selling plan pricing policy was created.
     */
    private OffsetDateTime createdAt;

    public SellingPlanRecurringPricingPolicy build() {
      SellingPlanRecurringPricingPolicy result = new SellingPlanRecurringPricingPolicy();
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      result.afterCycle = this.afterCycle;
      result.createdAt = this.createdAt;
      return result;
    }

    /**
     * The price adjustment type.
     */
    public Builder adjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
      this.adjustmentType = adjustmentType;
      return this;
    }

    /**
     * The price adjustment value.
     */
    public Builder adjustmentValue(SellingPlanPricingPolicyAdjustmentValue adjustmentValue) {
      this.adjustmentValue = adjustmentValue;
      return this;
    }

    /**
     * Cycle after which this pricing policy applies.
     */
    public Builder afterCycle(Integer afterCycle) {
      this.afterCycle = afterCycle;
      return this;
    }

    /**
     * The date and time when the recurring selling plan pricing policy was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }
  }
}
