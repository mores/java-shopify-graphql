package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PaymentMandate implements com.shopify.types.Node {
  
  private String id;

  
  private PaymentInstrument paymentInstrument;

  public PaymentMandate() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
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
    
    private String id;

    
    private PaymentInstrument paymentInstrument;

    public PaymentMandate build() {
      PaymentMandate result = new PaymentMandate();
      result.id = this.id;
      result.paymentInstrument = this.paymentInstrument;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder paymentInstrument(PaymentInstrument paymentInstrument) {
      this.paymentInstrument = paymentInstrument;
      return this;
    }
  }
}
