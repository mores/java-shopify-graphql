package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A transaction that contributes to a Shopify Payments account balance.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsBalanceTransaction implements com.shopify.admin.types.Node {
  /**
   * The reason for the adjustment that's associated with the transaction.
   *             If the source_type isn't an adjustment, the value will be null.
   */
  private String adjustmentReason;

  /**
   * The adjustment orders associated to the transaction.
   */
  private List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders;

  /**
   * The amount contributing to the balance transaction.
   */
  private MoneyV2 amount;

  /**
   * The associated order for the balance transaction.
   */
  private ShopifyPaymentsAssociatedOrder associatedOrder;

  /**
   * Payout assoicated with the transaction.
   */
  private ShopifyPaymentsBalanceTransactionAssociatedPayout associatedPayout;

  /**
   * The fee amount contributing to the balance transaction.
   */
  private MoneyV2 fee;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The net amount contributing to the merchant's balance.
   */
  private MoneyV2 net;

  /**
   * The ID of the resource leading to the transaction.
   */
  private String sourceId;

  /**
   * The id of the
   *             [Order Transaction](https://shopify.dev/docs/admin-api/rest/reference/orders/transaction)
   *   
   *             that resulted in this balance transaction.
   */
  private String sourceOrderTransactionId;

  /**
   * The source type of the balance transaction.
   */
  private ShopifyPaymentsSourceType sourceType;

  /**
   * Wether the tranaction was created in test mode.
   */
  private boolean test;

  /**
   * The date and time when the balance transaction was processed.
   */
  private OffsetDateTime transactionDate;

  /**
   * The type of transaction.
   */
  private ShopifyPaymentsTransactionType type;

  public ShopifyPaymentsBalanceTransaction() {
  }

  /**
   * The reason for the adjustment that's associated with the transaction.
   *             If the source_type isn't an adjustment, the value will be null.
   */
  public String getAdjustmentReason() {
    return adjustmentReason;
  }

  public void setAdjustmentReason(String adjustmentReason) {
    this.adjustmentReason = adjustmentReason;
  }

  /**
   * The adjustment orders associated to the transaction.
   */
  public List<ShopifyPaymentsAdjustmentOrder> getAdjustmentsOrders() {
    return adjustmentsOrders;
  }

  public void setAdjustmentsOrders(List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders) {
    this.adjustmentsOrders = adjustmentsOrders;
  }

  /**
   * The amount contributing to the balance transaction.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The associated order for the balance transaction.
   */
  public ShopifyPaymentsAssociatedOrder getAssociatedOrder() {
    return associatedOrder;
  }

  public void setAssociatedOrder(ShopifyPaymentsAssociatedOrder associatedOrder) {
    this.associatedOrder = associatedOrder;
  }

  /**
   * Payout assoicated with the transaction.
   */
  public ShopifyPaymentsBalanceTransactionAssociatedPayout getAssociatedPayout() {
    return associatedPayout;
  }

  public void setAssociatedPayout(
      ShopifyPaymentsBalanceTransactionAssociatedPayout associatedPayout) {
    this.associatedPayout = associatedPayout;
  }

  /**
   * The fee amount contributing to the balance transaction.
   */
  public MoneyV2 getFee() {
    return fee;
  }

  public void setFee(MoneyV2 fee) {
    this.fee = fee;
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
   * The net amount contributing to the merchant's balance.
   */
  public MoneyV2 getNet() {
    return net;
  }

  public void setNet(MoneyV2 net) {
    this.net = net;
  }

  /**
   * The ID of the resource leading to the transaction.
   */
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  /**
   * The id of the
   *             [Order Transaction](https://shopify.dev/docs/admin-api/rest/reference/orders/transaction)
   *   
   *             that resulted in this balance transaction.
   */
  public String getSourceOrderTransactionId() {
    return sourceOrderTransactionId;
  }

  public void setSourceOrderTransactionId(String sourceOrderTransactionId) {
    this.sourceOrderTransactionId = sourceOrderTransactionId;
  }

  /**
   * The source type of the balance transaction.
   */
  public ShopifyPaymentsSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(ShopifyPaymentsSourceType sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Wether the tranaction was created in test mode.
   */
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  /**
   * The date and time when the balance transaction was processed.
   */
  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  /**
   * The type of transaction.
   */
  public ShopifyPaymentsTransactionType getType() {
    return type;
  }

  public void setType(ShopifyPaymentsTransactionType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsBalanceTransaction{adjustmentReason='" + adjustmentReason + "', adjustmentsOrders='" + adjustmentsOrders + "', amount='" + amount + "', associatedOrder='" + associatedOrder + "', associatedPayout='" + associatedPayout + "', fee='" + fee + "', id='" + id + "', net='" + net + "', sourceId='" + sourceId + "', sourceOrderTransactionId='" + sourceOrderTransactionId + "', sourceType='" + sourceType + "', test='" + test + "', transactionDate='" + transactionDate + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsBalanceTransaction that = (ShopifyPaymentsBalanceTransaction) o;
    return Objects.equals(adjustmentReason, that.adjustmentReason) &&
        Objects.equals(adjustmentsOrders, that.adjustmentsOrders) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(associatedOrder, that.associatedOrder) &&
        Objects.equals(associatedPayout, that.associatedPayout) &&
        Objects.equals(fee, that.fee) &&
        Objects.equals(id, that.id) &&
        Objects.equals(net, that.net) &&
        Objects.equals(sourceId, that.sourceId) &&
        Objects.equals(sourceOrderTransactionId, that.sourceOrderTransactionId) &&
        Objects.equals(sourceType, that.sourceType) &&
        test == that.test &&
        Objects.equals(transactionDate, that.transactionDate) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentReason, adjustmentsOrders, amount, associatedOrder, associatedPayout, fee, id, net, sourceId, sourceOrderTransactionId, sourceType, test, transactionDate, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The reason for the adjustment that's associated with the transaction.
     *             If the source_type isn't an adjustment, the value will be null.
     */
    private String adjustmentReason;

    /**
     * The adjustment orders associated to the transaction.
     */
    private List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders;

    /**
     * The amount contributing to the balance transaction.
     */
    private MoneyV2 amount;

    /**
     * The associated order for the balance transaction.
     */
    private ShopifyPaymentsAssociatedOrder associatedOrder;

    /**
     * Payout assoicated with the transaction.
     */
    private ShopifyPaymentsBalanceTransactionAssociatedPayout associatedPayout;

    /**
     * The fee amount contributing to the balance transaction.
     */
    private MoneyV2 fee;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The net amount contributing to the merchant's balance.
     */
    private MoneyV2 net;

    /**
     * The ID of the resource leading to the transaction.
     */
    private String sourceId;

    /**
     * The id of the
     *             [Order Transaction](https://shopify.dev/docs/admin-api/rest/reference/orders/transaction)
     *   
     *             that resulted in this balance transaction.
     */
    private String sourceOrderTransactionId;

    /**
     * The source type of the balance transaction.
     */
    private ShopifyPaymentsSourceType sourceType;

    /**
     * Wether the tranaction was created in test mode.
     */
    private boolean test;

    /**
     * The date and time when the balance transaction was processed.
     */
    private OffsetDateTime transactionDate;

    /**
     * The type of transaction.
     */
    private ShopifyPaymentsTransactionType type;

    public ShopifyPaymentsBalanceTransaction build() {
      ShopifyPaymentsBalanceTransaction result = new ShopifyPaymentsBalanceTransaction();
      result.adjustmentReason = this.adjustmentReason;
      result.adjustmentsOrders = this.adjustmentsOrders;
      result.amount = this.amount;
      result.associatedOrder = this.associatedOrder;
      result.associatedPayout = this.associatedPayout;
      result.fee = this.fee;
      result.id = this.id;
      result.net = this.net;
      result.sourceId = this.sourceId;
      result.sourceOrderTransactionId = this.sourceOrderTransactionId;
      result.sourceType = this.sourceType;
      result.test = this.test;
      result.transactionDate = this.transactionDate;
      result.type = this.type;
      return result;
    }

    /**
     * The reason for the adjustment that's associated with the transaction.
     *             If the source_type isn't an adjustment, the value will be null.
     */
    public Builder adjustmentReason(String adjustmentReason) {
      this.adjustmentReason = adjustmentReason;
      return this;
    }

    /**
     * The adjustment orders associated to the transaction.
     */
    public Builder adjustmentsOrders(List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders) {
      this.adjustmentsOrders = adjustmentsOrders;
      return this;
    }

    /**
     * The amount contributing to the balance transaction.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The associated order for the balance transaction.
     */
    public Builder associatedOrder(ShopifyPaymentsAssociatedOrder associatedOrder) {
      this.associatedOrder = associatedOrder;
      return this;
    }

    /**
     * Payout assoicated with the transaction.
     */
    public Builder associatedPayout(
        ShopifyPaymentsBalanceTransactionAssociatedPayout associatedPayout) {
      this.associatedPayout = associatedPayout;
      return this;
    }

    /**
     * The fee amount contributing to the balance transaction.
     */
    public Builder fee(MoneyV2 fee) {
      this.fee = fee;
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
     * The net amount contributing to the merchant's balance.
     */
    public Builder net(MoneyV2 net) {
      this.net = net;
      return this;
    }

    /**
     * The ID of the resource leading to the transaction.
     */
    public Builder sourceId(String sourceId) {
      this.sourceId = sourceId;
      return this;
    }

    /**
     * The id of the
     *             [Order Transaction](https://shopify.dev/docs/admin-api/rest/reference/orders/transaction)
     *   
     *             that resulted in this balance transaction.
     */
    public Builder sourceOrderTransactionId(String sourceOrderTransactionId) {
      this.sourceOrderTransactionId = sourceOrderTransactionId;
      return this;
    }

    /**
     * The source type of the balance transaction.
     */
    public Builder sourceType(ShopifyPaymentsSourceType sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Wether the tranaction was created in test mode.
     */
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    /**
     * The date and time when the balance transaction was processed.
     */
    public Builder transactionDate(OffsetDateTime transactionDate) {
      this.transactionDate = transactionDate;
      return this;
    }

    /**
     * The type of transaction.
     */
    public Builder type(ShopifyPaymentsTransactionType type) {
      this.type = type;
      return this;
    }
  }
}
