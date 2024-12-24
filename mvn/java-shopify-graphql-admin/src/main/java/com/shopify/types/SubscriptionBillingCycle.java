package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class SubscriptionBillingCycle {
  
  private OffsetDateTime billingAttemptExpectedDate;

  
  private SubscriptionBillingAttemptConnection billingAttempts;

  
  private OffsetDateTime cycleEndAt;

  
  private int cycleIndex;

  
  private OffsetDateTime cycleStartAt;

  
  private boolean edited;

  
  private SubscriptionBillingCycleEditedContract editedContract;

  
  private boolean skipped;

  
  private SubscriptionContract sourceContract;

  
  private SubscriptionBillingCycleBillingCycleStatus status;

  public SubscriptionBillingCycle() {
  }

  
  public OffsetDateTime getBillingAttemptExpectedDate() {
    return billingAttemptExpectedDate;
  }

  public void setBillingAttemptExpectedDate(OffsetDateTime billingAttemptExpectedDate) {
    this.billingAttemptExpectedDate = billingAttemptExpectedDate;
  }

  
  public SubscriptionBillingAttemptConnection getBillingAttempts() {
    return billingAttempts;
  }

  public void setBillingAttempts(SubscriptionBillingAttemptConnection billingAttempts) {
    this.billingAttempts = billingAttempts;
  }

  
  public OffsetDateTime getCycleEndAt() {
    return cycleEndAt;
  }

  public void setCycleEndAt(OffsetDateTime cycleEndAt) {
    this.cycleEndAt = cycleEndAt;
  }

  
  public int getCycleIndex() {
    return cycleIndex;
  }

  public void setCycleIndex(int cycleIndex) {
    this.cycleIndex = cycleIndex;
  }

  
  public OffsetDateTime getCycleStartAt() {
    return cycleStartAt;
  }

  public void setCycleStartAt(OffsetDateTime cycleStartAt) {
    this.cycleStartAt = cycleStartAt;
  }

  
  public boolean getEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  
  public SubscriptionBillingCycleEditedContract getEditedContract() {
    return editedContract;
  }

  public void setEditedContract(SubscriptionBillingCycleEditedContract editedContract) {
    this.editedContract = editedContract;
  }

  
  public boolean getSkipped() {
    return skipped;
  }

  public void setSkipped(boolean skipped) {
    this.skipped = skipped;
  }

  
  public SubscriptionContract getSourceContract() {
    return sourceContract;
  }

  public void setSourceContract(SubscriptionContract sourceContract) {
    this.sourceContract = sourceContract;
  }

  
  public SubscriptionBillingCycleBillingCycleStatus getStatus() {
    return status;
  }

  public void setStatus(SubscriptionBillingCycleBillingCycleStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycle{billingAttemptExpectedDate='" + billingAttemptExpectedDate + "', billingAttempts='" + billingAttempts + "', cycleEndAt='" + cycleEndAt + "', cycleIndex='" + cycleIndex + "', cycleStartAt='" + cycleStartAt + "', edited='" + edited + "', editedContract='" + editedContract + "', skipped='" + skipped + "', sourceContract='" + sourceContract + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycle that = (SubscriptionBillingCycle) o;
    return Objects.equals(billingAttemptExpectedDate, that.billingAttemptExpectedDate) &&
        Objects.equals(billingAttempts, that.billingAttempts) &&
        Objects.equals(cycleEndAt, that.cycleEndAt) &&
        cycleIndex == that.cycleIndex &&
        Objects.equals(cycleStartAt, that.cycleStartAt) &&
        edited == that.edited &&
        Objects.equals(editedContract, that.editedContract) &&
        skipped == that.skipped &&
        Objects.equals(sourceContract, that.sourceContract) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAttemptExpectedDate, billingAttempts, cycleEndAt, cycleIndex, cycleStartAt, edited, editedContract, skipped, sourceContract, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime billingAttemptExpectedDate;

    
    private SubscriptionBillingAttemptConnection billingAttempts;

    
    private OffsetDateTime cycleEndAt;

    
    private int cycleIndex;

    
    private OffsetDateTime cycleStartAt;

    
    private boolean edited;

    
    private SubscriptionBillingCycleEditedContract editedContract;

    
    private boolean skipped;

    
    private SubscriptionContract sourceContract;

    
    private SubscriptionBillingCycleBillingCycleStatus status;

    public SubscriptionBillingCycle build() {
      SubscriptionBillingCycle result = new SubscriptionBillingCycle();
      result.billingAttemptExpectedDate = this.billingAttemptExpectedDate;
      result.billingAttempts = this.billingAttempts;
      result.cycleEndAt = this.cycleEndAt;
      result.cycleIndex = this.cycleIndex;
      result.cycleStartAt = this.cycleStartAt;
      result.edited = this.edited;
      result.editedContract = this.editedContract;
      result.skipped = this.skipped;
      result.sourceContract = this.sourceContract;
      result.status = this.status;
      return result;
    }

    
    public Builder billingAttemptExpectedDate(OffsetDateTime billingAttemptExpectedDate) {
      this.billingAttemptExpectedDate = billingAttemptExpectedDate;
      return this;
    }

    
    public Builder billingAttempts(SubscriptionBillingAttemptConnection billingAttempts) {
      this.billingAttempts = billingAttempts;
      return this;
    }

    
    public Builder cycleEndAt(OffsetDateTime cycleEndAt) {
      this.cycleEndAt = cycleEndAt;
      return this;
    }

    
    public Builder cycleIndex(int cycleIndex) {
      this.cycleIndex = cycleIndex;
      return this;
    }

    
    public Builder cycleStartAt(OffsetDateTime cycleStartAt) {
      this.cycleStartAt = cycleStartAt;
      return this;
    }

    
    public Builder edited(boolean edited) {
      this.edited = edited;
      return this;
    }

    
    public Builder editedContract(SubscriptionBillingCycleEditedContract editedContract) {
      this.editedContract = editedContract;
      return this;
    }

    
    public Builder skipped(boolean skipped) {
      this.skipped = skipped;
      return this;
    }

    
    public Builder sourceContract(SubscriptionContract sourceContract) {
      this.sourceContract = sourceContract;
      return this;
    }

    
    public Builder status(SubscriptionBillingCycleBillingCycleStatus status) {
      this.status = status;
      return this;
    }
  }
}
