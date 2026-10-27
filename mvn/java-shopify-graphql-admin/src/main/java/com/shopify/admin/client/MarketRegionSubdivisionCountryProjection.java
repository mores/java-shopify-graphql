package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRegionSubdivisionCountryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRegionSubdivisionCountryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRegionSubdivisionCountry"));
  }

  public MarketRegionSubdivisionCountryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<MarketRegionSubdivisionCountryProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CountryCodeProjection<MarketRegionSubdivisionCountryProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MarketRegionSubdivisionCountryProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
