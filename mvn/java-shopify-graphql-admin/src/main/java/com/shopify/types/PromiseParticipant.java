package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Returns enabled delivery promise participants.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PromiseParticipant implements com.shopify.types.Node {
  /**
   * The ID of the promise participant.
   */
  private String id;

  /**
   * The resource that the participant is attached to.
   */
  private DeliveryPromisePromiseParticipantPromiseParticipantOwner owner;

  /**
   * The owner type of the participant.
   */
  private DeliveryPromisePromiseParticipantParticipantOwnerType ownerType;

  public PromiseParticipant() {
  }

  /**
   * The ID of the promise participant.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The resource that the participant is attached to.
   */
  public DeliveryPromisePromiseParticipantPromiseParticipantOwner getOwner() {
    return owner;
  }

  public void setOwner(DeliveryPromisePromiseParticipantPromiseParticipantOwner owner) {
    this.owner = owner;
  }

  /**
   * The owner type of the participant.
   */
  public DeliveryPromisePromiseParticipantParticipantOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(DeliveryPromisePromiseParticipantParticipantOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  @Override
  public String toString() {
    return "PromiseParticipant{id='" + id + "', owner='" + owner + "', ownerType='" + ownerType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PromiseParticipant that = (PromiseParticipant) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(owner, that.owner) &&
        Objects.equals(ownerType, that.ownerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, ownerType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the promise participant.
     */
    private String id;

    /**
     * The resource that the participant is attached to.
     */
    private DeliveryPromisePromiseParticipantPromiseParticipantOwner owner;

    /**
     * The owner type of the participant.
     */
    private DeliveryPromisePromiseParticipantParticipantOwnerType ownerType;

    public PromiseParticipant build() {
      PromiseParticipant result = new PromiseParticipant();
      result.id = this.id;
      result.owner = this.owner;
      result.ownerType = this.ownerType;
      return result;
    }

    /**
     * The ID of the promise participant.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The resource that the participant is attached to.
     */
    public Builder owner(DeliveryPromisePromiseParticipantPromiseParticipantOwner owner) {
      this.owner = owner;
      return this;
    }

    /**
     * The owner type of the participant.
     */
    public Builder ownerType(DeliveryPromisePromiseParticipantParticipantOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }
  }
}
