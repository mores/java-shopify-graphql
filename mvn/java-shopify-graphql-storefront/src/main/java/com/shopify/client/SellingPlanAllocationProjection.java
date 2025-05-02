package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanAllocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanAllocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanAllocation"));
  }

  public SellingPlanAllocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<SellingPlanAllocationProjection<PARENT, ROOT>, ROOT> checkoutChargeAmount(
      ) {
     MoneyV2Projection<SellingPlanAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("checkoutChargeAmount", projection);
     return projection;
  }

  public SellingPlanAllocationPriceAdjustmentProjection<SellingPlanAllocationProjection<PARENT, ROOT>, ROOT> priceAdjustments(
      ) {
     SellingPlanAllocationPriceAdjustmentProjection<SellingPlanAllocationProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationPriceAdjustmentProjection<>(this, getRoot());
     getFields().put("priceAdjustments", projection);
     return projection;
  }

  public MoneyV2Projection<SellingPlanAllocationProjection<PARENT, ROOT>, ROOT> remainingBalanceChargeAmount(
      ) {
     MoneyV2Projection<SellingPlanAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("remainingBalanceChargeAmount", projection);
     return projection;
  }

  public SellingPlanProjection<SellingPlanAllocationProjection<PARENT, ROOT>, ROOT> sellingPlan() {
     SellingPlanProjection<SellingPlanAllocationProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanProjection<>(this, getRoot());
     getFields().put("sellingPlan", projection);
     return projection;
  }
}
