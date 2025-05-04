package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A TenderTransaction represents a transaction with financial impact on a shop's balance sheet. A tender transaction always
 * represents actual money movement between a buyer and a shop. TenderTransactions can be used instead of OrderTransactions
 * for reconciling a shop's cash flow. A TenderTransaction is immutable once created.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TenderTransaction implements com.shopify.admin.types.Node {
  /**
   * The amount and currency of the tender transaction.
   */
  private MoneyV2 amount;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The order that's related to the tender transaction. This value is null if the order has been deleted.
   */
  private Order order;

  /**
   * Information about the payment method used for the transaction.
   */
  private String paymentMethod;

  /**
   * Date and time when the transaction was processed.
   */
  private OffsetDateTime processedAt;

  /**
   * The remote gateway reference associated with the tender transaction.
   */
  private String remoteReference;

  /**
   * Whether the transaction is a test transaction.
   */
  private boolean test;

  /**
   * Information about the payment instrument used for the transaction.
   */
  private TenderTransactionDetails transactionDetails;

  /**
   * The staff member who performed the transaction.
   */
  private StaffMember user;

  public TenderTransaction() {
  }

  /**
   * The amount and currency of the tender transaction.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
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
   * The order that's related to the tender transaction. This value is null if the order has been deleted.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * Information about the payment method used for the transaction.
   */
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * Date and time when the transaction was processed.
   */
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  /**
   * The remote gateway reference associated with the tender transaction.
   */
  public String getRemoteReference() {
    return remoteReference;
  }

  public void setRemoteReference(String remoteReference) {
    this.remoteReference = remoteReference;
  }

  /**
   * Whether the transaction is a test transaction.
   */
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  /**
   * Information about the payment instrument used for the transaction.
   */
  public TenderTransactionDetails getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(TenderTransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  /**
   * The staff member who performed the transaction.
   */
  public StaffMember getUser() {
    return user;
  }

  public void setUser(StaffMember user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "TenderTransaction{amount='" + amount + "', id='" + id + "', order='" + order + "', paymentMethod='" + paymentMethod + "', processedAt='" + processedAt + "', remoteReference='" + remoteReference + "', test='" + test + "', transactionDetails='" + transactionDetails + "', user='" + user + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TenderTransaction that = (TenderTransaction) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(id, that.id) &&
        Objects.equals(order, that.order) &&
        Objects.equals(paymentMethod, that.paymentMethod) &&
        Objects.equals(processedAt, that.processedAt) &&
        Objects.equals(remoteReference, that.remoteReference) &&
        test == that.test &&
        Objects.equals(transactionDetails, that.transactionDetails) &&
        Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, id, order, paymentMethod, processedAt, remoteReference, test, transactionDetails, user);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount and currency of the tender transaction.
     */
    private MoneyV2 amount;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The order that's related to the tender transaction. This value is null if the order has been deleted.
     */
    private Order order;

    /**
     * Information about the payment method used for the transaction.
     */
    private String paymentMethod;

    /**
     * Date and time when the transaction was processed.
     */
    private OffsetDateTime processedAt;

    /**
     * The remote gateway reference associated with the tender transaction.
     */
    private String remoteReference;

    /**
     * Whether the transaction is a test transaction.
     */
    private boolean test;

    /**
     * Information about the payment instrument used for the transaction.
     */
    private TenderTransactionDetails transactionDetails;

    /**
     * The staff member who performed the transaction.
     */
    private StaffMember user;

    public TenderTransaction build() {
      TenderTransaction result = new TenderTransaction();
      result.amount = this.amount;
      result.id = this.id;
      result.order = this.order;
      result.paymentMethod = this.paymentMethod;
      result.processedAt = this.processedAt;
      result.remoteReference = this.remoteReference;
      result.test = this.test;
      result.transactionDetails = this.transactionDetails;
      result.user = this.user;
      return result;
    }

    /**
     * The amount and currency of the tender transaction.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
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
     * The order that's related to the tender transaction. This value is null if the order has been deleted.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * Information about the payment method used for the transaction.
     */
    public Builder paymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Date and time when the transaction was processed.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    /**
     * The remote gateway reference associated with the tender transaction.
     */
    public Builder remoteReference(String remoteReference) {
      this.remoteReference = remoteReference;
      return this;
    }

    /**
     * Whether the transaction is a test transaction.
     */
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    /**
     * Information about the payment instrument used for the transaction.
     */
    public Builder transactionDetails(TenderTransactionDetails transactionDetails) {
      this.transactionDetails = transactionDetails;
      return this;
    }

    /**
     * The staff member who performed the transaction.
     */
    public Builder user(StaffMember user) {
      this.user = user;
      return this;
    }
  }
}
