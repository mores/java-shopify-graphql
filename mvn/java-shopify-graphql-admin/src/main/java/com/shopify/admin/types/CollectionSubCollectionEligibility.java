package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Whether a collection can be referenced as a sub-collection target by another
 * collection's source. Use this to surface ineligible targets up front (with reasons).
 */
public class CollectionSubCollectionEligibility {
  /**
   * Eligibility for use as an exclusion target of a sub-collection source.
   */
  private CollectionSubCollectionEligibilityState exclusion;

  /**
   * Eligibility for use as the inclusion target of a sub-collection source.
   */
  private CollectionSubCollectionEligibilityState inclusion;

  public CollectionSubCollectionEligibility() {
  }

  /**
   * Eligibility for use as an exclusion target of a sub-collection source.
   */
  public CollectionSubCollectionEligibilityState getExclusion() {
    return exclusion;
  }

  public void setExclusion(CollectionSubCollectionEligibilityState exclusion) {
    this.exclusion = exclusion;
  }

  /**
   * Eligibility for use as the inclusion target of a sub-collection source.
   */
  public CollectionSubCollectionEligibilityState getInclusion() {
    return inclusion;
  }

  public void setInclusion(CollectionSubCollectionEligibilityState inclusion) {
    this.inclusion = inclusion;
  }

  @Override
  public String toString() {
    return "CollectionSubCollectionEligibility{exclusion='" + exclusion + "', inclusion='" + inclusion + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSubCollectionEligibility that = (CollectionSubCollectionEligibility) o;
    return Objects.equals(exclusion, that.exclusion) &&
        Objects.equals(inclusion, that.inclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusion, inclusion);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Eligibility for use as an exclusion target of a sub-collection source.
     */
    private CollectionSubCollectionEligibilityState exclusion;

    /**
     * Eligibility for use as the inclusion target of a sub-collection source.
     */
    private CollectionSubCollectionEligibilityState inclusion;

    public CollectionSubCollectionEligibility build() {
      CollectionSubCollectionEligibility result = new CollectionSubCollectionEligibility();
      result.exclusion = this.exclusion;
      result.inclusion = this.inclusion;
      return result;
    }

    /**
     * Eligibility for use as an exclusion target of a sub-collection source.
     */
    public Builder exclusion(CollectionSubCollectionEligibilityState exclusion) {
      this.exclusion = exclusion;
      return this;
    }

    /**
     * Eligibility for use as the inclusion target of a sub-collection source.
     */
    public Builder inclusion(CollectionSubCollectionEligibilityState inclusion) {
      this.inclusion = inclusion;
      return this;
    }
  }
}
