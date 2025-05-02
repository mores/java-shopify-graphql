package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayInstallmentsFinancingPlanProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayInstallmentsFinancingPlanProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsFinancingPlan"));
  }

  public ShopPayInstallmentsFinancingPlanProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopPayInstallmentsFinancingPlanProjection<PARENT, ROOT>, ROOT> maxPrice(
      ) {
     MoneyV2Projection<ShopPayInstallmentsFinancingPlanProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maxPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayInstallmentsFinancingPlanProjection<PARENT, ROOT>, ROOT> minPrice(
      ) {
     MoneyV2Projection<ShopPayInstallmentsFinancingPlanProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("minPrice", projection);
     return projection;
  }

  public ShopPayInstallmentsFinancingPlanTermProjection<ShopPayInstallmentsFinancingPlanProjection<PARENT, ROOT>, ROOT> terms(
      ) {
     ShopPayInstallmentsFinancingPlanTermProjection<ShopPayInstallmentsFinancingPlanProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsFinancingPlanTermProjection<>(this, getRoot());
     getFields().put("terms", projection);
     return projection;
  }

  public ShopPayInstallmentsFinancingPlanProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
