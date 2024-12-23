package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFeedsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFeedsProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductFeedConnection"));
  }

  public ProductFeedsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductFeedEdgeProjection<ProductFeedsProjectionRoot<PARENT, ROOT>, ProductFeedsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ProductFeedEdgeProjection<ProductFeedsProjectionRoot<PARENT, ROOT>, ProductFeedsProjectionRoot<PARENT, ROOT>> projection = new ProductFeedEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ProductFeedProjection<ProductFeedsProjectionRoot<PARENT, ROOT>, ProductFeedsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ProductFeedProjection<ProductFeedsProjectionRoot<PARENT, ROOT>, ProductFeedsProjectionRoot<PARENT, ROOT>> projection = new ProductFeedProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ProductFeedsProjectionRoot<PARENT, ROOT>, ProductFeedsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ProductFeedsProjectionRoot<PARENT, ROOT>, ProductFeedsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
