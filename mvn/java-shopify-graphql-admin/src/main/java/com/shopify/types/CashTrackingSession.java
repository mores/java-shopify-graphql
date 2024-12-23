package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Tracks the balance in a cash drawer for a point of sale device over the course of a shift.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashTrackingSession implements com.shopify.types.Node {
  /**
   * The adjustments made to the cash drawer during this session.
   */
  private CashTrackingAdjustmentConnection adjustments;

  /**
   * Whether this session is tracking cash payments.
   */
  private boolean cashTrackingEnabled;

  /**
   * The cash transactions made during this session.
   */
  private OrderTransactionConnection cashTransactions;

  /**
   * The counted cash balance when the session was closed.
   */
  private MoneyV2 closingBalance;

  /**
   * The note entered when the session was closed.
   */
  private String closingNote;

  /**
   * The user who closed the session.
   */
  private StaffMember closingStaffMember;

  /**
   * When the session was closed.
   */
  private OffsetDateTime closingTime;

  /**
   * The expected balance at the end of the session or the expected current balance for sessions that are still open.
   */
  private MoneyV2 expectedBalance;

  /**
   * The amount that was expected to be in the cash drawer at the end of the session, calculated after the session was closed.
   */
  private MoneyV2 expectedClosingBalance;

  /**
   * The amount expected to be in the cash drawer based on the previous session.
   */
  private MoneyV2 expectedOpeningBalance;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The location of the point of sale device during this session.
   */
  private Location location;

  /**
   * The net cash sales made for the duration of this cash tracking session.
   */
  private MoneyV2 netCashSales;

  /**
   * The counted cash balance when the session was opened.
   */
  private MoneyV2 openingBalance;

  /**
   * The note entered when the session was opened.
   */
  private String openingNote;

  /**
   * The user who opened the session.
   */
  private StaffMember openingStaffMember;

  /**
   * When the session was opened.
   */
  private OffsetDateTime openingTime;

  /**
   * The register name for the point of sale device that this session is tracking cash for.
   */
  private String registerName;

  /**
   * The sum of all adjustments made during the session, excluding the final adjustment.
   */
  private MoneyV2 totalAdjustments;

  /**
   * The sum of all cash refunds for the duration of this cash tracking session.
   */
  private MoneyV2 totalCashRefunds;

  /**
   * The sum of all cash sales for the duration of this cash tracking session.
   */
  private MoneyV2 totalCashSales;

  /**
   * The total discrepancy for the session including starting and ending.
   */
  private MoneyV2 totalDiscrepancy;

  public CashTrackingSession() {
  }

  /**
   * The adjustments made to the cash drawer during this session.
   */
  public CashTrackingAdjustmentConnection getAdjustments() {
    return adjustments;
  }

  public void setAdjustments(CashTrackingAdjustmentConnection adjustments) {
    this.adjustments = adjustments;
  }

  /**
   * Whether this session is tracking cash payments.
   */
  public boolean getCashTrackingEnabled() {
    return cashTrackingEnabled;
  }

  public void setCashTrackingEnabled(boolean cashTrackingEnabled) {
    this.cashTrackingEnabled = cashTrackingEnabled;
  }

  /**
   * The cash transactions made during this session.
   */
  public OrderTransactionConnection getCashTransactions() {
    return cashTransactions;
  }

  public void setCashTransactions(OrderTransactionConnection cashTransactions) {
    this.cashTransactions = cashTransactions;
  }

  /**
   * The counted cash balance when the session was closed.
   */
  public MoneyV2 getClosingBalance() {
    return closingBalance;
  }

  public void setClosingBalance(MoneyV2 closingBalance) {
    this.closingBalance = closingBalance;
  }

  /**
   * The note entered when the session was closed.
   */
  public String getClosingNote() {
    return closingNote;
  }

  public void setClosingNote(String closingNote) {
    this.closingNote = closingNote;
  }

  /**
   * The user who closed the session.
   */
  public StaffMember getClosingStaffMember() {
    return closingStaffMember;
  }

  public void setClosingStaffMember(StaffMember closingStaffMember) {
    this.closingStaffMember = closingStaffMember;
  }

  /**
   * When the session was closed.
   */
  public OffsetDateTime getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(OffsetDateTime closingTime) {
    this.closingTime = closingTime;
  }

  /**
   * The expected balance at the end of the session or the expected current balance for sessions that are still open.
   */
  public MoneyV2 getExpectedBalance() {
    return expectedBalance;
  }

  public void setExpectedBalance(MoneyV2 expectedBalance) {
    this.expectedBalance = expectedBalance;
  }

  /**
   * The amount that was expected to be in the cash drawer at the end of the session, calculated after the session was closed.
   */
  public MoneyV2 getExpectedClosingBalance() {
    return expectedClosingBalance;
  }

  public void setExpectedClosingBalance(MoneyV2 expectedClosingBalance) {
    this.expectedClosingBalance = expectedClosingBalance;
  }

  /**
   * The amount expected to be in the cash drawer based on the previous session.
   */
  public MoneyV2 getExpectedOpeningBalance() {
    return expectedOpeningBalance;
  }

  public void setExpectedOpeningBalance(MoneyV2 expectedOpeningBalance) {
    this.expectedOpeningBalance = expectedOpeningBalance;
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
   * The location of the point of sale device during this session.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The net cash sales made for the duration of this cash tracking session.
   */
  public MoneyV2 getNetCashSales() {
    return netCashSales;
  }

  public void setNetCashSales(MoneyV2 netCashSales) {
    this.netCashSales = netCashSales;
  }

  /**
   * The counted cash balance when the session was opened.
   */
  public MoneyV2 getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(MoneyV2 openingBalance) {
    this.openingBalance = openingBalance;
  }

  /**
   * The note entered when the session was opened.
   */
  public String getOpeningNote() {
    return openingNote;
  }

  public void setOpeningNote(String openingNote) {
    this.openingNote = openingNote;
  }

  /**
   * The user who opened the session.
   */
  public StaffMember getOpeningStaffMember() {
    return openingStaffMember;
  }

  public void setOpeningStaffMember(StaffMember openingStaffMember) {
    this.openingStaffMember = openingStaffMember;
  }

  /**
   * When the session was opened.
   */
  public OffsetDateTime getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
  }

  /**
   * The register name for the point of sale device that this session is tracking cash for.
   */
  public String getRegisterName() {
    return registerName;
  }

  public void setRegisterName(String registerName) {
    this.registerName = registerName;
  }

  /**
   * The sum of all adjustments made during the session, excluding the final adjustment.
   */
  public MoneyV2 getTotalAdjustments() {
    return totalAdjustments;
  }

  public void setTotalAdjustments(MoneyV2 totalAdjustments) {
    this.totalAdjustments = totalAdjustments;
  }

  /**
   * The sum of all cash refunds for the duration of this cash tracking session.
   */
  public MoneyV2 getTotalCashRefunds() {
    return totalCashRefunds;
  }

  public void setTotalCashRefunds(MoneyV2 totalCashRefunds) {
    this.totalCashRefunds = totalCashRefunds;
  }

  /**
   * The sum of all cash sales for the duration of this cash tracking session.
   */
  public MoneyV2 getTotalCashSales() {
    return totalCashSales;
  }

  public void setTotalCashSales(MoneyV2 totalCashSales) {
    this.totalCashSales = totalCashSales;
  }

  /**
   * The total discrepancy for the session including starting and ending.
   */
  public MoneyV2 getTotalDiscrepancy() {
    return totalDiscrepancy;
  }

  public void setTotalDiscrepancy(MoneyV2 totalDiscrepancy) {
    this.totalDiscrepancy = totalDiscrepancy;
  }

  @Override
  public String toString() {
    return "CashTrackingSession{adjustments='" + adjustments + "', cashTrackingEnabled='" + cashTrackingEnabled + "', cashTransactions='" + cashTransactions + "', closingBalance='" + closingBalance + "', closingNote='" + closingNote + "', closingStaffMember='" + closingStaffMember + "', closingTime='" + closingTime + "', expectedBalance='" + expectedBalance + "', expectedClosingBalance='" + expectedClosingBalance + "', expectedOpeningBalance='" + expectedOpeningBalance + "', id='" + id + "', location='" + location + "', netCashSales='" + netCashSales + "', openingBalance='" + openingBalance + "', openingNote='" + openingNote + "', openingStaffMember='" + openingStaffMember + "', openingTime='" + openingTime + "', registerName='" + registerName + "', totalAdjustments='" + totalAdjustments + "', totalCashRefunds='" + totalCashRefunds + "', totalCashSales='" + totalCashSales + "', totalDiscrepancy='" + totalDiscrepancy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashTrackingSession that = (CashTrackingSession) o;
    return Objects.equals(adjustments, that.adjustments) &&
        cashTrackingEnabled == that.cashTrackingEnabled &&
        Objects.equals(cashTransactions, that.cashTransactions) &&
        Objects.equals(closingBalance, that.closingBalance) &&
        Objects.equals(closingNote, that.closingNote) &&
        Objects.equals(closingStaffMember, that.closingStaffMember) &&
        Objects.equals(closingTime, that.closingTime) &&
        Objects.equals(expectedBalance, that.expectedBalance) &&
        Objects.equals(expectedClosingBalance, that.expectedClosingBalance) &&
        Objects.equals(expectedOpeningBalance, that.expectedOpeningBalance) &&
        Objects.equals(id, that.id) &&
        Objects.equals(location, that.location) &&
        Objects.equals(netCashSales, that.netCashSales) &&
        Objects.equals(openingBalance, that.openingBalance) &&
        Objects.equals(openingNote, that.openingNote) &&
        Objects.equals(openingStaffMember, that.openingStaffMember) &&
        Objects.equals(openingTime, that.openingTime) &&
        Objects.equals(registerName, that.registerName) &&
        Objects.equals(totalAdjustments, that.totalAdjustments) &&
        Objects.equals(totalCashRefunds, that.totalCashRefunds) &&
        Objects.equals(totalCashSales, that.totalCashSales) &&
        Objects.equals(totalDiscrepancy, that.totalDiscrepancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustments, cashTrackingEnabled, cashTransactions, closingBalance, closingNote, closingStaffMember, closingTime, expectedBalance, expectedClosingBalance, expectedOpeningBalance, id, location, netCashSales, openingBalance, openingNote, openingStaffMember, openingTime, registerName, totalAdjustments, totalCashRefunds, totalCashSales, totalDiscrepancy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The adjustments made to the cash drawer during this session.
     */
    private CashTrackingAdjustmentConnection adjustments;

    /**
     * Whether this session is tracking cash payments.
     */
    private boolean cashTrackingEnabled;

    /**
     * The cash transactions made during this session.
     */
    private OrderTransactionConnection cashTransactions;

    /**
     * The counted cash balance when the session was closed.
     */
    private MoneyV2 closingBalance;

    /**
     * The note entered when the session was closed.
     */
    private String closingNote;

    /**
     * The user who closed the session.
     */
    private StaffMember closingStaffMember;

    /**
     * When the session was closed.
     */
    private OffsetDateTime closingTime;

    /**
     * The expected balance at the end of the session or the expected current balance for sessions that are still open.
     */
    private MoneyV2 expectedBalance;

    /**
     * The amount that was expected to be in the cash drawer at the end of the session, calculated after the session was closed.
     */
    private MoneyV2 expectedClosingBalance;

    /**
     * The amount expected to be in the cash drawer based on the previous session.
     */
    private MoneyV2 expectedOpeningBalance;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The location of the point of sale device during this session.
     */
    private Location location;

    /**
     * The net cash sales made for the duration of this cash tracking session.
     */
    private MoneyV2 netCashSales;

    /**
     * The counted cash balance when the session was opened.
     */
    private MoneyV2 openingBalance;

    /**
     * The note entered when the session was opened.
     */
    private String openingNote;

    /**
     * The user who opened the session.
     */
    private StaffMember openingStaffMember;

    /**
     * When the session was opened.
     */
    private OffsetDateTime openingTime;

    /**
     * The register name for the point of sale device that this session is tracking cash for.
     */
    private String registerName;

    /**
     * The sum of all adjustments made during the session, excluding the final adjustment.
     */
    private MoneyV2 totalAdjustments;

    /**
     * The sum of all cash refunds for the duration of this cash tracking session.
     */
    private MoneyV2 totalCashRefunds;

    /**
     * The sum of all cash sales for the duration of this cash tracking session.
     */
    private MoneyV2 totalCashSales;

    /**
     * The total discrepancy for the session including starting and ending.
     */
    private MoneyV2 totalDiscrepancy;

    public CashTrackingSession build() {
      CashTrackingSession result = new CashTrackingSession();
      result.adjustments = this.adjustments;
      result.cashTrackingEnabled = this.cashTrackingEnabled;
      result.cashTransactions = this.cashTransactions;
      result.closingBalance = this.closingBalance;
      result.closingNote = this.closingNote;
      result.closingStaffMember = this.closingStaffMember;
      result.closingTime = this.closingTime;
      result.expectedBalance = this.expectedBalance;
      result.expectedClosingBalance = this.expectedClosingBalance;
      result.expectedOpeningBalance = this.expectedOpeningBalance;
      result.id = this.id;
      result.location = this.location;
      result.netCashSales = this.netCashSales;
      result.openingBalance = this.openingBalance;
      result.openingNote = this.openingNote;
      result.openingStaffMember = this.openingStaffMember;
      result.openingTime = this.openingTime;
      result.registerName = this.registerName;
      result.totalAdjustments = this.totalAdjustments;
      result.totalCashRefunds = this.totalCashRefunds;
      result.totalCashSales = this.totalCashSales;
      result.totalDiscrepancy = this.totalDiscrepancy;
      return result;
    }

    /**
     * The adjustments made to the cash drawer during this session.
     */
    public Builder adjustments(CashTrackingAdjustmentConnection adjustments) {
      this.adjustments = adjustments;
      return this;
    }

    /**
     * Whether this session is tracking cash payments.
     */
    public Builder cashTrackingEnabled(boolean cashTrackingEnabled) {
      this.cashTrackingEnabled = cashTrackingEnabled;
      return this;
    }

    /**
     * The cash transactions made during this session.
     */
    public Builder cashTransactions(OrderTransactionConnection cashTransactions) {
      this.cashTransactions = cashTransactions;
      return this;
    }

    /**
     * The counted cash balance when the session was closed.
     */
    public Builder closingBalance(MoneyV2 closingBalance) {
      this.closingBalance = closingBalance;
      return this;
    }

    /**
     * The note entered when the session was closed.
     */
    public Builder closingNote(String closingNote) {
      this.closingNote = closingNote;
      return this;
    }

    /**
     * The user who closed the session.
     */
    public Builder closingStaffMember(StaffMember closingStaffMember) {
      this.closingStaffMember = closingStaffMember;
      return this;
    }

    /**
     * When the session was closed.
     */
    public Builder closingTime(OffsetDateTime closingTime) {
      this.closingTime = closingTime;
      return this;
    }

    /**
     * The expected balance at the end of the session or the expected current balance for sessions that are still open.
     */
    public Builder expectedBalance(MoneyV2 expectedBalance) {
      this.expectedBalance = expectedBalance;
      return this;
    }

    /**
     * The amount that was expected to be in the cash drawer at the end of the session, calculated after the session was closed.
     */
    public Builder expectedClosingBalance(MoneyV2 expectedClosingBalance) {
      this.expectedClosingBalance = expectedClosingBalance;
      return this;
    }

    /**
     * The amount expected to be in the cash drawer based on the previous session.
     */
    public Builder expectedOpeningBalance(MoneyV2 expectedOpeningBalance) {
      this.expectedOpeningBalance = expectedOpeningBalance;
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
     * The location of the point of sale device during this session.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The net cash sales made for the duration of this cash tracking session.
     */
    public Builder netCashSales(MoneyV2 netCashSales) {
      this.netCashSales = netCashSales;
      return this;
    }

    /**
     * The counted cash balance when the session was opened.
     */
    public Builder openingBalance(MoneyV2 openingBalance) {
      this.openingBalance = openingBalance;
      return this;
    }

    /**
     * The note entered when the session was opened.
     */
    public Builder openingNote(String openingNote) {
      this.openingNote = openingNote;
      return this;
    }

    /**
     * The user who opened the session.
     */
    public Builder openingStaffMember(StaffMember openingStaffMember) {
      this.openingStaffMember = openingStaffMember;
      return this;
    }

    /**
     * When the session was opened.
     */
    public Builder openingTime(OffsetDateTime openingTime) {
      this.openingTime = openingTime;
      return this;
    }

    /**
     * The register name for the point of sale device that this session is tracking cash for.
     */
    public Builder registerName(String registerName) {
      this.registerName = registerName;
      return this;
    }

    /**
     * The sum of all adjustments made during the session, excluding the final adjustment.
     */
    public Builder totalAdjustments(MoneyV2 totalAdjustments) {
      this.totalAdjustments = totalAdjustments;
      return this;
    }

    /**
     * The sum of all cash refunds for the duration of this cash tracking session.
     */
    public Builder totalCashRefunds(MoneyV2 totalCashRefunds) {
      this.totalCashRefunds = totalCashRefunds;
      return this;
    }

    /**
     * The sum of all cash sales for the duration of this cash tracking session.
     */
    public Builder totalCashSales(MoneyV2 totalCashSales) {
      this.totalCashSales = totalCashSales;
      return this;
    }

    /**
     * The total discrepancy for the session including starting and ending.
     */
    public Builder totalDiscrepancy(MoneyV2 totalDiscrepancy) {
      this.totalDiscrepancy = totalDiscrepancy;
      return this;
    }
  }
}
