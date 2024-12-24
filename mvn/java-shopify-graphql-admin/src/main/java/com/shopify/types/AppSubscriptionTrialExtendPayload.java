package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AppSubscriptionTrialExtendPayload {
  
  private AppSubscription appSubscription;

  
  private List<AppSubscriptionTrialExtendUserError> userErrors;

  public AppSubscriptionTrialExtendPayload() {
  }

  
  public AppSubscription getAppSubscription() {
    return appSubscription;
  }

  public void setAppSubscription(AppSubscription appSubscription) {
    this.appSubscription = appSubscription;
  }

  
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
    
    private AppSubscription appSubscription;

    
    private List<AppSubscriptionTrialExtendUserError> userErrors;

    public AppSubscriptionTrialExtendPayload build() {
      AppSubscriptionTrialExtendPayload result = new AppSubscriptionTrialExtendPayload();
      result.appSubscription = this.appSubscription;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder appSubscription(AppSubscription appSubscription) {
      this.appSubscription = appSubscription;
      return this;
    }

    
    public Builder userErrors(List<AppSubscriptionTrialExtendUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
