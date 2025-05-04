package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketsB2BEntitlementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsB2BEntitlementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketsB2BEntitlement"));
  }

  public MarketsB2BEntitlementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketsCatalogsEntitlementProjection<MarketsB2BEntitlementProjection<PARENT, ROOT>, ROOT> catalogs(
      ) {
     MarketsCatalogsEntitlementProjection<MarketsB2BEntitlementProjection<PARENT, ROOT>, ROOT> projection = new MarketsCatalogsEntitlementProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public MarketsB2BEntitlementProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
