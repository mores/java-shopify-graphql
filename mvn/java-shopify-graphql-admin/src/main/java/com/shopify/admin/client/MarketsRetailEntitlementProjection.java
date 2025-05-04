package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketsRetailEntitlementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsRetailEntitlementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketsRetailEntitlement"));
  }

  public MarketsRetailEntitlementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketsCatalogsEntitlementProjection<MarketsRetailEntitlementProjection<PARENT, ROOT>, ROOT> catalogs(
      ) {
     MarketsCatalogsEntitlementProjection<MarketsRetailEntitlementProjection<PARENT, ROOT>, ROOT> projection = new MarketsCatalogsEntitlementProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public MarketsRetailEntitlementProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
