package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseFulfillmentOrderLineItem implements com.shopify.types.Node {
  
  private List<ReverseFulfillmentOrderDisposition> dispositions;

  
  private FulfillmentLineItem fulfillmentLineItem;

  
  private String id;

  
  private int totalQuantity;

  public ReverseFulfillmentOrderLineItem() {
  }

  
  public List<ReverseFulfillmentOrderDisposition> getDispositions() {
    return dispositions;
  }

  public void setDispositions(List<ReverseFulfillmentOrderDisposition> dispositions) {
    this.dispositions = dispositions;
  }

  
  public FulfillmentLineItem getFulfillmentLineItem() {
    return fulfillmentLineItem;
  }

  public void setFulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
    this.fulfillmentLineItem = fulfillmentLineItem;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderLineItem{dispositions='" + dispositions + "', fulfillmentLineItem='" + fulfillmentLineItem + "', id='" + id + "', totalQuantity='" + totalQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderLineItem that = (ReverseFulfillmentOrderLineItem) o;
    return Objects.equals(dispositions, that.dispositions) &&
        Objects.equals(fulfillmentLineItem, that.fulfillmentLineItem) &&
        Objects.equals(id, that.id) &&
        totalQuantity == that.totalQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispositions, fulfillmentLineItem, id, totalQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ReverseFulfillmentOrderDisposition> dispositions;

    
    private FulfillmentLineItem fulfillmentLineItem;

    
    private String id;

    
    private int totalQuantity;

    public ReverseFulfillmentOrderLineItem build() {
      ReverseFulfillmentOrderLineItem result = new ReverseFulfillmentOrderLineItem();
      result.dispositions = this.dispositions;
      result.fulfillmentLineItem = this.fulfillmentLineItem;
      result.id = this.id;
      result.totalQuantity = this.totalQuantity;
      return result;
    }

    
    public Builder dispositions(List<ReverseFulfillmentOrderDisposition> dispositions) {
      this.dispositions = dispositions;
      return this;
    }

    
    public Builder fulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
      this.fulfillmentLineItem = fulfillmentLineItem;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }
  }
}
