package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketRegionDeletePayload {
  
  private String deletedId;

  
  private Market market;

  
  private List<MarketUserError> userErrors;

  public MarketRegionDeletePayload() {
  }

  
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
  }

  
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  
  public List<MarketUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketRegionDeletePayload{deletedId='" + deletedId + "', market='" + market + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRegionDeletePayload that = (MarketRegionDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(market, that.market) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, market, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedId;

    
    private Market market;

    
    private List<MarketUserError> userErrors;

    public MarketRegionDeletePayload build() {
      MarketRegionDeletePayload result = new MarketRegionDeletePayload();
      result.deletedId = this.deletedId;
      result.market = this.market;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    
    public Builder userErrors(List<MarketUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
