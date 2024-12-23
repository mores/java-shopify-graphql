package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CountryHarmonizedSystemCodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CountryHarmonizedSystemCodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CountryHarmonizedSystemCodeConnection"));
  }

  public CountryHarmonizedSystemCodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryHarmonizedSystemCodeEdgeProjection<CountryHarmonizedSystemCodeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CountryHarmonizedSystemCodeEdgeProjection<CountryHarmonizedSystemCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new CountryHarmonizedSystemCodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CountryHarmonizedSystemCodeProjection<CountryHarmonizedSystemCodeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CountryHarmonizedSystemCodeProjection<CountryHarmonizedSystemCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new CountryHarmonizedSystemCodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CountryHarmonizedSystemCodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CountryHarmonizedSystemCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
