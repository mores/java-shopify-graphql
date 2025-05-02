package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Cart submit for checkout completion is throttled.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubmitThrottled implements CartSubmitForCompletionResult {
  /**
   * UTC date time string that indicates the time after which clients should make their next
   * poll request. Any poll requests sent before this time will be ignored. Use this value to schedule the
   * next poll request.
   */
  private OffsetDateTime pollAfter;

  public SubmitThrottled() {
  }

  /**
   * UTC date time string that indicates the time after which clients should make their next
   * poll request. Any poll requests sent before this time will be ignored. Use this value to schedule the
   * next poll request.
   */
  public OffsetDateTime getPollAfter() {
    return pollAfter;
  }

  public void setPollAfter(OffsetDateTime pollAfter) {
    this.pollAfter = pollAfter;
  }

  @Override
  public String toString() {
    return "SubmitThrottled{pollAfter='" + pollAfter + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubmitThrottled that = (SubmitThrottled) o;
    return Objects.equals(pollAfter, that.pollAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pollAfter);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * UTC date time string that indicates the time after which clients should make their next
     * poll request. Any poll requests sent before this time will be ignored. Use this value to schedule the
     * next poll request.
     */
    private OffsetDateTime pollAfter;

    public SubmitThrottled build() {
      SubmitThrottled result = new SubmitThrottled();
      result.pollAfter = this.pollAfter;
      return result;
    }

    /**
     * UTC date time string that indicates the time after which clients should make their next
     * poll request. Any poll requests sent before this time will be ignored. Use this value to schedule the
     * next poll request.
     */
    public Builder pollAfter(OffsetDateTime pollAfter) {
      this.pollAfter = pollAfter;
      return this;
    }
  }
}
