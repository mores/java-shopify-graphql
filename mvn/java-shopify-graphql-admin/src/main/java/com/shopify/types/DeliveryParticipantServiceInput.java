package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a shipping service provided by a participant.
 */
public class DeliveryParticipantServiceInput {
  /**
   * The name of the service.
   */
  private String name;

  /**
   * Whether the service is active.
   */
  private boolean active;

  public DeliveryParticipantServiceInput() {
  }

  /**
   * The name of the service.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether the service is active.
   */
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return "DeliveryParticipantServiceInput{name='" + name + "', active='" + active + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryParticipantServiceInput that = (DeliveryParticipantServiceInput) o;
    return Objects.equals(name, that.name) &&
        active == that.active;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the service.
     */
    private String name;

    /**
     * Whether the service is active.
     */
    private boolean active;

    public DeliveryParticipantServiceInput build() {
      DeliveryParticipantServiceInput result = new DeliveryParticipantServiceInput();
      result.name = this.name;
      result.active = this.active;
      return result;
    }

    /**
     * The name of the service.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Whether the service is active.
     */
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }
  }
}
