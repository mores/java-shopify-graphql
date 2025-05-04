package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRemoveProductsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRemoveProductsProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionRemoveProductsPayload"));
  }

  public CollectionRemoveProductsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<CollectionRemoveProductsProjectionRoot<PARENT, ROOT>, CollectionRemoveProductsProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<CollectionRemoveProductsProjectionRoot<PARENT, ROOT>, CollectionRemoveProductsProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<CollectionRemoveProductsProjectionRoot<PARENT, ROOT>, CollectionRemoveProductsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionRemoveProductsProjectionRoot<PARENT, ROOT>, CollectionRemoveProductsProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
