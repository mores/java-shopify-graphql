package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The discount application applied using a discount code.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartCodeDiscountApplication implements com.shopify.storefront.types.BaseCartDiscountApplication {
  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  private DiscountApplicationAllocationMethod allocationMethod;

  /**
   * The code used to apply the discount.
   */
  private String code;

  /**
   * Which lines of targetType that the discount is allocated over.
   */
  private DiscountApplicationTargetSelection targetSelection;

  /**
   * The type of line that the discount is applicable towards.
   */
  private DiscountApplicationTargetType targetType;

  /**
   * The total amount allocated by this discount application across all entitled items.
   */
  private MoneyV2 totalAllocatedAmount;

  /**
   * The value of the discount application.
   */
  private PricingValue value;

  public CartCodeDiscountApplication() {
  }

  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  public DiscountApplicationAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  /**
   * The code used to apply the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Which lines of targetType that the discount is allocated over.
   */
  public DiscountApplicationTargetSelection getTargetSelection() {
    return targetSelection;
  }

  public void setTargetSelection(DiscountApplicationTargetSelection targetSelection) {
    this.targetSelection = targetSelection;
  }

  /**
   * The type of line that the discount is applicable towards.
   */
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  /**
   * The total amount allocated by this discount application across all entitled items.
   */
  public MoneyV2 getTotalAllocatedAmount() {
    return totalAllocatedAmount;
  }

  public void setTotalAllocatedAmount(MoneyV2 totalAllocatedAmount) {
    this.totalAllocatedAmount = totalAllocatedAmount;
  }

  /**
   * The value of the discount application.
   */
  public PricingValue getValue() {
    return value;
  }

  public void setValue(PricingValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CartCodeDiscountApplication{allocationMethod='" + allocationMethod + "', code='" + code + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', totalAllocatedAmount='" + totalAllocatedAmount + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartCodeDiscountApplication that = (CartCodeDiscountApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(code, that.code) &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(totalAllocatedAmount, that.totalAllocatedAmount) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, code, targetSelection, targetType, totalAllocatedAmount, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The method by which the discount's value is allocated to its entitled items.
     */
    private DiscountApplicationAllocationMethod allocationMethod;

    /**
     * The code used to apply the discount.
     */
    private String code;

    /**
     * Which lines of targetType that the discount is allocated over.
     */
    private DiscountApplicationTargetSelection targetSelection;

    /**
     * The type of line that the discount is applicable towards.
     */
    private DiscountApplicationTargetType targetType;

    /**
     * The total amount allocated by this discount application across all entitled items.
     */
    private MoneyV2 totalAllocatedAmount;

    /**
     * The value of the discount application.
     */
    private PricingValue value;

    public CartCodeDiscountApplication build() {
      CartCodeDiscountApplication result = new CartCodeDiscountApplication();
      result.allocationMethod = this.allocationMethod;
      result.code = this.code;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      result.totalAllocatedAmount = this.totalAllocatedAmount;
      result.value = this.value;
      return result;
    }

    /**
     * The method by which the discount's value is allocated to its entitled items.
     */
    public Builder allocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    /**
     * The code used to apply the discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * Which lines of targetType that the discount is allocated over.
     */
    public Builder targetSelection(DiscountApplicationTargetSelection targetSelection) {
      this.targetSelection = targetSelection;
      return this;
    }

    /**
     * The type of line that the discount is applicable towards.
     */
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    /**
     * The total amount allocated by this discount application across all entitled items.
     */
    public Builder totalAllocatedAmount(MoneyV2 totalAllocatedAmount) {
      this.totalAllocatedAmount = totalAllocatedAmount;
      return this;
    }

    /**
     * The value of the discount application.
     */
    public Builder value(PricingValue value) {
      this.value = value;
      return this;
    }
  }
}
