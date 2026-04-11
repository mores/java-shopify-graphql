package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnReasonDefinitionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnReasonDefinitionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnReasonDefinitionConnection"));
  }

  public ReturnReasonDefinitionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnReasonDefinitionEdgeProjection<ReturnReasonDefinitionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReturnReasonDefinitionEdgeProjection<ReturnReasonDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnReasonDefinitionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReturnReasonDefinitionProjection<ReturnReasonDefinitionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReturnReasonDefinitionProjection<ReturnReasonDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnReasonDefinitionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReturnReasonDefinitionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ReturnReasonDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
