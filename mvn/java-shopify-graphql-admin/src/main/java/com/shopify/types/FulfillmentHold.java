package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentHold implements com.shopify.types.Node {
  
  private String displayReason;

  
  private String heldBy;

  
  private boolean heldByRequestingApp;

  
  private String id;

  
  private FulfillmentHoldReason reason;

  
  private String reasonNotes;

  public FulfillmentHold() {
  }

  
  public String getDisplayReason() {
    return displayReason;
  }

  public void setDisplayReason(String displayReason) {
    this.displayReason = displayReason;
  }

  
  public String getHeldBy() {
    return heldBy;
  }

  public void setHeldBy(String heldBy) {
    this.heldBy = heldBy;
  }

  
  public boolean getHeldByRequestingApp() {
    return heldByRequestingApp;
  }

  public void setHeldByRequestingApp(boolean heldByRequestingApp) {
    this.heldByRequestingApp = heldByRequestingApp;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public FulfillmentHoldReason getReason() {
    return reason;
  }

  public void setReason(FulfillmentHoldReason reason) {
    this.reason = reason;
  }

  
  public String getReasonNotes() {
    return reasonNotes;
  }

  public void setReasonNotes(String reasonNotes) {
    this.reasonNotes = reasonNotes;
  }

  @Override
  public String toString() {
    return "FulfillmentHold{displayReason='" + displayReason + "', heldBy='" + heldBy + "', heldByRequestingApp='" + heldByRequestingApp + "', id='" + id + "', reason='" + reason + "', reasonNotes='" + reasonNotes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentHold that = (FulfillmentHold) o;
    return Objects.equals(displayReason, that.displayReason) &&
        Objects.equals(heldBy, that.heldBy) &&
        heldByRequestingApp == that.heldByRequestingApp &&
        Objects.equals(id, that.id) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(reasonNotes, that.reasonNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayReason, heldBy, heldByRequestingApp, id, reason, reasonNotes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String displayReason;

    
    private String heldBy;

    
    private boolean heldByRequestingApp;

    
    private String id;

    
    private FulfillmentHoldReason reason;

    
    private String reasonNotes;

    public FulfillmentHold build() {
      FulfillmentHold result = new FulfillmentHold();
      result.displayReason = this.displayReason;
      result.heldBy = this.heldBy;
      result.heldByRequestingApp = this.heldByRequestingApp;
      result.id = this.id;
      result.reason = this.reason;
      result.reasonNotes = this.reasonNotes;
      return result;
    }

    
    public Builder displayReason(String displayReason) {
      this.displayReason = displayReason;
      return this;
    }

    
    public Builder heldBy(String heldBy) {
      this.heldBy = heldBy;
      return this;
    }

    
    public Builder heldByRequestingApp(boolean heldByRequestingApp) {
      this.heldByRequestingApp = heldByRequestingApp;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder reason(FulfillmentHoldReason reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder reasonNotes(String reasonNotes) {
      this.reasonNotes = reasonNotes;
      return this;
    }
  }
}
