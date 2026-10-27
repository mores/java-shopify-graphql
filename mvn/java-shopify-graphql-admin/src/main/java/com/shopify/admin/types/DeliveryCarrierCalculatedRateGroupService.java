package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A carrier-provided service within a carrier-calculated rate group.
 *
 * Represents an individual service that the merchant has explicitly included or excluded.
 */
public class DeliveryCarrierCalculatedRateGroupService {
  /**
   * The name of the carrier-provided service.
   */
  private String name;

  /**
   * Whether this service is included or excluded at checkout.
   */
  private DeliveryCarrierCalculatedRateGroupServiceStatus status;

  public DeliveryCarrierCalculatedRateGroupService() {
  }

  /**
   * The name of the carrier-provided service.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether this service is included or excluded at checkout.
   */
  public DeliveryCarrierCalculatedRateGroupServiceStatus getStatus() {
    return status;
  }

  public void setStatus(DeliveryCarrierCalculatedRateGroupServiceStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierCalculatedRateGroupService{name='" + name + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierCalculatedRateGroupService that = (DeliveryCarrierCalculatedRateGroupService) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the carrier-provided service.
     */
    private String name;

    /**
     * Whether this service is included or excluded at checkout.
     */
    private DeliveryCarrierCalculatedRateGroupServiceStatus status;

    public DeliveryCarrierCalculatedRateGroupService build() {
      DeliveryCarrierCalculatedRateGroupService result = new DeliveryCarrierCalculatedRateGroupService();
      result.name = this.name;
      result.status = this.status;
      return result;
    }

    /**
     * The name of the carrier-provided service.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Whether this service is included or excluded at checkout.
     */
    public Builder status(DeliveryCarrierCalculatedRateGroupServiceStatus status) {
      this.status = status;
      return this;
    }
  }
}
