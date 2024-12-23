package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetafieldDefinitionTemplateConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetafieldDefinitionTemplateConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardMetafieldDefinitionTemplateConnection"));
  }

  public StandardMetafieldDefinitionTemplateConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateEdgeProjection<StandardMetafieldDefinitionTemplateConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     StandardMetafieldDefinitionTemplateEdgeProjection<StandardMetafieldDefinitionTemplateConnectionProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public StandardMetafieldDefinitionTemplateProjection<StandardMetafieldDefinitionTemplateConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     StandardMetafieldDefinitionTemplateProjection<StandardMetafieldDefinitionTemplateConnectionProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<StandardMetafieldDefinitionTemplateConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<StandardMetafieldDefinitionTemplateConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
