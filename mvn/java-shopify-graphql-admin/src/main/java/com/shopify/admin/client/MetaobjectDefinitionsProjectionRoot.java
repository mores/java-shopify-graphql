package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectDefinitionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDefinitionsProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectDefinitionConnection"));
  }

  public MetaobjectDefinitionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectDefinitionEdgeProjection<MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MetaobjectDefinitionEdgeProjection<MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>> projection = new MetaobjectDefinitionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MetaobjectDefinitionProjection<MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MetaobjectDefinitionProjection<MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>> projection = new MetaobjectDefinitionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
