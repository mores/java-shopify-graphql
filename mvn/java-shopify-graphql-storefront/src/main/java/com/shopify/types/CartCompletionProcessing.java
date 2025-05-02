package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A cart checkout completion that's still processing.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartCompletionProcessing implements CartCompletionAttemptResult {
  /**
   * The ID of the cart completion attempt.
   */
  private String id;

  /**
   * The number of milliseconds to wait before polling again.
   */
  private int pollDelay;

  public CartCompletionProcessing() {
  }

  /**
   * The ID of the cart completion attempt.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The number of milliseconds to wait before polling again.
   */
  public int getPollDelay() {
    return pollDelay;
  }

  public void setPollDelay(int pollDelay) {
    this.pollDelay = pollDelay;
  }

  @Override
  public String toString() {
    return "CartCompletionProcessing{id='" + id + "', pollDelay='" + pollDelay + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartCompletionProcessing that = (CartCompletionProcessing) o;
    return Objects.equals(id, that.id) &&
        pollDelay == that.pollDelay;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pollDelay);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the cart completion attempt.
     */
    private String id;

    /**
     * The number of milliseconds to wait before polling again.
     */
    private int pollDelay;

    public CartCompletionProcessing build() {
      CartCompletionProcessing result = new CartCompletionProcessing();
      result.id = this.id;
      result.pollDelay = this.pollDelay;
      return result;
    }

    /**
     * The ID of the cart completion attempt.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The number of milliseconds to wait before polling again.
     */
    public Builder pollDelay(int pollDelay) {
      this.pollDelay = pollDelay;
      return this;
    }
  }
}
