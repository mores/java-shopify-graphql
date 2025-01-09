package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `bulkOperationCancel` mutation.
 */
public class BulkOperationCancelPayload {
  /**
   * The bulk operation to be canceled.
   */
  private BulkOperation bulkOperation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public BulkOperationCancelPayload() {
  }

  /**
   * The bulk operation to be canceled.
   */
  public BulkOperation getBulkOperation() {
    return bulkOperation;
  }

  public void setBulkOperation(BulkOperation bulkOperation) {
    this.bulkOperation = bulkOperation;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "BulkOperationCancelPayload{bulkOperation='" + bulkOperation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BulkOperationCancelPayload that = (BulkOperationCancelPayload) o;
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
    /**
     * The bulk operation to be canceled.
     */
    private BulkOperation bulkOperation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public BulkOperationCancelPayload build() {
      BulkOperationCancelPayload result = new BulkOperationCancelPayload();
      result.bulkOperation = this.bulkOperation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The bulk operation to be canceled.
     */
    public Builder bulkOperation(BulkOperation bulkOperation) {
      this.bulkOperation = bulkOperation;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
