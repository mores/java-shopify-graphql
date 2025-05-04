package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The international duties relevant to a fulfillment order.
 */
public class FulfillmentOrderInternationalDuties {
  /**
   * The method of duties payment. Example values: `DDP`, `DAP`.
   */
  private String incoterm;

  public FulfillmentOrderInternationalDuties() {
  }

  /**
   * The method of duties payment. Example values: `DDP`, `DAP`.
   */
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
    /**
     * The method of duties payment. Example values: `DDP`, `DAP`.
     */
    private String incoterm;

    public FulfillmentOrderInternationalDuties build() {
      FulfillmentOrderInternationalDuties result = new FulfillmentOrderInternationalDuties();
      result.incoterm = this.incoterm;
      return result;
    }

    /**
     * The method of duties payment. Example values: `DDP`, `DAP`.
     */
    public Builder incoterm(String incoterm) {
      this.incoterm = incoterm;
      return this;
    }
  }
}
