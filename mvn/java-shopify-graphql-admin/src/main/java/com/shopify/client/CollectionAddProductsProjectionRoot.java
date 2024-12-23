package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionAddProductsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionAddProductsProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionAddProductsPayload"));
  }

  public CollectionAddProductsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionProjection<CollectionAddProductsProjectionRoot<PARENT, ROOT>, CollectionAddProductsProjectionRoot<PARENT, ROOT>> collection(
      ) {
    CollectionProjection<CollectionAddProductsProjectionRoot<PARENT, ROOT>, CollectionAddProductsProjectionRoot<PARENT, ROOT>> projection = new CollectionProjection<>(this, this);    
    getFields().put("collection", projection);
    return projection;
  }

  public UserErrorProjection<CollectionAddProductsProjectionRoot<PARENT, ROOT>, CollectionAddProductsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionAddProductsProjectionRoot<PARENT, ROOT>, CollectionAddProductsProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
