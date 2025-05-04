package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountUserError"));
  }

  public DiscountUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountErrorCodeProjection<DiscountUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     DiscountErrorCodeProjection<DiscountUserErrorProjection<PARENT, ROOT>, ROOT> projection = new DiscountErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DiscountUserErrorProjection<PARENT, ROOT> extraInfo() {
    getFields().put("extraInfo", null);
    return this;
  }

  public DiscountUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DiscountUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
