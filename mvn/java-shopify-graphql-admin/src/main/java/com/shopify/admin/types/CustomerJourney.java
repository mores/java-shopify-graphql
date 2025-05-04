package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a customer's visiting activities on a shop's online store.
 */
public class CustomerJourney {
  /**
   * The position of the current order within the customer's order history.
   */
  private int customerOrderIndex;

  /**
   * The amount of days between first session and order creation date. First
   * session represents first session since the last order, or first session within
   * the 30 day attribution window, if more than 30 days has passed since the last order.
   */
  private int daysToConversion;

  /**
   * The customer's first session going into the shop.
   */
  private CustomerVisit firstVisit;

  /**
   * The last session before an order is made.
   */
  private CustomerVisit lastVisit;

  /**
   * Events preceding a customer order, such as shop sessions.
   */
  private List<CustomerMoment> moments;

  public CustomerJourney() {
  }

  /**
   * The position of the current order within the customer's order history.
   */
  public int getCustomerOrderIndex() {
    return customerOrderIndex;
  }

  public void setCustomerOrderIndex(int customerOrderIndex) {
    this.customerOrderIndex = customerOrderIndex;
  }

  /**
   * The amount of days between first session and order creation date. First
   * session represents first session since the last order, or first session within
   * the 30 day attribution window, if more than 30 days has passed since the last order.
   */
  public int getDaysToConversion() {
    return daysToConversion;
  }

  public void setDaysToConversion(int daysToConversion) {
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
   * Events preceding a customer order, such as shop sessions.
   */
  public List<CustomerMoment> getMoments() {
    return moments;
  }

  public void setMoments(List<CustomerMoment> moments) {
    this.moments = moments;
  }

  @Override
  public String toString() {
    return "CustomerJourney{customerOrderIndex='" + customerOrderIndex + "', daysToConversion='" + daysToConversion + "', firstVisit='" + firstVisit + "', lastVisit='" + lastVisit + "', moments='" + moments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerJourney that = (CustomerJourney) o;
    return customerOrderIndex == that.customerOrderIndex &&
        daysToConversion == that.daysToConversion &&
        Objects.equals(firstVisit, that.firstVisit) &&
        Objects.equals(lastVisit, that.lastVisit) &&
        Objects.equals(moments, that.moments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderIndex, daysToConversion, firstVisit, lastVisit, moments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The position of the current order within the customer's order history.
     */
    private int customerOrderIndex;

    /**
     * The amount of days between first session and order creation date. First
     * session represents first session since the last order, or first session within
     * the 30 day attribution window, if more than 30 days has passed since the last order.
     */
    private int daysToConversion;

    /**
     * The customer's first session going into the shop.
     */
    private CustomerVisit firstVisit;

    /**
     * The last session before an order is made.
     */
    private CustomerVisit lastVisit;

    /**
     * Events preceding a customer order, such as shop sessions.
     */
    private List<CustomerMoment> moments;

    public CustomerJourney build() {
      CustomerJourney result = new CustomerJourney();
      result.customerOrderIndex = this.customerOrderIndex;
      result.daysToConversion = this.daysToConversion;
      result.firstVisit = this.firstVisit;
      result.lastVisit = this.lastVisit;
      result.moments = this.moments;
      return result;
    }

    /**
     * The position of the current order within the customer's order history.
     */
    public Builder customerOrderIndex(int customerOrderIndex) {
      this.customerOrderIndex = customerOrderIndex;
      return this;
    }

    /**
     * The amount of days between first session and order creation date. First
     * session represents first session since the last order, or first session within
     * the 30 day attribution window, if more than 30 days has passed since the last order.
     */
    public Builder daysToConversion(int daysToConversion) {
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
     * Events preceding a customer order, such as shop sessions.
     */
    public Builder moments(List<CustomerMoment> moments) {
      this.moments = moments;
      return this;
    }
  }
}
