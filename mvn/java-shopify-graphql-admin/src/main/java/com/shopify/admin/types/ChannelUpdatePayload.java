package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `channelUpdate` mutation.
 */
public class ChannelUpdatePayload {
  /**
   * The channel that was updated.
   */
  private Channel channel;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ChannelUpdateUserError> userErrors;

  public ChannelUpdatePayload() {
  }

  /**
   * The channel that was updated.
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
  public List<ChannelUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ChannelUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ChannelUpdatePayload{channel='" + channel + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelUpdatePayload that = (ChannelUpdatePayload) o;
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
     * The channel that was updated.
     */
    private Channel channel;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ChannelUpdateUserError> userErrors;

    public ChannelUpdatePayload build() {
      ChannelUpdatePayload result = new ChannelUpdatePayload();
      result.channel = this.channel;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The channel that was updated.
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ChannelUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
