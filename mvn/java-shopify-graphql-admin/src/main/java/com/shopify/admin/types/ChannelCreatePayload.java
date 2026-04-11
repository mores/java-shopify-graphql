package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `channelCreate` mutation.
 */
public class ChannelCreatePayload {
  /**
   * The channel that was created.
   */
  private Channel channel;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ChannelCreateUserError> userErrors;

  public ChannelCreatePayload() {
  }

  /**
   * The channel that was created.
   */
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ChannelCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ChannelCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ChannelCreatePayload{channel='" + channel + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelCreatePayload that = (ChannelCreatePayload) o;
    return Objects.equals(channel, that.channel) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The channel that was created.
     */
    private Channel channel;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ChannelCreateUserError> userErrors;

    public ChannelCreatePayload build() {
      ChannelCreatePayload result = new ChannelCreatePayload();
      result.channel = this.channel;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The channel that was created.
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ChannelCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
