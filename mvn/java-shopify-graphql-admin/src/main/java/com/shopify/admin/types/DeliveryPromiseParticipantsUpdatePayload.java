package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `deliveryPromiseParticipantsUpdate` mutation.
 */
public class DeliveryPromiseParticipantsUpdatePayload {
  /**
   * The promise participants that were added.
   */
  private List<DeliveryPromiseParticipant> promiseParticipants;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public DeliveryPromiseParticipantsUpdatePayload() {
  }

  /**
   * The promise participants that were added.
   */
  public List<DeliveryPromiseParticipant> getPromiseParticipants() {
    return promiseParticipants;
  }

  public void setPromiseParticipants(List<DeliveryPromiseParticipant> promiseParticipants) {
    this.promiseParticipants = promiseParticipants;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliveryPromiseParticipantsUpdatePayload{promiseParticipants='" + promiseParticipants + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryPromiseParticipantsUpdatePayload that = (DeliveryPromiseParticipantsUpdatePayload) o;
    return Objects.equals(promiseParticipants, that.promiseParticipants) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promiseParticipants, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The promise participants that were added.
     */
    private List<DeliveryPromiseParticipant> promiseParticipants;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public DeliveryPromiseParticipantsUpdatePayload build() {
      DeliveryPromiseParticipantsUpdatePayload result = new DeliveryPromiseParticipantsUpdatePayload();
      result.promiseParticipants = this.promiseParticipants;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The promise participants that were added.
     */
    public Builder promiseParticipants(List<DeliveryPromiseParticipant> promiseParticipants) {
      this.promiseParticipants = promiseParticipants;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
