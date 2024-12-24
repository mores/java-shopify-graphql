package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderAgreement implements com.shopify.types.SalesAgreement {
  
  private App app;

  
  private OffsetDateTime happenedAt;

  
  private String id;

  
  private Order order;

  
  private OrderActionType reason;

  
  private SaleConnection sales;

  
  private StaffMember user;

  public OrderAgreement() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public OffsetDateTime getHappenedAt() {
    return happenedAt;
  }

  public void setHappenedAt(OffsetDateTime happenedAt) {
    this.happenedAt = happenedAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public OrderActionType getReason() {
    return reason;
  }

  public void setReason(OrderActionType reason) {
    this.reason = reason;
  }

  
  public SaleConnection getSales() {
    return sales;
  }

  public void setSales(SaleConnection sales) {
    this.sales = sales;
  }

  
  public StaffMember getUser() {
    return user;
  }

  public void setUser(StaffMember user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "OrderAgreement{app='" + app + "', happenedAt='" + happenedAt + "', id='" + id + "', order='" + order + "', reason='" + reason + "', sales='" + sales + "', user='" + user + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderAgreement that = (OrderAgreement) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(happenedAt, that.happenedAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(order, that.order) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(sales, that.sales) &&
        Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, happenedAt, id, order, reason, sales, user);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private OffsetDateTime happenedAt;

    
    private String id;

    
    private Order order;

    
    private OrderActionType reason;

    
    private SaleConnection sales;

    
    private StaffMember user;

    public OrderAgreement build() {
      OrderAgreement result = new OrderAgreement();
      result.app = this.app;
      result.happenedAt = this.happenedAt;
      result.id = this.id;
      result.order = this.order;
      result.reason = this.reason;
      result.sales = this.sales;
      result.user = this.user;
      return result;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder happenedAt(OffsetDateTime happenedAt) {
      this.happenedAt = happenedAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder reason(OrderActionType reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder sales(SaleConnection sales) {
      this.sales = sales;
      return this;
    }

    
    public Builder user(StaffMember user) {
      this.user = user;
      return this;
    }
  }
}
