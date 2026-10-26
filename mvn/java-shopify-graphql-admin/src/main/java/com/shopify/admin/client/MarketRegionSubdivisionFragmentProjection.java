package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MarketRegionSubdivisionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketRegionSubdivisionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRegionSubdivision"));
  }

  public MarketRegionSubdivisionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRegionSubdivisionCountryProjection<MarketRegionSubdivisionFragmentProjection<PARENT, ROOT>, ROOT> country(
      ) {
     MarketRegionSubdivisionCountryProjection<MarketRegionSubdivisionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionSubdivisionCountryProjection<>(this, getRoot());
     getFields().put("country", projection);
     return projection;
  }

  public MarketRegionSubdivisionFragmentProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public MarketRegionSubdivisionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketRegionSubdivisionFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MarketRegionSubdivision {");
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
