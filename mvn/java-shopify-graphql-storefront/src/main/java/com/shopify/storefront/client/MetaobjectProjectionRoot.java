package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectProjectionRoot() {
    super(null, null, java.util.Optional.of("Metaobject"));
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> field(
      ) {
    MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("field", projection);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> field(
      String key) {
    MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("field", projection);
    getInputArguments().computeIfAbsent("field", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("field").add(keyArg);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> fields(
      ) {
    MetaobjectFieldProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectFieldProjection<>(this, this);    
    getFields().put("fields", projection);
    return projection;
  }

  public MetaobjectSEOProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> seo(
      ) {
    MetaobjectSEOProjection<MetaobjectProjectionRoot<PARENT, ROOT>, MetaobjectProjectionRoot<PARENT, ROOT>> projection = new MetaobjectSEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetaobjectProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
