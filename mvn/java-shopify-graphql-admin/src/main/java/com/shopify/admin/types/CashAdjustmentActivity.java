package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A cash adjustment activity.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashAdjustmentActivity implements com.shopify.admin.types.CashActivity {
  /**
   * The amount of cash added or removed as part of the activity.
   */
  private MoneyV2 cash;

  /**
   * The gift card associated with the activity.
   */
  private GiftCard giftCard;

  /**
   * A note associated with the activity.
   */
  private String note;

  /**
   * The point of sale device payment session associated with the activity.
   */
  private PointOfSaleDevicePaymentSession paymentSession;

  /**
   * The reason code for the activity.
   */
  private CashManagementReasonCode reasonCode;

  /**
   * The staff member who performed the activity.
   */
  private StaffMember staffMember;

  /**
   * The time at which the activity occurred.
   */
  private OffsetDateTime time;

  /**
   * The type of adjustment activity.
   */
  private CashAdjustmentActivityType type;

  public CashAdjustmentActivity() {
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
   * The gift card associated with the activity.
   */
  public GiftCard getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(GiftCard giftCard) {
    this.giftCard = giftCard;
  }

  /**
   * A note associated with the activity.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
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
   * The reason code for the activity.
   */
  public CashManagementReasonCode getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(CashManagementReasonCode reasonCode) {
    this.reasonCode = reasonCode;
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
   * The type of adjustment activity.
   */
  public CashAdjustmentActivityType getType() {
    return type;
  }

  public void setType(CashAdjustmentActivityType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "CashAdjustmentActivity{cash='" + cash + "', giftCard='" + giftCard + "', note='" + note + "', paymentSession='" + paymentSession + "', reasonCode='" + reasonCode + "', staffMember='" + staffMember + "', time='" + time + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashAdjustmentActivity that = (CashAdjustmentActivity) o;
    return Objects.equals(cash, that.cash) &&
        Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(note, that.note) &&
        Objects.equals(paymentSession, that.paymentSession) &&
        Objects.equals(reasonCode, that.reasonCode) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(time, that.time) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cash, giftCard, note, paymentSession, reasonCode, staffMember, time, type);
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
     * The gift card associated with the activity.
     */
    private GiftCard giftCard;

    /**
     * A note associated with the activity.
     */
    private String note;

    /**
     * The point of sale device payment session associated with the activity.
     */
    private PointOfSaleDevicePaymentSession paymentSession;

    /**
     * The reason code for the activity.
     */
    private CashManagementReasonCode reasonCode;

    /**
     * The staff member who performed the activity.
     */
    private StaffMember staffMember;

    /**
     * The time at which the activity occurred.
     */
    private OffsetDateTime time;

    /**
     * The type of adjustment activity.
     */
    private CashAdjustmentActivityType type;

    public CashAdjustmentActivity build() {
      CashAdjustmentActivity result = new CashAdjustmentActivity();
      result.cash = this.cash;
      result.giftCard = this.giftCard;
      result.note = this.note;
      result.paymentSession = this.paymentSession;
      result.reasonCode = this.reasonCode;
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
     * The gift card associated with the activity.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * A note associated with the activity.
     */
    public Builder note(String note) {
      this.note = note;
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
     * The reason code for the activity.
     */
    public Builder reasonCode(CashManagementReasonCode reasonCode) {
      this.reasonCode = reasonCode;
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
     * The type of adjustment activity.
     */
    public Builder type(CashAdjustmentActivityType type) {
      this.type = type;
      return this;
    }
  }
}
