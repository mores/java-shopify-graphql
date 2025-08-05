package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The financial transfer details for a return outcome that results in an invoice.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InvoiceReturnOutcome implements ReturnOutcomeFinancialTransfer {
  /**
   * The total monetary value to be invoiced in shop and presentment currencies.
   */
  private MoneyBag amount;

  public InvoiceReturnOutcome() {
  }

  /**
   * The total monetary value to be invoiced in shop and presentment currencies.
   */
  public MoneyBag getAmount() {
    return amount;
  }

  public void setAmount(MoneyBag amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "InvoiceReturnOutcome{amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InvoiceReturnOutcome that = (InvoiceReturnOutcome) o;
    return Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total monetary value to be invoiced in shop and presentment currencies.
     */
    private MoneyBag amount;

    public InvoiceReturnOutcome build() {
      InvoiceReturnOutcome result = new InvoiceReturnOutcome();
      result.amount = this.amount;
      return result;
    }

    /**
     * The total monetary value to be invoiced in shop and presentment currencies.
     */
    public Builder amount(MoneyBag amount) {
      this.amount = amount;
      return this;
    }
  }
}
