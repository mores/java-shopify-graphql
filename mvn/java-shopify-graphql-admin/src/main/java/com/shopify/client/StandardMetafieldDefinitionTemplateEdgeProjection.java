package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetafieldDefinitionTemplateEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetafieldDefinitionTemplateEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardMetafieldDefinitionTemplateEdge"));
  }

  public StandardMetafieldDefinitionTemplateEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateProjection<StandardMetafieldDefinitionTemplateEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     StandardMetafieldDefinitionTemplateProjection<StandardMetafieldDefinitionTemplateEdgeProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public StandardMetafieldDefinitionTemplateEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
