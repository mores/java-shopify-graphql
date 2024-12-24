package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Return implements com.shopify.types.Node {
  
  private ReturnDecline decline;

  
  private ExchangeLineItemConnection exchangeLineItems;

  
  private String id;

  
  private String name;

  
  private Order order;

  
  private RefundConnection refunds;

  
  private ReturnLineItemTypeConnection returnLineItems;

  
  private List<ReturnShippingFee> returnShippingFees;

  
  private ReverseFulfillmentOrderConnection reverseFulfillmentOrders;

  
  private ReturnStatus status;

  
  private SuggestedReturnRefund suggestedRefund;

  
  private int totalQuantity;

  public Return() {
  }

  
  public ReturnDecline getDecline() {
    return decline;
  }

  public void setDecline(ReturnDecline decline) {
    this.decline = decline;
  }

  
  public ExchangeLineItemConnection getExchangeLineItems() {
    return exchangeLineItems;
  }

  public void setExchangeLineItems(ExchangeLineItemConnection exchangeLineItems) {
    this.exchangeLineItems = exchangeLineItems;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public RefundConnection getRefunds() {
    return refunds;
  }

  public void setRefunds(RefundConnection refunds) {
    this.refunds = refunds;
  }

  
  public ReturnLineItemTypeConnection getReturnLineItems() {
    return returnLineItems;
  }

  public void setReturnLineItems(ReturnLineItemTypeConnection returnLineItems) {
    this.returnLineItems = returnLineItems;
  }

  
  public List<ReturnShippingFee> getReturnShippingFees() {
    return returnShippingFees;
  }

  public void setReturnShippingFees(List<ReturnShippingFee> returnShippingFees) {
    this.returnShippingFees = returnShippingFees;
  }

  
  public ReverseFulfillmentOrderConnection getReverseFulfillmentOrders() {
    return reverseFulfillmentOrders;
  }

  public void setReverseFulfillmentOrders(
      ReverseFulfillmentOrderConnection reverseFulfillmentOrders) {
    this.reverseFulfillmentOrders = reverseFulfillmentOrders;
  }

  
  public ReturnStatus getStatus() {
    return status;
  }

  public void setStatus(ReturnStatus status) {
    this.status = status;
  }

  
  public SuggestedReturnRefund getSuggestedRefund() {
    return suggestedRefund;
  }

  public void setSuggestedRefund(SuggestedReturnRefund suggestedRefund) {
    this.suggestedRefund = suggestedRefund;
  }

  
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  @Override
  public String toString() {
    return "Return{decline='" + decline + "', exchangeLineItems='" + exchangeLineItems + "', id='" + id + "', name='" + name + "', order='" + order + "', refunds='" + refunds + "', returnLineItems='" + returnLineItems + "', returnShippingFees='" + returnShippingFees + "', reverseFulfillmentOrders='" + reverseFulfillmentOrders + "', status='" + status + "', suggestedRefund='" + suggestedRefund + "', totalQuantity='" + totalQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Return that = (Return) o;
    return Objects.equals(decline, that.decline) &&
        Objects.equals(exchangeLineItems, that.exchangeLineItems) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(order, that.order) &&
        Objects.equals(refunds, that.refunds) &&
        Objects.equals(returnLineItems, that.returnLineItems) &&
        Objects.equals(returnShippingFees, that.returnShippingFees) &&
        Objects.equals(reverseFulfillmentOrders, that.reverseFulfillmentOrders) &&
        Objects.equals(status, that.status) &&
        Objects.equals(suggestedRefund, that.suggestedRefund) &&
        totalQuantity == that.totalQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(decline, exchangeLineItems, id, name, order, refunds, returnLineItems, returnShippingFees, reverseFulfillmentOrders, status, suggestedRefund, totalQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ReturnDecline decline;

    
    private ExchangeLineItemConnection exchangeLineItems;

    
    private String id;

    
    private String name;

    
    private Order order;

    
    private RefundConnection refunds;

    
    private ReturnLineItemTypeConnection returnLineItems;

    
    private List<ReturnShippingFee> returnShippingFees;

    
    private ReverseFulfillmentOrderConnection reverseFulfillmentOrders;

    
    private ReturnStatus status;

    
    private SuggestedReturnRefund suggestedRefund;

    
    private int totalQuantity;

    public Return build() {
      Return result = new Return();
      result.decline = this.decline;
      result.exchangeLineItems = this.exchangeLineItems;
      result.id = this.id;
      result.name = this.name;
      result.order = this.order;
      result.refunds = this.refunds;
      result.returnLineItems = this.returnLineItems;
      result.returnShippingFees = this.returnShippingFees;
      result.reverseFulfillmentOrders = this.reverseFulfillmentOrders;
      result.status = this.status;
      result.suggestedRefund = this.suggestedRefund;
      result.totalQuantity = this.totalQuantity;
      return result;
    }

    
    public Builder decline(ReturnDecline decline) {
      this.decline = decline;
      return this;
    }

    
    public Builder exchangeLineItems(ExchangeLineItemConnection exchangeLineItems) {
      this.exchangeLineItems = exchangeLineItems;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder refunds(RefundConnection refunds) {
      this.refunds = refunds;
      return this;
    }

    
    public Builder returnLineItems(ReturnLineItemTypeConnection returnLineItems) {
      this.returnLineItems = returnLineItems;
      return this;
    }

    
    public Builder returnShippingFees(List<ReturnShippingFee> returnShippingFees) {
      this.returnShippingFees = returnShippingFees;
      return this;
    }

    
    public Builder reverseFulfillmentOrders(
        ReverseFulfillmentOrderConnection reverseFulfillmentOrders) {
      this.reverseFulfillmentOrders = reverseFulfillmentOrders;
      return this;
    }

    
    public Builder status(ReturnStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder suggestedRefund(SuggestedReturnRefund suggestedRefund) {
      this.suggestedRefund = suggestedRefund;
      return this;
    }

    
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }
  }
}
