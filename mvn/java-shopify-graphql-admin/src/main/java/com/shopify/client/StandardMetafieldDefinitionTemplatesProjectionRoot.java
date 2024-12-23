package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetafieldDefinitionTemplatesProjectionRoot() {
    super(null, null, java.util.Optional.of("StandardMetafieldDefinitionTemplateConnection"));
  }

  public StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StandardMetafieldDefinitionTemplateEdgeProjection<StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    StandardMetafieldDefinitionTemplateEdgeProjection<StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>> projection = new StandardMetafieldDefinitionTemplateEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public StandardMetafieldDefinitionTemplateProjection<StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    StandardMetafieldDefinitionTemplateProjection<StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>> projection = new StandardMetafieldDefinitionTemplateProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionTemplatesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
