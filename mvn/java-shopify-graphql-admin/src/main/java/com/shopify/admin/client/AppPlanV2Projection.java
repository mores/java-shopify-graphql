package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppPlanV2Projection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppPlanV2Projection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppPlanV2"));
  }

  public AppPlanV2Projection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppPricingDetailsProjection<AppPlanV2Projection<PARENT, ROOT>, ROOT> pricingDetails() {
     AppPricingDetailsProjection<AppPlanV2Projection<PARENT, ROOT>, ROOT> projection = new AppPricingDetailsProjection<>(this, getRoot());
     getFields().put("pricingDetails", projection);
     return projection;
  }
}
