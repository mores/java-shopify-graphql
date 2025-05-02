package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Manual discount applications capture the intentions of a discount that was manually created.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ManualDiscountApplication implements com.shopify.types.DiscountApplication {
  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  private DiscountApplicationAllocationMethod allocationMethod;

  /**
   * The description of the application.
   */
  private String description;

  /**
   * Which lines of targetType that the discount is allocated over.
   */
  private DiscountApplicationTargetSelection targetSelection;

  /**
   * The type of line that the discount is applicable towards.
   */
  private DiscountApplicationTargetType targetType;

  /**
   * The title of the application.
   */
  private String title;

  /**
   * The value of the discount application.
   */
  private PricingValue value;

  public ManualDiscountApplication() {
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
   * The description of the application.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * The title of the application.
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
    return "ManualDiscountApplication{allocationMethod='" + allocationMethod + "', description='" + description + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', title='" + title + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ManualDiscountApplication that = (ManualDiscountApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(description, that.description) &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, description, targetSelection, targetType, title, value);
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
     * The description of the application.
     */
    private String description;

    /**
     * Which lines of targetType that the discount is allocated over.
     */
    private DiscountApplicationTargetSelection targetSelection;

    /**
     * The type of line that the discount is applicable towards.
     */
    private DiscountApplicationTargetType targetType;

    /**
     * The title of the application.
     */
    private String title;

    /**
     * The value of the discount application.
     */
    private PricingValue value;

    public ManualDiscountApplication build() {
      ManualDiscountApplication result = new ManualDiscountApplication();
      result.allocationMethod = this.allocationMethod;
      result.description = this.description;
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
     * The description of the application.
     */
    public Builder description(String description) {
      this.description = description;
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
     * The title of the application.
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
