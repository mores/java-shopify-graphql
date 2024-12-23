package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Deletion events chronicle the destruction of resources (e.g. products and collections).
 * Once deleted, the deletion event is the only trace of the original's existence,
 * as the resource itself has been removed and can no longer be accessed.
 */
public class DeletionEvent {
  /**
   * The date and time when the deletion event for the related resource was generated.
   */
  private OffsetDateTime occurredAt;

  /**
   * The ID of the resource that was deleted.
   */
  private String subjectId;

  /**
   * The type of resource that was deleted.
   */
  private DeletionEventSubjectType subjectType;

  public DeletionEvent() {
  }

  /**
   * The date and time when the deletion event for the related resource was generated.
   */
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }

  /**
   * The ID of the resource that was deleted.
   */
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  /**
   * The type of resource that was deleted.
   */
  public DeletionEventSubjectType getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(DeletionEventSubjectType subjectType) {
    this.subjectType = subjectType;
  }

  @Override
  public String toString() {
    return "DeletionEvent{occurredAt='" + occurredAt + "', subjectId='" + subjectId + "', subjectType='" + subjectType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeletionEvent that = (DeletionEvent) o;
    return Objects.equals(occurredAt, that.occurredAt) &&
        Objects.equals(subjectId, that.subjectId) &&
        Objects.equals(subjectType, that.subjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurredAt, subjectId, subjectType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the deletion event for the related resource was generated.
     */
    private OffsetDateTime occurredAt;

    /**
     * The ID of the resource that was deleted.
     */
    private String subjectId;

    /**
     * The type of resource that was deleted.
     */
    private DeletionEventSubjectType subjectType;

    public DeletionEvent build() {
      DeletionEvent result = new DeletionEvent();
      result.occurredAt = this.occurredAt;
      result.subjectId = this.subjectId;
      result.subjectType = this.subjectType;
      return result;
    }

    /**
     * The date and time when the deletion event for the related resource was generated.
     */
    public Builder occurredAt(OffsetDateTime occurredAt) {
      this.occurredAt = occurredAt;
      return this;
    }

    /**
     * The ID of the resource that was deleted.
     */
    public Builder subjectId(String subjectId) {
      this.subjectId = subjectId;
      return this;
    }

    /**
     * The type of resource that was deleted.
     */
    public Builder subjectType(DeletionEventSubjectType subjectType) {
      this.subjectType = subjectType;
      return this;
    }
  }
}
