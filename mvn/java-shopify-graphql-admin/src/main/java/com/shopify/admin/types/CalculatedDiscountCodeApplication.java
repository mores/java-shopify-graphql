package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A discount code that is applied to an order that is being edited.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedDiscountCodeApplication implements com.shopify.admin.types.CalculatedDiscountApplication {
  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  private DiscountApplicationAllocationMethod allocationMethod;

  /**
   * The level at which the discount was applied.
   */
  private DiscountApplicationLevel appliedTo;

  /**
   * The string identifying the discount code that was used at the time of application.
   */
  private String code;

  /**
   * The description of discount application. Indicates the reason why the discount was applied.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

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

  public CalculatedDiscountCodeApplication() {
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
   * The level at which the discount was applied.
   */
  public DiscountApplicationLevel getAppliedTo() {
    return appliedTo;
  }

  public void setAppliedTo(DiscountApplicationLevel appliedTo) {
    this.appliedTo = appliedTo;
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
   * The description of discount application. Indicates the reason why the discount was applied.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
    return "CalculatedDiscountCodeApplication{allocationMethod='" + allocationMethod + "', appliedTo='" + appliedTo + "', code='" + code + "', description='" + description + "', id='" + id + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedDiscountCodeApplication that = (CalculatedDiscountCodeApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(appliedTo, that.appliedTo) &&
        Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, appliedTo, code, description, id, targetSelection, targetType, value);
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
     * The level at which the discount was applied.
     */
    private DiscountApplicationLevel appliedTo;

    /**
     * The string identifying the discount code that was used at the time of application.
     */
    private String code;

    /**
     * The description of discount application. Indicates the reason why the discount was applied.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

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

    public CalculatedDiscountCodeApplication build() {
      CalculatedDiscountCodeApplication result = new CalculatedDiscountCodeApplication();
      result.allocationMethod = this.allocationMethod;
      result.appliedTo = this.appliedTo;
      result.code = this.code;
      result.description = this.description;
      result.id = this.id;
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
     * The level at which the discount was applied.
     */
    public Builder appliedTo(DiscountApplicationLevel appliedTo) {
      this.appliedTo = appliedTo;
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
     * The description of discount application. Indicates the reason why the discount was applied.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
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
