package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDuplicateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDuplicateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductDuplicatePayload"));
  }

  public ProductDuplicateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> imageJob(
      ) {
    JobProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("imageJob", projection);
    return projection;
  }

  public ProductProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> newProduct(
      ) {
    ProductProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("newProduct", projection);
    return projection;
  }

  public ProductDuplicateOperationProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> productDuplicateOperation(
      ) {
    ProductDuplicateOperationProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> projection = new ProductDuplicateOperationProjection<>(this, this);    
    getFields().put("productDuplicateOperation", projection);
    return projection;
  }

  public ShopProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductDuplicateProjectionRoot<PARENT, ROOT>, ProductDuplicateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
