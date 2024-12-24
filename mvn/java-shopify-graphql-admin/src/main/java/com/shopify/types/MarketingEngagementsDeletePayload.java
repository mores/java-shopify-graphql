package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketingEngagementsDeletePayload {
  
  private String result;

  
  private List<MarketingActivityUserError> userErrors;

  public MarketingEngagementsDeletePayload() {
  }

  
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  
  public List<MarketingActivityUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketingActivityUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingEngagementsDeletePayload{result='" + result + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEngagementsDeletePayload that = (MarketingEngagementsDeletePayload) o;
    return Objects.equals(result, that.result) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String result;

    
    private List<MarketingActivityUserError> userErrors;

    public MarketingEngagementsDeletePayload build() {
      MarketingEngagementsDeletePayload result = new MarketingEngagementsDeletePayload();
      result.result = this.result;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder result(String result) {
      this.result = result;
      return this;
    }

    
    public Builder userErrors(List<MarketingActivityUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
