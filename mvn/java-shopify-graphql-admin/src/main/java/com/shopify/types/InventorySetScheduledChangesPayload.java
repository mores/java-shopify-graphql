package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventorySetScheduledChangesPayload {
  
  private List<InventoryScheduledChange> scheduledChanges;

  
  private List<InventorySetScheduledChangesUserError> userErrors;

  public InventorySetScheduledChangesPayload() {
  }

  
  public List<InventoryScheduledChange> getScheduledChanges() {
    return scheduledChanges;
  }

  public void setScheduledChanges(List<InventoryScheduledChange> scheduledChanges) {
    this.scheduledChanges = scheduledChanges;
  }

  
  public List<InventorySetScheduledChangesUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventorySetScheduledChangesUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventorySetScheduledChangesPayload{scheduledChanges='" + scheduledChanges + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetScheduledChangesPayload that = (InventorySetScheduledChangesPayload) o;
    return Objects.equals(scheduledChanges, that.scheduledChanges) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledChanges, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<InventoryScheduledChange> scheduledChanges;

    
    private List<InventorySetScheduledChangesUserError> userErrors;

    public InventorySetScheduledChangesPayload build() {
      InventorySetScheduledChangesPayload result = new InventorySetScheduledChangesPayload();
      result.scheduledChanges = this.scheduledChanges;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder scheduledChanges(List<InventoryScheduledChange> scheduledChanges) {
      this.scheduledChanges = scheduledChanges;
      return this;
    }

    
    public Builder userErrors(List<InventorySetScheduledChangesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
