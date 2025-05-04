package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Custom subscription discount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionManualDiscount implements SubscriptionDiscount {
  /**
   * Entitled line items used to apply the subscription discount on.
   */
  private SubscriptionDiscountEntitledLines entitledLines;

  /**
   * The unique ID.
   */
  private String id;

  /**
   * The maximum number of times the subscription discount will be applied on orders.
   */
  private Integer recurringCycleLimit;

  /**
   * The reason that the discount on the subscription draft is rejected.
   */
  private SubscriptionDiscountRejectionReason rejectionReason;

  /**
   * Type of line the discount applies on.
   */
  private DiscountTargetType targetType;

  /**
   * The title associated with the subscription discount.
   */
  private String title;

  /**
   * The type of the subscription discount.
   */
  private DiscountType type;

  /**
   * The number of times the discount was applied.
   */
  private int usageCount;

  /**
   * The value of the subscription discount.
   */
  private SubscriptionDiscountValue value;

  public SubscriptionManualDiscount() {
  }

  /**
   * Entitled line items used to apply the subscription discount on.
   */
  public SubscriptionDiscountEntitledLines getEntitledLines() {
    return entitledLines;
  }

  public void setEntitledLines(SubscriptionDiscountEntitledLines entitledLines) {
    this.entitledLines = entitledLines;
  }

  /**
   * The unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The maximum number of times the subscription discount will be applied on orders.
   */
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  /**
   * The reason that the discount on the subscription draft is rejected.
   */
  public SubscriptionDiscountRejectionReason getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(SubscriptionDiscountRejectionReason rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  /**
   * Type of line the discount applies on.
   */
  public DiscountTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountTargetType targetType) {
    this.targetType = targetType;
  }

  /**
   * The title associated with the subscription discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The type of the subscription discount.
   */
  public DiscountType getType() {
    return type;
  }

  public void setType(DiscountType type) {
    this.type = type;
  }

  /**
   * The number of times the discount was applied.
   */
  public int getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(int usageCount) {
    this.usageCount = usageCount;
  }

  /**
   * The value of the subscription discount.
   */
  public SubscriptionDiscountValue getValue() {
    return value;
  }

  public void setValue(SubscriptionDiscountValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscount{entitledLines='" + entitledLines + "', id='" + id + "', recurringCycleLimit='" + recurringCycleLimit + "', rejectionReason='" + rejectionReason + "', targetType='" + targetType + "', title='" + title + "', type='" + type + "', usageCount='" + usageCount + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscount that = (SubscriptionManualDiscount) o;
    return Objects.equals(entitledLines, that.entitledLines) &&
        Objects.equals(id, that.id) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(rejectionReason, that.rejectionReason) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title) &&
        Objects.equals(type, that.type) &&
        usageCount == that.usageCount &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitledLines, id, recurringCycleLimit, rejectionReason, targetType, title, type, usageCount, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Entitled line items used to apply the subscription discount on.
     */
    private SubscriptionDiscountEntitledLines entitledLines;

    /**
     * The unique ID.
     */
    private String id;

    /**
     * The maximum number of times the subscription discount will be applied on orders.
     */
    private Integer recurringCycleLimit;

    /**
     * The reason that the discount on the subscription draft is rejected.
     */
    private SubscriptionDiscountRejectionReason rejectionReason;

    /**
     * Type of line the discount applies on.
     */
    private DiscountTargetType targetType;

    /**
     * The title associated with the subscription discount.
     */
    private String title;

    /**
     * The type of the subscription discount.
     */
    private DiscountType type;

    /**
     * The number of times the discount was applied.
     */
    private int usageCount;

    /**
     * The value of the subscription discount.
     */
    private SubscriptionDiscountValue value;

    public SubscriptionManualDiscount build() {
      SubscriptionManualDiscount result = new SubscriptionManualDiscount();
      result.entitledLines = this.entitledLines;
      result.id = this.id;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.rejectionReason = this.rejectionReason;
      result.targetType = this.targetType;
      result.title = this.title;
      result.type = this.type;
      result.usageCount = this.usageCount;
      result.value = this.value;
      return result;
    }

    /**
     * Entitled line items used to apply the subscription discount on.
     */
    public Builder entitledLines(SubscriptionDiscountEntitledLines entitledLines) {
      this.entitledLines = entitledLines;
      return this;
    }

    /**
     * The unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The maximum number of times the subscription discount will be applied on orders.
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    /**
     * The reason that the discount on the subscription draft is rejected.
     */
    public Builder rejectionReason(SubscriptionDiscountRejectionReason rejectionReason) {
      this.rejectionReason = rejectionReason;
      return this;
    }

    /**
     * Type of line the discount applies on.
     */
    public Builder targetType(DiscountTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    /**
     * The title associated with the subscription discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The type of the subscription discount.
     */
    public Builder type(DiscountType type) {
      this.type = type;
      return this;
    }

    /**
     * The number of times the discount was applied.
     */
    public Builder usageCount(int usageCount) {
      this.usageCount = usageCount;
      return this;
    }

    /**
     * The value of the subscription discount.
     */
    public Builder value(SubscriptionDiscountValue value) {
      this.value = value;
      return this;
    }
  }
}
