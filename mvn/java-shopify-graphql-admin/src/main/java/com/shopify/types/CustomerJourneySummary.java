package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerJourneySummary {
  
  private Integer customerOrderIndex;

  
  private Integer daysToConversion;

  
  private CustomerVisit firstVisit;

  
  private CustomerVisit lastVisit;

  
  private CustomerMomentConnection moments;

  
  private Count momentsCount;

  
  private boolean ready;

  public CustomerJourneySummary() {
  }

  
  public Integer getCustomerOrderIndex() {
    return customerOrderIndex;
  }

  public void setCustomerOrderIndex(Integer customerOrderIndex) {
    this.customerOrderIndex = customerOrderIndex;
  }

  
  public Integer getDaysToConversion() {
    return daysToConversion;
  }

  public void setDaysToConversion(Integer daysToConversion) {
    this.daysToConversion = daysToConversion;
  }

  
  public CustomerVisit getFirstVisit() {
    return firstVisit;
  }

  public void setFirstVisit(CustomerVisit firstVisit) {
    this.firstVisit = firstVisit;
  }

  
  public CustomerVisit getLastVisit() {
    return lastVisit;
  }

  public void setLastVisit(CustomerVisit lastVisit) {
    this.lastVisit = lastVisit;
  }

  
  public CustomerMomentConnection getMoments() {
    return moments;
  }

  public void setMoments(CustomerMomentConnection moments) {
    this.moments = moments;
  }

  
  public Count getMomentsCount() {
    return momentsCount;
  }

  public void setMomentsCount(Count momentsCount) {
    this.momentsCount = momentsCount;
  }

  
  public boolean getReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  @Override
  public String toString() {
    return "CustomerJourneySummary{customerOrderIndex='" + customerOrderIndex + "', daysToConversion='" + daysToConversion + "', firstVisit='" + firstVisit + "', lastVisit='" + lastVisit + "', moments='" + moments + "', momentsCount='" + momentsCount + "', ready='" + ready + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerJourneySummary that = (CustomerJourneySummary) o;
    return Objects.equals(customerOrderIndex, that.customerOrderIndex) &&
        Objects.equals(daysToConversion, that.daysToConversion) &&
        Objects.equals(firstVisit, that.firstVisit) &&
        Objects.equals(lastVisit, that.lastVisit) &&
        Objects.equals(moments, that.moments) &&
        Objects.equals(momentsCount, that.momentsCount) &&
        ready == that.ready;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderIndex, daysToConversion, firstVisit, lastVisit, moments, momentsCount, ready);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Integer customerOrderIndex;

    
    private Integer daysToConversion;

    
    private CustomerVisit firstVisit;

    
    private CustomerVisit lastVisit;

    
    private CustomerMomentConnection moments;

    
    private Count momentsCount;

    
    private boolean ready;

    public CustomerJourneySummary build() {
      CustomerJourneySummary result = new CustomerJourneySummary();
      result.customerOrderIndex = this.customerOrderIndex;
      result.daysToConversion = this.daysToConversion;
      result.firstVisit = this.firstVisit;
      result.lastVisit = this.lastVisit;
      result.moments = this.moments;
      result.momentsCount = this.momentsCount;
      result.ready = this.ready;
      return result;
    }

    
    public Builder customerOrderIndex(Integer customerOrderIndex) {
      this.customerOrderIndex = customerOrderIndex;
      return this;
    }

    
    public Builder daysToConversion(Integer daysToConversion) {
      this.daysToConversion = daysToConversion;
      return this;
    }

    
    public Builder firstVisit(CustomerVisit firstVisit) {
      this.firstVisit = firstVisit;
      return this;
    }

    
    public Builder lastVisit(CustomerVisit lastVisit) {
      this.lastVisit = lastVisit;
      return this;
    }

    
    public Builder moments(CustomerMomentConnection moments) {
      this.moments = moments;
      return this;
    }

    
    public Builder momentsCount(Count momentsCount) {
      this.momentsCount = momentsCount;
      return this;
    }

    
    public Builder ready(boolean ready) {
      this.ready = ready;
      return this;
    }
  }
}
