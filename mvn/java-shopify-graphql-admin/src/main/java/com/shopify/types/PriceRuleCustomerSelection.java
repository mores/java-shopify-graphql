package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PriceRuleCustomerSelection {
  
  private CustomerConnection customers;

  
  private boolean forAllCustomers;

  
  private List<Segment> segments;

  public PriceRuleCustomerSelection() {
  }

  
  public CustomerConnection getCustomers() {
    return customers;
  }

  public void setCustomers(CustomerConnection customers) {
    this.customers = customers;
  }

  
  public boolean getForAllCustomers() {
    return forAllCustomers;
  }

  public void setForAllCustomers(boolean forAllCustomers) {
    this.forAllCustomers = forAllCustomers;
  }

  
  public List<Segment> getSegments() {
    return segments;
  }

  public void setSegments(List<Segment> segments) {
    this.segments = segments;
  }

  @Override
  public String toString() {
    return "PriceRuleCustomerSelection{customers='" + customers + "', forAllCustomers='" + forAllCustomers + "', segments='" + segments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleCustomerSelection that = (PriceRuleCustomerSelection) o;
    return Objects.equals(customers, that.customers) &&
        forAllCustomers == that.forAllCustomers &&
        Objects.equals(segments, that.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers, forAllCustomers, segments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerConnection customers;

    
    private boolean forAllCustomers;

    
    private List<Segment> segments;

    public PriceRuleCustomerSelection build() {
      PriceRuleCustomerSelection result = new PriceRuleCustomerSelection();
      result.customers = this.customers;
      result.forAllCustomers = this.forAllCustomers;
      result.segments = this.segments;
      return result;
    }

    
    public Builder customers(CustomerConnection customers) {
      this.customers = customers;
      return this;
    }

    
    public Builder forAllCustomers(boolean forAllCustomers) {
      this.forAllCustomers = forAllCustomers;
      return this;
    }

    
    public Builder segments(List<Segment> segments) {
      this.segments = segments;
      return this;
    }
  }
}
