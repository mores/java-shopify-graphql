package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnReasonDefinitionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnReasonDefinitionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnReasonDefinitionEdge"));
  }

  public ReturnReasonDefinitionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnReasonDefinitionProjection<ReturnReasonDefinitionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ReturnReasonDefinitionProjection<ReturnReasonDefinitionEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReturnReasonDefinitionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReturnReasonDefinitionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
