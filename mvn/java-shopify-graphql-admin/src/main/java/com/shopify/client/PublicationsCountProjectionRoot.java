package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public PublicationsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<PublicationsCountProjectionRoot<PARENT, ROOT>, PublicationsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<PublicationsCountProjectionRoot<PARENT, ROOT>, PublicationsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public PublicationsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
