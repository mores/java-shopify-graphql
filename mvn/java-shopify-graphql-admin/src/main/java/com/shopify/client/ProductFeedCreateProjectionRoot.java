package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFeedCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFeedCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductFeedCreatePayload"));
  }

  public ProductFeedCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductFeedProjection<ProductFeedCreateProjectionRoot<PARENT, ROOT>, ProductFeedCreateProjectionRoot<PARENT, ROOT>> productFeed(
      ) {
    ProductFeedProjection<ProductFeedCreateProjectionRoot<PARENT, ROOT>, ProductFeedCreateProjectionRoot<PARENT, ROOT>> projection = new ProductFeedProjection<>(this, this);    
    getFields().put("productFeed", projection);
    return projection;
  }

  public ProductFeedCreateUserErrorProjection<ProductFeedCreateProjectionRoot<PARENT, ROOT>, ProductFeedCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductFeedCreateUserErrorProjection<ProductFeedCreateProjectionRoot<PARENT, ROOT>, ProductFeedCreateProjectionRoot<PARENT, ROOT>> projection = new ProductFeedCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
