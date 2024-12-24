package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashTrackingSession implements com.shopify.types.Node {
  
  private CashTrackingAdjustmentConnection adjustments;

  
  private boolean cashTrackingEnabled;

  
  private OrderTransactionConnection cashTransactions;

  
  private MoneyV2 closingBalance;

  
  private String closingNote;

  
  private StaffMember closingStaffMember;

  
  private OffsetDateTime closingTime;

  
  private MoneyV2 expectedBalance;

  
  private MoneyV2 expectedClosingBalance;

  
  private MoneyV2 expectedOpeningBalance;

  
  private String id;

  
  private Location location;

  
  private MoneyV2 netCashSales;

  
  private MoneyV2 openingBalance;

  
  private String openingNote;

  
  private StaffMember openingStaffMember;

  
  private OffsetDateTime openingTime;

  
  private String registerName;

  
  private MoneyV2 totalAdjustments;

  
  private MoneyV2 totalCashRefunds;

  
  private MoneyV2 totalCashSales;

  
  private MoneyV2 totalDiscrepancy;

  public CashTrackingSession() {
  }

  
  public CashTrackingAdjustmentConnection getAdjustments() {
    return adjustments;
  }

  public void setAdjustments(CashTrackingAdjustmentConnection adjustments) {
    this.adjustments = adjustments;
  }

  
  public boolean getCashTrackingEnabled() {
    return cashTrackingEnabled;
  }

  public void setCashTrackingEnabled(boolean cashTrackingEnabled) {
    this.cashTrackingEnabled = cashTrackingEnabled;
  }

  
  public OrderTransactionConnection getCashTransactions() {
    return cashTransactions;
  }

  public void setCashTransactions(OrderTransactionConnection cashTransactions) {
    this.cashTransactions = cashTransactions;
  }

  
  public MoneyV2 getClosingBalance() {
    return closingBalance;
  }

  public void setClosingBalance(MoneyV2 closingBalance) {
    this.closingBalance = closingBalance;
  }

  
  public String getClosingNote() {
    return closingNote;
  }

  public void setClosingNote(String closingNote) {
    this.closingNote = closingNote;
  }

  
  public StaffMember getClosingStaffMember() {
    return closingStaffMember;
  }

  public void setClosingStaffMember(StaffMember closingStaffMember) {
    this.closingStaffMember = closingStaffMember;
  }

  
  public OffsetDateTime getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(OffsetDateTime closingTime) {
    this.closingTime = closingTime;
  }

  
  public MoneyV2 getExpectedBalance() {
    return expectedBalance;
  }

  public void setExpectedBalance(MoneyV2 expectedBalance) {
    this.expectedBalance = expectedBalance;
  }

  
  public MoneyV2 getExpectedClosingBalance() {
    return expectedClosingBalance;
  }

  public void setExpectedClosingBalance(MoneyV2 expectedClosingBalance) {
    this.expectedClosingBalance = expectedClosingBalance;
  }

  
  public MoneyV2 getExpectedOpeningBalance() {
    return expectedOpeningBalance;
  }

  public void setExpectedOpeningBalance(MoneyV2 expectedOpeningBalance) {
    this.expectedOpeningBalance = expectedOpeningBalance;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public MoneyV2 getNetCashSales() {
    return netCashSales;
  }

  public void setNetCashSales(MoneyV2 netCashSales) {
    this.netCashSales = netCashSales;
  }

  
  public MoneyV2 getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(MoneyV2 openingBalance) {
    this.openingBalance = openingBalance;
  }

  
  public String getOpeningNote() {
    return openingNote;
  }

  public void setOpeningNote(String openingNote) {
    this.openingNote = openingNote;
  }

  
  public StaffMember getOpeningStaffMember() {
    return openingStaffMember;
  }

  public void setOpeningStaffMember(StaffMember openingStaffMember) {
    this.openingStaffMember = openingStaffMember;
  }

  
  public OffsetDateTime getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
  }

  
  public String getRegisterName() {
    return registerName;
  }

  public void setRegisterName(String registerName) {
    this.registerName = registerName;
  }

  
  public MoneyV2 getTotalAdjustments() {
    return totalAdjustments;
  }

  public void setTotalAdjustments(MoneyV2 totalAdjustments) {
    this.totalAdjustments = totalAdjustments;
  }

  
  public MoneyV2 getTotalCashRefunds() {
    return totalCashRefunds;
  }

  public void setTotalCashRefunds(MoneyV2 totalCashRefunds) {
    this.totalCashRefunds = totalCashRefunds;
  }

  
  public MoneyV2 getTotalCashSales() {
    return totalCashSales;
  }

  public void setTotalCashSales(MoneyV2 totalCashSales) {
    this.totalCashSales = totalCashSales;
  }

  
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
    
    private CashTrackingAdjustmentConnection adjustments;

    
    private boolean cashTrackingEnabled;

    
    private OrderTransactionConnection cashTransactions;

    
    private MoneyV2 closingBalance;

    
    private String closingNote;

    
    private StaffMember closingStaffMember;

    
    private OffsetDateTime closingTime;

    
    private MoneyV2 expectedBalance;

    
    private MoneyV2 expectedClosingBalance;

    
    private MoneyV2 expectedOpeningBalance;

    
    private String id;

    
    private Location location;

    
    private MoneyV2 netCashSales;

    
    private MoneyV2 openingBalance;

    
    private String openingNote;

    
    private StaffMember openingStaffMember;

    
    private OffsetDateTime openingTime;

    
    private String registerName;

    
    private MoneyV2 totalAdjustments;

    
    private MoneyV2 totalCashRefunds;

    
    private MoneyV2 totalCashSales;

    
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

    
    public Builder adjustments(CashTrackingAdjustmentConnection adjustments) {
      this.adjustments = adjustments;
      return this;
    }

    
    public Builder cashTrackingEnabled(boolean cashTrackingEnabled) {
      this.cashTrackingEnabled = cashTrackingEnabled;
      return this;
    }

    
    public Builder cashTransactions(OrderTransactionConnection cashTransactions) {
      this.cashTransactions = cashTransactions;
      return this;
    }

    
    public Builder closingBalance(MoneyV2 closingBalance) {
      this.closingBalance = closingBalance;
      return this;
    }

    
    public Builder closingNote(String closingNote) {
      this.closingNote = closingNote;
      return this;
    }

    
    public Builder closingStaffMember(StaffMember closingStaffMember) {
      this.closingStaffMember = closingStaffMember;
      return this;
    }

    
    public Builder closingTime(OffsetDateTime closingTime) {
      this.closingTime = closingTime;
      return this;
    }

    
    public Builder expectedBalance(MoneyV2 expectedBalance) {
      this.expectedBalance = expectedBalance;
      return this;
    }

    
    public Builder expectedClosingBalance(MoneyV2 expectedClosingBalance) {
      this.expectedClosingBalance = expectedClosingBalance;
      return this;
    }

    
    public Builder expectedOpeningBalance(MoneyV2 expectedOpeningBalance) {
      this.expectedOpeningBalance = expectedOpeningBalance;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder netCashSales(MoneyV2 netCashSales) {
      this.netCashSales = netCashSales;
      return this;
    }

    
    public Builder openingBalance(MoneyV2 openingBalance) {
      this.openingBalance = openingBalance;
      return this;
    }

    
    public Builder openingNote(String openingNote) {
      this.openingNote = openingNote;
      return this;
    }

    
    public Builder openingStaffMember(StaffMember openingStaffMember) {
      this.openingStaffMember = openingStaffMember;
      return this;
    }

    
    public Builder openingTime(OffsetDateTime openingTime) {
      this.openingTime = openingTime;
      return this;
    }

    
    public Builder registerName(String registerName) {
      this.registerName = registerName;
      return this;
    }

    
    public Builder totalAdjustments(MoneyV2 totalAdjustments) {
      this.totalAdjustments = totalAdjustments;
      return this;
    }

    
    public Builder totalCashRefunds(MoneyV2 totalCashRefunds) {
      this.totalCashRefunds = totalCashRefunds;
      return this;
    }

    
    public Builder totalCashSales(MoneyV2 totalCashSales) {
      this.totalCashSales = totalCashSales;
      return this;
    }

    
    public Builder totalDiscrepancy(MoneyV2 totalDiscrepancy) {
      this.totalDiscrepancy = totalDiscrepancy;
      return this;
    }
  }
}
