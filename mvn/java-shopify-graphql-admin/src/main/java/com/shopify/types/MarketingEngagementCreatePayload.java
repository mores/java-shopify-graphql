package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketingEngagementCreatePayload {
  
  private MarketingEngagement marketingEngagement;

  
  private List<MarketingActivityUserError> userErrors;

  public MarketingEngagementCreatePayload() {
  }

  
  public MarketingEngagement getMarketingEngagement() {
    return marketingEngagement;
  }

  public void setMarketingEngagement(MarketingEngagement marketingEngagement) {
    this.marketingEngagement = marketingEngagement;
  }

  
  public List<MarketingActivityUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketingActivityUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingEngagementCreatePayload{marketingEngagement='" + marketingEngagement + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEngagementCreatePayload that = (MarketingEngagementCreatePayload) o;
    return Objects.equals(marketingEngagement, that.marketingEngagement) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingEngagement, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MarketingEngagement marketingEngagement;

    
    private List<MarketingActivityUserError> userErrors;

    public MarketingEngagementCreatePayload build() {
      MarketingEngagementCreatePayload result = new MarketingEngagementCreatePayload();
      result.marketingEngagement = this.marketingEngagement;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder marketingEngagement(MarketingEngagement marketingEngagement) {
      this.marketingEngagement = marketingEngagement;
      return this;
    }

    
    public Builder userErrors(List<MarketingActivityUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
