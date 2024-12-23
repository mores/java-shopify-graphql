package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Settings describing the behavior of checkout for a B2B buyer.
 */
public class BuyerExperienceConfiguration {
  /**
   * Whether to checkout to draft order for merchant review.
   */
  private boolean checkoutToDraft;

  /**
   * The portion required to be paid at checkout.
   */
  private DepositConfiguration deposit;

  /**
   * Whether to allow customers to use editable shipping addresses.
   */
  private boolean editableShippingAddress;

  /**
   * Whether a buyer must pay at checkout or they can also choose to pay
   * later using net terms.
   */
  private boolean payNowOnly;

  /**
   * Represents the merchant configured payment terms.
   */
  private PaymentTermsTemplate paymentTermsTemplate;

  public BuyerExperienceConfiguration() {
  }

  /**
   * Whether to checkout to draft order for merchant review.
   */
  public boolean getCheckoutToDraft() {
    return checkoutToDraft;
  }

  public void setCheckoutToDraft(boolean checkoutToDraft) {
    this.checkoutToDraft = checkoutToDraft;
  }

  /**
   * The portion required to be paid at checkout.
   */
  public DepositConfiguration getDeposit() {
    return deposit;
  }

  public void setDeposit(DepositConfiguration deposit) {
    this.deposit = deposit;
  }

  /**
   * Whether to allow customers to use editable shipping addresses.
   */
  public boolean getEditableShippingAddress() {
    return editableShippingAddress;
  }

  public void setEditableShippingAddress(boolean editableShippingAddress) {
    this.editableShippingAddress = editableShippingAddress;
  }

  /**
   * Whether a buyer must pay at checkout or they can also choose to pay
   * later using net terms.
   */
  public boolean getPayNowOnly() {
    return payNowOnly;
  }

  public void setPayNowOnly(boolean payNowOnly) {
    this.payNowOnly = payNowOnly;
  }

  /**
   * Represents the merchant configured payment terms.
   */
  public PaymentTermsTemplate getPaymentTermsTemplate() {
    return paymentTermsTemplate;
  }

  public void setPaymentTermsTemplate(PaymentTermsTemplate paymentTermsTemplate) {
    this.paymentTermsTemplate = paymentTermsTemplate;
  }

  @Override
  public String toString() {
    return "BuyerExperienceConfiguration{checkoutToDraft='" + checkoutToDraft + "', deposit='" + deposit + "', editableShippingAddress='" + editableShippingAddress + "', payNowOnly='" + payNowOnly + "', paymentTermsTemplate='" + paymentTermsTemplate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BuyerExperienceConfiguration that = (BuyerExperienceConfiguration) o;
    return checkoutToDraft == that.checkoutToDraft &&
        Objects.equals(deposit, that.deposit) &&
        editableShippingAddress == that.editableShippingAddress &&
        payNowOnly == that.payNowOnly &&
        Objects.equals(paymentTermsTemplate, that.paymentTermsTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutToDraft, deposit, editableShippingAddress, payNowOnly, paymentTermsTemplate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether to checkout to draft order for merchant review.
     */
    private boolean checkoutToDraft;

    /**
     * The portion required to be paid at checkout.
     */
    private DepositConfiguration deposit;

    /**
     * Whether to allow customers to use editable shipping addresses.
     */
    private boolean editableShippingAddress;

    /**
     * Whether a buyer must pay at checkout or they can also choose to pay
     * later using net terms.
     */
    private boolean payNowOnly;

    /**
     * Represents the merchant configured payment terms.
     */
    private PaymentTermsTemplate paymentTermsTemplate;

    public BuyerExperienceConfiguration build() {
      BuyerExperienceConfiguration result = new BuyerExperienceConfiguration();
      result.checkoutToDraft = this.checkoutToDraft;
      result.deposit = this.deposit;
      result.editableShippingAddress = this.editableShippingAddress;
      result.payNowOnly = this.payNowOnly;
      result.paymentTermsTemplate = this.paymentTermsTemplate;
      return result;
    }

    /**
     * Whether to checkout to draft order for merchant review.
     */
    public Builder checkoutToDraft(boolean checkoutToDraft) {
      this.checkoutToDraft = checkoutToDraft;
      return this;
    }

    /**
     * The portion required to be paid at checkout.
     */
    public Builder deposit(DepositConfiguration deposit) {
      this.deposit = deposit;
      return this;
    }

    /**
     * Whether to allow customers to use editable shipping addresses.
     */
    public Builder editableShippingAddress(boolean editableShippingAddress) {
      this.editableShippingAddress = editableShippingAddress;
      return this;
    }

    /**
     * Whether a buyer must pay at checkout or they can also choose to pay
     * later using net terms.
     */
    public Builder payNowOnly(boolean payNowOnly) {
      this.payNowOnly = payNowOnly;
      return this;
    }

    /**
     * Represents the merchant configured payment terms.
     */
    public Builder paymentTermsTemplate(PaymentTermsTemplate paymentTermsTemplate) {
      this.paymentTermsTemplate = paymentTermsTemplate;
      return this;
    }
  }
}
