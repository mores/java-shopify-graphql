package com.shopify.admin.types;

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
public class DeliveryPromiseParticipant implements com.shopify.admin.types.Node {
  /**
   * The ID of the promise participant.
   */
  private String id;

  /**
   * The resource that the participant is attached to.
   */
  private DeliveryPromiseParticipantOwner owner;

  /**
   * The owner type of the participant.
   */
  private DeliveryPromiseParticipantOwnerType ownerType;

  public DeliveryPromiseParticipant() {
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
  public DeliveryPromiseParticipantOwner getOwner() {
    return owner;
  }

  public void setOwner(DeliveryPromiseParticipantOwner owner) {
    this.owner = owner;
  }

  /**
   * The owner type of the participant.
   */
  public DeliveryPromiseParticipantOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(DeliveryPromiseParticipantOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  @Override
  public String toString() {
    return "DeliveryPromiseParticipant{id='" + id + "', owner='" + owner + "', ownerType='" + ownerType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryPromiseParticipant that = (DeliveryPromiseParticipant) o;
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
    private DeliveryPromiseParticipantOwner owner;

    /**
     * The owner type of the participant.
     */
    private DeliveryPromiseParticipantOwnerType ownerType;

    public DeliveryPromiseParticipant build() {
      DeliveryPromiseParticipant result = new DeliveryPromiseParticipant();
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
    public Builder owner(DeliveryPromiseParticipantOwner owner) {
      this.owner = owner;
      return this;
    }

    /**
     * The owner type of the participant.
     */
    public Builder ownerType(DeliveryPromiseParticipantOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }
  }
}
