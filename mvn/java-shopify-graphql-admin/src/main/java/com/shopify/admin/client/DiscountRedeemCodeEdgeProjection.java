package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountRedeemCodeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountRedeemCodeEdge"));
  }

  public DiscountRedeemCodeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeProjection<DiscountRedeemCodeEdgeProjection<PARENT, ROOT>, ROOT> node() {
     DiscountRedeemCodeProjection<DiscountRedeemCodeEdgeProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DiscountRedeemCodeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
