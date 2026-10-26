package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Whether a collection is eligible for one role (inclusion or exclusion) in a
 * sub-collection relationship, plus the reason it isn't if applicable.
 */
public class CollectionSubCollectionEligibilityState {
  /**
   * Whether the collection can be used in this sub-collection role.
   */
  private boolean eligible;

  /**
   * Stable identifier describing why the collection is ineligible. Null when
   * `eligible` is true. Clients can map this to user-facing copy or use it as a feature flag.
   */
  private SubCollectionIneligibleReason ineligibleReason;

  public CollectionSubCollectionEligibilityState() {
  }

  /**
   * Whether the collection can be used in this sub-collection role.
   */
  public boolean getEligible() {
    return eligible;
  }

  public void setEligible(boolean eligible) {
    this.eligible = eligible;
  }

  /**
   * Stable identifier describing why the collection is ineligible. Null when
   * `eligible` is true. Clients can map this to user-facing copy or use it as a feature flag.
   */
  public SubCollectionIneligibleReason getIneligibleReason() {
    return ineligibleReason;
  }

  public void setIneligibleReason(SubCollectionIneligibleReason ineligibleReason) {
    this.ineligibleReason = ineligibleReason;
  }

  @Override
  public String toString() {
    return "CollectionSubCollectionEligibilityState{eligible='" + eligible + "', ineligibleReason='" + ineligibleReason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSubCollectionEligibilityState that = (CollectionSubCollectionEligibilityState) o;
    return eligible == that.eligible &&
        Objects.equals(ineligibleReason, that.ineligibleReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible, ineligibleReason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the collection can be used in this sub-collection role.
     */
    private boolean eligible;

    /**
     * Stable identifier describing why the collection is ineligible. Null when
     * `eligible` is true. Clients can map this to user-facing copy or use it as a feature flag.
     */
    private SubCollectionIneligibleReason ineligibleReason;

    public CollectionSubCollectionEligibilityState build() {
      CollectionSubCollectionEligibilityState result = new CollectionSubCollectionEligibilityState();
      result.eligible = this.eligible;
      result.ineligibleReason = this.ineligibleReason;
      return result;
    }

    /**
     * Whether the collection can be used in this sub-collection role.
     */
    public Builder eligible(boolean eligible) {
      this.eligible = eligible;
      return this;
    }

    /**
     * Stable identifier describing why the collection is ineligible. Null when
     * `eligible` is true. Clients can map this to user-facing copy or use it as a feature flag.
     */
    public Builder ineligibleReason(SubCollectionIneligibleReason ineligibleReason) {
      this.ineligibleReason = ineligibleReason;
      return this;
    }
  }
}
