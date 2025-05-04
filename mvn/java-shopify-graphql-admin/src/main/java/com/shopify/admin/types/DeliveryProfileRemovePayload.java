package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `deliveryProfileRemove` mutation.
 */
public class DeliveryProfileRemovePayload {
  /**
   * The delivery profile deletion job triggered by the mutation.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public DeliveryProfileRemovePayload() {
  }

  /**
   * The delivery profile deletion job triggered by the mutation.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
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
    return "DeliveryProfileRemovePayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProfileRemovePayload that = (DeliveryProfileRemovePayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The delivery profile deletion job triggered by the mutation.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public DeliveryProfileRemovePayload build() {
      DeliveryProfileRemovePayload result = new DeliveryProfileRemovePayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The delivery profile deletion job triggered by the mutation.
     */
    public Builder job(Job job) {
      this.job = job;
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
