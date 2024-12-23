package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CountryHarmonizedSystemCodeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CountryHarmonizedSystemCodeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CountryHarmonizedSystemCodeEdge"));
  }

  public CountryHarmonizedSystemCodeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryHarmonizedSystemCodeProjection<CountryHarmonizedSystemCodeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CountryHarmonizedSystemCodeProjection<CountryHarmonizedSystemCodeEdgeProjection<PARENT, ROOT>, ROOT> projection = new CountryHarmonizedSystemCodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CountryHarmonizedSystemCodeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
