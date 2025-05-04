package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A fulfillment hold currently applied on a fulfillment order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentHold implements com.shopify.admin.types.Node {
  /**
   * The localized reason for the fulfillment hold for display purposes.
   */
  private String displayReason;

  /**
   * An identifier an app can use to reference one of many holds it applied to a fulfillment order.
   * This field must be unique among the holds that a single app applies to a single fulfillment order.
   */
  private String handle;

  /**
   * The app that created the fulfillment hold.
   */
  private App heldByApp;

  /**
   * A boolean value that indicates whether the requesting app created the fulfillment hold.
   */
  private boolean heldByRequestingApp;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The reason for the fulfillment hold.
   */
  private FulfillmentHoldReason reason;

  /**
   * Additional information about the fulfillment hold reason.
   */
  private String reasonNotes;

  public FulfillmentHold() {
  }

  /**
   * The localized reason for the fulfillment hold for display purposes.
   */
  public String getDisplayReason() {
    return displayReason;
  }

  public void setDisplayReason(String displayReason) {
    this.displayReason = displayReason;
  }

  /**
   * An identifier an app can use to reference one of many holds it applied to a fulfillment order.
   * This field must be unique among the holds that a single app applies to a single fulfillment order.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The app that created the fulfillment hold.
   */
  public App getHeldByApp() {
    return heldByApp;
  }

  public void setHeldByApp(App heldByApp) {
    this.heldByApp = heldByApp;
  }

  /**
   * A boolean value that indicates whether the requesting app created the fulfillment hold.
   */
  public boolean getHeldByRequestingApp() {
    return heldByRequestingApp;
  }

  public void setHeldByRequestingApp(boolean heldByRequestingApp) {
    this.heldByRequestingApp = heldByRequestingApp;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The reason for the fulfillment hold.
   */
  public FulfillmentHoldReason getReason() {
    return reason;
  }

  public void setReason(FulfillmentHoldReason reason) {
    this.reason = reason;
  }

  /**
   * Additional information about the fulfillment hold reason.
   */
  public String getReasonNotes() {
    return reasonNotes;
  }

  public void setReasonNotes(String reasonNotes) {
    this.reasonNotes = reasonNotes;
  }

  @Override
  public String toString() {
    return "FulfillmentHold{displayReason='" + displayReason + "', handle='" + handle + "', heldByApp='" + heldByApp + "', heldByRequestingApp='" + heldByRequestingApp + "', id='" + id + "', reason='" + reason + "', reasonNotes='" + reasonNotes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentHold that = (FulfillmentHold) o;
    return Objects.equals(displayReason, that.displayReason) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(heldByApp, that.heldByApp) &&
        heldByRequestingApp == that.heldByRequestingApp &&
        Objects.equals(id, that.id) &&
        Objects.equals(reason, that.reason) &&
        Objects.equals(reasonNotes, that.reasonNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayReason, handle, heldByApp, heldByRequestingApp, id, reason, reasonNotes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The localized reason for the fulfillment hold for display purposes.
     */
    private String displayReason;

    /**
     * An identifier an app can use to reference one of many holds it applied to a fulfillment order.
     * This field must be unique among the holds that a single app applies to a single fulfillment order.
     */
    private String handle;

    /**
     * The app that created the fulfillment hold.
     */
    private App heldByApp;

    /**
     * A boolean value that indicates whether the requesting app created the fulfillment hold.
     */
    private boolean heldByRequestingApp;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The reason for the fulfillment hold.
     */
    private FulfillmentHoldReason reason;

    /**
     * Additional information about the fulfillment hold reason.
     */
    private String reasonNotes;

    public FulfillmentHold build() {
      FulfillmentHold result = new FulfillmentHold();
      result.displayReason = this.displayReason;
      result.handle = this.handle;
      result.heldByApp = this.heldByApp;
      result.heldByRequestingApp = this.heldByRequestingApp;
      result.id = this.id;
      result.reason = this.reason;
      result.reasonNotes = this.reasonNotes;
      return result;
    }

    /**
     * The localized reason for the fulfillment hold for display purposes.
     */
    public Builder displayReason(String displayReason) {
      this.displayReason = displayReason;
      return this;
    }

    /**
     * An identifier an app can use to reference one of many holds it applied to a fulfillment order.
     * This field must be unique among the holds that a single app applies to a single fulfillment order.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The app that created the fulfillment hold.
     */
    public Builder heldByApp(App heldByApp) {
      this.heldByApp = heldByApp;
      return this;
    }

    /**
     * A boolean value that indicates whether the requesting app created the fulfillment hold.
     */
    public Builder heldByRequestingApp(boolean heldByRequestingApp) {
      this.heldByRequestingApp = heldByRequestingApp;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The reason for the fulfillment hold.
     */
    public Builder reason(FulfillmentHoldReason reason) {
      this.reason = reason;
      return this;
    }

    /**
     * Additional information about the fulfillment hold reason.
     */
    public Builder reasonNotes(String reasonNotes) {
      this.reasonNotes = reasonNotes;
      return this;
    }
  }
}
