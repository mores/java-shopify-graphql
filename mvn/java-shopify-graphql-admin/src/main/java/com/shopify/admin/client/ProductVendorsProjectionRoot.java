package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVendorsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVendorsProjectionRoot() {
    super(null, null, java.util.Optional.of("StringConnection"));
  }

  public ProductVendorsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StringEdgeProjection<ProductVendorsProjectionRoot<PARENT, ROOT>, ProductVendorsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    StringEdgeProjection<ProductVendorsProjectionRoot<PARENT, ROOT>, ProductVendorsProjectionRoot<PARENT, ROOT>> projection = new StringEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PageInfoProjection<ProductVendorsProjectionRoot<PARENT, ROOT>, ProductVendorsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ProductVendorsProjectionRoot<PARENT, ROOT>, ProductVendorsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }

  public ProductVendorsProjectionRoot<PARENT, ROOT> nodes() {
    getFields().put("nodes", null);
    return this;
  }
}
