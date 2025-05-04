package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Tracks an adjustment to the cash in a cash tracking session for a point of sale device over the course of a shift.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CashTrackingAdjustment implements com.shopify.admin.types.Node {
  /**
   * The amount of cash being added or removed.
   */
  private MoneyV2 cash;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The note entered when the adjustment was made.
   */
  private String note;

  /**
   * The staff member who made the adjustment.
   */
  private StaffMember staffMember;

  /**
   * The time when the adjustment was made.
   */
  private OffsetDateTime time;

  public CashTrackingAdjustment() {
  }

  /**
   * The amount of cash being added or removed.
   */
  public MoneyV2 getCash() {
    return cash;
  }

  public void setCash(MoneyV2 cash) {
    this.cash = cash;
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
   * The note entered when the adjustment was made.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The staff member who made the adjustment.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The time when the adjustment was made.
   */
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
    /**
     * The amount of cash being added or removed.
     */
    private MoneyV2 cash;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The note entered when the adjustment was made.
     */
    private String note;

    /**
     * The staff member who made the adjustment.
     */
    private StaffMember staffMember;

    /**
     * The time when the adjustment was made.
     */
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

    /**
     * The amount of cash being added or removed.
     */
    public Builder cash(MoneyV2 cash) {
      this.cash = cash;
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
     * The note entered when the adjustment was made.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The staff member who made the adjustment.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The time when the adjustment was made.
     */
    public Builder time(OffsetDateTime time) {
      this.time = time;
      return this;
    }
  }
}
