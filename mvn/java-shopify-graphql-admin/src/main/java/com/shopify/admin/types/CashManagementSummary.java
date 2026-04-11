package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A summary of cash management data.
 */
public class CashManagementSummary {
  /**
   * The cumulative cash balance of all cash drawers at the provided end date.
   */
  private MoneyV2 cashBalanceAtEnd;

  /**
   * The cumulative cash balance of all cash drawers at the provided start date.
   */
  private MoneyV2 cashBalanceAtStart;

  /**
   * The net cash flow during the specified period (start date to end date). Calculated as net sales plus adjustments.
   */
  private MoneyV2 netCash;

  /**
   * The number of sessions that were closed during the specified period (start date to end date).
   */
  private int sessionsClosed;

  /**
   * The number of sessions that were opened during the specified period (start date to end date).
   */
  private int sessionsOpened;

  /**
   * The total cash discrepancies during the specified period (start date to end date).
   */
  private MoneyV2 totalDiscrepancies;

  public CashManagementSummary() {
  }

  /**
   * The cumulative cash balance of all cash drawers at the provided end date.
   */
  public MoneyV2 getCashBalanceAtEnd() {
    return cashBalanceAtEnd;
  }

  public void setCashBalanceAtEnd(MoneyV2 cashBalanceAtEnd) {
    this.cashBalanceAtEnd = cashBalanceAtEnd;
  }

  /**
   * The cumulative cash balance of all cash drawers at the provided start date.
   */
  public MoneyV2 getCashBalanceAtStart() {
    return cashBalanceAtStart;
  }

  public void setCashBalanceAtStart(MoneyV2 cashBalanceAtStart) {
    this.cashBalanceAtStart = cashBalanceAtStart;
  }

  /**
   * The net cash flow during the specified period (start date to end date). Calculated as net sales plus adjustments.
   */
  public MoneyV2 getNetCash() {
    return netCash;
  }

  public void setNetCash(MoneyV2 netCash) {
    this.netCash = netCash;
  }

  /**
   * The number of sessions that were closed during the specified period (start date to end date).
   */
  public int getSessionsClosed() {
    return sessionsClosed;
  }

  public void setSessionsClosed(int sessionsClosed) {
    this.sessionsClosed = sessionsClosed;
  }

  /**
   * The number of sessions that were opened during the specified period (start date to end date).
   */
  public int getSessionsOpened() {
    return sessionsOpened;
  }

  public void setSessionsOpened(int sessionsOpened) {
    this.sessionsOpened = sessionsOpened;
  }

  /**
   * The total cash discrepancies during the specified period (start date to end date).
   */
  public MoneyV2 getTotalDiscrepancies() {
    return totalDiscrepancies;
  }

  public void setTotalDiscrepancies(MoneyV2 totalDiscrepancies) {
    this.totalDiscrepancies = totalDiscrepancies;
  }

  @Override
  public String toString() {
    return "CashManagementSummary{cashBalanceAtEnd='" + cashBalanceAtEnd + "', cashBalanceAtStart='" + cashBalanceAtStart + "', netCash='" + netCash + "', sessionsClosed='" + sessionsClosed + "', sessionsOpened='" + sessionsOpened + "', totalDiscrepancies='" + totalDiscrepancies + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashManagementSummary that = (CashManagementSummary) o;
    return Objects.equals(cashBalanceAtEnd, that.cashBalanceAtEnd) &&
        Objects.equals(cashBalanceAtStart, that.cashBalanceAtStart) &&
        Objects.equals(netCash, that.netCash) &&
        sessionsClosed == that.sessionsClosed &&
        sessionsOpened == that.sessionsOpened &&
        Objects.equals(totalDiscrepancies, that.totalDiscrepancies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashBalanceAtEnd, cashBalanceAtStart, netCash, sessionsClosed, sessionsOpened, totalDiscrepancies);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The cumulative cash balance of all cash drawers at the provided end date.
     */
    private MoneyV2 cashBalanceAtEnd;

    /**
     * The cumulative cash balance of all cash drawers at the provided start date.
     */
    private MoneyV2 cashBalanceAtStart;

    /**
     * The net cash flow during the specified period (start date to end date). Calculated as net sales plus adjustments.
     */
    private MoneyV2 netCash;

    /**
     * The number of sessions that were closed during the specified period (start date to end date).
     */
    private int sessionsClosed;

    /**
     * The number of sessions that were opened during the specified period (start date to end date).
     */
    private int sessionsOpened;

    /**
     * The total cash discrepancies during the specified period (start date to end date).
     */
    private MoneyV2 totalDiscrepancies;

    public CashManagementSummary build() {
      CashManagementSummary result = new CashManagementSummary();
      result.cashBalanceAtEnd = this.cashBalanceAtEnd;
      result.cashBalanceAtStart = this.cashBalanceAtStart;
      result.netCash = this.netCash;
      result.sessionsClosed = this.sessionsClosed;
      result.sessionsOpened = this.sessionsOpened;
      result.totalDiscrepancies = this.totalDiscrepancies;
      return result;
    }

    /**
     * The cumulative cash balance of all cash drawers at the provided end date.
     */
    public Builder cashBalanceAtEnd(MoneyV2 cashBalanceAtEnd) {
      this.cashBalanceAtEnd = cashBalanceAtEnd;
      return this;
    }

    /**
     * The cumulative cash balance of all cash drawers at the provided start date.
     */
    public Builder cashBalanceAtStart(MoneyV2 cashBalanceAtStart) {
      this.cashBalanceAtStart = cashBalanceAtStart;
      return this;
    }

    /**
     * The net cash flow during the specified period (start date to end date). Calculated as net sales plus adjustments.
     */
    public Builder netCash(MoneyV2 netCash) {
      this.netCash = netCash;
      return this;
    }

    /**
     * The number of sessions that were closed during the specified period (start date to end date).
     */
    public Builder sessionsClosed(int sessionsClosed) {
      this.sessionsClosed = sessionsClosed;
      return this;
    }

    /**
     * The number of sessions that were opened during the specified period (start date to end date).
     */
    public Builder sessionsOpened(int sessionsOpened) {
      this.sessionsOpened = sessionsOpened;
      return this;
    }

    /**
     * The total cash discrepancies during the specified period (start date to end date).
     */
    public Builder totalDiscrepancies(MoneyV2 totalDiscrepancies) {
      this.totalDiscrepancies = totalDiscrepancies;
      return this;
    }
  }
}
