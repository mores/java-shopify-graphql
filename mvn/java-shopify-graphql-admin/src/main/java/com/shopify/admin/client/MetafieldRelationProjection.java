package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldRelationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldRelationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldRelation"));
  }

  public MetafieldRelationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldReferencerProjection<MetafieldRelationProjection<PARENT, ROOT>, ROOT> referencer(
      ) {
     MetafieldReferencerProjection<MetafieldRelationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferencerProjection<>(this, getRoot());
     getFields().put("referencer", projection);
     return projection;
  }

  public MetafieldReferenceProjection<MetafieldRelationProjection<PARENT, ROOT>, ROOT> target() {
     MetafieldReferenceProjection<MetafieldRelationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceProjection<>(this, getRoot());
     getFields().put("target", projection);
     return projection;
  }

  public MetafieldRelationProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldRelationProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetafieldRelationProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }
}
