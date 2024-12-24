package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryAdjustmentGroup implements com.shopify.types.Node {
  
  private App app;

  
  private List<InventoryChange> changes;

  
  private OffsetDateTime createdAt;

  
  private String id;

  
  private String reason;

  
  private String referenceDocumentUri;

  
  private StaffMember staffMember;

  public InventoryAdjustmentGroup() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public List<InventoryChange> getChanges() {
    return changes;
  }

  public void setChanges(List<InventoryChange> changes) {
    this.changes = changes;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  
  public String getReferenceDocumentUri() {
    return referenceDocumentUri;
  }

  public void setReferenceDocumentUri(String referenceDocumentUri) {
    this.referenceDocumentUri = referenceDocumentUri;
  }

  
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  @Override
  public String toString() {
    return "InventoryAdjustmentGroup{app='" + app + "', changes='" + changes + "', createdAt='" + createdAt + "', id='" + id + "', reason='" + reason + "', referenceDocumentUri='" + referenceDocumentUri + "', staffMember='" + staffMember + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustmentGroup that = (InventoryAdjustmentGroup) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(changes, that.changes) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(staffMember, that.staffMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, changes, createdAt, id, reason, referenceDocumentUri, staffMember);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private List<InventoryChange> changes;

    
    private OffsetDateTime createdAt;

    
    private String id;

    
    private String reason;

    
    private String referenceDocumentUri;

    
    private StaffMember staffMember;

    public InventoryAdjustmentGroup build() {
      InventoryAdjustmentGroup result = new InventoryAdjustmentGroup();
      result.app = this.app;
      result.changes = this.changes;
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.reason = this.reason;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.staffMember = this.staffMember;
      return result;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder changes(List<InventoryChange> changes) {
      this.changes = changes;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder referenceDocumentUri(String referenceDocumentUri) {
      this.referenceDocumentUri = referenceDocumentUri;
      return this;
    }

    
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }
  }
}
