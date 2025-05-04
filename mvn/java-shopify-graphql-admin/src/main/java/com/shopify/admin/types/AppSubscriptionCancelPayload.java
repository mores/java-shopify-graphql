package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `appSubscriptionCancel` mutation.
 */
public class AppSubscriptionCancelPayload {
  /**
   * The cancelled app subscription.
   */
  private AppSubscription appSubscription;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public AppSubscriptionCancelPayload() {
  }

  /**
   * The cancelled app subscription.
   */
  public AppSubscription getAppSubscription() {
    return appSubscription;
  }

  public void setAppSubscription(AppSubscription appSubscription) {
    this.appSubscription = appSubscription;
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
    return "AppSubscriptionCancelPayload{appSubscription='" + appSubscription + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionCancelPayload that = (AppSubscriptionCancelPayload) o;
    return Objects.equals(appSubscription, that.appSubscription) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appSubscription, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The cancelled app subscription.
     */
    private AppSubscription appSubscription;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public AppSubscriptionCancelPayload build() {
      AppSubscriptionCancelPayload result = new AppSubscriptionCancelPayload();
      result.appSubscription = this.appSubscription;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The cancelled app subscription.
     */
    public Builder appSubscription(AppSubscription appSubscription) {
      this.appSubscription = appSubscription;
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
