package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Script discount applications capture the intentions of a discount that
 * was created by a Shopify Script.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ScriptDiscountApplication implements com.shopify.storefront.types.DiscountApplication {
  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  private DiscountApplicationAllocationMethod allocationMethod;

  /**
   * Which lines of targetType that the discount is allocated over.
   */
  private DiscountApplicationTargetSelection targetSelection;

  /**
   * The type of line that the discount is applicable towards.
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
   * The method by which the discount's value is allocated to its entitled items.
   */
  public DiscountApplicationAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
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
    return "ScriptDiscountApplication{allocationMethod='" + allocationMethod + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', title='" + title + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptDiscountApplication that = (ScriptDiscountApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, targetSelection, targetType, title, value);
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
     * Which lines of targetType that the discount is allocated over.
     */
    private DiscountApplicationTargetSelection targetSelection;

    /**
     * The type of line that the discount is applicable towards.
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
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      result.title = this.title;
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
