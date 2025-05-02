package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Metaobject"));
  }

  public MetaobjectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> field() {
     MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("field", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> field(String key) {
    MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());    
    getFields().put("field", projection);
    getInputArguments().computeIfAbsent("field", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("field").add(keyArg);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> fields() {
     MetaobjectFieldProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("fields", projection);
     return projection;
  }

  public MetaobjectSEOProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> seo() {
     MetaobjectSEOProjection<MetaobjectProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectSEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public MetaobjectProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetaobjectProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
