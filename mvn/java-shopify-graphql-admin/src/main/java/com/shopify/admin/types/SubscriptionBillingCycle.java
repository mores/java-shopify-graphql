package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A subscription billing cycle.
 */
public class SubscriptionBillingCycle {
  /**
   * The date on which the billing attempt is expected to be made.
   */
  private OffsetDateTime billingAttemptExpectedDate;

  /**
   * The list of billing attempts associated with the billing cycle.
   */
  private SubscriptionBillingAttemptConnection billingAttempts;

  /**
   * The end date of the billing cycle.
   */
  private OffsetDateTime cycleEndAt;

  /**
   * The index of the billing cycle.
   */
  private int cycleIndex;

  /**
   * The start date of the billing cycle.
   */
  private OffsetDateTime cycleStartAt;

  /**
   * Whether this billing cycle was edited.
   */
  private boolean edited;

  /**
   * The active edited contract for the billing cycle.
   */
  private SubscriptionBillingCycleEditedContract editedContract;

  /**
   * Whether this billing cycle was skipped.
   */
  private boolean skipped;

  /**
   * The subscription contract that the billing cycle belongs to.
   */
  private SubscriptionContract sourceContract;

  /**
   * The status of the billing cycle.
   */
  private SubscriptionBillingCycleBillingCycleStatus status;

  public SubscriptionBillingCycle() {
  }

  /**
   * The date on which the billing attempt is expected to be made.
   */
  public OffsetDateTime getBillingAttemptExpectedDate() {
    return billingAttemptExpectedDate;
  }

  public void setBillingAttemptExpectedDate(OffsetDateTime billingAttemptExpectedDate) {
    this.billingAttemptExpectedDate = billingAttemptExpectedDate;
  }

  /**
   * The list of billing attempts associated with the billing cycle.
   */
  public SubscriptionBillingAttemptConnection getBillingAttempts() {
    return billingAttempts;
  }

  public void setBillingAttempts(SubscriptionBillingAttemptConnection billingAttempts) {
    this.billingAttempts = billingAttempts;
  }

  /**
   * The end date of the billing cycle.
   */
  public OffsetDateTime getCycleEndAt() {
    return cycleEndAt;
  }

  public void setCycleEndAt(OffsetDateTime cycleEndAt) {
    this.cycleEndAt = cycleEndAt;
  }

  /**
   * The index of the billing cycle.
   */
  public int getCycleIndex() {
    return cycleIndex;
  }

  public void setCycleIndex(int cycleIndex) {
    this.cycleIndex = cycleIndex;
  }

  /**
   * The start date of the billing cycle.
   */
  public OffsetDateTime getCycleStartAt() {
    return cycleStartAt;
  }

  public void setCycleStartAt(OffsetDateTime cycleStartAt) {
    this.cycleStartAt = cycleStartAt;
  }

  /**
   * Whether this billing cycle was edited.
   */
  public boolean getEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  /**
   * The active edited contract for the billing cycle.
   */
  public SubscriptionBillingCycleEditedContract getEditedContract() {
    return editedContract;
  }

  public void setEditedContract(SubscriptionBillingCycleEditedContract editedContract) {
    this.editedContract = editedContract;
  }

  /**
   * Whether this billing cycle was skipped.
   */
  public boolean getSkipped() {
    return skipped;
  }

  public void setSkipped(boolean skipped) {
    this.skipped = skipped;
  }

  /**
   * The subscription contract that the billing cycle belongs to.
   */
  public SubscriptionContract getSourceContract() {
    return sourceContract;
  }

  public void setSourceContract(SubscriptionContract sourceContract) {
    this.sourceContract = sourceContract;
  }

  /**
   * The status of the billing cycle.
   */
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
    /**
     * The date on which the billing attempt is expected to be made.
     */
    private OffsetDateTime billingAttemptExpectedDate;

    /**
     * The list of billing attempts associated with the billing cycle.
     */
    private SubscriptionBillingAttemptConnection billingAttempts;

    /**
     * The end date of the billing cycle.
     */
    private OffsetDateTime cycleEndAt;

    /**
     * The index of the billing cycle.
     */
    private int cycleIndex;

    /**
     * The start date of the billing cycle.
     */
    private OffsetDateTime cycleStartAt;

    /**
     * Whether this billing cycle was edited.
     */
    private boolean edited;

    /**
     * The active edited contract for the billing cycle.
     */
    private SubscriptionBillingCycleEditedContract editedContract;

    /**
     * Whether this billing cycle was skipped.
     */
    private boolean skipped;

    /**
     * The subscription contract that the billing cycle belongs to.
     */
    private SubscriptionContract sourceContract;

    /**
     * The status of the billing cycle.
     */
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

    /**
     * The date on which the billing attempt is expected to be made.
     */
    public Builder billingAttemptExpectedDate(OffsetDateTime billingAttemptExpectedDate) {
      this.billingAttemptExpectedDate = billingAttemptExpectedDate;
      return this;
    }

    /**
     * The list of billing attempts associated with the billing cycle.
     */
    public Builder billingAttempts(SubscriptionBillingAttemptConnection billingAttempts) {
      this.billingAttempts = billingAttempts;
      return this;
    }

    /**
     * The end date of the billing cycle.
     */
    public Builder cycleEndAt(OffsetDateTime cycleEndAt) {
      this.cycleEndAt = cycleEndAt;
      return this;
    }

    /**
     * The index of the billing cycle.
     */
    public Builder cycleIndex(int cycleIndex) {
      this.cycleIndex = cycleIndex;
      return this;
    }

    /**
     * The start date of the billing cycle.
     */
    public Builder cycleStartAt(OffsetDateTime cycleStartAt) {
      this.cycleStartAt = cycleStartAt;
      return this;
    }

    /**
     * Whether this billing cycle was edited.
     */
    public Builder edited(boolean edited) {
      this.edited = edited;
      return this;
    }

    /**
     * The active edited contract for the billing cycle.
     */
    public Builder editedContract(SubscriptionBillingCycleEditedContract editedContract) {
      this.editedContract = editedContract;
      return this;
    }

    /**
     * Whether this billing cycle was skipped.
     */
    public Builder skipped(boolean skipped) {
      this.skipped = skipped;
      return this;
    }

    /**
     * The subscription contract that the billing cycle belongs to.
     */
    public Builder sourceContract(SubscriptionContract sourceContract) {
      this.sourceContract = sourceContract;
      return this;
    }

    /**
     * The status of the billing cycle.
     */
    public Builder status(SubscriptionBillingCycleBillingCycleStatus status) {
      this.status = status;
      return this;
    }
  }
}
