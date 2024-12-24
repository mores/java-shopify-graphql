package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketRegionsDeletePayload {
  
  private List<String> deletedIds;

  
  private List<MarketUserError> userErrors;

  public MarketRegionsDeletePayload() {
  }

  
  public List<String> getDeletedIds() {
    return deletedIds;
  }

  public void setDeletedIds(List<String> deletedIds) {
    this.deletedIds = deletedIds;
  }

  
  public List<MarketUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketRegionsDeletePayload{deletedIds='" + deletedIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRegionsDeletePayload that = (MarketRegionsDeletePayload) o;
    return Objects.equals(deletedIds, that.deletedIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> deletedIds;

    
    private List<MarketUserError> userErrors;

    public MarketRegionsDeletePayload build() {
      MarketRegionsDeletePayload result = new MarketRegionsDeletePayload();
      result.deletedIds = this.deletedIds;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedIds(List<String> deletedIds) {
      this.deletedIds = deletedIds;
      return this;
    }

    
    public Builder userErrors(List<MarketUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
