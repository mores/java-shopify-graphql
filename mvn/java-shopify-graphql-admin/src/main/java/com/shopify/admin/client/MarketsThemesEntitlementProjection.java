package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketsThemesEntitlementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsThemesEntitlementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketsThemesEntitlement"));
  }

  public MarketsThemesEntitlementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketsThemesEntitlementProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
