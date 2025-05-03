package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanAllocationPriceAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanAllocationPriceAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanAllocationPriceAdjustment"));
  }

  public SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT>, ROOT> compareAtPrice(
      ) {
     MoneyV2Projection<SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtPrice", projection);
     return projection;
  }

  public MoneyV2Projection<SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT>, ROOT> perDeliveryPrice(
      ) {
     MoneyV2Projection<SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("perDeliveryPrice", projection);
     return projection;
  }

  public MoneyV2Projection<SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT>, ROOT> price(
      ) {
     MoneyV2Projection<SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public MoneyV2Projection<SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT>, ROOT> unitPrice(
      ) {
     MoneyV2Projection<SellingPlanAllocationPriceAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitPrice", projection);
     return projection;
  }
}
