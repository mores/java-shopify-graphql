package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketsRegionsEntitlementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsRegionsEntitlementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketsRegionsEntitlement"));
  }

  public MarketsRegionsEntitlementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketsCatalogsEntitlementProjection<MarketsRegionsEntitlementProjection<PARENT, ROOT>, ROOT> catalogs(
      ) {
     MarketsCatalogsEntitlementProjection<MarketsRegionsEntitlementProjection<PARENT, ROOT>, ROOT> projection = new MarketsCatalogsEntitlementProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public MarketsRegionsEntitlementProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
