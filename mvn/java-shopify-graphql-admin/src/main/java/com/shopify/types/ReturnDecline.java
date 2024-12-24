package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReturnDecline {
  
  private String note;

  
  private ReturnDeclineReason reason;

  public ReturnDecline() {
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public ReturnDeclineReason getReason() {
    return reason;
  }

  public void setReason(ReturnDeclineReason reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "ReturnDecline{note='" + note + "', reason='" + reason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnDecline that = (ReturnDecline) o;
    return Objects.equals(note, that.note) &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, reason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String note;

    
    private ReturnDeclineReason reason;

    public ReturnDecline build() {
      ReturnDecline result = new ReturnDecline();
      result.note = this.note;
      result.reason = this.reason;
      return result;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder reason(ReturnDeclineReason reason) {
      this.reason = reason;
      return this;
    }
  }
}
