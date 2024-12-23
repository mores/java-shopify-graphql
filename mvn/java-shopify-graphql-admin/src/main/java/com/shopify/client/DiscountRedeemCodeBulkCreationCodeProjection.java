package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountRedeemCodeBulkCreationCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeBulkCreationCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountRedeemCodeBulkCreationCode"));
  }

  public DiscountRedeemCodeBulkCreationCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeProjection<DiscountRedeemCodeBulkCreationCodeProjection<PARENT, ROOT>, ROOT> discountRedeemCode(
      ) {
     DiscountRedeemCodeProjection<DiscountRedeemCodeBulkCreationCodeProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeProjection<>(this, getRoot());
     getFields().put("discountRedeemCode", projection);
     return projection;
  }

  public DiscountUserErrorProjection<DiscountRedeemCodeBulkCreationCodeProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     DiscountUserErrorProjection<DiscountRedeemCodeBulkCreationCodeProjection<PARENT, ROOT>, ROOT> projection = new DiscountUserErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public DiscountRedeemCodeBulkCreationCodeProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }
}
