package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRegionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRegionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRegion"));
  }

  public MarketRegionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRegionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketRegionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MarketRegionCountryFragmentProjection<MarketRegionProjection<PARENT, ROOT>, ROOT> onMarketRegionCountry(
      ) {
    MarketRegionCountryFragmentProjection<MarketRegionProjection<PARENT, ROOT>, ROOT> fragment = new MarketRegionCountryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
