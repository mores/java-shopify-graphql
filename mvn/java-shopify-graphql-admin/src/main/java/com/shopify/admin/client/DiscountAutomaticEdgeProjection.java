package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticEdge"));
  }

  public DiscountAutomaticEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticProjection<DiscountAutomaticEdgeProjection<PARENT, ROOT>, ROOT> node() {
     DiscountAutomaticProjection<DiscountAutomaticEdgeProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DiscountAutomaticEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
