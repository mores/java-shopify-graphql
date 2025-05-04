package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents errors returned from apps when using the marketing activity extension.
 */
public class MarketingActivityExtensionAppErrors {
  /**
   * The app error type.
   */
  private MarketingActivityExtensionAppErrorCode code;

  /**
   * The list of errors returned by the app.
   */
  private List<UserError> userErrors;

  public MarketingActivityExtensionAppErrors() {
  }

  /**
   * The app error type.
   */
  public MarketingActivityExtensionAppErrorCode getCode() {
    return code;
  }

  public void setCode(MarketingActivityExtensionAppErrorCode code) {
    this.code = code;
  }

  /**
   * The list of errors returned by the app.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingActivityExtensionAppErrors{code='" + code + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityExtensionAppErrors that = (MarketingActivityExtensionAppErrors) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The app error type.
     */
    private MarketingActivityExtensionAppErrorCode code;

    /**
     * The list of errors returned by the app.
     */
    private List<UserError> userErrors;

    public MarketingActivityExtensionAppErrors build() {
      MarketingActivityExtensionAppErrors result = new MarketingActivityExtensionAppErrors();
      result.code = this.code;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The app error type.
     */
    public Builder code(MarketingActivityExtensionAppErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * The list of errors returned by the app.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
