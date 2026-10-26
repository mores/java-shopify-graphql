package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSource"));
  }

  public CollectionSourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<CollectionSourceProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<CollectionSourceProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public CollectionSourceProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionSourceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CollectionConditionsSourceFragmentProjection<CollectionSourceProjection<PARENT, ROOT>, ROOT> onCollectionConditionsSource(
      ) {
    CollectionConditionsSourceFragmentProjection<CollectionSourceProjection<PARENT, ROOT>, ROOT> fragment = new CollectionConditionsSourceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSubCollectionsSourceFragmentProjection<CollectionSourceProjection<PARENT, ROOT>, ROOT> onCollectionSubCollectionsSource(
      ) {
    CollectionSubCollectionsSourceFragmentProjection<CollectionSourceProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSubCollectionsSourceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
