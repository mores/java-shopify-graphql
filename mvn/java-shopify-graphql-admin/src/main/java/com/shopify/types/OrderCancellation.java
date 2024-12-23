package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Details about the order cancellation.
 */
public class OrderCancellation {
  /**
   * Staff provided note for the order cancellation.
   */
  private String staffNote;

  public OrderCancellation() {
  }

  /**
   * Staff provided note for the order cancellation.
   */
  public String getStaffNote() {
    return staffNote;
  }

  public void setStaffNote(String staffNote) {
    this.staffNote = staffNote;
  }

  @Override
  public String toString() {
    return "OrderCancellation{staffNote='" + staffNote + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCancellation that = (OrderCancellation) o;
    return Objects.equals(staffNote, that.staffNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffNote);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Staff provided note for the order cancellation.
     */
    private String staffNote;

    public OrderCancellation build() {
      OrderCancellation result = new OrderCancellation();
      result.staffNote = this.staffNote;
      return result;
    }

    /**
     * Staff provided note for the order cancellation.
     */
    public Builder staffNote(String staffNote) {
      this.staffNote = staffNote;
      return this;
    }
  }
}
