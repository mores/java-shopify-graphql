package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductCreatePayload"));
  }

  public ProductCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductCreateProjectionRoot<PARENT, ROOT>, ProductCreateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductCreateProjectionRoot<PARENT, ROOT>, ProductCreateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ShopProjection<ProductCreateProjectionRoot<PARENT, ROOT>, ProductCreateProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<ProductCreateProjectionRoot<PARENT, ROOT>, ProductCreateProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<ProductCreateProjectionRoot<PARENT, ROOT>, ProductCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductCreateProjectionRoot<PARENT, ROOT>, ProductCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
