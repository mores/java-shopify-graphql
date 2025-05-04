package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * An agreement associated with an order placement.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderAgreement implements com.shopify.admin.types.SalesAgreement {
  /**
   * The application that created the agreement.
   */
  private App app;

  /**
   * The date and time at which the agreement occured.
   */
  private OffsetDateTime happenedAt;

  /**
   * The unique ID for the agreement.
   */
  private String id;

  /**
   * The order associated with the agreement.
   */
  private Order order;

  /**
   * The reason the agremeent was created.
   */
  private OrderActionType reason;

  /**
   * The sales associated with the agreement.
   */
  private SaleConnection sales;

  /**
   * The staff member associated with the agreement.
   */
  private StaffMember user;

  public OrderAgreement() {
  }

  /**
   * The application that created the agreement.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The date and time at which the agreement occured.
   */
  public OffsetDateTime getHappenedAt() {
    return happenedAt;
  }

  public void setHappenedAt(OffsetDateTime happenedAt) {
    this.happenedAt = happenedAt;
  }

  /**
   * The unique ID for the agreement.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The order associated with the agreement.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The reason the agremeent was created.
   */
  public OrderActionType getReason() {
    return reason;
  }

  public void setReason(OrderActionType reason) {
    this.reason = reason;
  }

  /**
   * The sales associated with the agreement.
   */
  public SaleConnection getSales() {
    return sales;
  }

  public void setSales(SaleConnection sales) {
    this.sales = sales;
  }

  /**
   * The staff member associated with the agreement.
   */
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
    /**
     * The application that created the agreement.
     */
    private App app;

    /**
     * The date and time at which the agreement occured.
     */
    private OffsetDateTime happenedAt;

    /**
     * The unique ID for the agreement.
     */
    private String id;

    /**
     * The order associated with the agreement.
     */
    private Order order;

    /**
     * The reason the agremeent was created.
     */
    private OrderActionType reason;

    /**
     * The sales associated with the agreement.
     */
    private SaleConnection sales;

    /**
     * The staff member associated with the agreement.
     */
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

    /**
     * The application that created the agreement.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The date and time at which the agreement occured.
     */
    public Builder happenedAt(OffsetDateTime happenedAt) {
      this.happenedAt = happenedAt;
      return this;
    }

    /**
     * The unique ID for the agreement.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The order associated with the agreement.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The reason the agremeent was created.
     */
    public Builder reason(OrderActionType reason) {
      this.reason = reason;
      return this;
    }

    /**
     * The sales associated with the agreement.
     */
    public Builder sales(SaleConnection sales) {
      this.sales = sales;
      return this;
    }

    /**
     * The staff member associated with the agreement.
     */
    public Builder user(StaffMember user) {
      this.user = user;
      return this;
    }
  }
}
