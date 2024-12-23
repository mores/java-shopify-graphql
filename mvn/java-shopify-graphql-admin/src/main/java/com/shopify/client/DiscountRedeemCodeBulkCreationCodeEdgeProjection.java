package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountRedeemCodeBulkCreationCodeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeBulkCreationCodeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountRedeemCodeBulkCreationCodeEdge"));
  }

  public DiscountRedeemCodeBulkCreationCodeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationCodeProjection<DiscountRedeemCodeBulkCreationCodeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DiscountRedeemCodeBulkCreationCodeProjection<DiscountRedeemCodeBulkCreationCodeEdgeProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationCodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DiscountRedeemCodeBulkCreationCodeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
