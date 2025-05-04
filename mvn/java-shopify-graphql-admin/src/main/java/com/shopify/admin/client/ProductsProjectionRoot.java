package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductsProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductConnection"));
  }

  public ProductsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductEdgeProjection<ProductsProjectionRoot<PARENT, ROOT>, ProductsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ProductEdgeProjection<ProductsProjectionRoot<PARENT, ROOT>, ProductsProjectionRoot<PARENT, ROOT>> projection = new ProductEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ProductProjection<ProductsProjectionRoot<PARENT, ROOT>, ProductsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ProductProjection<ProductsProjectionRoot<PARENT, ROOT>, ProductsProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ProductsProjectionRoot<PARENT, ROOT>, ProductsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ProductsProjectionRoot<PARENT, ROOT>, ProductsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
