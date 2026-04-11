package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `channelFullSync` mutation.
 */
public class ChannelFullSyncPayload {
  /**
   * Trace information for each country-language product feed that was triggered. Returns one entry per feed.
   */
  private List<FullSyncTraceInfo> fullSyncTraceInfo;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ChannelFullSyncUserError> userErrors;

  public ChannelFullSyncPayload() {
  }

  /**
   * Trace information for each country-language product feed that was triggered. Returns one entry per feed.
   */
  public List<FullSyncTraceInfo> getFullSyncTraceInfo() {
    return fullSyncTraceInfo;
  }

  public void setFullSyncTraceInfo(List<FullSyncTraceInfo> fullSyncTraceInfo) {
    this.fullSyncTraceInfo = fullSyncTraceInfo;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ChannelFullSyncUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ChannelFullSyncUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ChannelFullSyncPayload{fullSyncTraceInfo='" + fullSyncTraceInfo + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelFullSyncPayload that = (ChannelFullSyncPayload) o;
    return Objects.equals(fullSyncTraceInfo, that.fullSyncTraceInfo) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullSyncTraceInfo, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Trace information for each country-language product feed that was triggered. Returns one entry per feed.
     */
    private List<FullSyncTraceInfo> fullSyncTraceInfo;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ChannelFullSyncUserError> userErrors;

    public ChannelFullSyncPayload build() {
      ChannelFullSyncPayload result = new ChannelFullSyncPayload();
      result.fullSyncTraceInfo = this.fullSyncTraceInfo;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Trace information for each country-language product feed that was triggered. Returns one entry per feed.
     */
    public Builder fullSyncTraceInfo(List<FullSyncTraceInfo> fullSyncTraceInfo) {
      this.fullSyncTraceInfo = fullSyncTraceInfo;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ChannelFullSyncUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
