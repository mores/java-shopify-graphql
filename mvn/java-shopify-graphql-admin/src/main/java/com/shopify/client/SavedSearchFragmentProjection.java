package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SavedSearchFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SavedSearchFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SavedSearch"));
  }

  public SavedSearchFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SearchFilterProjection<SavedSearchFragmentProjection<PARENT, ROOT>, ROOT> filters() {
     SearchFilterProjection<SavedSearchFragmentProjection<PARENT, ROOT>, ROOT> projection = new SearchFilterProjection<>(this, getRoot());
     getFields().put("filters", projection);
     return projection;
  }

  public SearchResultTypeProjection<SavedSearchFragmentProjection<PARENT, ROOT>, ROOT> resourceType(
      ) {
     SearchResultTypeProjection<SavedSearchFragmentProjection<PARENT, ROOT>, ROOT> projection = new SearchResultTypeProjection<>(this, getRoot());
     getFields().put("resourceType", projection);
     return projection;
  }

  public SavedSearchFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SavedSearchFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public SavedSearchFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SavedSearchFragmentProjection<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }

  public SavedSearchFragmentProjection<PARENT, ROOT> searchTerms() {
    getFields().put("searchTerms", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SavedSearch {");
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
