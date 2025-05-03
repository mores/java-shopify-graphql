package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopPayInstallmentsFinancingPlanFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsFinancingPlan"));
  }

  public ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT, ROOT>, ROOT> maxPrice(
      ) {
     MoneyV2Projection<ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maxPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT, ROOT>, ROOT> minPrice(
      ) {
     MoneyV2Projection<ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("minPrice", projection);
     return projection;
  }

  public ShopPayInstallmentsFinancingPlanTermProjection<ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT, ROOT>, ROOT> terms(
      ) {
     ShopPayInstallmentsFinancingPlanTermProjection<ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsFinancingPlanTermProjection<>(this, getRoot());
     getFields().put("terms", projection);
     return projection;
  }

  public ShopPayInstallmentsFinancingPlanFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopPayInstallmentsFinancingPlan {");
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
