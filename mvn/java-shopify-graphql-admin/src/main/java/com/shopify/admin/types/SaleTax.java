package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The tax allocated to a sale from a single tax line.
 */
public class SaleTax {
  /**
   * The portion of the total tax amount on the related sale that comes from the associated tax line.
   */
  private MoneyBag amount;

  /**
   * The unique ID for the sale tax.
   */
  private String id;

  /**
   * The tax line associated with the sale.
   */
  private TaxLine taxLine;

  public SaleTax() {
  }

  /**
   * The portion of the total tax amount on the related sale that comes from the associated tax line.
   */
  public MoneyBag getAmount() {
    return amount;
  }

  public void setAmount(MoneyBag amount) {
    this.amount = amount;
  }

  /**
   * The unique ID for the sale tax.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The tax line associated with the sale.
   */
  public TaxLine getTaxLine() {
    return taxLine;
  }

  public void setTaxLine(TaxLine taxLine) {
    this.taxLine = taxLine;
  }

  @Override
  public String toString() {
    return "SaleTax{amount='" + amount + "', id='" + id + "', taxLine='" + taxLine + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SaleTax that = (SaleTax) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(id, that.id) &&
        Objects.equals(taxLine, that.taxLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, id, taxLine);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The portion of the total tax amount on the related sale that comes from the associated tax line.
     */
    private MoneyBag amount;

    /**
     * The unique ID for the sale tax.
     */
    private String id;

    /**
     * The tax line associated with the sale.
     */
    private TaxLine taxLine;

    public SaleTax build() {
      SaleTax result = new SaleTax();
      result.amount = this.amount;
      result.id = this.id;
      result.taxLine = this.taxLine;
      return result;
    }

    /**
     * The portion of the total tax amount on the related sale that comes from the associated tax line.
     */
    public Builder amount(MoneyBag amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The unique ID for the sale tax.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The tax line associated with the sale.
     */
    public Builder taxLine(TaxLine taxLine) {
      this.taxLine = taxLine;
      return this;
    }
  }
}
