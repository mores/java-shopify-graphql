package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanInventoryPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanInventoryPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanInventoryPolicy"));
  }

  public SellingPlanInventoryPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanReserveProjection<SellingPlanInventoryPolicyProjection<PARENT, ROOT>, ROOT> reserve(
      ) {
     SellingPlanReserveProjection<SellingPlanInventoryPolicyProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanReserveProjection<>(this, getRoot());
     getFields().put("reserve", projection);
     return projection;
  }
}
