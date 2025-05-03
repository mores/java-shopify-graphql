package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayInstallmentsFinancingPlanFrequencyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayInstallmentsFinancingPlanFrequencyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsFinancingPlanFrequency"));
  }

  public ShopPayInstallmentsFinancingPlanFrequencyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
