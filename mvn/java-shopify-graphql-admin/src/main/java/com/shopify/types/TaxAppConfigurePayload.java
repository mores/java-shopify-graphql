package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class TaxAppConfigurePayload {
  
  private TaxAppConfiguration taxAppConfiguration;

  
  private List<TaxAppConfigureUserError> userErrors;

  public TaxAppConfigurePayload() {
  }

  
  public TaxAppConfiguration getTaxAppConfiguration() {
    return taxAppConfiguration;
  }

  public void setTaxAppConfiguration(TaxAppConfiguration taxAppConfiguration) {
    this.taxAppConfiguration = taxAppConfiguration;
  }

  
  public List<TaxAppConfigureUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<TaxAppConfigureUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "TaxAppConfigurePayload{taxAppConfiguration='" + taxAppConfiguration + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxAppConfigurePayload that = (TaxAppConfigurePayload) o;
    return Objects.equals(taxAppConfiguration, that.taxAppConfiguration) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxAppConfiguration, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private TaxAppConfiguration taxAppConfiguration;

    
    private List<TaxAppConfigureUserError> userErrors;

    public TaxAppConfigurePayload build() {
      TaxAppConfigurePayload result = new TaxAppConfigurePayload();
      result.taxAppConfiguration = this.taxAppConfiguration;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder taxAppConfiguration(TaxAppConfiguration taxAppConfiguration) {
      this.taxAppConfiguration = taxAppConfiguration;
      return this;
    }

    
    public Builder userErrors(List<TaxAppConfigureUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
