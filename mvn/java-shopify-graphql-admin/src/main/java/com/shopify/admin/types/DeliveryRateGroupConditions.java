package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Conditions that limit a rate group to specific collections or origin locations.
 *
 * When conditions are set, the rate group applies only to matching shipments.
 */
public class DeliveryRateGroupConditions {
  /**
   * Collections this rate group applies to. Null means the rate group applies to all products.
   */
  private CollectionConnection collections;

  /**
   * The number of collections this rate group applies to. Null when it applies to all products.
   */
  private Count collectionsCount;

  /**
   * Origin locations this rate group applies to.
   */
  private LocationConnection originLocations;

  /**
   * The number of origin locations this rate group applies to.
   */
  private Count originLocationsCount;

  public DeliveryRateGroupConditions() {
  }

  /**
   * Collections this rate group applies to. Null means the rate group applies to all products.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * The number of collections this rate group applies to. Null when it applies to all products.
   */
  public Count getCollectionsCount() {
    return collectionsCount;
  }

  public void setCollectionsCount(Count collectionsCount) {
    this.collectionsCount = collectionsCount;
  }

  /**
   * Origin locations this rate group applies to.
   */
  public LocationConnection getOriginLocations() {
    return originLocations;
  }

  public void setOriginLocations(LocationConnection originLocations) {
    this.originLocations = originLocations;
  }

  /**
   * The number of origin locations this rate group applies to.
   */
  public Count getOriginLocationsCount() {
    return originLocationsCount;
  }

  public void setOriginLocationsCount(Count originLocationsCount) {
    this.originLocationsCount = originLocationsCount;
  }

  @Override
  public String toString() {
    return "DeliveryRateGroupConditions{collections='" + collections + "', collectionsCount='" + collectionsCount + "', originLocations='" + originLocations + "', originLocationsCount='" + originLocationsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryRateGroupConditions that = (DeliveryRateGroupConditions) o;
    return Objects.equals(collections, that.collections) &&
        Objects.equals(collectionsCount, that.collectionsCount) &&
        Objects.equals(originLocations, that.originLocations) &&
        Objects.equals(originLocationsCount, that.originLocationsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections, collectionsCount, originLocations, originLocationsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Collections this rate group applies to. Null means the rate group applies to all products.
     */
    private CollectionConnection collections;

    /**
     * The number of collections this rate group applies to. Null when it applies to all products.
     */
    private Count collectionsCount;

    /**
     * Origin locations this rate group applies to.
     */
    private LocationConnection originLocations;

    /**
     * The number of origin locations this rate group applies to.
     */
    private Count originLocationsCount;

    public DeliveryRateGroupConditions build() {
      DeliveryRateGroupConditions result = new DeliveryRateGroupConditions();
      result.collections = this.collections;
      result.collectionsCount = this.collectionsCount;
      result.originLocations = this.originLocations;
      result.originLocationsCount = this.originLocationsCount;
      return result;
    }

    /**
     * Collections this rate group applies to. Null means the rate group applies to all products.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * The number of collections this rate group applies to. Null when it applies to all products.
     */
    public Builder collectionsCount(Count collectionsCount) {
      this.collectionsCount = collectionsCount;
      return this;
    }

    /**
     * Origin locations this rate group applies to.
     */
    public Builder originLocations(LocationConnection originLocations) {
      this.originLocations = originLocations;
      return this;
    }

    /**
     * The number of origin locations this rate group applies to.
     */
    public Builder originLocationsCount(Count originLocationsCount) {
      this.originLocationsCount = originLocationsCount;
      return this;
    }
  }
}
