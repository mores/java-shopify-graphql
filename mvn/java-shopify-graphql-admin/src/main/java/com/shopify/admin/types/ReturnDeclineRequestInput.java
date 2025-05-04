package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for declining a customer's return request.
 */
public class ReturnDeclineRequestInput {
  /**
   * The ID of the return that's being declined.
   */
  private String id;

  /**
   * The reason why the merchant declined the customer's return request.
   */
  private ReturnDeclineReason declineReason;

  /**
   * Notify the customer when a return request is declined.
   * The customer will only receive a notification if `Order.email` is present.
   */
  private Boolean notifyCustomer = false;

  /**
   * The notification message that's sent to a customer about their declined return request.
   * Maximum length: 500 characters.
   */
  private String declineNote;

  public ReturnDeclineRequestInput() {
  }

  /**
   * The ID of the return that's being declined.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The reason why the merchant declined the customer's return request.
   */
  public ReturnDeclineReason getDeclineReason() {
    return declineReason;
  }

  public void setDeclineReason(ReturnDeclineReason declineReason) {
    this.declineReason = declineReason;
  }

  /**
   * Notify the customer when a return request is declined.
   * The customer will only receive a notification if `Order.email` is present.
   */
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  /**
   * The notification message that's sent to a customer about their declined return request.
   * Maximum length: 500 characters.
   */
  public String getDeclineNote() {
    return declineNote;
  }

  public void setDeclineNote(String declineNote) {
    this.declineNote = declineNote;
  }

  @Override
  public String toString() {
    return "ReturnDeclineRequestInput{id='" + id + "', declineReason='" + declineReason + "', notifyCustomer='" + notifyCustomer + "', declineNote='" + declineNote + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnDeclineRequestInput that = (ReturnDeclineRequestInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(declineReason, that.declineReason) &&
        Objects.equals(notifyCustomer, that.notifyCustomer) &&
        Objects.equals(declineNote, that.declineNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, declineReason, notifyCustomer, declineNote);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the return that's being declined.
     */
    private String id;

    /**
     * The reason why the merchant declined the customer's return request.
     */
    private ReturnDeclineReason declineReason;

    /**
     * Notify the customer when a return request is declined.
     * The customer will only receive a notification if `Order.email` is present.
     */
    private Boolean notifyCustomer = false;

    /**
     * The notification message that's sent to a customer about their declined return request.
     * Maximum length: 500 characters.
     */
    private String declineNote;

    public ReturnDeclineRequestInput build() {
      ReturnDeclineRequestInput result = new ReturnDeclineRequestInput();
      result.id = this.id;
      result.declineReason = this.declineReason;
      result.notifyCustomer = this.notifyCustomer;
      result.declineNote = this.declineNote;
      return result;
    }

    /**
     * The ID of the return that's being declined.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The reason why the merchant declined the customer's return request.
     */
    public Builder declineReason(ReturnDeclineReason declineReason) {
      this.declineReason = declineReason;
      return this;
    }

    /**
     * Notify the customer when a return request is declined.
     * The customer will only receive a notification if `Order.email` is present.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }

    /**
     * The notification message that's sent to a customer about their declined return request.
     * Maximum length: 500 characters.
     */
    public Builder declineNote(String declineNote) {
      this.declineNote = declineNote;
      return this;
    }
  }
}
