package com.shopify.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class DiscountCodeFreeShippingInput {
  
  private DiscountCombinesWithInput combinesWith;

  
  private String title;

  
  private OffsetDateTime startsAt;

  
  private OffsetDateTime endsAt;

  
  private String code;

  
  private Integer usageLimit;

  
  private Boolean appliesOncePerCustomer;

  
  private DiscountMinimumRequirementInput minimumRequirement;

  
  private DiscountCustomerSelectionInput customerSelection;

  
  private DiscountShippingDestinationSelectionInput destination;

  
  private String maximumShippingPrice;

  
  private Integer recurringCycleLimit;

  
  private Boolean appliesOnOneTimePurchase;

  
  private Boolean appliesOnSubscription;

  public DiscountCodeFreeShippingInput() {
  }

  
  public DiscountCombinesWithInput getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWithInput combinesWith) {
    this.combinesWith = combinesWith;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  
  public Boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
  }

  
  public DiscountMinimumRequirementInput getMinimumRequirement() {
    return minimumRequirement;
  }

  public void setMinimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
    this.minimumRequirement = minimumRequirement;
  }

  
  public DiscountCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
  }

  
  public DiscountShippingDestinationSelectionInput getDestination() {
    return destination;
  }

  public void setDestination(DiscountShippingDestinationSelectionInput destination) {
    this.destination = destination;
  }

  
  public String getMaximumShippingPrice() {
    return maximumShippingPrice;
  }

  public void setMaximumShippingPrice(String maximumShippingPrice) {
    this.maximumShippingPrice = maximumShippingPrice;
  }

  
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  
  public Boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  
  public Boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(Boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  @Override
  public String toString() {
    return "DiscountCodeFreeShippingInput{combinesWith='" + combinesWith + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', code='" + code + "', usageLimit='" + usageLimit + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', minimumRequirement='" + minimumRequirement + "', customerSelection='" + customerSelection + "', destination='" + destination + "', maximumShippingPrice='" + maximumShippingPrice + "', recurringCycleLimit='" + recurringCycleLimit + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeFreeShippingInput that = (DiscountCodeFreeShippingInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(code, that.code) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(destination, that.destination) &&
        Objects.equals(maximumShippingPrice, that.maximumShippingPrice) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(appliesOnOneTimePurchase, that.appliesOnOneTimePurchase) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, title, startsAt, endsAt, code, usageLimit, appliesOncePerCustomer, minimumRequirement, customerSelection, destination, maximumShippingPrice, recurringCycleLimit, appliesOnOneTimePurchase, appliesOnSubscription);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountCombinesWithInput combinesWith;

    
    private String title;

    
    private OffsetDateTime startsAt;

    
    private OffsetDateTime endsAt;

    
    private String code;

    
    private Integer usageLimit;

    
    private Boolean appliesOncePerCustomer;

    
    private DiscountMinimumRequirementInput minimumRequirement;

    
    private DiscountCustomerSelectionInput customerSelection;

    
    private DiscountShippingDestinationSelectionInput destination;

    
    private String maximumShippingPrice;

    
    private Integer recurringCycleLimit;

    
    private Boolean appliesOnOneTimePurchase;

    
    private Boolean appliesOnSubscription;

    public DiscountCodeFreeShippingInput build() {
      DiscountCodeFreeShippingInput result = new DiscountCodeFreeShippingInput();
      result.combinesWith = this.combinesWith;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.code = this.code;
      result.usageLimit = this.usageLimit;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.minimumRequirement = this.minimumRequirement;
      result.customerSelection = this.customerSelection;
      result.destination = this.destination;
      result.maximumShippingPrice = this.maximumShippingPrice;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      return result;
    }

    
    public Builder combinesWith(DiscountCombinesWithInput combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }

    
    public Builder appliesOncePerCustomer(Boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
      return this;
    }

    
    public Builder minimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
      this.minimumRequirement = minimumRequirement;
      return this;
    }

    
    public Builder customerSelection(DiscountCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    
    public Builder destination(DiscountShippingDestinationSelectionInput destination) {
      this.destination = destination;
      return this;
    }

    
    public Builder maximumShippingPrice(String maximumShippingPrice) {
      this.maximumShippingPrice = maximumShippingPrice;
      return this;
    }

    
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    
    public Builder appliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    
    public Builder appliesOnSubscription(Boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }
  }
}
