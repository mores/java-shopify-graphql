package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TaxSummaryCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxSummaryCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxSummaryCreateUserError"));
  }

  public TaxSummaryCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxSummaryCreateUserErrorCodeProjection<TaxSummaryCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     TaxSummaryCreateUserErrorCodeProjection<TaxSummaryCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new TaxSummaryCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public TaxSummaryCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public TaxSummaryCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
