package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PublicationResourceOperationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PublicationResourceOperationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PublicationResourceOperation"));
  }

  public PublicationResourceOperationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RowCountProjection<PublicationResourceOperationFragmentProjection<PARENT, ROOT>, ROOT> rowCount(
      ) {
     RowCountProjection<PublicationResourceOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new RowCountProjection<>(this, getRoot());
     getFields().put("rowCount", projection);
     return projection;
  }

  public ResourceOperationStatusProjection<PublicationResourceOperationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ResourceOperationStatusProjection<PublicationResourceOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public PublicationResourceOperationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PublicationResourceOperationFragmentProjection<PARENT, ROOT> processedRowCount() {
    getFields().put("processedRowCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PublicationResourceOperation {");
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
