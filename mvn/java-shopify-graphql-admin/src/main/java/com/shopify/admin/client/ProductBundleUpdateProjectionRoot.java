package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductBundleUpdatePayload"));
  }

  public ProductBundleUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductBundleOperationProjection<ProductBundleUpdateProjectionRoot<PARENT, ROOT>, ProductBundleUpdateProjectionRoot<PARENT, ROOT>> productBundleOperation(
      ) {
    ProductBundleOperationProjection<ProductBundleUpdateProjectionRoot<PARENT, ROOT>, ProductBundleUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductBundleOperationProjection<>(this, this);    
    getFields().put("productBundleOperation", projection);
    return projection;
  }

  public UserErrorProjection<ProductBundleUpdateProjectionRoot<PARENT, ROOT>, ProductBundleUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductBundleUpdateProjectionRoot<PARENT, ROOT>, ProductBundleUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
