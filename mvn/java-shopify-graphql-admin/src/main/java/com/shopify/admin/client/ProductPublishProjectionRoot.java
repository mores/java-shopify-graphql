package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductPublishProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductPublishProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductPublishPayload"));
  }

  public ProductPublishProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductPublishProjectionRoot<PARENT, ROOT>, ProductPublishProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductPublishProjectionRoot<PARENT, ROOT>, ProductPublishProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductPublicationProjection<ProductPublishProjectionRoot<PARENT, ROOT>, ProductPublishProjectionRoot<PARENT, ROOT>> productPublications(
      ) {
    ProductPublicationProjection<ProductPublishProjectionRoot<PARENT, ROOT>, ProductPublishProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationProjection<>(this, this);    
    getFields().put("productPublications", projection);
    return projection;
  }

  public ShopProjection<ProductPublishProjectionRoot<PARENT, ROOT>, ProductPublishProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<ProductPublishProjectionRoot<PARENT, ROOT>, ProductPublishProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<ProductPublishProjectionRoot<PARENT, ROOT>, ProductPublishProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductPublishProjectionRoot<PARENT, ROOT>, ProductPublishProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
