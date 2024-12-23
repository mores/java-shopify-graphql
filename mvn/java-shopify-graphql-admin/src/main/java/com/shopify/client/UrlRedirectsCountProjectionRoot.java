package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public UrlRedirectsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<UrlRedirectsCountProjectionRoot<PARENT, ROOT>, UrlRedirectsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<UrlRedirectsCountProjectionRoot<PARENT, ROOT>, UrlRedirectsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public UrlRedirectsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
