package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A cash transaction activity.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashTransactionActivity implements com.shopify.admin.types.CashActivity {
  /**
   * The amount of cash added or removed as part of the activity.
   */
  private MoneyV2 cash;

  /**
   * The order transaction associated with the activity.
   */
  private OrderTransaction orderTransaction;

  /**
   * The point of sale device payment session associated with the activity.
   */
  private PointOfSaleDevicePaymentSession paymentSession;

  /**
   * The staff member who performed the activity.
   */
  private StaffMember staffMember;

  /**
   * The time at which the activity occurred.
   */
  private OffsetDateTime time;

  /**
   * The type of transaction activity.
   */
  private CashTransactionActivityType type;

  public CashTransactionActivity() {
  }

  /**
   * The amount of cash added or removed as part of the activity.
   */
  public MoneyV2 getCash() {
    return cash;
  }

  public void setCash(MoneyV2 cash) {
    this.cash = cash;
  }

  /**
   * The order transaction associated with the activity.
   */
  public OrderTransaction getOrderTransaction() {
    return orderTransaction;
  }

  public void setOrderTransaction(OrderTransaction orderTransaction) {
    this.orderTransaction = orderTransaction;
  }

  /**
   * The point of sale device payment session associated with the activity.
   */
  public PointOfSaleDevicePaymentSession getPaymentSession() {
    return paymentSession;
  }

  public void setPaymentSession(PointOfSaleDevicePaymentSession paymentSession) {
    this.paymentSession = paymentSession;
  }

  /**
   * The staff member who performed the activity.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The time at which the activity occurred.
   */
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  /**
   * The type of transaction activity.
   */
  public CashTransactionActivityType getType() {
    return type;
  }

  public void setType(CashTransactionActivityType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "CashTransactionActivity{cash='" + cash + "', orderTransaction='" + orderTransaction + "', paymentSession='" + paymentSession + "', staffMember='" + staffMember + "', time='" + time + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashTransactionActivity that = (CashTransactionActivity) o;
    return Objects.equals(cash, that.cash) &&
        Objects.equals(orderTransaction, that.orderTransaction) &&
        Objects.equals(paymentSession, that.paymentSession) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(time, that.time) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cash, orderTransaction, paymentSession, staffMember, time, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of cash added or removed as part of the activity.
     */
    private MoneyV2 cash;

    /**
     * The order transaction associated with the activity.
     */
    private OrderTransaction orderTransaction;

    /**
     * The point of sale device payment session associated with the activity.
     */
    private PointOfSaleDevicePaymentSession paymentSession;

    /**
     * The staff member who performed the activity.
     */
    private StaffMember staffMember;

    /**
     * The time at which the activity occurred.
     */
    private OffsetDateTime time;

    /**
     * The type of transaction activity.
     */
    private CashTransactionActivityType type;

    public CashTransactionActivity build() {
      CashTransactionActivity result = new CashTransactionActivity();
      result.cash = this.cash;
      result.orderTransaction = this.orderTransaction;
      result.paymentSession = this.paymentSession;
      result.staffMember = this.staffMember;
      result.time = this.time;
      result.type = this.type;
      return result;
    }

    /**
     * The amount of cash added or removed as part of the activity.
     */
    public Builder cash(MoneyV2 cash) {
      this.cash = cash;
      return this;
    }

    /**
     * The order transaction associated with the activity.
     */
    public Builder orderTransaction(OrderTransaction orderTransaction) {
      this.orderTransaction = orderTransaction;
      return this;
    }

    /**
     * The point of sale device payment session associated with the activity.
     */
    public Builder paymentSession(PointOfSaleDevicePaymentSession paymentSession) {
      this.paymentSession = paymentSession;
      return this;
    }

    /**
     * The staff member who performed the activity.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The time at which the activity occurred.
     */
    public Builder time(OffsetDateTime time) {
      this.time = time;
      return this;
    }

    /**
     * The type of transaction activity.
     */
    public Builder type(CashTransactionActivityType type) {
      this.type = type;
      return this;
    }
  }
}
