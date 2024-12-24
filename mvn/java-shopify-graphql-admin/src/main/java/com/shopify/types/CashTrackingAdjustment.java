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
public class CashTrackingAdjustment implements com.shopify.types.Node {
  
  private MoneyV2 cash;

  
  private String id;

  
  private String note;

  
  private StaffMember staffMember;

  
  private OffsetDateTime time;

  public CashTrackingAdjustment() {
  }

  
  public MoneyV2 getCash() {
    return cash;
  }

  public void setCash(MoneyV2 cash) {
    this.cash = cash;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "CashTrackingAdjustment{cash='" + cash + "', id='" + id + "', note='" + note + "', staffMember='" + staffMember + "', time='" + time + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashTrackingAdjustment that = (CashTrackingAdjustment) o;
    return Objects.equals(cash, that.cash) &&
        Objects.equals(id, that.id) &&
        Objects.equals(note, that.note) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(time, that.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cash, id, note, staffMember, time);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 cash;

    
    private String id;

    
    private String note;

    
    private StaffMember staffMember;

    
    private OffsetDateTime time;

    public CashTrackingAdjustment build() {
      CashTrackingAdjustment result = new CashTrackingAdjustment();
      result.cash = this.cash;
      result.id = this.id;
      result.note = this.note;
      result.staffMember = this.staffMember;
      result.time = this.time;
      return result;
    }

    
    public Builder cash(MoneyV2 cash) {
      this.cash = cash;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    
    public Builder time(OffsetDateTime time) {
      this.time = time;
      return this;
    }
  }
}
