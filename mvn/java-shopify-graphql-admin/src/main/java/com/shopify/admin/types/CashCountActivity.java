package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A cash count activity.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashCountActivity implements com.shopify.admin.types.CashActivity {
  /**
   * The amount of cash added or removed as part of the activity.
   */
  private MoneyV2 cash;

  /**
   * The amount of cash counted during the activity.
   */
  private MoneyV2 cashCounted;

  /**
   * The discrepancy between the counted and expected cash amounts.
   */
  private MoneyV2 cashDiscrepancy;

  /**
   * The expected amount of cash in the drawer at the time of the activity.
   */
  private MoneyV2 cashExpected;

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
   * The type of count activity.
   */
  private CashCountActivityType type;

  public CashCountActivity() {
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
   * The amount of cash counted during the activity.
   */
  public MoneyV2 getCashCounted() {
    return cashCounted;
  }

  public void setCashCounted(MoneyV2 cashCounted) {
    this.cashCounted = cashCounted;
  }

  /**
   * The discrepancy between the counted and expected cash amounts.
   */
  public MoneyV2 getCashDiscrepancy() {
    return cashDiscrepancy;
  }

  public void setCashDiscrepancy(MoneyV2 cashDiscrepancy) {
    this.cashDiscrepancy = cashDiscrepancy;
  }

  /**
   * The expected amount of cash in the drawer at the time of the activity.
   */
  public MoneyV2 getCashExpected() {
    return cashExpected;
  }

  public void setCashExpected(MoneyV2 cashExpected) {
    this.cashExpected = cashExpected;
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
   * The type of count activity.
   */
  public CashCountActivityType getType() {
    return type;
  }

  public void setType(CashCountActivityType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "CashCountActivity{cash='" + cash + "', cashCounted='" + cashCounted + "', cashDiscrepancy='" + cashDiscrepancy + "', cashExpected='" + cashExpected + "', paymentSession='" + paymentSession + "', staffMember='" + staffMember + "', time='" + time + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashCountActivity that = (CashCountActivity) o;
    return Objects.equals(cash, that.cash) &&
        Objects.equals(cashCounted, that.cashCounted) &&
        Objects.equals(cashDiscrepancy, that.cashDiscrepancy) &&
        Objects.equals(cashExpected, that.cashExpected) &&
        Objects.equals(paymentSession, that.paymentSession) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(time, that.time) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cash, cashCounted, cashDiscrepancy, cashExpected, paymentSession, staffMember, time, type);
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
     * The amount of cash counted during the activity.
     */
    private MoneyV2 cashCounted;

    /**
     * The discrepancy between the counted and expected cash amounts.
     */
    private MoneyV2 cashDiscrepancy;

    /**
     * The expected amount of cash in the drawer at the time of the activity.
     */
    private MoneyV2 cashExpected;

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
     * The type of count activity.
     */
    private CashCountActivityType type;

    public CashCountActivity build() {
      CashCountActivity result = new CashCountActivity();
      result.cash = this.cash;
      result.cashCounted = this.cashCounted;
      result.cashDiscrepancy = this.cashDiscrepancy;
      result.cashExpected = this.cashExpected;
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
     * The amount of cash counted during the activity.
     */
    public Builder cashCounted(MoneyV2 cashCounted) {
      this.cashCounted = cashCounted;
      return this;
    }

    /**
     * The discrepancy between the counted and expected cash amounts.
     */
    public Builder cashDiscrepancy(MoneyV2 cashDiscrepancy) {
      this.cashDiscrepancy = cashDiscrepancy;
      return this;
    }

    /**
     * The expected amount of cash in the drawer at the time of the activity.
     */
    public Builder cashExpected(MoneyV2 cashExpected) {
      this.cashExpected = cashExpected;
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
     * The type of count activity.
     */
    public Builder type(CashCountActivityType type) {
      this.type = type;
      return this;
    }
  }
}
