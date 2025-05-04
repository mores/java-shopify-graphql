package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectDefinitionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDefinitionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectDefinitionEdge"));
  }

  public MetaobjectDefinitionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectDefinitionProjection<MetaobjectDefinitionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     MetaobjectDefinitionProjection<MetaobjectDefinitionEdgeProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MetaobjectDefinitionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
