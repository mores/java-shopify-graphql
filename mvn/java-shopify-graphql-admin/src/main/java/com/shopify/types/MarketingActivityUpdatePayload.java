package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketingActivityUpdatePayload {
  
  private MarketingActivity marketingActivity;

  
  private String redirectPath;

  
  private List<UserError> userErrors;

  public MarketingActivityUpdatePayload() {
  }

  
  public MarketingActivity getMarketingActivity() {
    return marketingActivity;
  }

  public void setMarketingActivity(MarketingActivity marketingActivity) {
    this.marketingActivity = marketingActivity;
  }

  
  public String getRedirectPath() {
    return redirectPath;
  }

  public void setRedirectPath(String redirectPath) {
    this.redirectPath = redirectPath;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingActivityUpdatePayload{marketingActivity='" + marketingActivity + "', redirectPath='" + redirectPath + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpdatePayload that = (MarketingActivityUpdatePayload) o;
    return Objects.equals(marketingActivity, that.marketingActivity) &&
        Objects.equals(redirectPath, that.redirectPath) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingActivity, redirectPath, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MarketingActivity marketingActivity;

    
    private String redirectPath;

    
    private List<UserError> userErrors;

    public MarketingActivityUpdatePayload build() {
      MarketingActivityUpdatePayload result = new MarketingActivityUpdatePayload();
      result.marketingActivity = this.marketingActivity;
      result.redirectPath = this.redirectPath;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder marketingActivity(MarketingActivity marketingActivity) {
      this.marketingActivity = marketingActivity;
      return this;
    }

    
    public Builder redirectPath(String redirectPath) {
      this.redirectPath = redirectPath;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
