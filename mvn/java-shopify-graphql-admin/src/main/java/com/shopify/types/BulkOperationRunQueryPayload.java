package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class BulkOperationRunQueryPayload {
  
  private BulkOperation bulkOperation;

  
  private List<UserError> userErrors;

  public BulkOperationRunQueryPayload() {
  }

  
  public BulkOperation getBulkOperation() {
    return bulkOperation;
  }

  public void setBulkOperation(BulkOperation bulkOperation) {
    this.bulkOperation = bulkOperation;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "BulkOperationRunQueryPayload{bulkOperation='" + bulkOperation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BulkOperationRunQueryPayload that = (BulkOperationRunQueryPayload) o;
    return Objects.equals(bulkOperation, that.bulkOperation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOperation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private BulkOperation bulkOperation;

    
    private List<UserError> userErrors;

    public BulkOperationRunQueryPayload build() {
      BulkOperationRunQueryPayload result = new BulkOperationRunQueryPayload();
      result.bulkOperation = this.bulkOperation;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder bulkOperation(BulkOperation bulkOperation) {
      this.bulkOperation = bulkOperation;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
