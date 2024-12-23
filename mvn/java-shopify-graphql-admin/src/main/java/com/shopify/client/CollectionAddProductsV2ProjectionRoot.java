package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionAddProductsV2ProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionAddProductsV2ProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionAddProductsV2Payload"));
  }

  public CollectionAddProductsV2ProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<CollectionAddProductsV2ProjectionRoot<PARENT, ROOT>, CollectionAddProductsV2ProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<CollectionAddProductsV2ProjectionRoot<PARENT, ROOT>, CollectionAddProductsV2ProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public CollectionAddProductsV2UserErrorProjection<CollectionAddProductsV2ProjectionRoot<PARENT, ROOT>, CollectionAddProductsV2ProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CollectionAddProductsV2UserErrorProjection<CollectionAddProductsV2ProjectionRoot<PARENT, ROOT>, CollectionAddProductsV2ProjectionRoot<PARENT, ROOT>> projection = new CollectionAddProductsV2UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
