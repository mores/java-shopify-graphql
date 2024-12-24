package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsBalanceTransaction implements com.shopify.types.Node {
  
  private String adjustmentReason;

  
  private List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders;

  
  private MoneyV2 amount;

  
  private ShopifyPaymentsAssociatedOrder associatedOrder;

  
  private ShopifyPaymentsBalanceTransactionAssociatedPayout associatedPayout;

  
  private MoneyV2 fee;

  
  private String id;

  
  private MoneyV2 net;

  
  private String sourceId;

  
  private String sourceOrderTransactionId;

  
  private ShopifyPaymentsSourceType sourceType;

  
  private boolean test;

  
  private OffsetDateTime transactionDate;

  
  private ShopifyPaymentsTransactionType type;

  public ShopifyPaymentsBalanceTransaction() {
  }

  
  public String getAdjustmentReason() {
    return adjustmentReason;
  }

  public void setAdjustmentReason(String adjustmentReason) {
    this.adjustmentReason = adjustmentReason;
  }

  
  public List<ShopifyPaymentsAdjustmentOrder> getAdjustmentsOrders() {
    return adjustmentsOrders;
  }

  public void setAdjustmentsOrders(List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders) {
    this.adjustmentsOrders = adjustmentsOrders;
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public ShopifyPaymentsAssociatedOrder getAssociatedOrder() {
    return associatedOrder;
  }

  public void setAssociatedOrder(ShopifyPaymentsAssociatedOrder associatedOrder) {
    this.associatedOrder = associatedOrder;
  }

  
  public ShopifyPaymentsBalanceTransactionAssociatedPayout getAssociatedPayout() {
    return associatedPayout;
  }

  public void setAssociatedPayout(
      ShopifyPaymentsBalanceTransactionAssociatedPayout associatedPayout) {
    this.associatedPayout = associatedPayout;
  }

  
  public MoneyV2 getFee() {
    return fee;
  }

  public void setFee(MoneyV2 fee) {
    this.fee = fee;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MoneyV2 getNet() {
    return net;
  }

  public void setNet(MoneyV2 net) {
    this.net = net;
  }

  
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  public String getSourceOrderTransactionId() {
    return sourceOrderTransactionId;
  }

  public void setSourceOrderTransactionId(String sourceOrderTransactionId) {
    this.sourceOrderTransactionId = sourceOrderTransactionId;
  }

  
  public ShopifyPaymentsSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(ShopifyPaymentsSourceType sourceType) {
    this.sourceType = sourceType;
  }

  
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  
  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  
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
    
    private String adjustmentReason;

    
    private List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders;

    
    private MoneyV2 amount;

    
    private ShopifyPaymentsAssociatedOrder associatedOrder;

    
    private ShopifyPaymentsBalanceTransactionAssociatedPayout associatedPayout;

    
    private MoneyV2 fee;

    
    private String id;

    
    private MoneyV2 net;

    
    private String sourceId;

    
    private String sourceOrderTransactionId;

    
    private ShopifyPaymentsSourceType sourceType;

    
    private boolean test;

    
    private OffsetDateTime transactionDate;

    
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

    
    public Builder adjustmentReason(String adjustmentReason) {
      this.adjustmentReason = adjustmentReason;
      return this;
    }

    
    public Builder adjustmentsOrders(List<ShopifyPaymentsAdjustmentOrder> adjustmentsOrders) {
      this.adjustmentsOrders = adjustmentsOrders;
      return this;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder associatedOrder(ShopifyPaymentsAssociatedOrder associatedOrder) {
      this.associatedOrder = associatedOrder;
      return this;
    }

    
    public Builder associatedPayout(
        ShopifyPaymentsBalanceTransactionAssociatedPayout associatedPayout) {
      this.associatedPayout = associatedPayout;
      return this;
    }

    
    public Builder fee(MoneyV2 fee) {
      this.fee = fee;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder net(MoneyV2 net) {
      this.net = net;
      return this;
    }

    
    public Builder sourceId(String sourceId) {
      this.sourceId = sourceId;
      return this;
    }

    
    public Builder sourceOrderTransactionId(String sourceOrderTransactionId) {
      this.sourceOrderTransactionId = sourceOrderTransactionId;
      return this;
    }

    
    public Builder sourceType(ShopifyPaymentsSourceType sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    
    public Builder transactionDate(OffsetDateTime transactionDate) {
      this.transactionDate = transactionDate;
      return this;
    }

    
    public Builder type(ShopifyPaymentsTransactionType type) {
      this.type = type;
      return this;
    }
  }
}
