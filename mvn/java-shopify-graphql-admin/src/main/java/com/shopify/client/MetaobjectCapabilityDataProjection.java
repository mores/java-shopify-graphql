package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilityDataProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilityDataProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilityData"));
  }

  public MetaobjectCapabilityDataProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectCapabilityDataOnlineStoreProjection<MetaobjectCapabilityDataProjection<PARENT, ROOT>, ROOT> onlineStore(
      ) {
     MetaobjectCapabilityDataOnlineStoreProjection<MetaobjectCapabilityDataProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilityDataOnlineStoreProjection<>(this, getRoot());
     getFields().put("onlineStore", projection);
     return projection;
  }

  public MetaobjectCapabilityDataPublishableProjection<MetaobjectCapabilityDataProjection<PARENT, ROOT>, ROOT> publishable(
      ) {
     MetaobjectCapabilityDataPublishableProjection<MetaobjectCapabilityDataProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectCapabilityDataPublishableProjection<>(this, getRoot());
     getFields().put("publishable", projection);
     return projection;
  }
}
