package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Tracks the payment activity for a point of sale device.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PointOfSaleDevicePaymentSession implements com.shopify.admin.types.Node {
  /**
   * The activities on the point of sale device payment session.
   */
  private CashActivityConnection cashActivities;

  /**
   * The cash that was physically counted when the point of sale device payment session was closed.
   */
  private MoneyV2 cashCountedAtClose;

  /**
   * The cash that was physically counted when the point of sale device payment session was opened.
   */
  private MoneyV2 cashCountedAtOpen;

  /**
   * The cash drawer associated with the point of sale device payment session. The
   * session's sales andcash tracking activity will affect the cash drawer's balance.
   */
  private CashDrawer cashDrawer;

  /**
   * The amount that the cash drawer balance was adjusted when the session was closed.
   */
  private MoneyV2 closingAdjustment;

  /**
   * The counted balance of the cash drawer when the point of sale device payment session was closed.
   */
  private MoneyV2 closingBalance;

  /**
   * The note associated with the point of sale device payment session closing.
   */
  private String closingNote;

  /**
   * The staff member who closed the point of sale device payment session.
   */
  private StaffMember closingStaffMember;

  /**
   * The time the point of sale device payment session was closed.
   */
  private OffsetDateTime closingTime;

  /**
   * The currency of the point of sale device payment session.
   */
  private String currency;

  /**
   * The expected cash when the point of sale device payment session was closed.
   */
  private MoneyV2 expectedCashAtClose;

  /**
   * The expected balance of the cash drawer when the point of sale device payment session was opened.
   */
  private MoneyV2 expectedCashAtOpen;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The location associated with the point of sale device payment session. The
   * session's sales and cash tracking activity will contribute to the location's totals.
   */
  private Location location;

  /**
   * The net cash sales for the point of sale device payment session.
   */
  private MoneyV2 netCashSales;

  /**
   * The net sales for the duration of this session.
   */
  private MoneyV2 netSales;

  /**
   * The note associated with the point of sale device payment session opening.
   */
  private String openingNote;

  /**
   * The staff member who opened the point of sale device payment session.
   */
  private StaffMember openingStaffMember;

  /**
   * The time the point of sale device payment session was opened.
   */
  private OffsetDateTime openingTime;

  /**
   * The point of sale device.
   */
  private PointOfSaleDevice pointOfSaleDevice;

  /**
   * Whether the point of sale device payment session is open. Payments can't be
   * processed or refunded during a closed session, and the cash drawer balance
   * can't be adjusted or corrected.
   */
  private PointOfSaleDevicePaymentSessionStatus status;

  /**
   * The total adjustments for the point of sale device payment session.
   */
  private MoneyV2 totalAdjustments;

  /**
   * The total cash refunds for the point of sale device payment session.
   */
  private MoneyV2 totalCashRefunds;

  /**
   * The total cash sales for the point of sale device payment session.
   */
  private MoneyV2 totalCashSales;

  /**
   * The total discrepancy for the point of sale device payment session.
   */
  private MoneyV2 totalDiscrepancy;

  /**
   * The sum of all refunds for the duration of this session.
   */
  private MoneyV2 totalRefunds;

  /**
   * The sum of all sales for the duration of this session.
   */
  private MoneyV2 totalSales;

  /**
   * Whether the point of sale device payment session totals are ready.
   */
  private boolean totalsReady;

  public PointOfSaleDevicePaymentSession() {
  }

  /**
   * The activities on the point of sale device payment session.
   */
  public CashActivityConnection getCashActivities() {
    return cashActivities;
  }

  public void setCashActivities(CashActivityConnection cashActivities) {
    this.cashActivities = cashActivities;
  }

  /**
   * The cash that was physically counted when the point of sale device payment session was closed.
   */
  public MoneyV2 getCashCountedAtClose() {
    return cashCountedAtClose;
  }

  public void setCashCountedAtClose(MoneyV2 cashCountedAtClose) {
    this.cashCountedAtClose = cashCountedAtClose;
  }

  /**
   * The cash that was physically counted when the point of sale device payment session was opened.
   */
  public MoneyV2 getCashCountedAtOpen() {
    return cashCountedAtOpen;
  }

  public void setCashCountedAtOpen(MoneyV2 cashCountedAtOpen) {
    this.cashCountedAtOpen = cashCountedAtOpen;
  }

  /**
   * The cash drawer associated with the point of sale device payment session. The
   * session's sales andcash tracking activity will affect the cash drawer's balance.
   */
  public CashDrawer getCashDrawer() {
    return cashDrawer;
  }

  public void setCashDrawer(CashDrawer cashDrawer) {
    this.cashDrawer = cashDrawer;
  }

  /**
   * The amount that the cash drawer balance was adjusted when the session was closed.
   */
  public MoneyV2 getClosingAdjustment() {
    return closingAdjustment;
  }

  public void setClosingAdjustment(MoneyV2 closingAdjustment) {
    this.closingAdjustment = closingAdjustment;
  }

  /**
   * The counted balance of the cash drawer when the point of sale device payment session was closed.
   */
  public MoneyV2 getClosingBalance() {
    return closingBalance;
  }

  public void setClosingBalance(MoneyV2 closingBalance) {
    this.closingBalance = closingBalance;
  }

  /**
   * The note associated with the point of sale device payment session closing.
   */
  public String getClosingNote() {
    return closingNote;
  }

  public void setClosingNote(String closingNote) {
    this.closingNote = closingNote;
  }

  /**
   * The staff member who closed the point of sale device payment session.
   */
  public StaffMember getClosingStaffMember() {
    return closingStaffMember;
  }

  public void setClosingStaffMember(StaffMember closingStaffMember) {
    this.closingStaffMember = closingStaffMember;
  }

  /**
   * The time the point of sale device payment session was closed.
   */
  public OffsetDateTime getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(OffsetDateTime closingTime) {
    this.closingTime = closingTime;
  }

  /**
   * The currency of the point of sale device payment session.
   */
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The expected cash when the point of sale device payment session was closed.
   */
  public MoneyV2 getExpectedCashAtClose() {
    return expectedCashAtClose;
  }

  public void setExpectedCashAtClose(MoneyV2 expectedCashAtClose) {
    this.expectedCashAtClose = expectedCashAtClose;
  }

  /**
   * The expected balance of the cash drawer when the point of sale device payment session was opened.
   */
  public MoneyV2 getExpectedCashAtOpen() {
    return expectedCashAtOpen;
  }

  public void setExpectedCashAtOpen(MoneyV2 expectedCashAtOpen) {
    this.expectedCashAtOpen = expectedCashAtOpen;
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
   * The location associated with the point of sale device payment session. The
   * session's sales and cash tracking activity will contribute to the location's totals.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The net cash sales for the point of sale device payment session.
   */
  public MoneyV2 getNetCashSales() {
    return netCashSales;
  }

  public void setNetCashSales(MoneyV2 netCashSales) {
    this.netCashSales = netCashSales;
  }

  /**
   * The net sales for the duration of this session.
   */
  public MoneyV2 getNetSales() {
    return netSales;
  }

  public void setNetSales(MoneyV2 netSales) {
    this.netSales = netSales;
  }

  /**
   * The note associated with the point of sale device payment session opening.
   */
  public String getOpeningNote() {
    return openingNote;
  }

  public void setOpeningNote(String openingNote) {
    this.openingNote = openingNote;
  }

  /**
   * The staff member who opened the point of sale device payment session.
   */
  public StaffMember getOpeningStaffMember() {
    return openingStaffMember;
  }

  public void setOpeningStaffMember(StaffMember openingStaffMember) {
    this.openingStaffMember = openingStaffMember;
  }

  /**
   * The time the point of sale device payment session was opened.
   */
  public OffsetDateTime getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
  }

  /**
   * The point of sale device.
   */
  public PointOfSaleDevice getPointOfSaleDevice() {
    return pointOfSaleDevice;
  }

  public void setPointOfSaleDevice(PointOfSaleDevice pointOfSaleDevice) {
    this.pointOfSaleDevice = pointOfSaleDevice;
  }

  /**
   * Whether the point of sale device payment session is open. Payments can't be
   * processed or refunded during a closed session, and the cash drawer balance
   * can't be adjusted or corrected.
   */
  public PointOfSaleDevicePaymentSessionStatus getStatus() {
    return status;
  }

  public void setStatus(PointOfSaleDevicePaymentSessionStatus status) {
    this.status = status;
  }

  /**
   * The total adjustments for the point of sale device payment session.
   */
  public MoneyV2 getTotalAdjustments() {
    return totalAdjustments;
  }

  public void setTotalAdjustments(MoneyV2 totalAdjustments) {
    this.totalAdjustments = totalAdjustments;
  }

  /**
   * The total cash refunds for the point of sale device payment session.
   */
  public MoneyV2 getTotalCashRefunds() {
    return totalCashRefunds;
  }

  public void setTotalCashRefunds(MoneyV2 totalCashRefunds) {
    this.totalCashRefunds = totalCashRefunds;
  }

  /**
   * The total cash sales for the point of sale device payment session.
   */
  public MoneyV2 getTotalCashSales() {
    return totalCashSales;
  }

  public void setTotalCashSales(MoneyV2 totalCashSales) {
    this.totalCashSales = totalCashSales;
  }

  /**
   * The total discrepancy for the point of sale device payment session.
   */
  public MoneyV2 getTotalDiscrepancy() {
    return totalDiscrepancy;
  }

  public void setTotalDiscrepancy(MoneyV2 totalDiscrepancy) {
    this.totalDiscrepancy = totalDiscrepancy;
  }

  /**
   * The sum of all refunds for the duration of this session.
   */
  public MoneyV2 getTotalRefunds() {
    return totalRefunds;
  }

  public void setTotalRefunds(MoneyV2 totalRefunds) {
    this.totalRefunds = totalRefunds;
  }

  /**
   * The sum of all sales for the duration of this session.
   */
  public MoneyV2 getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(MoneyV2 totalSales) {
    this.totalSales = totalSales;
  }

  /**
   * Whether the point of sale device payment session totals are ready.
   */
  public boolean getTotalsReady() {
    return totalsReady;
  }

  public void setTotalsReady(boolean totalsReady) {
    this.totalsReady = totalsReady;
  }

  @Override
  public String toString() {
    return "PointOfSaleDevicePaymentSession{cashActivities='" + cashActivities + "', cashCountedAtClose='" + cashCountedAtClose + "', cashCountedAtOpen='" + cashCountedAtOpen + "', cashDrawer='" + cashDrawer + "', closingAdjustment='" + closingAdjustment + "', closingBalance='" + closingBalance + "', closingNote='" + closingNote + "', closingStaffMember='" + closingStaffMember + "', closingTime='" + closingTime + "', currency='" + currency + "', expectedCashAtClose='" + expectedCashAtClose + "', expectedCashAtOpen='" + expectedCashAtOpen + "', id='" + id + "', location='" + location + "', netCashSales='" + netCashSales + "', netSales='" + netSales + "', openingNote='" + openingNote + "', openingStaffMember='" + openingStaffMember + "', openingTime='" + openingTime + "', pointOfSaleDevice='" + pointOfSaleDevice + "', status='" + status + "', totalAdjustments='" + totalAdjustments + "', totalCashRefunds='" + totalCashRefunds + "', totalCashSales='" + totalCashSales + "', totalDiscrepancy='" + totalDiscrepancy + "', totalRefunds='" + totalRefunds + "', totalSales='" + totalSales + "', totalsReady='" + totalsReady + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PointOfSaleDevicePaymentSession that = (PointOfSaleDevicePaymentSession) o;
    return Objects.equals(cashActivities, that.cashActivities) &&
        Objects.equals(cashCountedAtClose, that.cashCountedAtClose) &&
        Objects.equals(cashCountedAtOpen, that.cashCountedAtOpen) &&
        Objects.equals(cashDrawer, that.cashDrawer) &&
        Objects.equals(closingAdjustment, that.closingAdjustment) &&
        Objects.equals(closingBalance, that.closingBalance) &&
        Objects.equals(closingNote, that.closingNote) &&
        Objects.equals(closingStaffMember, that.closingStaffMember) &&
        Objects.equals(closingTime, that.closingTime) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(expectedCashAtClose, that.expectedCashAtClose) &&
        Objects.equals(expectedCashAtOpen, that.expectedCashAtOpen) &&
        Objects.equals(id, that.id) &&
        Objects.equals(location, that.location) &&
        Objects.equals(netCashSales, that.netCashSales) &&
        Objects.equals(netSales, that.netSales) &&
        Objects.equals(openingNote, that.openingNote) &&
        Objects.equals(openingStaffMember, that.openingStaffMember) &&
        Objects.equals(openingTime, that.openingTime) &&
        Objects.equals(pointOfSaleDevice, that.pointOfSaleDevice) &&
        Objects.equals(status, that.status) &&
        Objects.equals(totalAdjustments, that.totalAdjustments) &&
        Objects.equals(totalCashRefunds, that.totalCashRefunds) &&
        Objects.equals(totalCashSales, that.totalCashSales) &&
        Objects.equals(totalDiscrepancy, that.totalDiscrepancy) &&
        Objects.equals(totalRefunds, that.totalRefunds) &&
        Objects.equals(totalSales, that.totalSales) &&
        totalsReady == that.totalsReady;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashActivities, cashCountedAtClose, cashCountedAtOpen, cashDrawer, closingAdjustment, closingBalance, closingNote, closingStaffMember, closingTime, currency, expectedCashAtClose, expectedCashAtOpen, id, location, netCashSales, netSales, openingNote, openingStaffMember, openingTime, pointOfSaleDevice, status, totalAdjustments, totalCashRefunds, totalCashSales, totalDiscrepancy, totalRefunds, totalSales, totalsReady);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The activities on the point of sale device payment session.
     */
    private CashActivityConnection cashActivities;

    /**
     * The cash that was physically counted when the point of sale device payment session was closed.
     */
    private MoneyV2 cashCountedAtClose;

    /**
     * The cash that was physically counted when the point of sale device payment session was opened.
     */
    private MoneyV2 cashCountedAtOpen;

    /**
     * The cash drawer associated with the point of sale device payment session. The
     * session's sales andcash tracking activity will affect the cash drawer's balance.
     */
    private CashDrawer cashDrawer;

    /**
     * The amount that the cash drawer balance was adjusted when the session was closed.
     */
    private MoneyV2 closingAdjustment;

    /**
     * The counted balance of the cash drawer when the point of sale device payment session was closed.
     */
    private MoneyV2 closingBalance;

    /**
     * The note associated with the point of sale device payment session closing.
     */
    private String closingNote;

    /**
     * The staff member who closed the point of sale device payment session.
     */
    private StaffMember closingStaffMember;

    /**
     * The time the point of sale device payment session was closed.
     */
    private OffsetDateTime closingTime;

    /**
     * The currency of the point of sale device payment session.
     */
    private String currency;

    /**
     * The expected cash when the point of sale device payment session was closed.
     */
    private MoneyV2 expectedCashAtClose;

    /**
     * The expected balance of the cash drawer when the point of sale device payment session was opened.
     */
    private MoneyV2 expectedCashAtOpen;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The location associated with the point of sale device payment session. The
     * session's sales and cash tracking activity will contribute to the location's totals.
     */
    private Location location;

    /**
     * The net cash sales for the point of sale device payment session.
     */
    private MoneyV2 netCashSales;

    /**
     * The net sales for the duration of this session.
     */
    private MoneyV2 netSales;

    /**
     * The note associated with the point of sale device payment session opening.
     */
    private String openingNote;

    /**
     * The staff member who opened the point of sale device payment session.
     */
    private StaffMember openingStaffMember;

    /**
     * The time the point of sale device payment session was opened.
     */
    private OffsetDateTime openingTime;

    /**
     * The point of sale device.
     */
    private PointOfSaleDevice pointOfSaleDevice;

    /**
     * Whether the point of sale device payment session is open. Payments can't be
     * processed or refunded during a closed session, and the cash drawer balance
     * can't be adjusted or corrected.
     */
    private PointOfSaleDevicePaymentSessionStatus status;

    /**
     * The total adjustments for the point of sale device payment session.
     */
    private MoneyV2 totalAdjustments;

    /**
     * The total cash refunds for the point of sale device payment session.
     */
    private MoneyV2 totalCashRefunds;

    /**
     * The total cash sales for the point of sale device payment session.
     */
    private MoneyV2 totalCashSales;

    /**
     * The total discrepancy for the point of sale device payment session.
     */
    private MoneyV2 totalDiscrepancy;

    /**
     * The sum of all refunds for the duration of this session.
     */
    private MoneyV2 totalRefunds;

    /**
     * The sum of all sales for the duration of this session.
     */
    private MoneyV2 totalSales;

    /**
     * Whether the point of sale device payment session totals are ready.
     */
    private boolean totalsReady;

    public PointOfSaleDevicePaymentSession build() {
      PointOfSaleDevicePaymentSession result = new PointOfSaleDevicePaymentSession();
      result.cashActivities = this.cashActivities;
      result.cashCountedAtClose = this.cashCountedAtClose;
      result.cashCountedAtOpen = this.cashCountedAtOpen;
      result.cashDrawer = this.cashDrawer;
      result.closingAdjustment = this.closingAdjustment;
      result.closingBalance = this.closingBalance;
      result.closingNote = this.closingNote;
      result.closingStaffMember = this.closingStaffMember;
      result.closingTime = this.closingTime;
      result.currency = this.currency;
      result.expectedCashAtClose = this.expectedCashAtClose;
      result.expectedCashAtOpen = this.expectedCashAtOpen;
      result.id = this.id;
      result.location = this.location;
      result.netCashSales = this.netCashSales;
      result.netSales = this.netSales;
      result.openingNote = this.openingNote;
      result.openingStaffMember = this.openingStaffMember;
      result.openingTime = this.openingTime;
      result.pointOfSaleDevice = this.pointOfSaleDevice;
      result.status = this.status;
      result.totalAdjustments = this.totalAdjustments;
      result.totalCashRefunds = this.totalCashRefunds;
      result.totalCashSales = this.totalCashSales;
      result.totalDiscrepancy = this.totalDiscrepancy;
      result.totalRefunds = this.totalRefunds;
      result.totalSales = this.totalSales;
      result.totalsReady = this.totalsReady;
      return result;
    }

    /**
     * The activities on the point of sale device payment session.
     */
    public Builder cashActivities(CashActivityConnection cashActivities) {
      this.cashActivities = cashActivities;
      return this;
    }

    /**
     * The cash that was physically counted when the point of sale device payment session was closed.
     */
    public Builder cashCountedAtClose(MoneyV2 cashCountedAtClose) {
      this.cashCountedAtClose = cashCountedAtClose;
      return this;
    }

    /**
     * The cash that was physically counted when the point of sale device payment session was opened.
     */
    public Builder cashCountedAtOpen(MoneyV2 cashCountedAtOpen) {
      this.cashCountedAtOpen = cashCountedAtOpen;
      return this;
    }

    /**
     * The cash drawer associated with the point of sale device payment session. The
     * session's sales andcash tracking activity will affect the cash drawer's balance.
     */
    public Builder cashDrawer(CashDrawer cashDrawer) {
      this.cashDrawer = cashDrawer;
      return this;
    }

    /**
     * The amount that the cash drawer balance was adjusted when the session was closed.
     */
    public Builder closingAdjustment(MoneyV2 closingAdjustment) {
      this.closingAdjustment = closingAdjustment;
      return this;
    }

    /**
     * The counted balance of the cash drawer when the point of sale device payment session was closed.
     */
    public Builder closingBalance(MoneyV2 closingBalance) {
      this.closingBalance = closingBalance;
      return this;
    }

    /**
     * The note associated with the point of sale device payment session closing.
     */
    public Builder closingNote(String closingNote) {
      this.closingNote = closingNote;
      return this;
    }

    /**
     * The staff member who closed the point of sale device payment session.
     */
    public Builder closingStaffMember(StaffMember closingStaffMember) {
      this.closingStaffMember = closingStaffMember;
      return this;
    }

    /**
     * The time the point of sale device payment session was closed.
     */
    public Builder closingTime(OffsetDateTime closingTime) {
      this.closingTime = closingTime;
      return this;
    }

    /**
     * The currency of the point of sale device payment session.
     */
    public Builder currency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The expected cash when the point of sale device payment session was closed.
     */
    public Builder expectedCashAtClose(MoneyV2 expectedCashAtClose) {
      this.expectedCashAtClose = expectedCashAtClose;
      return this;
    }

    /**
     * The expected balance of the cash drawer when the point of sale device payment session was opened.
     */
    public Builder expectedCashAtOpen(MoneyV2 expectedCashAtOpen) {
      this.expectedCashAtOpen = expectedCashAtOpen;
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
     * The location associated with the point of sale device payment session. The
     * session's sales and cash tracking activity will contribute to the location's totals.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The net cash sales for the point of sale device payment session.
     */
    public Builder netCashSales(MoneyV2 netCashSales) {
      this.netCashSales = netCashSales;
      return this;
    }

    /**
     * The net sales for the duration of this session.
     */
    public Builder netSales(MoneyV2 netSales) {
      this.netSales = netSales;
      return this;
    }

    /**
     * The note associated with the point of sale device payment session opening.
     */
    public Builder openingNote(String openingNote) {
      this.openingNote = openingNote;
      return this;
    }

    /**
     * The staff member who opened the point of sale device payment session.
     */
    public Builder openingStaffMember(StaffMember openingStaffMember) {
      this.openingStaffMember = openingStaffMember;
      return this;
    }

    /**
     * The time the point of sale device payment session was opened.
     */
    public Builder openingTime(OffsetDateTime openingTime) {
      this.openingTime = openingTime;
      return this;
    }

    /**
     * The point of sale device.
     */
    public Builder pointOfSaleDevice(PointOfSaleDevice pointOfSaleDevice) {
      this.pointOfSaleDevice = pointOfSaleDevice;
      return this;
    }

    /**
     * Whether the point of sale device payment session is open. Payments can't be
     * processed or refunded during a closed session, and the cash drawer balance
     * can't be adjusted or corrected.
     */
    public Builder status(PointOfSaleDevicePaymentSessionStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The total adjustments for the point of sale device payment session.
     */
    public Builder totalAdjustments(MoneyV2 totalAdjustments) {
      this.totalAdjustments = totalAdjustments;
      return this;
    }

    /**
     * The total cash refunds for the point of sale device payment session.
     */
    public Builder totalCashRefunds(MoneyV2 totalCashRefunds) {
      this.totalCashRefunds = totalCashRefunds;
      return this;
    }

    /**
     * The total cash sales for the point of sale device payment session.
     */
    public Builder totalCashSales(MoneyV2 totalCashSales) {
      this.totalCashSales = totalCashSales;
      return this;
    }

    /**
     * The total discrepancy for the point of sale device payment session.
     */
    public Builder totalDiscrepancy(MoneyV2 totalDiscrepancy) {
      this.totalDiscrepancy = totalDiscrepancy;
      return this;
    }

    /**
     * The sum of all refunds for the duration of this session.
     */
    public Builder totalRefunds(MoneyV2 totalRefunds) {
      this.totalRefunds = totalRefunds;
      return this;
    }

    /**
     * The sum of all sales for the duration of this session.
     */
    public Builder totalSales(MoneyV2 totalSales) {
      this.totalSales = totalSales;
      return this;
    }

    /**
     * Whether the point of sale device payment session totals are ready.
     */
    public Builder totalsReady(boolean totalsReady) {
      this.totalsReady = totalsReady;
      return this;
    }
  }
}
