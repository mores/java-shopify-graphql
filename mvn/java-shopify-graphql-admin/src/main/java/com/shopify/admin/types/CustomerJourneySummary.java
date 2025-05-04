package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a customer's visiting activities on a shop's online store.
 */
public class CustomerJourneySummary {
  /**
   * The position of the current order within the customer's order history. Test orders aren't included.
   */
  private Integer customerOrderIndex;

  /**
   * The number of days between the first session and the order creation date. The
   * first session represents the first session since the last order, or the first
   * session within the 30 day attribution window, if more than 30 days have passed
   * since the last order.
   */
  private Integer daysToConversion;

  /**
   * The customer's first session going into the shop.
   */
  private CustomerVisit firstVisit;

  /**
   * The last session before an order is made.
   */
  private CustomerVisit lastVisit;

  /**
   * The events preceding a customer's order, such as shop sessions.
   */
  private CustomerMomentConnection moments;

  /**
   * The total number of customer moments associated with this order. Returns null
   * if the order is still in the process of being attributed.
   */
  private Count momentsCount;

  /**
   * Whether the attributed sessions for the order have been created yet.
   */
  private boolean ready;

  public CustomerJourneySummary() {
  }

  /**
   * The position of the current order within the customer's order history. Test orders aren't included.
   */
  public Integer getCustomerOrderIndex() {
    return customerOrderIndex;
  }

  public void setCustomerOrderIndex(Integer customerOrderIndex) {
    this.customerOrderIndex = customerOrderIndex;
  }

  /**
   * The number of days between the first session and the order creation date. The
   * first session represents the first session since the last order, or the first
   * session within the 30 day attribution window, if more than 30 days have passed
   * since the last order.
   */
  public Integer getDaysToConversion() {
    return daysToConversion;
  }

  public void setDaysToConversion(Integer daysToConversion) {
    this.daysToConversion = daysToConversion;
  }

  /**
   * The customer's first session going into the shop.
   */
  public CustomerVisit getFirstVisit() {
    return firstVisit;
  }

  public void setFirstVisit(CustomerVisit firstVisit) {
    this.firstVisit = firstVisit;
  }

  /**
   * The last session before an order is made.
   */
  public CustomerVisit getLastVisit() {
    return lastVisit;
  }

  public void setLastVisit(CustomerVisit lastVisit) {
    this.lastVisit = lastVisit;
  }

  /**
   * The events preceding a customer's order, such as shop sessions.
   */
  public CustomerMomentConnection getMoments() {
    return moments;
  }

  public void setMoments(CustomerMomentConnection moments) {
    this.moments = moments;
  }

  /**
   * The total number of customer moments associated with this order. Returns null
   * if the order is still in the process of being attributed.
   */
  public Count getMomentsCount() {
    return momentsCount;
  }

  public void setMomentsCount(Count momentsCount) {
    this.momentsCount = momentsCount;
  }

  /**
   * Whether the attributed sessions for the order have been created yet.
   */
  public boolean getReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  @Override
  public String toString() {
    return "CustomerJourneySummary{customerOrderIndex='" + customerOrderIndex + "', daysToConversion='" + daysToConversion + "', firstVisit='" + firstVisit + "', lastVisit='" + lastVisit + "', moments='" + moments + "', momentsCount='" + momentsCount + "', ready='" + ready + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerJourneySummary that = (CustomerJourneySummary) o;
    return Objects.equals(customerOrderIndex, that.customerOrderIndex) &&
        Objects.equals(daysToConversion, that.daysToConversion) &&
        Objects.equals(firstVisit, that.firstVisit) &&
        Objects.equals(lastVisit, that.lastVisit) &&
        Objects.equals(moments, that.moments) &&
        Objects.equals(momentsCount, that.momentsCount) &&
        ready == that.ready;
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderIndex, daysToConversion, firstVisit, lastVisit, moments, momentsCount, ready);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The position of the current order within the customer's order history. Test orders aren't included.
     */
    private Integer customerOrderIndex;

    /**
     * The number of days between the first session and the order creation date. The
     * first session represents the first session since the last order, or the first
     * session within the 30 day attribution window, if more than 30 days have passed
     * since the last order.
     */
    private Integer daysToConversion;

    /**
     * The customer's first session going into the shop.
     */
    private CustomerVisit firstVisit;

    /**
     * The last session before an order is made.
     */
    private CustomerVisit lastVisit;

    /**
     * The events preceding a customer's order, such as shop sessions.
     */
    private CustomerMomentConnection moments;

    /**
     * The total number of customer moments associated with this order. Returns null
     * if the order is still in the process of being attributed.
     */
    private Count momentsCount;

    /**
     * Whether the attributed sessions for the order have been created yet.
     */
    private boolean ready;

    public CustomerJourneySummary build() {
      CustomerJourneySummary result = new CustomerJourneySummary();
      result.customerOrderIndex = this.customerOrderIndex;
      result.daysToConversion = this.daysToConversion;
      result.firstVisit = this.firstVisit;
      result.lastVisit = this.lastVisit;
      result.moments = this.moments;
      result.momentsCount = this.momentsCount;
      result.ready = this.ready;
      return result;
    }

    /**
     * The position of the current order within the customer's order history. Test orders aren't included.
     */
    public Builder customerOrderIndex(Integer customerOrderIndex) {
      this.customerOrderIndex = customerOrderIndex;
      return this;
    }

    /**
     * The number of days between the first session and the order creation date. The
     * first session represents the first session since the last order, or the first
     * session within the 30 day attribution window, if more than 30 days have passed
     * since the last order.
     */
    public Builder daysToConversion(Integer daysToConversion) {
      this.daysToConversion = daysToConversion;
      return this;
    }

    /**
     * The customer's first session going into the shop.
     */
    public Builder firstVisit(CustomerVisit firstVisit) {
      this.firstVisit = firstVisit;
      return this;
    }

    /**
     * The last session before an order is made.
     */
    public Builder lastVisit(CustomerVisit lastVisit) {
      this.lastVisit = lastVisit;
      return this;
    }

    /**
     * The events preceding a customer's order, such as shop sessions.
     */
    public Builder moments(CustomerMomentConnection moments) {
      this.moments = moments;
      return this;
    }

    /**
     * The total number of customer moments associated with this order. Returns null
     * if the order is still in the process of being attributed.
     */
    public Builder momentsCount(Count momentsCount) {
      this.momentsCount = momentsCount;
      return this;
    }

    /**
     * Whether the attributed sessions for the order have been created yet.
     */
    public Builder ready(boolean ready) {
      this.ready = ready;
      return this;
    }
  }
}
