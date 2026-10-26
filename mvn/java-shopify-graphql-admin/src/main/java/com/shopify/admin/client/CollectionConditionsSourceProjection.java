package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CollectionConditionsSourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionsSource"));
  }

  public CollectionConditionsSourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public CollectionSourceExclusionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> exclusion(
      ) {
     CollectionSourceExclusionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceExclusionProjection<>(this, getRoot());
     getFields().put("exclusion", projection);
     return projection;
  }

  public CollectionSourceInclusionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> inclusion(
      ) {
     CollectionSourceInclusionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionProjection<>(this, getRoot());
     getFields().put("inclusion", projection);
     return projection;
  }

  public ProductConnectionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> products(
      ) {
     ProductConnectionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("products").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> productsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductConnectionProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("products").add(reverseArg);
    return projection;
  }

  public CollectionSourceTargetTypeProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     CollectionSourceTargetTypeProjection<CollectionConditionsSourceProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public CollectionConditionsSourceProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionConditionsSourceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionConditionsSourceProjection<PARENT, ROOT> shareable() {
    getFields().put("shareable", null);
    return this;
  }

  public CollectionConditionsSourceProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
