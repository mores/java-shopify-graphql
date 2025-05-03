package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Cart submit for checkout completion is already accepted.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubmitSuccess implements CartSubmitForCompletionResult {
  /**
   * The ID of the cart completion attempt that will be used for polling for the result.
   */
  private String attemptId;

  /**
   * The url to which the buyer should be redirected after the cart is successfully submitted.
   */
  private String redirectUrl;

  public SubmitSuccess() {
  }

  /**
   * The ID of the cart completion attempt that will be used for polling for the result.
   */
  public String getAttemptId() {
    return attemptId;
  }

  public void setAttemptId(String attemptId) {
    this.attemptId = attemptId;
  }

  /**
   * The url to which the buyer should be redirected after the cart is successfully submitted.
   */
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  @Override
  public String toString() {
    return "SubmitSuccess{attemptId='" + attemptId + "', redirectUrl='" + redirectUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubmitSuccess that = (SubmitSuccess) o;
    return Objects.equals(attemptId, that.attemptId) &&
        Objects.equals(redirectUrl, that.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptId, redirectUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the cart completion attempt that will be used for polling for the result.
     */
    private String attemptId;

    /**
     * The url to which the buyer should be redirected after the cart is successfully submitted.
     */
    private String redirectUrl;

    public SubmitSuccess build() {
      SubmitSuccess result = new SubmitSuccess();
      result.attemptId = this.attemptId;
      result.redirectUrl = this.redirectUrl;
      return result;
    }

    /**
     * The ID of the cart completion attempt that will be used for polling for the result.
     */
    public Builder attemptId(String attemptId) {
      this.attemptId = attemptId;
      return this;
    }

    /**
     * The url to which the buyer should be redirected after the cart is successfully submitted.
     */
    public Builder redirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }
  }
}
