package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The number of method definitions for a zone, separated into merchant-owned and participant definitions.
 */
public class DeliveryMethodDefinitionCounts {
  /**
   * The number of participant method definitions for the specified zone.
   */
  private int participantDefinitionsCount;

  /**
   * The number of merchant-defined method definitions for the specified zone.
   */
  private int rateDefinitionsCount;

  public DeliveryMethodDefinitionCounts() {
  }

  /**
   * The number of participant method definitions for the specified zone.
   */
  public int getParticipantDefinitionsCount() {
    return participantDefinitionsCount;
  }

  public void setParticipantDefinitionsCount(int participantDefinitionsCount) {
    this.participantDefinitionsCount = participantDefinitionsCount;
  }

  /**
   * The number of merchant-defined method definitions for the specified zone.
   */
  public int getRateDefinitionsCount() {
    return rateDefinitionsCount;
  }

  public void setRateDefinitionsCount(int rateDefinitionsCount) {
    this.rateDefinitionsCount = rateDefinitionsCount;
  }

  @Override
  public String toString() {
    return "DeliveryMethodDefinitionCounts{participantDefinitionsCount='" + participantDefinitionsCount + "', rateDefinitionsCount='" + rateDefinitionsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryMethodDefinitionCounts that = (DeliveryMethodDefinitionCounts) o;
    return participantDefinitionsCount == that.participantDefinitionsCount &&
        rateDefinitionsCount == that.rateDefinitionsCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantDefinitionsCount, rateDefinitionsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of participant method definitions for the specified zone.
     */
    private int participantDefinitionsCount;

    /**
     * The number of merchant-defined method definitions for the specified zone.
     */
    private int rateDefinitionsCount;

    public DeliveryMethodDefinitionCounts build() {
      DeliveryMethodDefinitionCounts result = new DeliveryMethodDefinitionCounts();
      result.participantDefinitionsCount = this.participantDefinitionsCount;
      result.rateDefinitionsCount = this.rateDefinitionsCount;
      return result;
    }

    /**
     * The number of participant method definitions for the specified zone.
     */
    public Builder participantDefinitionsCount(int participantDefinitionsCount) {
      this.participantDefinitionsCount = participantDefinitionsCount;
      return this;
    }

    /**
     * The number of merchant-defined method definitions for the specified zone.
     */
    public Builder rateDefinitionsCount(int rateDefinitionsCount) {
      this.rateDefinitionsCount = rateDefinitionsCount;
      return this;
    }
  }
}
