package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A payment instrument and the permission
 * the owner of the instrument gives to the merchant to debit it.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PaymentMandate implements com.shopify.admin.types.Node {
  /**
   * The unique ID of a payment mandate.
   */
  private String id;

  /**
   * The outputs details of the payment instrument.
   */
  private PaymentInstrument paymentInstrument;

  public PaymentMandate() {
  }

  /**
   * The unique ID of a payment mandate.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The outputs details of the payment instrument.
   */
  public PaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  @Override
  public String toString() {
    return "PaymentMandate{id='" + id + "', paymentInstrument='" + paymentInstrument + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentMandate that = (PaymentMandate) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(paymentInstrument, that.paymentInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentInstrument);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique ID of a payment mandate.
     */
    private String id;

    /**
     * The outputs details of the payment instrument.
     */
    private PaymentInstrument paymentInstrument;

    public PaymentMandate build() {
      PaymentMandate result = new PaymentMandate();
      result.id = this.id;
      result.paymentInstrument = this.paymentInstrument;
      return result;
    }

    /**
     * The unique ID of a payment mandate.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The outputs details of the payment instrument.
     */
    public Builder paymentInstrument(PaymentInstrument paymentInstrument) {
      this.paymentInstrument = paymentInstrument;
      return this;
    }
  }
}
