package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchQuerySuggestionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchQuerySuggestionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SearchQuerySuggestion"));
  }

  public SearchQuerySuggestionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SearchQuerySuggestionProjection<PARENT, ROOT> styledText() {
    getFields().put("styledText", null);
    return this;
  }

  public SearchQuerySuggestionProjection<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }

  public SearchQuerySuggestionProjection<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }
}
