package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DisputeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DisputeProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopifyPaymentsDispute"));
  }

  public DisputeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> amount(
      ) {
    MoneyV2Projection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("amount", projection);
    return projection;
  }

  public OrderProjection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeReasonDetailsProjection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> reasonDetails(
      ) {
    ShopifyPaymentsDisputeReasonDetailsProjection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeReasonDetailsProjection<>(this, this);    
    getFields().put("reasonDetails", projection);
    return projection;
  }

  public DisputeStatusProjection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> status(
      ) {
    DisputeStatusProjection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> projection = new DisputeStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public DisputeTypeProjection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> type(
      ) {
    DisputeTypeProjection<DisputeProjectionRoot<PARENT, ROOT>, DisputeProjectionRoot<PARENT, ROOT>> projection = new DisputeTypeProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public DisputeProjectionRoot<PARENT, ROOT> evidenceDueBy() {
    getFields().put("evidenceDueBy", null);
    return this;
  }

  public DisputeProjectionRoot<PARENT, ROOT> evidenceSentOn() {
    getFields().put("evidenceSentOn", null);
    return this;
  }

  public DisputeProjectionRoot<PARENT, ROOT> finalizedOn() {
    getFields().put("finalizedOn", null);
    return this;
  }

  public DisputeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DisputeProjectionRoot<PARENT, ROOT> initiatedAt() {
    getFields().put("initiatedAt", null);
    return this;
  }

  public DisputeProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }
}
