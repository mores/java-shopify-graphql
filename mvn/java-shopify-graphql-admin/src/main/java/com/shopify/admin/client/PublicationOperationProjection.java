package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PublicationOperation"));
  }

  public PublicationOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AddAllProductsOperationFragmentProjection<PublicationOperationProjection<PARENT, ROOT>, ROOT> onAddAllProductsOperation(
      ) {
    AddAllProductsOperationFragmentProjection<PublicationOperationProjection<PARENT, ROOT>, ROOT> fragment = new AddAllProductsOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CatalogCsvOperationFragmentProjection<PublicationOperationProjection<PARENT, ROOT>, ROOT> onCatalogCsvOperation(
      ) {
    CatalogCsvOperationFragmentProjection<PublicationOperationProjection<PARENT, ROOT>, ROOT> fragment = new CatalogCsvOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationResourceOperationFragmentProjection<PublicationOperationProjection<PARENT, ROOT>, ROOT> onPublicationResourceOperation(
      ) {
    PublicationResourceOperationFragmentProjection<PublicationOperationProjection<PARENT, ROOT>, ROOT> fragment = new PublicationResourceOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
