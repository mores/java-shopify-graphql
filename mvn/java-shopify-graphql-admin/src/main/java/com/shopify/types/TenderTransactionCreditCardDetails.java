package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TenderTransactionCreditCardDetails implements TenderTransactionDetails {
  
  private String creditCardCompany;

  
  private String creditCardNumber;

  public TenderTransactionCreditCardDetails() {
  }

  
  public String getCreditCardCompany() {
    return creditCardCompany;
  }

  public void setCreditCardCompany(String creditCardCompany) {
    this.creditCardCompany = creditCardCompany;
  }

  
  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  @Override
  public String toString() {
    return "TenderTransactionCreditCardDetails{creditCardCompany='" + creditCardCompany + "', creditCardNumber='" + creditCardNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TenderTransactionCreditCardDetails that = (TenderTransactionCreditCardDetails) o;
    return Objects.equals(creditCardCompany, that.creditCardCompany) &&
        Objects.equals(creditCardNumber, that.creditCardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardCompany, creditCardNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String creditCardCompany;

    
    private String creditCardNumber;

    public TenderTransactionCreditCardDetails build() {
      TenderTransactionCreditCardDetails result = new TenderTransactionCreditCardDetails();
      result.creditCardCompany = this.creditCardCompany;
      result.creditCardNumber = this.creditCardNumber;
      return result;
    }

    
    public Builder creditCardCompany(String creditCardCompany) {
      this.creditCardCompany = creditCardCompany;
      return this;
    }

    
    public Builder creditCardNumber(String creditCardNumber) {
      this.creditCardNumber = creditCardNumber;
      return this;
    }
  }
}
