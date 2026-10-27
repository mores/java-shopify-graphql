package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `analyticsAnnotationUpdate` mutation.
 */
public class AnalyticsAnnotationUpdatePayload {
  /**
   * The updated analytics annotation.
   */
  private AnalyticsAnnotation analyticsAnnotation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AnalyticsAnnotationUpdateUserError> userErrors;

  public AnalyticsAnnotationUpdatePayload() {
  }

  /**
   * The updated analytics annotation.
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
  public List<AnalyticsAnnotationUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AnalyticsAnnotationUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AnalyticsAnnotationUpdatePayload{analyticsAnnotation='" + analyticsAnnotation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsAnnotationUpdatePayload that = (AnalyticsAnnotationUpdatePayload) o;
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
     * The updated analytics annotation.
     */
    private AnalyticsAnnotation analyticsAnnotation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AnalyticsAnnotationUpdateUserError> userErrors;

    public AnalyticsAnnotationUpdatePayload build() {
      AnalyticsAnnotationUpdatePayload result = new AnalyticsAnnotationUpdatePayload();
      result.analyticsAnnotation = this.analyticsAnnotation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated analytics annotation.
     */
    public Builder analyticsAnnotation(AnalyticsAnnotation analyticsAnnotation) {
      this.analyticsAnnotation = analyticsAnnotation;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AnalyticsAnnotationUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
