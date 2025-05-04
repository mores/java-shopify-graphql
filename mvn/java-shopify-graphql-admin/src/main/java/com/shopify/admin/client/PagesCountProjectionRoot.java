package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PagesCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PagesCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public PagesCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<PagesCountProjectionRoot<PARENT, ROOT>, PagesCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<PagesCountProjectionRoot<PARENT, ROOT>, PagesCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public PagesCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
