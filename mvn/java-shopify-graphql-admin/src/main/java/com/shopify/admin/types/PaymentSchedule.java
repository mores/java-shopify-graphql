package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents the payment schedule for a single payment defined in the payment terms.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PaymentSchedule implements com.shopify.admin.types.Node {
  /**
   * Amount owed for this payment schedule.
   */
  private MoneyV2 amount;

  /**
   * Remaining balance to be captured for this payment schedule.
   */
  private MoneyV2 balanceDue;

  /**
   * Date and time when the payment schedule is paid or fulfilled.
   */
  private OffsetDateTime completedAt;

  /**
   * Whether the payment schedule is due.
   */
  private boolean due;

  /**
   * Date and time when the payment schedule is due.
   */
  private OffsetDateTime dueAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Date and time when the invoice is sent.
   */
  private OffsetDateTime issuedAt;

  /**
   * The payment terms the payment schedule belongs to.
   */
  private PaymentTerms paymentTerms;

  /**
   * Remaining balance to be paid or authorized by the customer for this payment schedule.
   */
  private MoneyV2 totalBalance;

  public PaymentSchedule() {
  }

  /**
   * Amount owed for this payment schedule.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * Remaining balance to be captured for this payment schedule.
   */
  public MoneyV2 getBalanceDue() {
    return balanceDue;
  }

  public void setBalanceDue(MoneyV2 balanceDue) {
    this.balanceDue = balanceDue;
  }

  /**
   * Date and time when the payment schedule is paid or fulfilled.
   */
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * Whether the payment schedule is due.
   */
  public boolean getDue() {
    return due;
  }

  public void setDue(boolean due) {
    this.due = due;
  }

  /**
   * Date and time when the payment schedule is due.
   */
  public OffsetDateTime getDueAt() {
    return dueAt;
  }

  public void setDueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
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
   * Date and time when the invoice is sent.
   */
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  /**
   * The payment terms the payment schedule belongs to.
   */
  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * Remaining balance to be paid or authorized by the customer for this payment schedule.
   */
  public MoneyV2 getTotalBalance() {
    return totalBalance;
  }

  public void setTotalBalance(MoneyV2 totalBalance) {
    this.totalBalance = totalBalance;
  }

  @Override
  public String toString() {
    return "PaymentSchedule{amount='" + amount + "', balanceDue='" + balanceDue + "', completedAt='" + completedAt + "', due='" + due + "', dueAt='" + dueAt + "', id='" + id + "', issuedAt='" + issuedAt + "', paymentTerms='" + paymentTerms + "', totalBalance='" + totalBalance + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentSchedule that = (PaymentSchedule) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(balanceDue, that.balanceDue) &&
        Objects.equals(completedAt, that.completedAt) &&
        due == that.due &&
        Objects.equals(dueAt, that.dueAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(issuedAt, that.issuedAt) &&
        Objects.equals(paymentTerms, that.paymentTerms) &&
        Objects.equals(totalBalance, that.totalBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balanceDue, completedAt, due, dueAt, id, issuedAt, paymentTerms, totalBalance);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Amount owed for this payment schedule.
     */
    private MoneyV2 amount;

    /**
     * Remaining balance to be captured for this payment schedule.
     */
    private MoneyV2 balanceDue;

    /**
     * Date and time when the payment schedule is paid or fulfilled.
     */
    private OffsetDateTime completedAt;

    /**
     * Whether the payment schedule is due.
     */
    private boolean due;

    /**
     * Date and time when the payment schedule is due.
     */
    private OffsetDateTime dueAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Date and time when the invoice is sent.
     */
    private OffsetDateTime issuedAt;

    /**
     * The payment terms the payment schedule belongs to.
     */
    private PaymentTerms paymentTerms;

    /**
     * Remaining balance to be paid or authorized by the customer for this payment schedule.
     */
    private MoneyV2 totalBalance;

    public PaymentSchedule build() {
      PaymentSchedule result = new PaymentSchedule();
      result.amount = this.amount;
      result.balanceDue = this.balanceDue;
      result.completedAt = this.completedAt;
      result.due = this.due;
      result.dueAt = this.dueAt;
      result.id = this.id;
      result.issuedAt = this.issuedAt;
      result.paymentTerms = this.paymentTerms;
      result.totalBalance = this.totalBalance;
      return result;
    }

    /**
     * Amount owed for this payment schedule.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Remaining balance to be captured for this payment schedule.
     */
    public Builder balanceDue(MoneyV2 balanceDue) {
      this.balanceDue = balanceDue;
      return this;
    }

    /**
     * Date and time when the payment schedule is paid or fulfilled.
     */
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    /**
     * Whether the payment schedule is due.
     */
    public Builder due(boolean due) {
      this.due = due;
      return this;
    }

    /**
     * Date and time when the payment schedule is due.
     */
    public Builder dueAt(OffsetDateTime dueAt) {
      this.dueAt = dueAt;
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
     * Date and time when the invoice is sent.
     */
    public Builder issuedAt(OffsetDateTime issuedAt) {
      this.issuedAt = issuedAt;
      return this;
    }

    /**
     * The payment terms the payment schedule belongs to.
     */
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    /**
     * Remaining balance to be paid or authorized by the customer for this payment schedule.
     */
    public Builder totalBalance(MoneyV2 totalBalance) {
      this.totalBalance = totalBalance;
      return this;
    }
  }
}
