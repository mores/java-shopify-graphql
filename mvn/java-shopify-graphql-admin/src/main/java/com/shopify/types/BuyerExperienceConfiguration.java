package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BuyerExperienceConfiguration {
  
  private boolean checkoutToDraft;

  
  private DepositConfiguration deposit;

  
  private boolean editableShippingAddress;

  
  private boolean payNowOnly;

  
  private PaymentTermsTemplate paymentTermsTemplate;

  public BuyerExperienceConfiguration() {
  }

  
  public boolean getCheckoutToDraft() {
    return checkoutToDraft;
  }

  public void setCheckoutToDraft(boolean checkoutToDraft) {
    this.checkoutToDraft = checkoutToDraft;
  }

  
  public DepositConfiguration getDeposit() {
    return deposit;
  }

  public void setDeposit(DepositConfiguration deposit) {
    this.deposit = deposit;
  }

  
  public boolean getEditableShippingAddress() {
    return editableShippingAddress;
  }

  public void setEditableShippingAddress(boolean editableShippingAddress) {
    this.editableShippingAddress = editableShippingAddress;
  }

  
  public boolean getPayNowOnly() {
    return payNowOnly;
  }

  public void setPayNowOnly(boolean payNowOnly) {
    this.payNowOnly = payNowOnly;
  }

  
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
    
    private boolean checkoutToDraft;

    
    private DepositConfiguration deposit;

    
    private boolean editableShippingAddress;

    
    private boolean payNowOnly;

    
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

    
    public Builder checkoutToDraft(boolean checkoutToDraft) {
      this.checkoutToDraft = checkoutToDraft;
      return this;
    }

    
    public Builder deposit(DepositConfiguration deposit) {
      this.deposit = deposit;
      return this;
    }

    
    public Builder editableShippingAddress(boolean editableShippingAddress) {
      this.editableShippingAddress = editableShippingAddress;
      return this;
    }

    
    public Builder payNowOnly(boolean payNowOnly) {
      this.payNowOnly = payNowOnly;
      return this;
    }

    
    public Builder paymentTermsTemplate(PaymentTermsTemplate paymentTermsTemplate) {
      this.paymentTermsTemplate = paymentTermsTemplate;
      return this;
    }
  }
}
