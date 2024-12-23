package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountRedeemCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountRedeemCode"));
  }

  public DiscountRedeemCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<DiscountRedeemCodeProjection<PARENT, ROOT>, ROOT> createdBy() {
     AppProjection<DiscountRedeemCodeProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("createdBy", projection);
     return projection;
  }

  public DiscountRedeemCodeProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountRedeemCodeProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public DiscountRedeemCodeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
