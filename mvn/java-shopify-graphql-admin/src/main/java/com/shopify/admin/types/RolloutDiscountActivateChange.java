package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A rollout treatment change that makes a discount available to the buyers the
 * treatment serves, regardless of the discount's own `startsAt`, `endsAt`, or
 * `status`. Returned by [`RolloutTreatment.changes`](https://shopify.dev/docs/api/admin-graphql/latest/objects/RolloutTreatment#field-RolloutTreatment.fields.changes).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RolloutDiscountActivateChange implements com.shopify.admin.types.RolloutChange, com.shopify.admin.types.RolloutDiscountChange {
  /**
   * The discount that the change applies to. Returns `null` when the discount has been deleted or the caller can't read it.
   */
  private DiscountNode discount;

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  private String id;

  public RolloutDiscountActivateChange() {
  }

  /**
   * The discount that the change applies to. Returns `null` when the discount has been deleted or the caller can't read it.
   */
  public DiscountNode getDiscount() {
    return discount;
  }

  public void setDiscount(DiscountNode discount) {
    this.discount = discount;
  }

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "RolloutDiscountActivateChange{discount='" + discount + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RolloutDiscountActivateChange that = (RolloutDiscountActivateChange) o;
    return Objects.equals(discount, that.discount) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount that the change applies to. Returns `null` when the discount has been deleted or the caller can't read it.
     */
    private DiscountNode discount;

    /**
     * A globally unique ID for this change, not the resource it affects.
     */
    private String id;

    public RolloutDiscountActivateChange build() {
      RolloutDiscountActivateChange result = new RolloutDiscountActivateChange();
      result.discount = this.discount;
      result.id = this.id;
      return result;
    }

    /**
     * The discount that the change applies to. Returns `null` when the discount has been deleted or the caller can't read it.
     */
    public Builder discount(DiscountNode discount) {
      this.discount = discount;
      return this;
    }

    /**
     * A globally unique ID for this change, not the resource it affects.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
