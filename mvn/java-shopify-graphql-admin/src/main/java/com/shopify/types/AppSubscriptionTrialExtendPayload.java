package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `appSubscriptionTrialExtend` mutation.
 */
public class AppSubscriptionTrialExtendPayload {
  /**
   * The app subscription that had its trial extended.
   */
  private AppSubscription appSubscription;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<AppSubscriptionTrialExtendUserError> userErrors;

  public AppSubscriptionTrialExtendPayload() {
  }

  /**
   * The app subscription that had its trial extended.
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
  public List<AppSubscriptionTrialExtendUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AppSubscriptionTrialExtendUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AppSubscriptionTrialExtendPayload{appSubscription='" + appSubscription + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionTrialExtendPayload that = (AppSubscriptionTrialExtendPayload) o;
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
     * The app subscription that had its trial extended.
     */
    private AppSubscription appSubscription;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<AppSubscriptionTrialExtendUserError> userErrors;

    public AppSubscriptionTrialExtendPayload build() {
      AppSubscriptionTrialExtendPayload result = new AppSubscriptionTrialExtendPayload();
      result.appSubscription = this.appSubscription;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The app subscription that had its trial extended.
     */
    public Builder appSubscription(AppSubscription appSubscription) {
      this.appSubscription = appSubscription;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<AppSubscriptionTrialExtendUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
