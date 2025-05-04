package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompaniesCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompaniesCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public CompaniesCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<CompaniesCountProjectionRoot<PARENT, ROOT>, CompaniesCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<CompaniesCountProjectionRoot<PARENT, ROOT>, CompaniesCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public CompaniesCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
