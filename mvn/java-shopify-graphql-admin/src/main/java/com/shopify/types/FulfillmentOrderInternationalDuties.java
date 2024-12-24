package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentOrderInternationalDuties {
  
  private String incoterm;

  public FulfillmentOrderInternationalDuties() {
  }

  
  public String getIncoterm() {
    return incoterm;
  }

  public void setIncoterm(String incoterm) {
    this.incoterm = incoterm;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderInternationalDuties{incoterm='" + incoterm + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderInternationalDuties that = (FulfillmentOrderInternationalDuties) o;
    return Objects.equals(incoterm, that.incoterm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incoterm);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String incoterm;

    public FulfillmentOrderInternationalDuties build() {
      FulfillmentOrderInternationalDuties result = new FulfillmentOrderInternationalDuties();
      result.incoterm = this.incoterm;
      return result;
    }

    
    public Builder incoterm(String incoterm) {
      this.incoterm = incoterm;
      return this;
    }
  }
}
