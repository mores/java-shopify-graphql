package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a bank account payment instrument.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class BankAccount implements CustomerPaymentInstrument, PaymentInstrument {
  /**
   * The type of account holder.
   */
  private BankAccountHolderType accountHolderType;

  /**
   * The type of bank account.
   */
  private BankAccountType accountType;

  /**
   * The name of the bank.
   */
  private String bankName;

  /**
   * The billing address associated with the bank account.
   */
  private CustomerPaymentInstrumentBillingAddress billingAddress;

  /**
   * The last four digits of the account number.
   */
  private String lastDigits;

  public BankAccount() {
  }

  /**
   * The type of account holder.
   */
  public BankAccountHolderType getAccountHolderType() {
    return accountHolderType;
  }

  public void setAccountHolderType(BankAccountHolderType accountHolderType) {
    this.accountHolderType = accountHolderType;
  }

  /**
   * The type of bank account.
   */
  public BankAccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(BankAccountType accountType) {
    this.accountType = accountType;
  }

  /**
   * The name of the bank.
   */
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  /**
   * The billing address associated with the bank account.
   */
  public CustomerPaymentInstrumentBillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CustomerPaymentInstrumentBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The last four digits of the account number.
   */
  public String getLastDigits() {
    return lastDigits;
  }

  public void setLastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
  }

  @Override
  public String toString() {
    return "BankAccount{accountHolderType='" + accountHolderType + "', accountType='" + accountType + "', bankName='" + bankName + "', billingAddress='" + billingAddress + "', lastDigits='" + lastDigits + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BankAccount that = (BankAccount) o;
    return Objects.equals(accountHolderType, that.accountHolderType) &&
        Objects.equals(accountType, that.accountType) &&
        Objects.equals(bankName, that.bankName) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(lastDigits, that.lastDigits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderType, accountType, bankName, billingAddress, lastDigits);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of account holder.
     */
    private BankAccountHolderType accountHolderType;

    /**
     * The type of bank account.
     */
    private BankAccountType accountType;

    /**
     * The name of the bank.
     */
    private String bankName;

    /**
     * The billing address associated with the bank account.
     */
    private CustomerPaymentInstrumentBillingAddress billingAddress;

    /**
     * The last four digits of the account number.
     */
    private String lastDigits;

    public BankAccount build() {
      BankAccount result = new BankAccount();
      result.accountHolderType = this.accountHolderType;
      result.accountType = this.accountType;
      result.bankName = this.bankName;
      result.billingAddress = this.billingAddress;
      result.lastDigits = this.lastDigits;
      return result;
    }

    /**
     * The type of account holder.
     */
    public Builder accountHolderType(BankAccountHolderType accountHolderType) {
      this.accountHolderType = accountHolderType;
      return this;
    }

    /**
     * The type of bank account.
     */
    public Builder accountType(BankAccountType accountType) {
      this.accountType = accountType;
      return this;
    }

    /**
     * The name of the bank.
     */
    public Builder bankName(String bankName) {
      this.bankName = bankName;
      return this;
    }

    /**
     * The billing address associated with the bank account.
     */
    public Builder billingAddress(CustomerPaymentInstrumentBillingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * The last four digits of the account number.
     */
    public Builder lastDigits(String lastDigits) {
      this.lastDigits = lastDigits;
      return this;
    }
  }
}
