package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppDiscountTypesNodesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppDiscountTypesNodesProjectionRoot() {
    super(null, null, java.util.Optional.of("AppDiscountTypeConnection"));
  }

  public AppDiscountTypesNodesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeEdgeProjection<AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>, AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    AppDiscountTypeEdgeProjection<AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>, AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>> projection = new AppDiscountTypeEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public AppDiscountTypeProjection<AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>, AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    AppDiscountTypeProjection<AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>, AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>> projection = new AppDiscountTypeProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>, AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>, AppDiscountTypesNodesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
