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
public class FulfillmentConstraintRule implements com.shopify.types.HasMetafields, com.shopify.types.Node {
  
  private List<DeliveryMethodType> deliveryMethodTypes;

  
  private ShopifyFunction function;

  
  private String id;

  
  private Metafield metafield;

  
  private MetafieldConnection metafields;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  public FulfillmentConstraintRule() {
  }

  
  public List<DeliveryMethodType> getDeliveryMethodTypes() {
    return deliveryMethodTypes;
  }

  public void setDeliveryMethodTypes(List<DeliveryMethodType> deliveryMethodTypes) {
    this.deliveryMethodTypes = deliveryMethodTypes;
  }

  
  public ShopifyFunction getFunction() {
    return function;
  }

  public void setFunction(ShopifyFunction function) {
    this.function = function;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  @Override
  public String toString() {
    return "FulfillmentConstraintRule{deliveryMethodTypes='" + deliveryMethodTypes + "', function='" + function + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentConstraintRule that = (FulfillmentConstraintRule) o;
    return Objects.equals(deliveryMethodTypes, that.deliveryMethodTypes) &&
        Objects.equals(function, that.function) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMethodTypes, function, id, metafield, metafields, privateMetafield, privateMetafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<DeliveryMethodType> deliveryMethodTypes;

    
    private ShopifyFunction function;

    
    private String id;

    
    private Metafield metafield;

    
    private MetafieldConnection metafields;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    public FulfillmentConstraintRule build() {
      FulfillmentConstraintRule result = new FulfillmentConstraintRule();
      result.deliveryMethodTypes = this.deliveryMethodTypes;
      result.function = this.function;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      return result;
    }

    
    public Builder deliveryMethodTypes(List<DeliveryMethodType> deliveryMethodTypes) {
      this.deliveryMethodTypes = deliveryMethodTypes;
      return this;
    }

    
    public Builder function(ShopifyFunction function) {
      this.function = function;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }
  }
}
