package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrdersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrdersProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderConnection"));
  }

  public DraftOrdersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderEdgeProjection<DraftOrdersProjectionRoot<PARENT, ROOT>, DraftOrdersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DraftOrderEdgeProjection<DraftOrdersProjectionRoot<PARENT, ROOT>, DraftOrdersProjectionRoot<PARENT, ROOT>> projection = new DraftOrderEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DraftOrderProjection<DraftOrdersProjectionRoot<PARENT, ROOT>, DraftOrdersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DraftOrderProjection<DraftOrdersProjectionRoot<PARENT, ROOT>, DraftOrdersProjectionRoot<PARENT, ROOT>> projection = new DraftOrderProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<DraftOrdersProjectionRoot<PARENT, ROOT>, DraftOrdersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DraftOrdersProjectionRoot<PARENT, ROOT>, DraftOrdersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
