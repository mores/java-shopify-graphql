package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentOrderMerchantRequest implements com.shopify.types.Node {
  
  private FulfillmentOrder fulfillmentOrder;

  
  private String id;

  
  private FulfillmentOrderMerchantRequestKind kind;

  
  private String message;

  
  private String requestOptions;

  
  private String responseData;

  
  private OffsetDateTime sentAt;

  public FulfillmentOrderMerchantRequest() {
  }

  
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public FulfillmentOrderMerchantRequestKind getKind() {
    return kind;
  }

  public void setKind(FulfillmentOrderMerchantRequestKind kind) {
    this.kind = kind;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  
  public String getRequestOptions() {
    return requestOptions;
  }

  public void setRequestOptions(String requestOptions) {
    this.requestOptions = requestOptions;
  }

  
  public String getResponseData() {
    return responseData;
  }

  public void setResponseData(String responseData) {
    this.responseData = responseData;
  }

  
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
    
    private FulfillmentOrder fulfillmentOrder;

    
    private String id;

    
    private FulfillmentOrderMerchantRequestKind kind;

    
    private String message;

    
    private String requestOptions;

    
    private String responseData;

    
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

    
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder kind(FulfillmentOrderMerchantRequestKind kind) {
      this.kind = kind;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    
    public Builder requestOptions(String requestOptions) {
      this.requestOptions = requestOptions;
      return this;
    }

    
    public Builder responseData(String responseData) {
      this.responseData = responseData;
      return this;
    }

    
    public Builder sentAt(OffsetDateTime sentAt) {
      this.sentAt = sentAt;
      return this;
    }
  }
}
