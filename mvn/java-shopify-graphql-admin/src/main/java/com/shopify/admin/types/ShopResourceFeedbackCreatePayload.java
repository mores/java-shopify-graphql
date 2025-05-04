package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shopResourceFeedbackCreate` mutation.
 */
public class ShopResourceFeedbackCreatePayload {
  /**
   * The shop feedback that's created.
   */
  private AppFeedback feedback;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ShopResourceFeedbackCreateUserError> userErrors;

  public ShopResourceFeedbackCreatePayload() {
  }

  /**
   * The shop feedback that's created.
   */
  public AppFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(AppFeedback feedback) {
    this.feedback = feedback;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ShopResourceFeedbackCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ShopResourceFeedbackCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShopResourceFeedbackCreatePayload{feedback='" + feedback + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopResourceFeedbackCreatePayload that = (ShopResourceFeedbackCreatePayload) o;
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
     * The shop feedback that's created.
     */
    private AppFeedback feedback;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ShopResourceFeedbackCreateUserError> userErrors;

    public ShopResourceFeedbackCreatePayload build() {
      ShopResourceFeedbackCreatePayload result = new ShopResourceFeedbackCreatePayload();
      result.feedback = this.feedback;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The shop feedback that's created.
     */
    public Builder feedback(AppFeedback feedback) {
      this.feedback = feedback;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ShopResourceFeedbackCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
