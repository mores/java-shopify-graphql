package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A request made by the merchant or an order management app to a fulfillment service
 * for a fulfillment order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentOrderMerchantRequest implements com.shopify.types.Node {
  /**
   * The fulfillment order associated with the merchant request.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The kind of request made.
   */
  private FulfillmentOrderMerchantRequestKind kind;

  /**
   * The optional message that the merchant included in the request.
   */
  private String message;

  /**
   * Additional options requested by the merchant. These depend on the `kind` of the request.
   * For example, for a `FULFILLMENT_REQUEST`, one option is `notify_customer`, which indicates whether the
   * merchant intends to notify the customer upon fulfillment. The fulfillment service can then set
   * `notifyCustomer` when making calls to `FulfillmentCreate`.
   */
  private String requestOptions;

  /**
   * The response from the fulfillment service.
   */
  private String responseData;

  /**
   * The timestamp when the request was made.
   */
  private OffsetDateTime sentAt;

  public FulfillmentOrderMerchantRequest() {
  }

  /**
   * The fulfillment order associated with the merchant request.
   */
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
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
   * The kind of request made.
   */
  public FulfillmentOrderMerchantRequestKind getKind() {
    return kind;
  }

  public void setKind(FulfillmentOrderMerchantRequestKind kind) {
    this.kind = kind;
  }

  /**
   * The optional message that the merchant included in the request.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Additional options requested by the merchant. These depend on the `kind` of the request.
   * For example, for a `FULFILLMENT_REQUEST`, one option is `notify_customer`, which indicates whether the
   * merchant intends to notify the customer upon fulfillment. The fulfillment service can then set
   * `notifyCustomer` when making calls to `FulfillmentCreate`.
   */
  public String getRequestOptions() {
    return requestOptions;
  }

  public void setRequestOptions(String requestOptions) {
    this.requestOptions = requestOptions;
  }

  /**
   * The response from the fulfillment service.
   */
  public String getResponseData() {
    return responseData;
  }

  public void setResponseData(String responseData) {
    this.responseData = responseData;
  }

  /**
   * The timestamp when the request was made.
   */
  public OffsetDateTime getSentAt() {
    return sentAt;
  }

  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderMerchantRequest{fulfillmentOrder='" + fulfillmentOrder + "', id='" + id + "', kind='" + kind + "', message='" + message + "', requestOptions='" + requestOptions + "', responseData='" + responseData + "', sentAt='" + sentAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderMerchantRequest that = (FulfillmentOrderMerchantRequest) o;
    return Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(id, that.id) &&
        Objects.equals(kind, that.kind) &&
        Objects.equals(message, that.message) &&
        Objects.equals(requestOptions, that.requestOptions) &&
        Objects.equals(responseData, that.responseData) &&
        Objects.equals(sentAt, that.sentAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, id, kind, message, requestOptions, responseData, sentAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment order associated with the merchant request.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The kind of request made.
     */
    private FulfillmentOrderMerchantRequestKind kind;

    /**
     * The optional message that the merchant included in the request.
     */
    private String message;

    /**
     * Additional options requested by the merchant. These depend on the `kind` of the request.
     * For example, for a `FULFILLMENT_REQUEST`, one option is `notify_customer`, which indicates whether the
     * merchant intends to notify the customer upon fulfillment. The fulfillment service can then set
     * `notifyCustomer` when making calls to `FulfillmentCreate`.
     */
    private String requestOptions;

    /**
     * The response from the fulfillment service.
     */
    private String responseData;

    /**
     * The timestamp when the request was made.
     */
    private OffsetDateTime sentAt;

    public FulfillmentOrderMerchantRequest build() {
      FulfillmentOrderMerchantRequest result = new FulfillmentOrderMerchantRequest();
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.id = this.id;
      result.kind = this.kind;
      result.message = this.message;
      result.requestOptions = this.requestOptions;
      result.responseData = this.responseData;
      result.sentAt = this.sentAt;
      return result;
    }

    /**
     * The fulfillment order associated with the merchant request.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
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
     * The kind of request made.
     */
    public Builder kind(FulfillmentOrderMerchantRequestKind kind) {
      this.kind = kind;
      return this;
    }

    /**
     * The optional message that the merchant included in the request.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * Additional options requested by the merchant. These depend on the `kind` of the request.
     * For example, for a `FULFILLMENT_REQUEST`, one option is `notify_customer`, which indicates whether the
     * merchant intends to notify the customer upon fulfillment. The fulfillment service can then set
     * `notifyCustomer` when making calls to `FulfillmentCreate`.
     */
    public Builder requestOptions(String requestOptions) {
      this.requestOptions = requestOptions;
      return this;
    }

    /**
     * The response from the fulfillment service.
     */
    public Builder responseData(String responseData) {
      this.responseData = responseData;
      return this;
    }

    /**
     * The timestamp when the request was made.
     */
    public Builder sentAt(OffsetDateTime sentAt) {
      this.sentAt = sentAt;
      return this;
    }
  }
}
