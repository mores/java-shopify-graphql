package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `bulkProductResourceFeedbackCreate` mutation.
 */
public class BulkProductResourceFeedbackCreatePayload {
  /**
   * The feedback that's created.
   */
  private List<ProductResourceFeedback> feedback;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BulkProductResourceFeedbackCreateUserError> userErrors;

  public BulkProductResourceFeedbackCreatePayload() {
  }

  /**
   * The feedback that's created.
   */
  public List<ProductResourceFeedback> getFeedback() {
    return feedback;
  }

  public void setFeedback(List<ProductResourceFeedback> feedback) {
    this.feedback = feedback;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<BulkProductResourceFeedbackCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BulkProductResourceFeedbackCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "BulkProductResourceFeedbackCreatePayload{feedback='" + feedback + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BulkProductResourceFeedbackCreatePayload that = (BulkProductResourceFeedbackCreatePayload) o;
    return Objects.equals(feedback, that.feedback) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedback, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The feedback that's created.
     */
    private List<ProductResourceFeedback> feedback;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BulkProductResourceFeedbackCreateUserError> userErrors;

    public BulkProductResourceFeedbackCreatePayload build() {
      BulkProductResourceFeedbackCreatePayload result = new BulkProductResourceFeedbackCreatePayload();
      result.feedback = this.feedback;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The feedback that's created.
     */
    public Builder feedback(List<ProductResourceFeedback> feedback) {
      this.feedback = feedback;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<BulkProductResourceFeedbackCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
