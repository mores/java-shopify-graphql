package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReturnDeclineRequestInput {
  
  private String id;

  
  private ReturnDeclineReason declineReason;

  
  private Boolean notifyCustomer = false;

  
  private String declineNote;

  public ReturnDeclineRequestInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ReturnDeclineReason getDeclineReason() {
    return declineReason;
  }

  public void setDeclineReason(ReturnDeclineReason declineReason) {
    this.declineReason = declineReason;
  }

  
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  
  public String getDeclineNote() {
    return declineNote;
  }

  public void setDeclineNote(String declineNote) {
    this.declineNote = declineNote;
  }

  @Override
  public String toString() {
    return "ReturnDeclineRequestInput{id='" + id + "', declineReason='" + declineReason + "', notifyCustomer='" + notifyCustomer + "', declineNote='" + declineNote + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnDeclineRequestInput that = (ReturnDeclineRequestInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(declineReason, that.declineReason) &&
        Objects.equals(notifyCustomer, that.notifyCustomer) &&
        Objects.equals(declineNote, that.declineNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, declineReason, notifyCustomer, declineNote);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private ReturnDeclineReason declineReason;

    
    private Boolean notifyCustomer = false;

    
    private String declineNote;

    public ReturnDeclineRequestInput build() {
      ReturnDeclineRequestInput result = new ReturnDeclineRequestInput();
      result.id = this.id;
      result.declineReason = this.declineReason;
      result.notifyCustomer = this.notifyCustomer;
      result.declineNote = this.declineNote;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder declineReason(ReturnDeclineReason declineReason) {
      this.declineReason = declineReason;
      return this;
    }

    
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }

    
    public Builder declineNote(String declineNote) {
      this.declineNote = declineNote;
      return this;
    }
  }
}
