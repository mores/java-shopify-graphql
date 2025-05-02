package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The action for the 3DS payment redirect.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompletePaymentChallenge implements CartCompletionAction {
  /**
   * The URL for the 3DS payment redirect.
   */
  private String redirectUrl;

  public CompletePaymentChallenge() {
  }

  /**
   * The URL for the 3DS payment redirect.
   */
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  @Override
  public String toString() {
    return "CompletePaymentChallenge{redirectUrl='" + redirectUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompletePaymentChallenge that = (CompletePaymentChallenge) o;
    return Objects.equals(redirectUrl, that.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL for the 3DS payment redirect.
     */
    private String redirectUrl;

    public CompletePaymentChallenge build() {
      CompletePaymentChallenge result = new CompletePaymentChallenge();
      result.redirectUrl = this.redirectUrl;
      return result;
    }

    /**
     * The URL for the 3DS payment redirect.
     */
    public Builder redirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }
  }
}
