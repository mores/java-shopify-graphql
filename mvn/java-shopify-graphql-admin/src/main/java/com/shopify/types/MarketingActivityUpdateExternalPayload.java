package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketingActivityUpdateExternalPayload {
  
  private MarketingActivity marketingActivity;

  
  private List<MarketingActivityUserError> userErrors;

  public MarketingActivityUpdateExternalPayload() {
  }

  
  public MarketingActivity getMarketingActivity() {
    return marketingActivity;
  }

  public void setMarketingActivity(MarketingActivity marketingActivity) {
    this.marketingActivity = marketingActivity;
  }

  
  public List<MarketingActivityUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketingActivityUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingActivityUpdateExternalPayload{marketingActivity='" + marketingActivity + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpdateExternalPayload that = (MarketingActivityUpdateExternalPayload) o;
    return Objects.equals(marketingActivity, that.marketingActivity) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingActivity, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MarketingActivity marketingActivity;

    
    private List<MarketingActivityUserError> userErrors;

    public MarketingActivityUpdateExternalPayload build() {
      MarketingActivityUpdateExternalPayload result = new MarketingActivityUpdateExternalPayload();
      result.marketingActivity = this.marketingActivity;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder marketingActivity(MarketingActivity marketingActivity) {
      this.marketingActivity = marketingActivity;
      return this;
    }

    
    public Builder userErrors(List<MarketingActivityUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
