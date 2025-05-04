package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Additional information about why a merchant declined the customer's return request.
 */
public class ReturnDecline {
  /**
   * The notification message sent to the customer about their declined return request.
   * Maximum length: 500 characters.
   */
  private String note;

  /**
   * The reason the customer's return request was declined.
   */
  private ReturnDeclineReason reason;

  public ReturnDecline() {
  }

  /**
   * The notification message sent to the customer about their declined return request.
   * Maximum length: 500 characters.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The reason the customer's return request was declined.
   */
  public ReturnDeclineReason getReason() {
    return reason;
  }

  public void setReason(ReturnDeclineReason reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "ReturnDecline{note='" + note + "', reason='" + reason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnDecline that = (ReturnDecline) o;
    return Objects.equals(note, that.note) &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, reason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The notification message sent to the customer about their declined return request.
     * Maximum length: 500 characters.
     */
    private String note;

    /**
     * The reason the customer's return request was declined.
     */
    private ReturnDeclineReason reason;

    public ReturnDecline build() {
      ReturnDecline result = new ReturnDecline();
      result.note = this.note;
      result.reason = this.reason;
      return result;
    }

    /**
     * The notification message sent to the customer about their declined return request.
     * Maximum length: 500 characters.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The reason the customer's return request was declined.
     */
    public Builder reason(ReturnDeclineReason reason) {
      this.reason = reason;
      return this;
    }
  }
}
