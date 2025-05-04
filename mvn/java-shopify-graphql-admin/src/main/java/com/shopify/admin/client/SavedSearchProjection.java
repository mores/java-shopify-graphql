package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SavedSearchProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SavedSearchProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SavedSearch"));
  }

  public SavedSearchProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SearchFilterProjection<SavedSearchProjection<PARENT, ROOT>, ROOT> filters() {
     SearchFilterProjection<SavedSearchProjection<PARENT, ROOT>, ROOT> projection = new SearchFilterProjection<>(this, getRoot());
     getFields().put("filters", projection);
     return projection;
  }

  public SearchResultTypeProjection<SavedSearchProjection<PARENT, ROOT>, ROOT> resourceType() {
     SearchResultTypeProjection<SavedSearchProjection<PARENT, ROOT>, ROOT> projection = new SearchResultTypeProjection<>(this, getRoot());
     getFields().put("resourceType", projection);
     return projection;
  }

  public SavedSearchProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SavedSearchProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public SavedSearchProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SavedSearchProjection<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }

  public SavedSearchProjection<PARENT, ROOT> searchTerms() {
    getFields().put("searchTerms", null);
    return this;
  }
}
