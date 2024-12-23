package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppUsagePricingFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppUsagePricingFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppUsagePricing"));
  }

  public AppUsagePricingFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppUsagePricingFragmentProjection<PARENT, ROOT>, ROOT> balanceUsed() {
     MoneyV2Projection<AppUsagePricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceUsed", projection);
     return projection;
  }

  public MoneyV2Projection<AppUsagePricingFragmentProjection<PARENT, ROOT>, ROOT> cappedAmount() {
     MoneyV2Projection<AppUsagePricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cappedAmount", projection);
     return projection;
  }

  public AppPricingIntervalProjection<AppUsagePricingFragmentProjection<PARENT, ROOT>, ROOT> interval(
      ) {
     AppPricingIntervalProjection<AppUsagePricingFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppPricingIntervalProjection<>(this, getRoot());
     getFields().put("interval", projection);
     return projection;
  }

  public AppUsagePricingFragmentProjection<PARENT, ROOT> terms() {
    getFields().put("terms", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppUsagePricing {");
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
