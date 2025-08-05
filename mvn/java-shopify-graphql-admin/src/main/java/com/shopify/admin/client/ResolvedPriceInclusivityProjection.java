package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResolvedPriceInclusivityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResolvedPriceInclusivityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResolvedPriceInclusivity"));
  }

  public ResolvedPriceInclusivityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResolvedPriceInclusivityProjection<PARENT, ROOT> dutiesIncluded() {
    getFields().put("dutiesIncluded", null);
    return this;
  }

  public ResolvedPriceInclusivityProjection<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }
}
