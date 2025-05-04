package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketsTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketsType"));
  }

  public MarketsTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketsB2BEntitlementProjection<MarketsTypeProjection<PARENT, ROOT>, ROOT> b2b() {
     MarketsB2BEntitlementProjection<MarketsTypeProjection<PARENT, ROOT>, ROOT> projection = new MarketsB2BEntitlementProjection<>(this, getRoot());
     getFields().put("b2b", projection);
     return projection;
  }

  public MarketsRegionsEntitlementProjection<MarketsTypeProjection<PARENT, ROOT>, ROOT> regions() {
     MarketsRegionsEntitlementProjection<MarketsTypeProjection<PARENT, ROOT>, ROOT> projection = new MarketsRegionsEntitlementProjection<>(this, getRoot());
     getFields().put("regions", projection);
     return projection;
  }

  public MarketsRetailEntitlementProjection<MarketsTypeProjection<PARENT, ROOT>, ROOT> retail() {
     MarketsRetailEntitlementProjection<MarketsTypeProjection<PARENT, ROOT>, ROOT> projection = new MarketsRetailEntitlementProjection<>(this, getRoot());
     getFields().put("retail", projection);
     return projection;
  }

  public MarketsThemesEntitlementProjection<MarketsTypeProjection<PARENT, ROOT>, ROOT> themes() {
     MarketsThemesEntitlementProjection<MarketsTypeProjection<PARENT, ROOT>, ROOT> projection = new MarketsThemesEntitlementProjection<>(this, getRoot());
     getFields().put("themes", projection);
     return projection;
  }
}
