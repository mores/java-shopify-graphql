package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The calculated financial outcome of a requested order edit based on the line items requested for editing.
 */
public class CalculatedRequestedOrderEdit {
  /**
   * A breakdown of the monetary values for the calculated edit.
   */
  private RequestedOrderEditFinancialSummary financialSummary;

  /**
   * The line item changes being processed for a requested order edit, grouped by the type of change.
   */
  private CalculatedRequestedOrderEditLineItems lineItems;

  public CalculatedRequestedOrderEdit() {
  }

  /**
   * A breakdown of the monetary values for the calculated edit.
   */
  public RequestedOrderEditFinancialSummary getFinancialSummary() {
    return financialSummary;
  }

  public void setFinancialSummary(RequestedOrderEditFinancialSummary financialSummary) {
    this.financialSummary = financialSummary;
  }

  /**
   * The line item changes being processed for a requested order edit, grouped by the type of change.
   */
  public CalculatedRequestedOrderEditLineItems getLineItems() {
    return lineItems;
  }

  public void setLineItems(CalculatedRequestedOrderEditLineItems lineItems) {
    this.lineItems = lineItems;
  }

  @Override
  public String toString() {
    return "CalculatedRequestedOrderEdit{financialSummary='" + financialSummary + "', lineItems='" + lineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedRequestedOrderEdit that = (CalculatedRequestedOrderEdit) o;
    return Objects.equals(financialSummary, that.financialSummary) &&
        Objects.equals(lineItems, that.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialSummary, lineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A breakdown of the monetary values for the calculated edit.
     */
    private RequestedOrderEditFinancialSummary financialSummary;

    /**
     * The line item changes being processed for a requested order edit, grouped by the type of change.
     */
    private CalculatedRequestedOrderEditLineItems lineItems;

    public CalculatedRequestedOrderEdit build() {
      CalculatedRequestedOrderEdit result = new CalculatedRequestedOrderEdit();
      result.financialSummary = this.financialSummary;
      result.lineItems = this.lineItems;
      return result;
    }

    /**
     * A breakdown of the monetary values for the calculated edit.
     */
    public Builder financialSummary(RequestedOrderEditFinancialSummary financialSummary) {
      this.financialSummary = financialSummary;
      return this;
    }

    /**
     * The line item changes being processed for a requested order edit, grouped by the type of change.
     */
    public Builder lineItems(CalculatedRequestedOrderEditLineItems lineItems) {
      this.lineItems = lineItems;
      return this;
    }
  }
}
