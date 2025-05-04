package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPresencesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPresencesProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketWebPresenceConnection"));
  }

  public WebPresencesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketWebPresenceEdgeProjection<WebPresencesProjectionRoot<PARENT, ROOT>, WebPresencesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MarketWebPresenceEdgeProjection<WebPresencesProjectionRoot<PARENT, ROOT>, WebPresencesProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MarketWebPresenceProjection<WebPresencesProjectionRoot<PARENT, ROOT>, WebPresencesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MarketWebPresenceProjection<WebPresencesProjectionRoot<PARENT, ROOT>, WebPresencesProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<WebPresencesProjectionRoot<PARENT, ROOT>, WebPresencesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<WebPresencesProjectionRoot<PARENT, ROOT>, WebPresencesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
