package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountConnection"));
  }

  public StoreCreditAccountConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountEdgeProjection<StoreCreditAccountConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     StoreCreditAccountEdgeProjection<StoreCreditAccountConnectionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public StoreCreditAccountProjection<StoreCreditAccountConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     StoreCreditAccountProjection<StoreCreditAccountConnectionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<StoreCreditAccountConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<StoreCreditAccountConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
