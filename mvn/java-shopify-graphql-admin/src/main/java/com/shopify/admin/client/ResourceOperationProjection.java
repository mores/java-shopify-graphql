package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourceOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourceOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourceOperation"));
  }

  public ResourceOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RowCountProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> rowCount() {
     RowCountProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> projection = new RowCountProjection<>(this, getRoot());
     getFields().put("rowCount", projection);
     return projection;
  }

  public ResourceOperationStatusProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ResourceOperationStatusProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ResourceOperationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ResourceOperationProjection<PARENT, ROOT> processedRowCount() {
    getFields().put("processedRowCount", null);
    return this;
  }

  public AddAllProductsOperationFragmentProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> onAddAllProductsOperation(
      ) {
    AddAllProductsOperationFragmentProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> fragment = new AddAllProductsOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CatalogCsvOperationFragmentProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> onCatalogCsvOperation(
      ) {
    CatalogCsvOperationFragmentProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> fragment = new CatalogCsvOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationResourceOperationFragmentProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> onPublicationResourceOperation(
      ) {
    PublicationResourceOperationFragmentProjection<ResourceOperationProjection<PARENT, ROOT>, ROOT> fragment = new PublicationResourceOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
