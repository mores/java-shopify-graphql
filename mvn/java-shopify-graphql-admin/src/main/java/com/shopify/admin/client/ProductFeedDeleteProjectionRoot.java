package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFeedDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFeedDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductFeedDeletePayload"));
  }

  public ProductFeedDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductFeedDeleteUserErrorProjection<ProductFeedDeleteProjectionRoot<PARENT, ROOT>, ProductFeedDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductFeedDeleteUserErrorProjection<ProductFeedDeleteProjectionRoot<PARENT, ROOT>, ProductFeedDeleteProjectionRoot<PARENT, ROOT>> projection = new ProductFeedDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductFeedDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
