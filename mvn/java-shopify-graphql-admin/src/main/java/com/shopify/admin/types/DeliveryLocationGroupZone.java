package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Links a location group with a zone and the associated method definitions.
 */
public class DeliveryLocationGroupZone {
  /**
   * The number of method definitions for the zone.
   */
  private DeliveryMethodDefinitionCounts methodDefinitionCounts;

  /**
   * The method definitions associated to a zone and location group.
   */
  private DeliveryMethodDefinitionConnection methodDefinitions;

  /**
   * The zone associated to a location group.
   */
  private DeliveryZone zone;

  public DeliveryLocationGroupZone() {
  }

  /**
   * The number of method definitions for the zone.
   */
  public DeliveryMethodDefinitionCounts getMethodDefinitionCounts() {
    return methodDefinitionCounts;
  }

  public void setMethodDefinitionCounts(DeliveryMethodDefinitionCounts methodDefinitionCounts) {
    this.methodDefinitionCounts = methodDefinitionCounts;
  }

  /**
   * The method definitions associated to a zone and location group.
   */
  public DeliveryMethodDefinitionConnection getMethodDefinitions() {
    return methodDefinitions;
  }

  public void setMethodDefinitions(DeliveryMethodDefinitionConnection methodDefinitions) {
    this.methodDefinitions = methodDefinitions;
  }

  /**
   * The zone associated to a location group.
   */
  public DeliveryZone getZone() {
    return zone;
  }

  public void setZone(DeliveryZone zone) {
    this.zone = zone;
  }

  @Override
  public String toString() {
    return "DeliveryLocationGroupZone{methodDefinitionCounts='" + methodDefinitionCounts + "', methodDefinitions='" + methodDefinitions + "', zone='" + zone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryLocationGroupZone that = (DeliveryLocationGroupZone) o;
    return Objects.equals(methodDefinitionCounts, that.methodDefinitionCounts) &&
        Objects.equals(methodDefinitions, that.methodDefinitions) &&
        Objects.equals(zone, that.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodDefinitionCounts, methodDefinitions, zone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of method definitions for the zone.
     */
    private DeliveryMethodDefinitionCounts methodDefinitionCounts;

    /**
     * The method definitions associated to a zone and location group.
     */
    private DeliveryMethodDefinitionConnection methodDefinitions;

    /**
     * The zone associated to a location group.
     */
    private DeliveryZone zone;

    public DeliveryLocationGroupZone build() {
      DeliveryLocationGroupZone result = new DeliveryLocationGroupZone();
      result.methodDefinitionCounts = this.methodDefinitionCounts;
      result.methodDefinitions = this.methodDefinitions;
      result.zone = this.zone;
      return result;
    }

    /**
     * The number of method definitions for the zone.
     */
    public Builder methodDefinitionCounts(DeliveryMethodDefinitionCounts methodDefinitionCounts) {
      this.methodDefinitionCounts = methodDefinitionCounts;
      return this;
    }

    /**
     * The method definitions associated to a zone and location group.
     */
    public Builder methodDefinitions(DeliveryMethodDefinitionConnection methodDefinitions) {
      this.methodDefinitions = methodDefinitions;
      return this;
    }

    /**
     * The zone associated to a location group.
     */
    public Builder zone(DeliveryZone zone) {
      this.zone = zone;
      return this;
    }
  }
}
