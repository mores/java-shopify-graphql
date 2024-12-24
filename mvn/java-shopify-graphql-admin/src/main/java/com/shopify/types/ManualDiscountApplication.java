package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ManualDiscountApplication implements com.shopify.types.DiscountApplication {
  
  private DiscountApplicationAllocationMethod allocationMethod;

  
  private String description;

  
  private int index;

  
  private DiscountApplicationTargetSelection targetSelection;

  
  private DiscountApplicationTargetType targetType;

  
  private String title;

  
  private PricingValue value;

  public ManualDiscountApplication() {
  }

  
  public DiscountApplicationAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  
  public DiscountApplicationTargetSelection getTargetSelection() {
    return targetSelection;
  }

  public void setTargetSelection(DiscountApplicationTargetSelection targetSelection) {
    this.targetSelection = targetSelection;
  }

  
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public PricingValue getValue() {
    return value;
  }

  public void setValue(PricingValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ManualDiscountApplication{allocationMethod='" + allocationMethod + "', description='" + description + "', index='" + index + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', title='" + title + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ManualDiscountApplication that = (ManualDiscountApplication) o;
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
    
    private DiscountApplicationAllocationMethod allocationMethod;

    
    private String description;

    
    private int index;

    
    private DiscountApplicationTargetSelection targetSelection;

    
    private DiscountApplicationTargetType targetType;

    
    private String title;

    
    private PricingValue value;

    public ManualDiscountApplication build() {
      ManualDiscountApplication result = new ManualDiscountApplication();
      result.allocationMethod = this.allocationMethod;
      result.description = this.description;
      result.index = this.index;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      result.title = this.title;
      result.value = this.value;
      return result;
    }

    
    public Builder allocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder index(int index) {
      this.index = index;
      return this;
    }

    
    public Builder targetSelection(DiscountApplicationTargetSelection targetSelection) {
      this.targetSelection = targetSelection;
      return this;
    }

    
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder value(PricingValue value) {
      this.value = value;
      return this;
    }
  }
}
