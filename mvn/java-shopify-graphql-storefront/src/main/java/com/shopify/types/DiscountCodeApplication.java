package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Discount code applications capture the intentions of a discount code at
 * the time that it is applied.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCodeApplication implements com.shopify.types.DiscountApplication {
  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  private DiscountApplicationAllocationMethod allocationMethod;

  /**
   * Specifies whether the discount code was applied successfully.
   */
  private boolean applicable;

  /**
   * The string identifying the discount code that was used at the time of application.
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
   * The value of the discount application.
   */
  private PricingValue value;

  public DiscountCodeApplication() {
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
   * Specifies whether the discount code was applied successfully.
   */
  public boolean getApplicable() {
    return applicable;
  }

  public void setApplicable(boolean applicable) {
    this.applicable = applicable;
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
    return "DiscountCodeApplication{allocationMethod='" + allocationMethod + "', applicable='" + applicable + "', code='" + code + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeApplication that = (DiscountCodeApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        applicable == that.applicable &&
        Objects.equals(code, that.code) &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, applicable, code, targetSelection, targetType, value);
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
     * Specifies whether the discount code was applied successfully.
     */
    private boolean applicable;

    /**
     * The string identifying the discount code that was used at the time of application.
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
     * The value of the discount application.
     */
    private PricingValue value;

    public DiscountCodeApplication build() {
      DiscountCodeApplication result = new DiscountCodeApplication();
      result.allocationMethod = this.allocationMethod;
      result.applicable = this.applicable;
      result.code = this.code;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
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
     * Specifies whether the discount code was applied successfully.
     */
    public Builder applicable(boolean applicable) {
      this.applicable = applicable;
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
     * The value of the discount application.
     */
    public Builder value(PricingValue value) {
      this.value = value;
      return this;
    }
  }
}
