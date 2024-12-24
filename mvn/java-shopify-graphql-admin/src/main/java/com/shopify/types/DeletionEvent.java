package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class DeletionEvent {
  
  private OffsetDateTime occurredAt;

  
  private String subjectId;

  
  private DeletionEventSubjectType subjectType;

  public DeletionEvent() {
  }

  
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }

  
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  
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
    
    private OffsetDateTime occurredAt;

    
    private String subjectId;

    
    private DeletionEventSubjectType subjectType;

    public DeletionEvent build() {
      DeletionEvent result = new DeletionEvent();
      result.occurredAt = this.occurredAt;
      result.subjectId = this.subjectId;
      result.subjectType = this.subjectType;
      return result;
    }

    
    public Builder occurredAt(OffsetDateTime occurredAt) {
      this.occurredAt = occurredAt;
      return this;
    }

    
    public Builder subjectId(String subjectId) {
      this.subjectId = subjectId;
      return this;
    }

    
    public Builder subjectType(DeletionEventSubjectType subjectType) {
      this.subjectType = subjectType;
      return this;
    }
  }
}
