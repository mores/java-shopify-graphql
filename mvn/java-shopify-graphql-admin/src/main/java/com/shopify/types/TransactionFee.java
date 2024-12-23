package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Transaction fee related to an order transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TransactionFee implements com.shopify.types.Node {
  /**
   * Amount of the fee.
   */
  private MoneyV2 amount;

  /**
   * Flat rate charge for a transaction.
   */
  private MoneyV2 flatFee;

  /**
   * Name of the credit card flat fee.
   */
  private String flatFeeName;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Percentage charge.
   */
  private String rate;

  /**
   * Name of the credit card rate.
   */
  private String rateName;

  /**
   * Tax amount charged on the fee.
   */
  private MoneyV2 taxAmount;

  /**
   * Name of the type of fee.
   */
  private String type;

  public TransactionFee() {
  }

  /**
   * Amount of the fee.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * Flat rate charge for a transaction.
   */
  public MoneyV2 getFlatFee() {
    return flatFee;
  }

  public void setFlatFee(MoneyV2 flatFee) {
    this.flatFee = flatFee;
  }

  /**
   * Name of the credit card flat fee.
   */
  public String getFlatFeeName() {
    return flatFeeName;
  }

  public void setFlatFeeName(String flatFeeName) {
    this.flatFeeName = flatFeeName;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Percentage charge.
   */
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * Name of the credit card rate.
   */
  public String getRateName() {
    return rateName;
  }

  public void setRateName(String rateName) {
    this.rateName = rateName;
  }

  /**
   * Tax amount charged on the fee.
   */
  public MoneyV2 getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(MoneyV2 taxAmount) {
    this.taxAmount = taxAmount;
  }

  /**
   * Name of the type of fee.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "TransactionFee{amount='" + amount + "', flatFee='" + flatFee + "', flatFeeName='" + flatFeeName + "', id='" + id + "', rate='" + rate + "', rateName='" + rateName + "', taxAmount='" + taxAmount + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransactionFee that = (TransactionFee) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(flatFee, that.flatFee) &&
        Objects.equals(flatFeeName, that.flatFeeName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(rate, that.rate) &&
        Objects.equals(rateName, that.rateName) &&
        Objects.equals(taxAmount, that.taxAmount) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, flatFee, flatFeeName, id, rate, rateName, taxAmount, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Amount of the fee.
     */
    private MoneyV2 amount;

    /**
     * Flat rate charge for a transaction.
     */
    private MoneyV2 flatFee;

    /**
     * Name of the credit card flat fee.
     */
    private String flatFeeName;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Percentage charge.
     */
    private String rate;

    /**
     * Name of the credit card rate.
     */
    private String rateName;

    /**
     * Tax amount charged on the fee.
     */
    private MoneyV2 taxAmount;

    /**
     * Name of the type of fee.
     */
    private String type;

    public TransactionFee build() {
      TransactionFee result = new TransactionFee();
      result.amount = this.amount;
      result.flatFee = this.flatFee;
      result.flatFeeName = this.flatFeeName;
      result.id = this.id;
      result.rate = this.rate;
      result.rateName = this.rateName;
      result.taxAmount = this.taxAmount;
      result.type = this.type;
      return result;
    }

    /**
     * Amount of the fee.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Flat rate charge for a transaction.
     */
    public Builder flatFee(MoneyV2 flatFee) {
      this.flatFee = flatFee;
      return this;
    }

    /**
     * Name of the credit card flat fee.
     */
    public Builder flatFeeName(String flatFeeName) {
      this.flatFeeName = flatFeeName;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Percentage charge.
     */
    public Builder rate(String rate) {
      this.rate = rate;
      return this;
    }

    /**
     * Name of the credit card rate.
     */
    public Builder rateName(String rateName) {
      this.rateName = rateName;
      return this;
    }

    /**
     * Tax amount charged on the fee.
     */
    public Builder taxAmount(MoneyV2 taxAmount) {
      this.taxAmount = taxAmount;
      return this;
    }

    /**
     * Name of the type of fee.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
