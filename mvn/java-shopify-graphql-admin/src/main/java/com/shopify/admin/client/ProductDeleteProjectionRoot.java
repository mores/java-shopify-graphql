package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductDeletePayload"));
  }

  public ProductDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductDeleteOperationProjection<ProductDeleteProjectionRoot<PARENT, ROOT>, ProductDeleteProjectionRoot<PARENT, ROOT>> productDeleteOperation(
      ) {
    ProductDeleteOperationProjection<ProductDeleteProjectionRoot<PARENT, ROOT>, ProductDeleteProjectionRoot<PARENT, ROOT>> projection = new ProductDeleteOperationProjection<>(this, this);    
    getFields().put("productDeleteOperation", projection);
    return projection;
  }

  public ShopProjection<ProductDeleteProjectionRoot<PARENT, ROOT>, ProductDeleteProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<ProductDeleteProjectionRoot<PARENT, ROOT>, ProductDeleteProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<ProductDeleteProjectionRoot<PARENT, ROOT>, ProductDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductDeleteProjectionRoot<PARENT, ROOT>, ProductDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductDeleteProjectionRoot<PARENT, ROOT> deletedProductId() {
    getFields().put("deletedProductId", null);
    return this;
  }
}
