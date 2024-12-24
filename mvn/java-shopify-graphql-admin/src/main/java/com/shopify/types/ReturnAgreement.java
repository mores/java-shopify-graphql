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
public class ReturnAgreement implements com.shopify.types.SalesAgreement {
  
  private App app;

  
  private OffsetDateTime happenedAt;

  
  private String id;

  
  private OrderActionType reason;

  
  private Return _return;

  
  private SaleConnection sales;

  
  private StaffMember user;

  public ReturnAgreement() {
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

  
  public OrderActionType getReason() {
    return reason;
  }

  public void setReason(OrderActionType reason) {
    this.reason = reason;
  }

  
  public Return getReturn() {
    return _return;
  }

  public void setReturn(Return _return) {
    this._return = _return;
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
    return "ReturnAgreement{app='" + app + "', happenedAt='" + happenedAt + "', id='" + id + "', reason='" + reason + "', return='" + _return + "', sales='" + sales + "', user='" + user + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnAgreement that = (ReturnAgreement) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(happenedAt, that.happenedAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(_return, that._return) &&
        Objects.equals(sales, that.sales) &&
        Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, happenedAt, id, reason, _return, sales, user);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private OffsetDateTime happenedAt;

    
    private String id;

    
    private OrderActionType reason;

    
    private Return _return;

    
    private SaleConnection sales;

    
    private StaffMember user;

    public ReturnAgreement build() {
      ReturnAgreement result = new ReturnAgreement();
      result.app = this.app;
      result.happenedAt = this.happenedAt;
      result.id = this.id;
      result.reason = this.reason;
      result._return = this._return;
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

    
    public Builder reason(OrderActionType reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder _return(Return _return) {
      this._return = _return;
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
