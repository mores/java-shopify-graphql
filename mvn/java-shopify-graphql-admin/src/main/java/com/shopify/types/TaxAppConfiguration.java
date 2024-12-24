package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class TaxAppConfiguration {
  
  private TaxPartnerState state;

  public TaxAppConfiguration() {
  }

  
  public TaxPartnerState getState() {
    return state;
  }

  public void setState(TaxPartnerState state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "TaxAppConfiguration{state='" + state + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxAppConfiguration that = (TaxAppConfiguration) o;
    return Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private TaxPartnerState state;

    public TaxAppConfiguration build() {
      TaxAppConfiguration result = new TaxAppConfiguration();
      result.state = this.state;
      return result;
    }

    
    public Builder state(TaxPartnerState state) {
      this.state = state;
      return this;
    }
  }
}
