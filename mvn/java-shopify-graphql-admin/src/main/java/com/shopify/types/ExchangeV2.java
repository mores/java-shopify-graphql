package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ExchangeV2 implements com.shopify.types.Node {
  
  private ExchangeV2Additions additions;

  
  private OffsetDateTime completedAt;

  
  private OffsetDateTime createdAt;

  
  private String id;

  
  private Location location;

  
  private String note;

  
  private List<Refund> refunds;

  
  private ExchangeV2Returns returns;

  
  private StaffMember staffMember;

  
  private MoneyBag totalAmountProcessedSet;

  
  private MoneyBag totalPriceSet;

  
  private List<OrderTransaction> transactions;

  public ExchangeV2() {
  }

  
  public ExchangeV2Additions getAdditions() {
    return additions;
  }

  public void setAdditions(ExchangeV2Additions additions) {
    this.additions = additions;
  }

  
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }

  
  public ExchangeV2Returns getReturns() {
    return returns;
  }

  public void setReturns(ExchangeV2Returns returns) {
    this.returns = returns;
  }

  
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  
  public MoneyBag getTotalAmountProcessedSet() {
    return totalAmountProcessedSet;
  }

  public void setTotalAmountProcessedSet(MoneyBag totalAmountProcessedSet) {
    this.totalAmountProcessedSet = totalAmountProcessedSet;
  }

  
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  
  public List<OrderTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<OrderTransaction> transactions) {
    this.transactions = transactions;
  }

  @Override
  public String toString() {
    return "ExchangeV2{additions='" + additions + "', completedAt='" + completedAt + "', createdAt='" + createdAt + "', id='" + id + "', location='" + location + "', note='" + note + "', refunds='" + refunds + "', returns='" + returns + "', staffMember='" + staffMember + "', totalAmountProcessedSet='" + totalAmountProcessedSet + "', totalPriceSet='" + totalPriceSet + "', transactions='" + transactions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeV2 that = (ExchangeV2) o;
    return Objects.equals(additions, that.additions) &&
        Objects.equals(completedAt, that.completedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(location, that.location) &&
        Objects.equals(note, that.note) &&
        Objects.equals(refunds, that.refunds) &&
        Objects.equals(returns, that.returns) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(totalAmountProcessedSet, that.totalAmountProcessedSet) &&
        Objects.equals(totalPriceSet, that.totalPriceSet) &&
        Objects.equals(transactions, that.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, completedAt, createdAt, id, location, note, refunds, returns, staffMember, totalAmountProcessedSet, totalPriceSet, transactions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ExchangeV2Additions additions;

    
    private OffsetDateTime completedAt;

    
    private OffsetDateTime createdAt;

    
    private String id;

    
    private Location location;

    
    private String note;

    
    private List<Refund> refunds;

    
    private ExchangeV2Returns returns;

    
    private StaffMember staffMember;

    
    private MoneyBag totalAmountProcessedSet;

    
    private MoneyBag totalPriceSet;

    
    private List<OrderTransaction> transactions;

    public ExchangeV2 build() {
      ExchangeV2 result = new ExchangeV2();
      result.additions = this.additions;
      result.completedAt = this.completedAt;
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.location = this.location;
      result.note = this.note;
      result.refunds = this.refunds;
      result.returns = this.returns;
      result.staffMember = this.staffMember;
      result.totalAmountProcessedSet = this.totalAmountProcessedSet;
      result.totalPriceSet = this.totalPriceSet;
      result.transactions = this.transactions;
      return result;
    }

    
    public Builder additions(ExchangeV2Additions additions) {
      this.additions = additions;
      return this;
    }

    
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder refunds(List<Refund> refunds) {
      this.refunds = refunds;
      return this;
    }

    
    public Builder returns(ExchangeV2Returns returns) {
      this.returns = returns;
      return this;
    }

    
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    
    public Builder totalAmountProcessedSet(MoneyBag totalAmountProcessedSet) {
      this.totalAmountProcessedSet = totalAmountProcessedSet;
      return this;
    }

    
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    
    public Builder transactions(List<OrderTransaction> transactions) {
      this.transactions = transactions;
      return this;
    }
  }
}
