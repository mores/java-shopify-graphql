package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsDisputeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsDisputeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDispute"));
  }

  public ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public OrderProjection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeReasonDetailsProjection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> reasonDetails(
      ) {
     ShopifyPaymentsDisputeReasonDetailsProjection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeReasonDetailsProjection<>(this, getRoot());
     getFields().put("reasonDetails", projection);
     return projection;
  }

  public DisputeStatusProjection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DisputeStatusProjection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> projection = new DisputeStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DisputeTypeProjection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     DisputeTypeProjection<ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT>, ROOT> projection = new DisputeTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT> evidenceDueBy() {
    getFields().put("evidenceDueBy", null);
    return this;
  }

  public ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT> evidenceSentOn() {
    getFields().put("evidenceSentOn", null);
    return this;
  }

  public ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT> finalizedOn() {
    getFields().put("finalizedOn", null);
    return this;
  }

  public ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT> initiatedAt() {
    getFields().put("initiatedAt", null);
    return this;
  }

  public ShopifyPaymentsDisputeFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsDispute {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
