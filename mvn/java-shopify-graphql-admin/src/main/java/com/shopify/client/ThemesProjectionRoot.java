package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemesProjectionRoot() {
    super(null, null, java.util.Optional.of("OnlineStoreThemeConnection"));
  }

  public ThemesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeEdgeProjection<ThemesProjectionRoot<PARENT, ROOT>, ThemesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    OnlineStoreThemeEdgeProjection<ThemesProjectionRoot<PARENT, ROOT>, ThemesProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public OnlineStoreThemeProjection<ThemesProjectionRoot<PARENT, ROOT>, ThemesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    OnlineStoreThemeProjection<ThemesProjectionRoot<PARENT, ROOT>, ThemesProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ThemesProjectionRoot<PARENT, ROOT>, ThemesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ThemesProjectionRoot<PARENT, ROOT>, ThemesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
