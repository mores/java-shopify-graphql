package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * An exchange where existing items on an order are returned and new items are added to the order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ExchangeV2 implements com.shopify.types.Node {
  /**
   * The details of the new items in the exchange.
   */
  private ExchangeV2Additions additions;

  /**
   * The date and time when the exchange was completed.
   */
  private OffsetDateTime completedAt;

  /**
   * The date and time when the exchange was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The location where the exchange happened.
   */
  private Location location;

  /**
   * The text of an optional note that a shop owner can attach to the exchange.
   */
  private String note;

  /**
   * The refunds processed during the exchange.
   */
  private List<Refund> refunds;

  /**
   * The details of the returned items in the exchange.
   */
  private ExchangeV2Returns returns;

  /**
   * The staff member associated with the exchange.
   */
  private StaffMember staffMember;

  /**
   * The amount of money that was paid or refunded as part of the exchange.
   */
  private MoneyBag totalAmountProcessedSet;

  /**
   * The difference in values of the items that were exchanged.
   */
  private MoneyBag totalPriceSet;

  /**
   * The order transactions related to the exchange.
   */
  private List<OrderTransaction> transactions;

  public ExchangeV2() {
  }

  /**
   * The details of the new items in the exchange.
   */
  public ExchangeV2Additions getAdditions() {
    return additions;
  }

  public void setAdditions(ExchangeV2Additions additions) {
    this.additions = additions;
  }

  /**
   * The date and time when the exchange was completed.
   */
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * The date and time when the exchange was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
   * The location where the exchange happened.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The text of an optional note that a shop owner can attach to the exchange.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The refunds processed during the exchange.
   */
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }

  /**
   * The details of the returned items in the exchange.
   */
  public ExchangeV2Returns getReturns() {
    return returns;
  }

  public void setReturns(ExchangeV2Returns returns) {
    this.returns = returns;
  }

  /**
   * The staff member associated with the exchange.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The amount of money that was paid or refunded as part of the exchange.
   */
  public MoneyBag getTotalAmountProcessedSet() {
    return totalAmountProcessedSet;
  }

  public void setTotalAmountProcessedSet(MoneyBag totalAmountProcessedSet) {
    this.totalAmountProcessedSet = totalAmountProcessedSet;
  }

  /**
   * The difference in values of the items that were exchanged.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  /**
   * The order transactions related to the exchange.
   */
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
    /**
     * The details of the new items in the exchange.
     */
    private ExchangeV2Additions additions;

    /**
     * The date and time when the exchange was completed.
     */
    private OffsetDateTime completedAt;

    /**
     * The date and time when the exchange was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The location where the exchange happened.
     */
    private Location location;

    /**
     * The text of an optional note that a shop owner can attach to the exchange.
     */
    private String note;

    /**
     * The refunds processed during the exchange.
     */
    private List<Refund> refunds;

    /**
     * The details of the returned items in the exchange.
     */
    private ExchangeV2Returns returns;

    /**
     * The staff member associated with the exchange.
     */
    private StaffMember staffMember;

    /**
     * The amount of money that was paid or refunded as part of the exchange.
     */
    private MoneyBag totalAmountProcessedSet;

    /**
     * The difference in values of the items that were exchanged.
     */
    private MoneyBag totalPriceSet;

    /**
     * The order transactions related to the exchange.
     */
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

    /**
     * The details of the new items in the exchange.
     */
    public Builder additions(ExchangeV2Additions additions) {
      this.additions = additions;
      return this;
    }

    /**
     * The date and time when the exchange was completed.
     */
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    /**
     * The date and time when the exchange was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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
     * The location where the exchange happened.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The text of an optional note that a shop owner can attach to the exchange.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The refunds processed during the exchange.
     */
    public Builder refunds(List<Refund> refunds) {
      this.refunds = refunds;
      return this;
    }

    /**
     * The details of the returned items in the exchange.
     */
    public Builder returns(ExchangeV2Returns returns) {
      this.returns = returns;
      return this;
    }

    /**
     * The staff member associated with the exchange.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The amount of money that was paid or refunded as part of the exchange.
     */
    public Builder totalAmountProcessedSet(MoneyBag totalAmountProcessedSet) {
      this.totalAmountProcessedSet = totalAmountProcessedSet;
      return this;
    }

    /**
     * The difference in values of the items that were exchanged.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    /**
     * The order transactions related to the exchange.
     */
    public Builder transactions(List<OrderTransaction> transactions) {
      this.transactions = transactions;
      return this;
    }
  }
}
