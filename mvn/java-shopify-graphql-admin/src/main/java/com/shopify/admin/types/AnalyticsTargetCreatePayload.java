package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `analyticsTargetCreate` mutation.
 */
public class AnalyticsTargetCreatePayload {
  /**
   * The newly created [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
   */
  private AnalyticsTarget analyticsTarget;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AnalyticsTargetCreateUserError> userErrors;

  public AnalyticsTargetCreatePayload() {
  }

  /**
   * The newly created [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
   */
  public AnalyticsTarget getAnalyticsTarget() {
    return analyticsTarget;
  }

  public void setAnalyticsTarget(AnalyticsTarget analyticsTarget) {
    this.analyticsTarget = analyticsTarget;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<AnalyticsTargetCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AnalyticsTargetCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AnalyticsTargetCreatePayload{analyticsTarget='" + analyticsTarget + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsTargetCreatePayload that = (AnalyticsTargetCreatePayload) o;
    return Objects.equals(analyticsTarget, that.analyticsTarget) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyticsTarget, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
     */
    private AnalyticsTarget analyticsTarget;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AnalyticsTargetCreateUserError> userErrors;

    public AnalyticsTargetCreatePayload build() {
      AnalyticsTargetCreatePayload result = new AnalyticsTargetCreatePayload();
      result.analyticsTarget = this.analyticsTarget;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
     */
    public Builder analyticsTarget(AnalyticsTarget analyticsTarget) {
      this.analyticsTarget = analyticsTarget;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AnalyticsTargetCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
