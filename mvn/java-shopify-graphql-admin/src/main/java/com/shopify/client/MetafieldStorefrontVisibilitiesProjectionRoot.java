package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldStorefrontVisibilitiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldStorefrontVisibilitiesProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldStorefrontVisibilityConnection"));
  }

  public MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldStorefrontVisibilityEdgeProjection<MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MetafieldStorefrontVisibilityEdgeProjection<MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>> projection = new MetafieldStorefrontVisibilityEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MetafieldStorefrontVisibilityProjection<MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MetafieldStorefrontVisibilityProjection<MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>> projection = new MetafieldStorefrontVisibilityProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilitiesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
