package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingUpsertUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingUpsertUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingUpsertUserError"));
  }

  public CheckoutBrandingUpsertUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingUpsertUserErrorCodeProjection<CheckoutBrandingUpsertUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CheckoutBrandingUpsertUserErrorCodeProjection<CheckoutBrandingUpsertUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingUpsertUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CheckoutBrandingUpsertUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CheckoutBrandingUpsertUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
