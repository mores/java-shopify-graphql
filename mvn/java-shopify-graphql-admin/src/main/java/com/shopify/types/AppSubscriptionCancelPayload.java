package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AppSubscriptionCancelPayload {
  
  private AppSubscription appSubscription;

  
  private List<UserError> userErrors;

  public AppSubscriptionCancelPayload() {
  }

  
  public AppSubscription getAppSubscription() {
    return appSubscription;
  }

  public void setAppSubscription(AppSubscription appSubscription) {
    this.appSubscription = appSubscription;
  }

  
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
    
    private AppSubscription appSubscription;

    
    private List<UserError> userErrors;

    public AppSubscriptionCancelPayload build() {
      AppSubscriptionCancelPayload result = new AppSubscriptionCancelPayload();
      result.appSubscription = this.appSubscription;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder appSubscription(AppSubscription appSubscription) {
      this.appSubscription = appSubscription;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
