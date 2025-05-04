package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Price reduction allocations across the draft order's lines.
 */
public class DraftOrderPlatformDiscountAllocation {
  /**
   * The ID of the allocation.
   */
  private String id;

  /**
   * The quantity of the target being discounted.
   */
  private Integer quantity;

  /**
   * Amount of the discount allocated to the target.
   */
  private MoneyV2 reductionAmount;

  /**
   * Amount of the discount allocated to the target in both shop currency and presentment currency.
   */
  private MoneyBag reductionAmountSet;

  /**
   * The element of the draft being discounted.
   */
  private DraftOrderPlatformDiscountAllocationTarget target;

  public DraftOrderPlatformDiscountAllocation() {
  }

  /**
   * The ID of the allocation.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The quantity of the target being discounted.
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Amount of the discount allocated to the target.
   */
  public MoneyV2 getReductionAmount() {
    return reductionAmount;
  }

  public void setReductionAmount(MoneyV2 reductionAmount) {
    this.reductionAmount = reductionAmount;
  }

  /**
   * Amount of the discount allocated to the target in both shop currency and presentment currency.
   */
  public MoneyBag getReductionAmountSet() {
    return reductionAmountSet;
  }

  public void setReductionAmountSet(MoneyBag reductionAmountSet) {
    this.reductionAmountSet = reductionAmountSet;
  }

  /**
   * The element of the draft being discounted.
   */
  public DraftOrderPlatformDiscountAllocationTarget getTarget() {
    return target;
  }

  public void setTarget(DraftOrderPlatformDiscountAllocationTarget target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return "DraftOrderPlatformDiscountAllocation{id='" + id + "', quantity='" + quantity + "', reductionAmount='" + reductionAmount + "', reductionAmountSet='" + reductionAmountSet + "', target='" + target + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderPlatformDiscountAllocation that = (DraftOrderPlatformDiscountAllocation) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(reductionAmount, that.reductionAmount) &&
        Objects.equals(reductionAmountSet, that.reductionAmountSet) &&
        Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, reductionAmount, reductionAmountSet, target);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the allocation.
     */
    private String id;

    /**
     * The quantity of the target being discounted.
     */
    private Integer quantity;

    /**
     * Amount of the discount allocated to the target.
     */
    private MoneyV2 reductionAmount;

    /**
     * Amount of the discount allocated to the target in both shop currency and presentment currency.
     */
    private MoneyBag reductionAmountSet;

    /**
     * The element of the draft being discounted.
     */
    private DraftOrderPlatformDiscountAllocationTarget target;

    public DraftOrderPlatformDiscountAllocation build() {
      DraftOrderPlatformDiscountAllocation result = new DraftOrderPlatformDiscountAllocation();
      result.id = this.id;
      result.quantity = this.quantity;
      result.reductionAmount = this.reductionAmount;
      result.reductionAmountSet = this.reductionAmountSet;
      result.target = this.target;
      return result;
    }

    /**
     * The ID of the allocation.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The quantity of the target being discounted.
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Amount of the discount allocated to the target.
     */
    public Builder reductionAmount(MoneyV2 reductionAmount) {
      this.reductionAmount = reductionAmount;
      return this;
    }

    /**
     * Amount of the discount allocated to the target in both shop currency and presentment currency.
     */
    public Builder reductionAmountSet(MoneyBag reductionAmountSet) {
      this.reductionAmountSet = reductionAmountSet;
      return this;
    }

    /**
     * The element of the draft being discounted.
     */
    public Builder target(DraftOrderPlatformDiscountAllocationTarget target) {
      this.target = target;
      return this;
    }
  }
}
