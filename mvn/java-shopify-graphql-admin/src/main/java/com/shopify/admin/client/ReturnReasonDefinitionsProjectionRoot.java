package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnReasonDefinitionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnReasonDefinitionsProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnReasonDefinitionConnection"));
  }

  public ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnReasonDefinitionEdgeProjection<ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>, ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ReturnReasonDefinitionEdgeProjection<ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>, ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>> projection = new ReturnReasonDefinitionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ReturnReasonDefinitionProjection<ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>, ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ReturnReasonDefinitionProjection<ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>, ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>> projection = new ReturnReasonDefinitionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>, ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>, ReturnReasonDefinitionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
