package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `appSubscriptionLineItemUpdate` mutation.
 */
public class AppSubscriptionLineItemUpdatePayload {
  /**
   * The updated app subscription.
   */
  private AppSubscription appSubscription;

  /**
   * The URL where the merchant approves or declines the updated app subscription line item.
   */
  private String confirmationUrl;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public AppSubscriptionLineItemUpdatePayload() {
  }

  /**
   * The updated app subscription.
   */
  public AppSubscription getAppSubscription() {
    return appSubscription;
  }

  public void setAppSubscription(AppSubscription appSubscription) {
    this.appSubscription = appSubscription;
  }

  /**
   * The URL where the merchant approves or declines the updated app subscription line item.
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
    return "AppSubscriptionLineItemUpdatePayload{appSubscription='" + appSubscription + "', confirmationUrl='" + confirmationUrl + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionLineItemUpdatePayload that = (AppSubscriptionLineItemUpdatePayload) o;
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
     * The updated app subscription.
     */
    private AppSubscription appSubscription;

    /**
     * The URL where the merchant approves or declines the updated app subscription line item.
     */
    private String confirmationUrl;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public AppSubscriptionLineItemUpdatePayload build() {
      AppSubscriptionLineItemUpdatePayload result = new AppSubscriptionLineItemUpdatePayload();
      result.appSubscription = this.appSubscription;
      result.confirmationUrl = this.confirmationUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated app subscription.
     */
    public Builder appSubscription(AppSubscription appSubscription) {
      this.appSubscription = appSubscription;
      return this;
    }

    /**
     * The URL where the merchant approves or declines the updated app subscription line item.
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
