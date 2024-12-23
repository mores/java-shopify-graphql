package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanCheckoutChargeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanCheckoutChargeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanCheckoutCharge"));
  }

  public SellingPlanCheckoutChargeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanCheckoutChargeTypeProjection<SellingPlanCheckoutChargeProjection<PARENT, ROOT>, ROOT> type(
      ) {
     SellingPlanCheckoutChargeTypeProjection<SellingPlanCheckoutChargeProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanCheckoutChargeTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public SellingPlanCheckoutChargeValueProjection<SellingPlanCheckoutChargeProjection<PARENT, ROOT>, ROOT> value(
      ) {
     SellingPlanCheckoutChargeValueProjection<SellingPlanCheckoutChargeProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanCheckoutChargeValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }
}
