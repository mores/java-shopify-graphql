package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `serverPixelCreate` mutation.
 */
public class ServerPixelCreatePayload {
  /**
   * The new server pixel.
   */
  private ServerPixel serverPixel;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ErrorsServerPixelUserError> userErrors;

  public ServerPixelCreatePayload() {
  }

  /**
   * The new server pixel.
   */
  public ServerPixel getServerPixel() {
    return serverPixel;
  }

  public void setServerPixel(ServerPixel serverPixel) {
    this.serverPixel = serverPixel;
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
    return "ServerPixelCreatePayload{serverPixel='" + serverPixel + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServerPixelCreatePayload that = (ServerPixelCreatePayload) o;
    return Objects.equals(serverPixel, that.serverPixel) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverPixel, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The new server pixel.
     */
    private ServerPixel serverPixel;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ErrorsServerPixelUserError> userErrors;

    public ServerPixelCreatePayload build() {
      ServerPixelCreatePayload result = new ServerPixelCreatePayload();
      result.serverPixel = this.serverPixel;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The new server pixel.
     */
    public Builder serverPixel(ServerPixel serverPixel) {
      this.serverPixel = serverPixel;
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
