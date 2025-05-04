package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the fulfillment hold applied on the fulfillment order.
 */
public class FulfillmentOrderHoldInput {
  /**
   * The reason for the fulfillment hold.
   */
  private FulfillmentHoldReason reason;

  /**
   * Additional information about the fulfillment hold reason.
   */
  private String reasonNotes;

  /**
   * Whether the merchant receives a notification about the fulfillment hold. The default value is `false`.
   */
  private Boolean notifyMerchant = false;

  /**
   * A configurable ID used to track the automation system releasing these holds.
   */
  private String externalId;

  /**
   * An identifier that an app can use to reference one of the holds that it applies to a
   * fulfillment order.
   *   
   * This field must be unique among the holds that a single app applies to a single fulfillment order.
   * It prevents apps from inadvertently creating duplicate holds.
   * This field cannot exceed 64 characters.
   *   
   * For example, an app can place multiple holds on a single fulfillment order each with a different `handle`.
   * If an app attempts to place two holds with the same `handle`, the second hold will be rejected with
   * [a duplicate hold user error](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-duplicatefulfillmentholdhandle).
   * The same `handle` can however be re-used on different fulfillment orders and by different apps.
   *   
   * By default, `handle` will be an empty string. If an app wishes to place multiple holds on a single
   * fulfillment order, then a different `handle` must be provided for each.
   */
  private String handle = "";

  /**
   * The fulfillment order line items to be placed on hold.
   *   
   * If left blank, all line items of the fulfillment order are placed on hold.
   *   
   * Not supported when placing a hold on a fulfillment order that is already held.
   * If supplied when a fulfillment order is already on hold, [a user error](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-fulfillmentordernotsplittable)
   * will be returned indicating that the fulfillment order is not able to be split.
   */
  private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems = Collections.emptyList();

  public FulfillmentOrderHoldInput() {
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

  /**
   * Whether the merchant receives a notification about the fulfillment hold. The default value is `false`.
   */
  public Boolean getNotifyMerchant() {
    return notifyMerchant;
  }

  public void setNotifyMerchant(Boolean notifyMerchant) {
    this.notifyMerchant = notifyMerchant;
  }

  /**
   * A configurable ID used to track the automation system releasing these holds.
   */
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * An identifier that an app can use to reference one of the holds that it applies to a
   * fulfillment order.
   *   
   * This field must be unique among the holds that a single app applies to a single fulfillment order.
   * It prevents apps from inadvertently creating duplicate holds.
   * This field cannot exceed 64 characters.
   *   
   * For example, an app can place multiple holds on a single fulfillment order each with a different `handle`.
   * If an app attempts to place two holds with the same `handle`, the second hold will be rejected with
   * [a duplicate hold user error](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-duplicatefulfillmentholdhandle).
   * The same `handle` can however be re-used on different fulfillment orders and by different apps.
   *   
   * By default, `handle` will be an empty string. If an app wishes to place multiple holds on a single
   * fulfillment order, then a different `handle` must be provided for each.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The fulfillment order line items to be placed on hold.
   *   
   * If left blank, all line items of the fulfillment order are placed on hold.
   *   
   * Not supported when placing a hold on a fulfillment order that is already held.
   * If supplied when a fulfillment order is already on hold, [a user error](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-fulfillmentordernotsplittable)
   * will be returned indicating that the fulfillment order is not able to be split.
   */
  public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
    return fulfillmentOrderLineItems;
  }

  public void setFulfillmentOrderLineItems(
      List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
    this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderHoldInput{reason='" + reason + "', reasonNotes='" + reasonNotes + "', notifyMerchant='" + notifyMerchant + "', externalId='" + externalId + "', handle='" + handle + "', fulfillmentOrderLineItems='" + fulfillmentOrderLineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderHoldInput that = (FulfillmentOrderHoldInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(reasonNotes, that.reasonNotes) &&
        Objects.equals(notifyMerchant, that.notifyMerchant) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(fulfillmentOrderLineItems, that.fulfillmentOrderLineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, reasonNotes, notifyMerchant, externalId, handle, fulfillmentOrderLineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The reason for the fulfillment hold.
     */
    private FulfillmentHoldReason reason;

    /**
     * Additional information about the fulfillment hold reason.
     */
    private String reasonNotes;

    /**
     * Whether the merchant receives a notification about the fulfillment hold. The default value is `false`.
     */
    private Boolean notifyMerchant = false;

    /**
     * A configurable ID used to track the automation system releasing these holds.
     */
    private String externalId;

    /**
     * An identifier that an app can use to reference one of the holds that it applies to a
     * fulfillment order.
     *   
     * This field must be unique among the holds that a single app applies to a single fulfillment order.
     * It prevents apps from inadvertently creating duplicate holds.
     * This field cannot exceed 64 characters.
     *   
     * For example, an app can place multiple holds on a single fulfillment order each with a different `handle`.
     * If an app attempts to place two holds with the same `handle`, the second hold will be rejected with
     * [a duplicate hold user error](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-duplicatefulfillmentholdhandle).
     * The same `handle` can however be re-used on different fulfillment orders and by different apps.
     *   
     * By default, `handle` will be an empty string. If an app wishes to place multiple holds on a single
     * fulfillment order, then a different `handle` must be provided for each.
     */
    private String handle = "";

    /**
     * The fulfillment order line items to be placed on hold.
     *   
     * If left blank, all line items of the fulfillment order are placed on hold.
     *   
     * Not supported when placing a hold on a fulfillment order that is already held.
     * If supplied when a fulfillment order is already on hold, [a user error](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-fulfillmentordernotsplittable)
     * will be returned indicating that the fulfillment order is not able to be split.
     */
    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems = Collections.emptyList();

    public FulfillmentOrderHoldInput build() {
      FulfillmentOrderHoldInput result = new FulfillmentOrderHoldInput();
      result.reason = this.reason;
      result.reasonNotes = this.reasonNotes;
      result.notifyMerchant = this.notifyMerchant;
      result.externalId = this.externalId;
      result.handle = this.handle;
      result.fulfillmentOrderLineItems = this.fulfillmentOrderLineItems;
      return result;
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

    /**
     * Whether the merchant receives a notification about the fulfillment hold. The default value is `false`.
     */
    public Builder notifyMerchant(Boolean notifyMerchant) {
      this.notifyMerchant = notifyMerchant;
      return this;
    }

    /**
     * A configurable ID used to track the automation system releasing these holds.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /**
     * An identifier that an app can use to reference one of the holds that it applies to a
     * fulfillment order.
     *   
     * This field must be unique among the holds that a single app applies to a single fulfillment order.
     * It prevents apps from inadvertently creating duplicate holds.
     * This field cannot exceed 64 characters.
     *   
     * For example, an app can place multiple holds on a single fulfillment order each with a different `handle`.
     * If an app attempts to place two holds with the same `handle`, the second hold will be rejected with
     * [a duplicate hold user error](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-duplicatefulfillmentholdhandle).
     * The same `handle` can however be re-used on different fulfillment orders and by different apps.
     *   
     * By default, `handle` will be an empty string. If an app wishes to place multiple holds on a single
     * fulfillment order, then a different `handle` must be provided for each.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The fulfillment order line items to be placed on hold.
     *   
     * If left blank, all line items of the fulfillment order are placed on hold.
     *   
     * Not supported when placing a hold on a fulfillment order that is already held.
     * If supplied when a fulfillment order is already on hold, [a user error](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-fulfillmentordernotsplittable)
     * will be returned indicating that the fulfillment order is not able to be split.
     */
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      return this;
    }
  }
}
