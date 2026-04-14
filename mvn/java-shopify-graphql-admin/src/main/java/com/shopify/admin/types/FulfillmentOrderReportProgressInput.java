package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the progress report for the fulfillment order.
 */
public class FulfillmentOrderReportProgressInput {
  /**
   * Additional information for the progress report.
   */
  private String reasonNotes;

  public FulfillmentOrderReportProgressInput() {
  }

  /**
   * Additional information for the progress report.
   */
  public String getReasonNotes() {
    return reasonNotes;
  }

  public void setReasonNotes(String reasonNotes) {
    this.reasonNotes = reasonNotes;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderReportProgressInput{reasonNotes='" + reasonNotes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderReportProgressInput that = (FulfillmentOrderReportProgressInput) o;
    return Objects.equals(reasonNotes, that.reasonNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonNotes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Additional information for the progress report.
     */
    private String reasonNotes;

    public FulfillmentOrderReportProgressInput build() {
      FulfillmentOrderReportProgressInput result = new FulfillmentOrderReportProgressInput();
      result.reasonNotes = this.reasonNotes;
      return result;
    }

    /**
     * Additional information for the progress report.
     */
    public Builder reasonNotes(String reasonNotes) {
      this.reasonNotes = reasonNotes;
      return this;
    }
  }
}
