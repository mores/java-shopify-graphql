package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketPriceInclusionsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketPriceInclusionsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketPriceInclusions"));
  }

  public MarketPriceInclusionsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InclusiveDutiesPricingStrategyProjection<MarketPriceInclusionsProjection<PARENT, ROOT>, ROOT> inclusiveDutiesPricingStrategy(
      ) {
     InclusiveDutiesPricingStrategyProjection<MarketPriceInclusionsProjection<PARENT, ROOT>, ROOT> projection = new InclusiveDutiesPricingStrategyProjection<>(this, getRoot());
     getFields().put("inclusiveDutiesPricingStrategy", projection);
     return projection;
  }

  public InclusiveTaxPricingStrategyProjection<MarketPriceInclusionsProjection<PARENT, ROOT>, ROOT> inclusiveTaxPricingStrategy(
      ) {
     InclusiveTaxPricingStrategyProjection<MarketPriceInclusionsProjection<PARENT, ROOT>, ROOT> projection = new InclusiveTaxPricingStrategyProjection<>(this, getRoot());
     getFields().put("inclusiveTaxPricingStrategy", projection);
     return projection;
  }
}
