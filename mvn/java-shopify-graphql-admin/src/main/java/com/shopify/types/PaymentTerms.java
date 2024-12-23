package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the payment terms for an order or draft order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PaymentTerms implements com.shopify.types.Node {
  /**
   * The draft order associated with the payment terms.
   */
  private DraftOrder draftOrder;

  /**
   * Duration of payment terms in days based on the payment terms template used to create the payment terms.
   */
  private Integer dueInDays;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The order associated with the payment terms.
   */
  private Order order;

  /**
   * Whether the payment terms have overdue payment schedules.
   */
  private boolean overdue;

  /**
   * List of schedules for the payment terms.
   */
  private PaymentScheduleConnection paymentSchedules;

  /**
   * The name of the payment terms template used to create the payment terms.
   */
  private String paymentTermsName;

  /**
   * The payment terms template type used to create the payment terms.
   */
  private PaymentTermsType paymentTermsType;

  /**
   * The payment terms name, translated into the shop admin's preferred language.
   */
  private String translatedName;

  public PaymentTerms() {
  }

  /**
   * The draft order associated with the payment terms.
   */
  public DraftOrder getDraftOrder() {
    return draftOrder;
  }

  public void setDraftOrder(DraftOrder draftOrder) {
    this.draftOrder = draftOrder;
  }

  /**
   * Duration of payment terms in days based on the payment terms template used to create the payment terms.
   */
  public Integer getDueInDays() {
    return dueInDays;
  }

  public void setDueInDays(Integer dueInDays) {
    this.dueInDays = dueInDays;
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
   * The order associated with the payment terms.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * Whether the payment terms have overdue payment schedules.
   */
  public boolean getOverdue() {
    return overdue;
  }

  public void setOverdue(boolean overdue) {
    this.overdue = overdue;
  }

  /**
   * List of schedules for the payment terms.
   */
  public PaymentScheduleConnection getPaymentSchedules() {
    return paymentSchedules;
  }

  public void setPaymentSchedules(PaymentScheduleConnection paymentSchedules) {
    this.paymentSchedules = paymentSchedules;
  }

  /**
   * The name of the payment terms template used to create the payment terms.
   */
  public String getPaymentTermsName() {
    return paymentTermsName;
  }

  public void setPaymentTermsName(String paymentTermsName) {
    this.paymentTermsName = paymentTermsName;
  }

  /**
   * The payment terms template type used to create the payment terms.
   */
  public PaymentTermsType getPaymentTermsType() {
    return paymentTermsType;
  }

  public void setPaymentTermsType(PaymentTermsType paymentTermsType) {
    this.paymentTermsType = paymentTermsType;
  }

  /**
   * The payment terms name, translated into the shop admin's preferred language.
   */
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }

  @Override
  public String toString() {
    return "PaymentTerms{draftOrder='" + draftOrder + "', dueInDays='" + dueInDays + "', id='" + id + "', order='" + order + "', overdue='" + overdue + "', paymentSchedules='" + paymentSchedules + "', paymentTermsName='" + paymentTermsName + "', paymentTermsType='" + paymentTermsType + "', translatedName='" + translatedName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTerms that = (PaymentTerms) o;
    return Objects.equals(draftOrder, that.draftOrder) &&
        Objects.equals(dueInDays, that.dueInDays) &&
        Objects.equals(id, that.id) &&
        Objects.equals(order, that.order) &&
        overdue == that.overdue &&
        Objects.equals(paymentSchedules, that.paymentSchedules) &&
        Objects.equals(paymentTermsName, that.paymentTermsName) &&
        Objects.equals(paymentTermsType, that.paymentTermsType) &&
        Objects.equals(translatedName, that.translatedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draftOrder, dueInDays, id, order, overdue, paymentSchedules, paymentTermsName, paymentTermsType, translatedName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The draft order associated with the payment terms.
     */
    private DraftOrder draftOrder;

    /**
     * Duration of payment terms in days based on the payment terms template used to create the payment terms.
     */
    private Integer dueInDays;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The order associated with the payment terms.
     */
    private Order order;

    /**
     * Whether the payment terms have overdue payment schedules.
     */
    private boolean overdue;

    /**
     * List of schedules for the payment terms.
     */
    private PaymentScheduleConnection paymentSchedules;

    /**
     * The name of the payment terms template used to create the payment terms.
     */
    private String paymentTermsName;

    /**
     * The payment terms template type used to create the payment terms.
     */
    private PaymentTermsType paymentTermsType;

    /**
     * The payment terms name, translated into the shop admin's preferred language.
     */
    private String translatedName;

    public PaymentTerms build() {
      PaymentTerms result = new PaymentTerms();
      result.draftOrder = this.draftOrder;
      result.dueInDays = this.dueInDays;
      result.id = this.id;
      result.order = this.order;
      result.overdue = this.overdue;
      result.paymentSchedules = this.paymentSchedules;
      result.paymentTermsName = this.paymentTermsName;
      result.paymentTermsType = this.paymentTermsType;
      result.translatedName = this.translatedName;
      return result;
    }

    /**
     * The draft order associated with the payment terms.
     */
    public Builder draftOrder(DraftOrder draftOrder) {
      this.draftOrder = draftOrder;
      return this;
    }

    /**
     * Duration of payment terms in days based on the payment terms template used to create the payment terms.
     */
    public Builder dueInDays(Integer dueInDays) {
      this.dueInDays = dueInDays;
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
     * The order associated with the payment terms.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * Whether the payment terms have overdue payment schedules.
     */
    public Builder overdue(boolean overdue) {
      this.overdue = overdue;
      return this;
    }

    /**
     * List of schedules for the payment terms.
     */
    public Builder paymentSchedules(PaymentScheduleConnection paymentSchedules) {
      this.paymentSchedules = paymentSchedules;
      return this;
    }

    /**
     * The name of the payment terms template used to create the payment terms.
     */
    public Builder paymentTermsName(String paymentTermsName) {
      this.paymentTermsName = paymentTermsName;
      return this;
    }

    /**
     * The payment terms template type used to create the payment terms.
     */
    public Builder paymentTermsType(PaymentTermsType paymentTermsType) {
      this.paymentTermsType = paymentTermsType;
      return this;
    }

    /**
     * The payment terms name, translated into the shop admin's preferred language.
     */
    public Builder translatedName(String translatedName) {
      this.translatedName = translatedName;
      return this;
    }
  }
}
