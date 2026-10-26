package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The planned activation and optional conclusion dates of a rollout, not its actual lifecycle timestamps.
 */
public class RolloutSchedule {
  /**
   * The date and time at which the rollout is scheduled to activate.
   */
  private OffsetDateTime activateAt;

  /**
   * The date and time at which the rollout is scheduled to conclude, or null when no conclusion date is set.
   */
  private OffsetDateTime concludeAt;

  public RolloutSchedule() {
  }

  /**
   * The date and time at which the rollout is scheduled to activate.
   */
  public OffsetDateTime getActivateAt() {
    return activateAt;
  }

  public void setActivateAt(OffsetDateTime activateAt) {
    this.activateAt = activateAt;
  }

  /**
   * The date and time at which the rollout is scheduled to conclude, or null when no conclusion date is set.
   */
  public OffsetDateTime getConcludeAt() {
    return concludeAt;
  }

  public void setConcludeAt(OffsetDateTime concludeAt) {
    this.concludeAt = concludeAt;
  }

  @Override
  public String toString() {
    return "RolloutSchedule{activateAt='" + activateAt + "', concludeAt='" + concludeAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RolloutSchedule that = (RolloutSchedule) o;
    return Objects.equals(activateAt, that.activateAt) &&
        Objects.equals(concludeAt, that.concludeAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activateAt, concludeAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time at which the rollout is scheduled to activate.
     */
    private OffsetDateTime activateAt;

    /**
     * The date and time at which the rollout is scheduled to conclude, or null when no conclusion date is set.
     */
    private OffsetDateTime concludeAt;

    public RolloutSchedule build() {
      RolloutSchedule result = new RolloutSchedule();
      result.activateAt = this.activateAt;
      result.concludeAt = this.concludeAt;
      return result;
    }

    /**
     * The date and time at which the rollout is scheduled to activate.
     */
    public Builder activateAt(OffsetDateTime activateAt) {
      this.activateAt = activateAt;
      return this;
    }

    /**
     * The date and time at which the rollout is scheduled to conclude, or null when no conclusion date is set.
     */
    public Builder concludeAt(OffsetDateTime concludeAt) {
      this.concludeAt = concludeAt;
      return this;
    }
  }
}
