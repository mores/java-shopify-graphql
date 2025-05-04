package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxAppConfigureUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxAppConfigureUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxAppConfigureUserError"));
  }

  public TaxAppConfigureUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxAppConfigureUserErrorCodeProjection<TaxAppConfigureUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     TaxAppConfigureUserErrorCodeProjection<TaxAppConfigureUserErrorProjection<PARENT, ROOT>, ROOT> projection = new TaxAppConfigureUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public TaxAppConfigureUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public TaxAppConfigureUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
