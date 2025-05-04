package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class TaxonomyCategoryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyCategoryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyCategory"));
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryAttributeConnectionProjection<TaxonomyCategoryProjection<PARENT, ROOT>, ROOT> attributes(
      ) {
     TaxonomyCategoryAttributeConnectionProjection<TaxonomyCategoryProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryAttributeConnectionProjection<>(this, getRoot());
     getFields().put("attributes", projection);
     return projection;
  }

  public TaxonomyCategoryAttributeConnectionProjection<TaxonomyCategoryProjection<PARENT, ROOT>, ROOT> attributes(
      Integer first, String after, Integer last, String before) {
    TaxonomyCategoryAttributeConnectionProjection<TaxonomyCategoryProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryAttributeConnectionProjection<>(this, getRoot());    
    getFields().put("attributes", projection);
    getInputArguments().computeIfAbsent("attributes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("attributes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("attributes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("attributes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("attributes").add(beforeArg);
    return projection;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> ancestorIds() {
    getFields().put("ancestorIds", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> childrenIds() {
    getFields().put("childrenIds", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> fullName() {
    getFields().put("fullName", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> isArchived() {
    getFields().put("isArchived", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> isLeaf() {
    getFields().put("isLeaf", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> isRoot() {
    getFields().put("isRoot", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> level() {
    getFields().put("level", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public TaxonomyCategoryProjection<PARENT, ROOT> parentId() {
    getFields().put("parentId", null);
    return this;
  }
}
