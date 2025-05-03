package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductTagsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductTagsProjectionRoot() {
    super(null, null, java.util.Optional.of("StringConnection"));
  }

  public ProductTagsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StringEdgeProjection<ProductTagsProjectionRoot<PARENT, ROOT>, ProductTagsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    StringEdgeProjection<ProductTagsProjectionRoot<PARENT, ROOT>, ProductTagsProjectionRoot<PARENT, ROOT>> projection = new StringEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PageInfoProjection<ProductTagsProjectionRoot<PARENT, ROOT>, ProductTagsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ProductTagsProjectionRoot<PARENT, ROOT>, ProductTagsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }

  public ProductTagsProjectionRoot<PARENT, ROOT> nodes() {
    getFields().put("nodes", null);
    return this;
  }
}
