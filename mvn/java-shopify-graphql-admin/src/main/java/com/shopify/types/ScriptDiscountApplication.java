package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Script discount applications capture the intentions of a discount that
 * was created by a Shopify Script for an order's line item or shipping line.
 *
 * Discount applications don't represent the actual final amount discounted on a
 * line (line item or shipping line). The actual amount discounted on a line is
 * represented by the [DiscountAllocation](https://shopify.dev/api/admin-graphql/latest/objects/discountallocation) object.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ScriptDiscountApplication implements com.shopify.types.DiscountApplication {
  /**
   * The method by which the discount's value is applied to its entitled items.
   */
  private DiscountApplicationAllocationMethod allocationMethod;

  /**
   * The description of the application as defined by the Script.
   */
  private String description;

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
   * The title of the application as defined by the Script.
   */
  private String title;

  /**
   * The value of the discount application.
   */
  private PricingValue value;

  public ScriptDiscountApplication() {
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
   * The description of the application as defined by the Script.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * The title of the application as defined by the Script.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
    return "ScriptDiscountApplication{allocationMethod='" + allocationMethod + "', description='" + description + "', index='" + index + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', title='" + title + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptDiscountApplication that = (ScriptDiscountApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(description, that.description) &&
        index == that.index &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, description, index, targetSelection, targetType, title, value);
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
     * The description of the application as defined by the Script.
     */
    private String description;

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
     * The title of the application as defined by the Script.
     */
    private String title;

    /**
     * The value of the discount application.
     */
    private PricingValue value;

    public ScriptDiscountApplication build() {
      ScriptDiscountApplication result = new ScriptDiscountApplication();
      result.allocationMethod = this.allocationMethod;
      result.description = this.description;
      result.index = this.index;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      result.title = this.title;
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
     * The description of the application as defined by the Script.
     */
    public Builder description(String description) {
      this.description = description;
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
     * The title of the application as defined by the Script.
     */
    public Builder title(String title) {
      this.title = title;
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
