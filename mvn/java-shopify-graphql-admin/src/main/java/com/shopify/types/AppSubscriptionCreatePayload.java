package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `appSubscriptionCreate` mutation.
 */
public class AppSubscriptionCreatePayload {
  /**
   * The newly-created app subscription.
   */
  private AppSubscription appSubscription;

  /**
   * The URL pointing to the page where the merchant approves or declines the charges for an app subscription.
   */
  private String confirmationUrl;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public AppSubscriptionCreatePayload() {
  }

  /**
   * The newly-created app subscription.
   */
  public AppSubscription getAppSubscription() {
    return appSubscription;
  }

  public void setAppSubscription(AppSubscription appSubscription) {
    this.appSubscription = appSubscription;
  }

  /**
   * The URL pointing to the page where the merchant approves or declines the charges for an app subscription.
   */
  public String getConfirmationUrl() {
    return confirmationUrl;
  }

  public void setConfirmationUrl(String confirmationUrl) {
    this.confirmationUrl = confirmationUrl;
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
    return "AppSubscriptionCreatePayload{appSubscription='" + appSubscription + "', confirmationUrl='" + confirmationUrl + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionCreatePayload that = (AppSubscriptionCreatePayload) o;
    return Objects.equals(appSubscription, that.appSubscription) &&
        Objects.equals(confirmationUrl, that.confirmationUrl) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appSubscription, confirmationUrl, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly-created app subscription.
     */
    private AppSubscription appSubscription;

    /**
     * The URL pointing to the page where the merchant approves or declines the charges for an app subscription.
     */
    private String confirmationUrl;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public AppSubscriptionCreatePayload build() {
      AppSubscriptionCreatePayload result = new AppSubscriptionCreatePayload();
      result.appSubscription = this.appSubscription;
      result.confirmationUrl = this.confirmationUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly-created app subscription.
     */
    public Builder appSubscription(AppSubscription appSubscription) {
      this.appSubscription = appSubscription;
      return this;
    }

    /**
     * The URL pointing to the page where the merchant approves or declines the charges for an app subscription.
     */
    public Builder confirmationUrl(String confirmationUrl) {
      this.confirmationUrl = confirmationUrl;
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
