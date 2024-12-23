package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilitiesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilitiesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilities"));
  }

  public MetaobjectCapabilitiesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilitiesOnlineStoreProjection<MetaobjectCapabilitiesProjection<PARENT, ROOT>, ROOT> onlineStore(
      ) {
     MetaobjectCapabilitiesOnlineStoreProjection<MetaobjectCapabilitiesProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilitiesOnlineStoreProjection<>(this, getRoot());
     getFields().put("onlineStore", projection);
     return projection;
  }

  public MetaobjectCapabilitiesPublishableProjection<MetaobjectCapabilitiesProjection<PARENT, ROOT>, ROOT> publishable(
      ) {
     MetaobjectCapabilitiesPublishableProjection<MetaobjectCapabilitiesProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilitiesPublishableProjection<>(this, getRoot());
     getFields().put("publishable", projection);
     return projection;
  }

  public MetaobjectCapabilitiesRenderableProjection<MetaobjectCapabilitiesProjection<PARENT, ROOT>, ROOT> renderable(
      ) {
     MetaobjectCapabilitiesRenderableProjection<MetaobjectCapabilitiesProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilitiesRenderableProjection<>(this, getRoot());
     getFields().put("renderable", projection);
     return projection;
  }

  public MetaobjectCapabilitiesTranslatableProjection<MetaobjectCapabilitiesProjection<PARENT, ROOT>, ROOT> translatable(
      ) {
     MetaobjectCapabilitiesTranslatableProjection<MetaobjectCapabilitiesProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilitiesTranslatableProjection<>(this, getRoot());
     getFields().put("translatable", projection);
     return projection;
  }
}
