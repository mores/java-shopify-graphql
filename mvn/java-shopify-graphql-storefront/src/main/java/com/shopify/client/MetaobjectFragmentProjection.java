package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class MetaobjectFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MetaobjectFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Metaobject"));
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> field() {
     MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("field", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> field(
      String key) {
    MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());    
    getFields().put("field", projection);
    getInputArguments().computeIfAbsent("field", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("field").add(keyArg);
    return projection;
  }

  public MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> fields() {
     MetaobjectFieldProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("fields", projection);
     return projection;
  }

  public MetaobjectSEOProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> seo() {
     MetaobjectSEOProjection<MetaobjectFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectSEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetaobjectFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Metaobject {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
