package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MarketRelationshipFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketRelationshipFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRelationship"));
  }

  public MarketRelationshipFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketRelationshipFragmentProjection<PARENT, ROOT>, ROOT> childMarket() {
     MarketProjection<MarketRelationshipFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("childMarket", projection);
     return projection;
  }

  public MarketProjection<MarketRelationshipFragmentProjection<PARENT, ROOT>, ROOT> parentMarket() {
     MarketProjection<MarketRelationshipFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("parentMarket", projection);
     return projection;
  }

  public MarketRelationshipFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MarketRelationship {");
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
