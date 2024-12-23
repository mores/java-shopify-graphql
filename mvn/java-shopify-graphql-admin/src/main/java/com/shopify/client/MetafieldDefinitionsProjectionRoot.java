package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionsProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDefinitionConnection"));
  }

  public MetafieldDefinitionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionEdgeProjection<MetafieldDefinitionsProjectionRoot<PARENT, ROOT>, MetafieldDefinitionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MetafieldDefinitionEdgeProjection<MetafieldDefinitionsProjectionRoot<PARENT, ROOT>, MetafieldDefinitionsProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MetafieldDefinitionProjection<MetafieldDefinitionsProjectionRoot<PARENT, ROOT>, MetafieldDefinitionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MetafieldDefinitionProjection<MetafieldDefinitionsProjectionRoot<PARENT, ROOT>, MetafieldDefinitionsProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MetafieldDefinitionsProjectionRoot<PARENT, ROOT>, MetafieldDefinitionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MetafieldDefinitionsProjectionRoot<PARENT, ROOT>, MetafieldDefinitionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
