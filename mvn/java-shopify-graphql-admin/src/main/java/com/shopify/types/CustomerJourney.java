package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerJourney {
  
  private int customerOrderIndex;

  
  private int daysToConversion;

  
  private CustomerVisit firstVisit;

  
  private CustomerVisit lastVisit;

  
  private List<CustomerMoment> moments;

  public CustomerJourney() {
  }

  
  public int getCustomerOrderIndex() {
    return customerOrderIndex;
  }

  public void setCustomerOrderIndex(int customerOrderIndex) {
    this.customerOrderIndex = customerOrderIndex;
  }

  
  public int getDaysToConversion() {
    return daysToConversion;
  }

  public void setDaysToConversion(int daysToConversion) {
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

  
  public List<CustomerMoment> getMoments() {
    return moments;
  }

  public void setMoments(List<CustomerMoment> moments) {
    this.moments = moments;
  }

  @Override
  public String toString() {
    return "CustomerJourney{customerOrderIndex='" + customerOrderIndex + "', daysToConversion='" + daysToConversion + "', firstVisit='" + firstVisit + "', lastVisit='" + lastVisit + "', moments='" + moments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerJourney that = (CustomerJourney) o;
    return customerOrderIndex == that.customerOrderIndex &&
        daysToConversion == that.daysToConversion &&
        Objects.equals(firstVisit, that.firstVisit) &&
        Objects.equals(lastVisit, that.lastVisit) &&
        Objects.equals(moments, that.moments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderIndex, daysToConversion, firstVisit, lastVisit, moments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int customerOrderIndex;

    
    private int daysToConversion;

    
    private CustomerVisit firstVisit;

    
    private CustomerVisit lastVisit;

    
    private List<CustomerMoment> moments;

    public CustomerJourney build() {
      CustomerJourney result = new CustomerJourney();
      result.customerOrderIndex = this.customerOrderIndex;
      result.daysToConversion = this.daysToConversion;
      result.firstVisit = this.firstVisit;
      result.lastVisit = this.lastVisit;
      result.moments = this.moments;
      return result;
    }

    
    public Builder customerOrderIndex(int customerOrderIndex) {
      this.customerOrderIndex = customerOrderIndex;
      return this;
    }

    
    public Builder daysToConversion(int daysToConversion) {
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

    
    public Builder moments(List<CustomerMoment> moments) {
      this.moments = moments;
      return this;
    }
  }
}
