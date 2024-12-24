package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketingActivityExtensionAppErrors {
  
  private MarketingActivityExtensionAppErrorCode code;

  
  private List<UserError> userErrors;

  public MarketingActivityExtensionAppErrors() {
  }

  
  public MarketingActivityExtensionAppErrorCode getCode() {
    return code;
  }

  public void setCode(MarketingActivityExtensionAppErrorCode code) {
    this.code = code;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingActivityExtensionAppErrors{code='" + code + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityExtensionAppErrors that = (MarketingActivityExtensionAppErrors) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MarketingActivityExtensionAppErrorCode code;

    
    private List<UserError> userErrors;

    public MarketingActivityExtensionAppErrors build() {
      MarketingActivityExtensionAppErrors result = new MarketingActivityExtensionAppErrors();
      result.code = this.code;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder code(MarketingActivityExtensionAppErrorCode code) {
      this.code = code;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
