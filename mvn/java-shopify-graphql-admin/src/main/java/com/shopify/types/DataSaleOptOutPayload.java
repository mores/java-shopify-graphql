package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DataSaleOptOutPayload {
  
  private String customerId;

  
  private List<DataSaleOptOutUserError> userErrors;

  public DataSaleOptOutPayload() {
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public List<DataSaleOptOutUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DataSaleOptOutUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DataSaleOptOutPayload{customerId='" + customerId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataSaleOptOutPayload that = (DataSaleOptOutPayload) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerId;

    
    private List<DataSaleOptOutUserError> userErrors;

    public DataSaleOptOutPayload build() {
      DataSaleOptOutPayload result = new DataSaleOptOutPayload();
      result.customerId = this.customerId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    
    public Builder userErrors(List<DataSaleOptOutUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
