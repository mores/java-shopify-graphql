package com.shopify.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class DiscountCodeBxgyInput {
  
  private DiscountCombinesWithInput combinesWith;

  
  private String title;

  
  private OffsetDateTime startsAt;

  
  private OffsetDateTime endsAt;

  
  private DiscountCustomerBuysInput customerBuys;

  
  private DiscountCustomerGetsInput customerGets;

  
  private DiscountCustomerSelectionInput customerSelection;

  
  private String code;

  
  private Integer usageLimit;

  
  private Integer usesPerOrderLimit;

  
  private Boolean appliesOncePerCustomer;

  public DiscountCodeBxgyInput() {
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

  
  public DiscountCustomerBuysInput getCustomerBuys() {
    return customerBuys;
  }

  public void setCustomerBuys(DiscountCustomerBuysInput customerBuys) {
    this.customerBuys = customerBuys;
  }

  
  public DiscountCustomerGetsInput getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGetsInput customerGets) {
    this.customerGets = customerGets;
  }

  
  public DiscountCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
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

  
  public Integer getUsesPerOrderLimit() {
    return usesPerOrderLimit;
  }

  public void setUsesPerOrderLimit(Integer usesPerOrderLimit) {
    this.usesPerOrderLimit = usesPerOrderLimit;
  }

  
  public Boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
  }

  @Override
  public String toString() {
    return "DiscountCodeBxgyInput{combinesWith='" + combinesWith + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', customerBuys='" + customerBuys + "', customerGets='" + customerGets + "', customerSelection='" + customerSelection + "', code='" + code + "', usageLimit='" + usageLimit + "', usesPerOrderLimit='" + usesPerOrderLimit + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeBxgyInput that = (DiscountCodeBxgyInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(customerBuys, that.customerBuys) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(code, that.code) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(usesPerOrderLimit, that.usesPerOrderLimit) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, title, startsAt, endsAt, customerBuys, customerGets, customerSelection, code, usageLimit, usesPerOrderLimit, appliesOncePerCustomer);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountCombinesWithInput combinesWith;

    
    private String title;

    
    private OffsetDateTime startsAt;

    
    private OffsetDateTime endsAt;

    
    private DiscountCustomerBuysInput customerBuys;

    
    private DiscountCustomerGetsInput customerGets;

    
    private DiscountCustomerSelectionInput customerSelection;

    
    private String code;

    
    private Integer usageLimit;

    
    private Integer usesPerOrderLimit;

    
    private Boolean appliesOncePerCustomer;

    public DiscountCodeBxgyInput build() {
      DiscountCodeBxgyInput result = new DiscountCodeBxgyInput();
      result.combinesWith = this.combinesWith;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.customerBuys = this.customerBuys;
      result.customerGets = this.customerGets;
      result.customerSelection = this.customerSelection;
      result.code = this.code;
      result.usageLimit = this.usageLimit;
      result.usesPerOrderLimit = this.usesPerOrderLimit;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
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

    
    public Builder customerBuys(DiscountCustomerBuysInput customerBuys) {
      this.customerBuys = customerBuys;
      return this;
    }

    
    public Builder customerGets(DiscountCustomerGetsInput customerGets) {
      this.customerGets = customerGets;
      return this;
    }

    
    public Builder customerSelection(DiscountCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
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

    
    public Builder usesPerOrderLimit(Integer usesPerOrderLimit) {
      this.usesPerOrderLimit = usesPerOrderLimit;
      return this;
    }

    
    public Builder appliesOncePerCustomer(Boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
      return this;
    }
  }
}
