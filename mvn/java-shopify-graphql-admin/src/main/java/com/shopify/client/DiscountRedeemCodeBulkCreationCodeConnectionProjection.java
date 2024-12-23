package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountRedeemCodeBulkCreationCodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeBulkCreationCodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountRedeemCodeBulkCreationCodeConnection"));
  }

  public DiscountRedeemCodeBulkCreationCodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationCodeEdgeProjection<DiscountRedeemCodeBulkCreationCodeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DiscountRedeemCodeBulkCreationCodeEdgeProjection<DiscountRedeemCodeBulkCreationCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationCodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DiscountRedeemCodeBulkCreationCodeProjection<DiscountRedeemCodeBulkCreationCodeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DiscountRedeemCodeBulkCreationCodeProjection<DiscountRedeemCodeBulkCreationCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationCodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DiscountRedeemCodeBulkCreationCodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DiscountRedeemCodeBulkCreationCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
