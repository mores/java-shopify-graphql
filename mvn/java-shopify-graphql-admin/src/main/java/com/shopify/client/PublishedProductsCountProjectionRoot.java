package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublishedProductsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublishedProductsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public PublishedProductsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<PublishedProductsCountProjectionRoot<PARENT, ROOT>, PublishedProductsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<PublishedProductsCountProjectionRoot<PARENT, ROOT>, PublishedProductsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public PublishedProductsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
