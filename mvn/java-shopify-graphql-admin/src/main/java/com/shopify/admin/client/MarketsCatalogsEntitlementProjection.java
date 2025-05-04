package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketsCatalogsEntitlementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsCatalogsEntitlementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketsCatalogsEntitlement"));
  }

  public MarketsCatalogsEntitlementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketsCatalogsEntitlementProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
