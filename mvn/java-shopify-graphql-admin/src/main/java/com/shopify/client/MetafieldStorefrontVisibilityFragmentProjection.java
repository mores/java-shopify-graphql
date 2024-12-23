package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MetafieldStorefrontVisibilityFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MetafieldStorefrontVisibilityFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldStorefrontVisibility"));
  }

  public MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldOwnerTypeProjection<MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     MetafieldOwnerTypeProjection<MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldStorefrontVisibilityFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MetafieldStorefrontVisibility {");
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
