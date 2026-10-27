package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `analyticsAnnotationCreate` mutation.
 */
public class AnalyticsAnnotationCreatePayload {
  /**
   * The newly created analytics annotation.
   */
  private AnalyticsAnnotation analyticsAnnotation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AnalyticsAnnotationCreateUserError> userErrors;

  public AnalyticsAnnotationCreatePayload() {
  }

  /**
   * The newly created analytics annotation.
   */
  public AnalyticsAnnotation getAnalyticsAnnotation() {
    return analyticsAnnotation;
  }

  public void setAnalyticsAnnotation(AnalyticsAnnotation analyticsAnnotation) {
    this.analyticsAnnotation = analyticsAnnotation;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<AnalyticsAnnotationCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AnalyticsAnnotationCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AnalyticsAnnotationCreatePayload{analyticsAnnotation='" + analyticsAnnotation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsAnnotationCreatePayload that = (AnalyticsAnnotationCreatePayload) o;
    return Objects.equals(analyticsAnnotation, that.analyticsAnnotation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyticsAnnotation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created analytics annotation.
     */
    private AnalyticsAnnotation analyticsAnnotation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AnalyticsAnnotationCreateUserError> userErrors;

    public AnalyticsAnnotationCreatePayload build() {
      AnalyticsAnnotationCreatePayload result = new AnalyticsAnnotationCreatePayload();
      result.analyticsAnnotation = this.analyticsAnnotation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created analytics annotation.
     */
    public Builder analyticsAnnotation(AnalyticsAnnotation analyticsAnnotation) {
      this.analyticsAnnotation = analyticsAnnotation;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AnalyticsAnnotationCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
