package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `analyticsAnnotationDelete` mutation.
 */
public class AnalyticsAnnotationDeletePayload {
  /**
   * The ID of the deleted analytics annotation.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AnalyticsAnnotationDeleteUserError> userErrors;

  public AnalyticsAnnotationDeletePayload() {
  }

  /**
   * The ID of the deleted analytics annotation.
   */
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<AnalyticsAnnotationDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AnalyticsAnnotationDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AnalyticsAnnotationDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsAnnotationDeletePayload that = (AnalyticsAnnotationDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted analytics annotation.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AnalyticsAnnotationDeleteUserError> userErrors;

    public AnalyticsAnnotationDeletePayload build() {
      AnalyticsAnnotationDeletePayload result = new AnalyticsAnnotationDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted analytics annotation.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AnalyticsAnnotationDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
