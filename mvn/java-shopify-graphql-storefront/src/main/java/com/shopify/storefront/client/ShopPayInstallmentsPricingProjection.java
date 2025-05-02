package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayInstallmentsPricingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayInstallmentsPricingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsPricing"));
  }

  public ShopPayInstallmentsPricingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayInstallmentsFinancingPlanProjection<ShopPayInstallmentsPricingProjection<PARENT, ROOT>, ROOT> financingPlans(
      ) {
     ShopPayInstallmentsFinancingPlanProjection<ShopPayInstallmentsPricingProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsFinancingPlanProjection<>(this, getRoot());
     getFields().put("financingPlans", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayInstallmentsPricingProjection<PARENT, ROOT>, ROOT> maxPrice() {
     MoneyV2Projection<ShopPayInstallmentsPricingProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maxPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayInstallmentsPricingProjection<PARENT, ROOT>, ROOT> minPrice() {
     MoneyV2Projection<ShopPayInstallmentsPricingProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("minPrice", projection);
     return projection;
  }
}
