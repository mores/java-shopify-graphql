package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductBundleCreatePayload"));
  }

  public ProductBundleCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductBundleOperationProjection<ProductBundleCreateProjectionRoot<PARENT, ROOT>, ProductBundleCreateProjectionRoot<PARENT, ROOT>> productBundleOperation(
      ) {
    ProductBundleOperationProjection<ProductBundleCreateProjectionRoot<PARENT, ROOT>, ProductBundleCreateProjectionRoot<PARENT, ROOT>> projection = new ProductBundleOperationProjection<>(this, this);    
    getFields().put("productBundleOperation", projection);
    return projection;
  }

  public UserErrorProjection<ProductBundleCreateProjectionRoot<PARENT, ROOT>, ProductBundleCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductBundleCreateProjectionRoot<PARENT, ROOT>, ProductBundleCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
