package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Discount code applications capture the intentions of a discount code at
 * the time that it is applied onto an order.
 *
 * Discount applications don't represent the actual final amount discounted on a
 * line (line item or shipping line). The actual amount discounted on a line is
 * represented by the [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation) object.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCodeApplication implements com.shopify.types.DiscountApplication {
  /**
   * The method by which the discount's value is applied to its entitled items.
   */
  private DiscountApplicationAllocationMethod allocationMethod;

  /**
   * The string identifying the discount code that was used at the time of application.
   */
  private String code;

  /**
   * An ordered index that can be used to identify the discount application and indicate the precedence
   * of the discount application for calculations.
   */
  private int index;

  /**
   * How the discount amount is distributed on the discounted lines.
   */
  private DiscountApplicationTargetSelection targetSelection;

  /**
   * Whether the discount is applied on line items or shipping lines.
   */
  private DiscountApplicationTargetType targetType;

  /**
   * The value of the discount application.
   */
  private PricingValue value;

  public DiscountCodeApplication() {
  }

  /**
   * The method by which the discount's value is applied to its entitled items.
   */
  public DiscountApplicationAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  /**
   * The string identifying the discount code that was used at the time of application.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * An ordered index that can be used to identify the discount application and indicate the precedence
   * of the discount application for calculations.
   */
  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  /**
   * How the discount amount is distributed on the discounted lines.
   */
  public DiscountApplicationTargetSelection getTargetSelection() {
    return targetSelection;
  }

  public void setTargetSelection(DiscountApplicationTargetSelection targetSelection) {
    this.targetSelection = targetSelection;
  }

  /**
   * Whether the discount is applied on line items or shipping lines.
   */
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
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
    return "DiscountCodeApplication{allocationMethod='" + allocationMethod + "', code='" + code + "', index='" + index + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeApplication that = (DiscountCodeApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(code, that.code) &&
        index == that.index &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, code, index, targetSelection, targetType, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The method by which the discount's value is applied to its entitled items.
     */
    private DiscountApplicationAllocationMethod allocationMethod;

    /**
     * The string identifying the discount code that was used at the time of application.
     */
    private String code;

    /**
     * An ordered index that can be used to identify the discount application and indicate the precedence
     * of the discount application for calculations.
     */
    private int index;

    /**
     * How the discount amount is distributed on the discounted lines.
     */
    private DiscountApplicationTargetSelection targetSelection;

    /**
     * Whether the discount is applied on line items or shipping lines.
     */
    private DiscountApplicationTargetType targetType;

    /**
     * The value of the discount application.
     */
    private PricingValue value;

    public DiscountCodeApplication build() {
      DiscountCodeApplication result = new DiscountCodeApplication();
      result.allocationMethod = this.allocationMethod;
      result.code = this.code;
      result.index = this.index;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      result.value = this.value;
      return result;
    }

    /**
     * The method by which the discount's value is applied to its entitled items.
     */
    public Builder allocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    /**
     * The string identifying the discount code that was used at the time of application.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * An ordered index that can be used to identify the discount application and indicate the precedence
     * of the discount application for calculations.
     */
    public Builder index(int index) {
      this.index = index;
      return this;
    }

    /**
     * How the discount amount is distributed on the discounted lines.
     */
    public Builder targetSelection(DiscountApplicationTargetSelection targetSelection) {
      this.targetSelection = targetSelection;
      return this;
    }

    /**
     * Whether the discount is applied on line items or shipping lines.
     */
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
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
