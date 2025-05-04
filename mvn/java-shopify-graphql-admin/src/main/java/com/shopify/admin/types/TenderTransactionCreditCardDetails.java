package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Information about the credit card used for this transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TenderTransactionCreditCardDetails implements TenderTransactionDetails {
  /**
   * The name of the company that issued the customer's credit card. Example: `Visa`.
   */
  private String creditCardCompany;

  /**
   * The customer's credit card number, with all digits except the last 4 redacted. Example: `•••• •••• •••• 1234`
   */
  private String creditCardNumber;

  public TenderTransactionCreditCardDetails() {
  }

  /**
   * The name of the company that issued the customer's credit card. Example: `Visa`.
   */
  public String getCreditCardCompany() {
    return creditCardCompany;
  }

  public void setCreditCardCompany(String creditCardCompany) {
    this.creditCardCompany = creditCardCompany;
  }

  /**
   * The customer's credit card number, with all digits except the last 4 redacted. Example: `•••• •••• •••• 1234`
   */
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
    /**
     * The name of the company that issued the customer's credit card. Example: `Visa`.
     */
    private String creditCardCompany;

    /**
     * The customer's credit card number, with all digits except the last 4 redacted. Example: `•••• •••• •••• 1234`
     */
    private String creditCardNumber;

    public TenderTransactionCreditCardDetails build() {
      TenderTransactionCreditCardDetails result = new TenderTransactionCreditCardDetails();
      result.creditCardCompany = this.creditCardCompany;
      result.creditCardNumber = this.creditCardNumber;
      return result;
    }

    /**
     * The name of the company that issued the customer's credit card. Example: `Visa`.
     */
    public Builder creditCardCompany(String creditCardCompany) {
      this.creditCardCompany = creditCardCompany;
      return this;
    }

    /**
     * The customer's credit card number, with all digits except the last 4 redacted. Example: `•••• •••• •••• 1234`
     */
    public Builder creditCardNumber(String creditCardNumber) {
      this.creditCardNumber = creditCardNumber;
      return this;
    }
  }
}
