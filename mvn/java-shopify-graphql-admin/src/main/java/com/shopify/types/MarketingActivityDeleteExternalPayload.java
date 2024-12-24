package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketingActivityDeleteExternalPayload {
  
  private String deletedMarketingActivityId;

  
  private List<MarketingActivityUserError> userErrors;

  public MarketingActivityDeleteExternalPayload() {
  }

  
  public String getDeletedMarketingActivityId() {
    return deletedMarketingActivityId;
  }

  public void setDeletedMarketingActivityId(String deletedMarketingActivityId) {
    this.deletedMarketingActivityId = deletedMarketingActivityId;
  }

  
  public List<MarketingActivityUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketingActivityUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingActivityDeleteExternalPayload{deletedMarketingActivityId='" + deletedMarketingActivityId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityDeleteExternalPayload that = (MarketingActivityDeleteExternalPayload) o;
    return Objects.equals(deletedMarketingActivityId, that.deletedMarketingActivityId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMarketingActivityId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedMarketingActivityId;

    
    private List<MarketingActivityUserError> userErrors;

    public MarketingActivityDeleteExternalPayload build() {
      MarketingActivityDeleteExternalPayload result = new MarketingActivityDeleteExternalPayload();
      result.deletedMarketingActivityId = this.deletedMarketingActivityId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedMarketingActivityId(String deletedMarketingActivityId) {
      this.deletedMarketingActivityId = deletedMarketingActivityId;
      return this;
    }

    
    public Builder userErrors(List<MarketingActivityUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
