package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AppPurchaseOneTimeCreatePayload {
  
  private AppPurchaseOneTime appPurchaseOneTime;

  
  private String confirmationUrl;

  
  private List<UserError> userErrors;

  public AppPurchaseOneTimeCreatePayload() {
  }

  
  public AppPurchaseOneTime getAppPurchaseOneTime() {
    return appPurchaseOneTime;
  }

  public void setAppPurchaseOneTime(AppPurchaseOneTime appPurchaseOneTime) {
    this.appPurchaseOneTime = appPurchaseOneTime;
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
    return "AppPurchaseOneTimeCreatePayload{appPurchaseOneTime='" + appPurchaseOneTime + "', confirmationUrl='" + confirmationUrl + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppPurchaseOneTimeCreatePayload that = (AppPurchaseOneTimeCreatePayload) o;
    return Objects.equals(appPurchaseOneTime, that.appPurchaseOneTime) &&
        Objects.equals(confirmationUrl, that.confirmationUrl) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPurchaseOneTime, confirmationUrl, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private AppPurchaseOneTime appPurchaseOneTime;

    
    private String confirmationUrl;

    
    private List<UserError> userErrors;

    public AppPurchaseOneTimeCreatePayload build() {
      AppPurchaseOneTimeCreatePayload result = new AppPurchaseOneTimeCreatePayload();
      result.appPurchaseOneTime = this.appPurchaseOneTime;
      result.confirmationUrl = this.confirmationUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder appPurchaseOneTime(AppPurchaseOneTime appPurchaseOneTime) {
      this.appPurchaseOneTime = appPurchaseOneTime;
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
