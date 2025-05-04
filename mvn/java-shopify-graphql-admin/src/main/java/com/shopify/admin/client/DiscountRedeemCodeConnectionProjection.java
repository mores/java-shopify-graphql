package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountRedeemCodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountRedeemCodeConnection"));
  }

  public DiscountRedeemCodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeEdgeProjection<DiscountRedeemCodeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DiscountRedeemCodeEdgeProjection<DiscountRedeemCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DiscountRedeemCodeProjection<DiscountRedeemCodeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DiscountRedeemCodeProjection<DiscountRedeemCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DiscountRedeemCodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DiscountRedeemCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
