package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AppSubscriptionLineItemUpdatePayload {
  
  private AppSubscription appSubscription;

  
  private String confirmationUrl;

  
  private List<UserError> userErrors;

  public AppSubscriptionLineItemUpdatePayload() {
  }

  
  public AppSubscription getAppSubscription() {
    return appSubscription;
  }

  public void setAppSubscription(AppSubscription appSubscription) {
    this.appSubscription = appSubscription;
  }

  
  public String getConfirmationUrl() {
    return confirmationUrl;
  }

  public void setConfirmationUrl(String confirmationUrl) {
    this.confirmationUrl = confirmationUrl;
  }

  
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
    
    private AppSubscription appSubscription;

    
    private String confirmationUrl;

    
    private List<UserError> userErrors;

    public AppSubscriptionLineItemUpdatePayload build() {
      AppSubscriptionLineItemUpdatePayload result = new AppSubscriptionLineItemUpdatePayload();
      result.appSubscription = this.appSubscription;
      result.confirmationUrl = this.confirmationUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder appSubscription(AppSubscription appSubscription) {
      this.appSubscription = appSubscription;
      return this;
    }

    
    public Builder confirmationUrl(String confirmationUrl) {
      this.confirmationUrl = confirmationUrl;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
