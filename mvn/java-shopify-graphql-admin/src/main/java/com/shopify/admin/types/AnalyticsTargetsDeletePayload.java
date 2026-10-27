package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `analyticsTargetsDelete` mutation.
 */
public class AnalyticsTargetsDeletePayload {
  /**
   * The IDs of the deleted analytics targets.
   */
  private List<String> deletedIds;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AnalyticsTargetsDeleteUserError> userErrors;

  public AnalyticsTargetsDeletePayload() {
  }

  /**
   * The IDs of the deleted analytics targets.
   */
  public List<String> getDeletedIds() {
    return deletedIds;
  }

  public void setDeletedIds(List<String> deletedIds) {
    this.deletedIds = deletedIds;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<AnalyticsTargetsDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AnalyticsTargetsDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AnalyticsTargetsDeletePayload{deletedIds='" + deletedIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsTargetsDeletePayload that = (AnalyticsTargetsDeletePayload) o;
    return Objects.equals(deletedIds, that.deletedIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The IDs of the deleted analytics targets.
     */
    private List<String> deletedIds;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AnalyticsTargetsDeleteUserError> userErrors;

    public AnalyticsTargetsDeletePayload build() {
      AnalyticsTargetsDeletePayload result = new AnalyticsTargetsDeletePayload();
      result.deletedIds = this.deletedIds;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The IDs of the deleted analytics targets.
     */
    public Builder deletedIds(List<String> deletedIds) {
      this.deletedIds = deletedIds;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AnalyticsTargetsDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
