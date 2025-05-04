package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionReorderProductsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionReorderProductsProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionReorderProductsPayload"));
  }

  public CollectionReorderProductsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<CollectionReorderProductsProjectionRoot<PARENT, ROOT>, CollectionReorderProductsProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<CollectionReorderProductsProjectionRoot<PARENT, ROOT>, CollectionReorderProductsProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<CollectionReorderProductsProjectionRoot<PARENT, ROOT>, CollectionReorderProductsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionReorderProductsProjectionRoot<PARENT, ROOT>, CollectionReorderProductsProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
