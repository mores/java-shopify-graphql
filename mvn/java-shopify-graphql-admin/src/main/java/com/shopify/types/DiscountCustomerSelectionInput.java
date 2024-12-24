package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCustomerSelectionInput {
  
  private Boolean all;

  
  private DiscountCustomersInput customers;

  
  private DiscountCustomerSegmentsInput customerSegments;

  public DiscountCustomerSelectionInput() {
  }

  
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }

  
  public DiscountCustomersInput getCustomers() {
    return customers;
  }

  public void setCustomers(DiscountCustomersInput customers) {
    this.customers = customers;
  }

  
  public DiscountCustomerSegmentsInput getCustomerSegments() {
    return customerSegments;
  }

  public void setCustomerSegments(DiscountCustomerSegmentsInput customerSegments) {
    this.customerSegments = customerSegments;
  }

  @Override
  public String toString() {
    return "DiscountCustomerSelectionInput{all='" + all + "', customers='" + customers + "', customerSegments='" + customerSegments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerSelectionInput that = (DiscountCustomerSelectionInput) o;
    return Objects.equals(all, that.all) &&
        Objects.equals(customers, that.customers) &&
        Objects.equals(customerSegments, that.customerSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, customers, customerSegments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean all;

    
    private DiscountCustomersInput customers;

    
    private DiscountCustomerSegmentsInput customerSegments;

    public DiscountCustomerSelectionInput build() {
      DiscountCustomerSelectionInput result = new DiscountCustomerSelectionInput();
      result.all = this.all;
      result.customers = this.customers;
      result.customerSegments = this.customerSegments;
      return result;
    }

    
    public Builder all(Boolean all) {
      this.all = all;
      return this;
    }

    
    public Builder customers(DiscountCustomersInput customers) {
      this.customers = customers;
      return this;
    }

    
    public Builder customerSegments(DiscountCustomerSegmentsInput customerSegments) {
      this.customerSegments = customerSegments;
      return this;
    }
  }
}
