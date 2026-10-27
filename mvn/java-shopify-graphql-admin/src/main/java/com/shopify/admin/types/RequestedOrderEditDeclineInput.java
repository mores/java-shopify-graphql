package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for declining a requested order edit.
 */
public class RequestedOrderEditDeclineInput {
  /**
   * The notification message that's sent to a buyer about their declined requested order edit.
   * Maximum length: 500 characters.
   */
  private String declineNote;

  /**
   * The ID of the requested order edit to decline.
   */
  private String id;

  public RequestedOrderEditDeclineInput() {
  }

  /**
   * The notification message that's sent to a buyer about their declined requested order edit.
   * Maximum length: 500 characters.
   */
  public String getDeclineNote() {
    return declineNote;
  }

  public void setDeclineNote(String declineNote) {
    this.declineNote = declineNote;
  }

  /**
   * The ID of the requested order edit to decline.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditDeclineInput{declineNote='" + declineNote + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditDeclineInput that = (RequestedOrderEditDeclineInput) o;
    return Objects.equals(declineNote, that.declineNote) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declineNote, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The notification message that's sent to a buyer about their declined requested order edit.
     * Maximum length: 500 characters.
     */
    private String declineNote;

    /**
     * The ID of the requested order edit to decline.
     */
    private String id;

    public RequestedOrderEditDeclineInput build() {
      RequestedOrderEditDeclineInput result = new RequestedOrderEditDeclineInput();
      result.declineNote = this.declineNote;
      result.id = this.id;
      return result;
    }

    /**
     * The notification message that's sent to a buyer about their declined requested order edit.
     * Maximum length: 500 characters.
     */
    public Builder declineNote(String declineNote) {
      this.declineNote = declineNote;
      return this;
    }

    /**
     * The ID of the requested order edit to decline.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
