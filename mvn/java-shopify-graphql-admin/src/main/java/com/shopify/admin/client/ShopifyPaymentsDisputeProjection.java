package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsDisputeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsDisputeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDispute"));
  }

  public ShopifyPaymentsDisputeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public OrderProjection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeReasonDetailsProjection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> reasonDetails(
      ) {
     ShopifyPaymentsDisputeReasonDetailsProjection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeReasonDetailsProjection<>(this, getRoot());
     getFields().put("reasonDetails", projection);
     return projection;
  }

  public DisputeStatusProjection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> status() {
     DisputeStatusProjection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> projection = new DisputeStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DisputeTypeProjection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> type() {
     DisputeTypeProjection<ShopifyPaymentsDisputeProjection<PARENT, ROOT>, ROOT> projection = new DisputeTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeProjection<PARENT, ROOT> evidenceDueBy() {
    getFields().put("evidenceDueBy", null);
    return this;
  }

  public ShopifyPaymentsDisputeProjection<PARENT, ROOT> evidenceSentOn() {
    getFields().put("evidenceSentOn", null);
    return this;
  }

  public ShopifyPaymentsDisputeProjection<PARENT, ROOT> finalizedOn() {
    getFields().put("finalizedOn", null);
    return this;
  }

  public ShopifyPaymentsDisputeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsDisputeProjection<PARENT, ROOT> initiatedAt() {
    getFields().put("initiatedAt", null);
    return this;
  }

  public ShopifyPaymentsDisputeProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }
}
