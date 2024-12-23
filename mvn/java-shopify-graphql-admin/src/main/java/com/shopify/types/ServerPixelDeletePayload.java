package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `serverPixelDelete` mutation.
 */
public class ServerPixelDeletePayload {
  /**
   * The ID of the server pixel that was deleted, if one was deleted.
   */
  private String deletedServerPixelId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ErrorsServerPixelUserError> userErrors;

  public ServerPixelDeletePayload() {
  }

  /**
   * The ID of the server pixel that was deleted, if one was deleted.
   */
  public String getDeletedServerPixelId() {
    return deletedServerPixelId;
  }

  public void setDeletedServerPixelId(String deletedServerPixelId) {
    this.deletedServerPixelId = deletedServerPixelId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ErrorsServerPixelUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ErrorsServerPixelUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ServerPixelDeletePayload{deletedServerPixelId='" + deletedServerPixelId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServerPixelDeletePayload that = (ServerPixelDeletePayload) o;
    return Objects.equals(deletedServerPixelId, that.deletedServerPixelId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedServerPixelId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the server pixel that was deleted, if one was deleted.
     */
    private String deletedServerPixelId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ErrorsServerPixelUserError> userErrors;

    public ServerPixelDeletePayload build() {
      ServerPixelDeletePayload result = new ServerPixelDeletePayload();
      result.deletedServerPixelId = this.deletedServerPixelId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the server pixel that was deleted, if one was deleted.
     */
    public Builder deletedServerPixelId(String deletedServerPixelId) {
      this.deletedServerPixelId = deletedServerPixelId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ErrorsServerPixelUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
