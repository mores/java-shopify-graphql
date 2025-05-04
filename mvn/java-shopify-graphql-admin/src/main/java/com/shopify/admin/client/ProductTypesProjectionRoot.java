package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductTypesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductTypesProjectionRoot() {
    super(null, null, java.util.Optional.of("StringConnection"));
  }

  public ProductTypesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StringEdgeProjection<ProductTypesProjectionRoot<PARENT, ROOT>, ProductTypesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    StringEdgeProjection<ProductTypesProjectionRoot<PARENT, ROOT>, ProductTypesProjectionRoot<PARENT, ROOT>> projection = new StringEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PageInfoProjection<ProductTypesProjectionRoot<PARENT, ROOT>, ProductTypesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ProductTypesProjectionRoot<PARENT, ROOT>, ProductTypesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }

  public ProductTypesProjectionRoot<PARENT, ROOT> nodes() {
    getFields().put("nodes", null);
    return this;
  }
}
