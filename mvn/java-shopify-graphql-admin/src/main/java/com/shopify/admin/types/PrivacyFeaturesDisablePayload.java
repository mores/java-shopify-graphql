package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `privacyFeaturesDisable` mutation.
 */
public class PrivacyFeaturesDisablePayload {
  /**
   * The privacy features that were disabled.
   */
  private List<PrivacyFeaturesEnum> featuresDisabled;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PrivacyFeaturesDisableUserError> userErrors;

  public PrivacyFeaturesDisablePayload() {
  }

  /**
   * The privacy features that were disabled.
   */
  public List<PrivacyFeaturesEnum> getFeaturesDisabled() {
    return featuresDisabled;
  }

  public void setFeaturesDisabled(List<PrivacyFeaturesEnum> featuresDisabled) {
    this.featuresDisabled = featuresDisabled;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PrivacyFeaturesDisableUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PrivacyFeaturesDisableUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PrivacyFeaturesDisablePayload{featuresDisabled='" + featuresDisabled + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivacyFeaturesDisablePayload that = (PrivacyFeaturesDisablePayload) o;
    return Objects.equals(featuresDisabled, that.featuresDisabled) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featuresDisabled, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The privacy features that were disabled.
     */
    private List<PrivacyFeaturesEnum> featuresDisabled;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PrivacyFeaturesDisableUserError> userErrors;

    public PrivacyFeaturesDisablePayload build() {
      PrivacyFeaturesDisablePayload result = new PrivacyFeaturesDisablePayload();
      result.featuresDisabled = this.featuresDisabled;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The privacy features that were disabled.
     */
    public Builder featuresDisabled(List<PrivacyFeaturesEnum> featuresDisabled) {
      this.featuresDisabled = featuresDisabled;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PrivacyFeaturesDisableUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
