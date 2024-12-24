package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class DiscountAutomaticBxgyInput {
  
  private DiscountCombinesWithInput combinesWith;

  
  private OffsetDateTime startsAt;

  
  private OffsetDateTime endsAt;

  
  private String title;

  
  private String usesPerOrderLimit;

  
  private DiscountCustomerBuysInput customerBuys;

  
  private DiscountCustomerGetsInput customerGets;

  public DiscountAutomaticBxgyInput() {
  }

  
  public DiscountCombinesWithInput getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWithInput combinesWith) {
    this.combinesWith = combinesWith;
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

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getUsesPerOrderLimit() {
    return usesPerOrderLimit;
  }

  public void setUsesPerOrderLimit(String usesPerOrderLimit) {
    this.usesPerOrderLimit = usesPerOrderLimit;
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

  @Override
  public String toString() {
    return "DiscountAutomaticBxgyInput{combinesWith='" + combinesWith + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', title='" + title + "', usesPerOrderLimit='" + usesPerOrderLimit + "', customerBuys='" + customerBuys + "', customerGets='" + customerGets + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBxgyInput that = (DiscountAutomaticBxgyInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(title, that.title) &&
        Objects.equals(usesPerOrderLimit, that.usesPerOrderLimit) &&
        Objects.equals(customerBuys, that.customerBuys) &&
        Objects.equals(customerGets, that.customerGets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, startsAt, endsAt, title, usesPerOrderLimit, customerBuys, customerGets);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountCombinesWithInput combinesWith;

    
    private OffsetDateTime startsAt;

    
    private OffsetDateTime endsAt;

    
    private String title;

    
    private String usesPerOrderLimit;

    
    private DiscountCustomerBuysInput customerBuys;

    
    private DiscountCustomerGetsInput customerGets;

    public DiscountAutomaticBxgyInput build() {
      DiscountAutomaticBxgyInput result = new DiscountAutomaticBxgyInput();
      result.combinesWith = this.combinesWith;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.title = this.title;
      result.usesPerOrderLimit = this.usesPerOrderLimit;
      result.customerBuys = this.customerBuys;
      result.customerGets = this.customerGets;
      return result;
    }

    
    public Builder combinesWith(DiscountCombinesWithInput combinesWith) {
      this.combinesWith = combinesWith;
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

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder usesPerOrderLimit(String usesPerOrderLimit) {
      this.usesPerOrderLimit = usesPerOrderLimit;
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
  }
}
