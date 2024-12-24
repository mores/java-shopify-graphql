package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedScriptDiscountApplication implements com.shopify.types.CalculatedDiscountApplication {
  
  private DiscountApplicationAllocationMethod allocationMethod;

  
  private DiscountApplicationLevel appliedTo;

  
  private String description;

  
  private String id;

  
  private DiscountApplicationTargetSelection targetSelection;

  
  private DiscountApplicationTargetType targetType;

  
  private PricingValue value;

  public CalculatedScriptDiscountApplication() {
  }

  
  public DiscountApplicationAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  
  public DiscountApplicationLevel getAppliedTo() {
    return appliedTo;
  }

  public void setAppliedTo(DiscountApplicationLevel appliedTo) {
    this.appliedTo = appliedTo;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  
  public PricingValue getValue() {
    return value;
  }

  public void setValue(PricingValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CalculatedScriptDiscountApplication{allocationMethod='" + allocationMethod + "', appliedTo='" + appliedTo + "', description='" + description + "', id='" + id + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedScriptDiscountApplication that = (CalculatedScriptDiscountApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(appliedTo, that.appliedTo) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, appliedTo, description, id, targetSelection, targetType, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountApplicationAllocationMethod allocationMethod;

    
    private DiscountApplicationLevel appliedTo;

    
    private String description;

    
    private String id;

    
    private DiscountApplicationTargetSelection targetSelection;

    
    private DiscountApplicationTargetType targetType;

    
    private PricingValue value;

    public CalculatedScriptDiscountApplication build() {
      CalculatedScriptDiscountApplication result = new CalculatedScriptDiscountApplication();
      result.allocationMethod = this.allocationMethod;
      result.appliedTo = this.appliedTo;
      result.description = this.description;
      result.id = this.id;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      result.value = this.value;
      return result;
    }

    
    public Builder allocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    
    public Builder appliedTo(DiscountApplicationLevel appliedTo) {
      this.appliedTo = appliedTo;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
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

    
    public Builder value(PricingValue value) {
      this.value = value;
      return this;
    }
  }
}
