package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class TaxonomyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TaxonomyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Taxonomy"));
  }

  public TaxonomyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryConnectionProjection<TaxonomyProjection<PARENT, ROOT>, ROOT> categories() {
     TaxonomyCategoryConnectionProjection<TaxonomyProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryConnectionProjection<>(this, getRoot());
     getFields().put("categories", projection);
     return projection;
  }

  public TaxonomyCategoryConnectionProjection<TaxonomyProjection<PARENT, ROOT>, ROOT> categories(
      String search, String childrenOf, String siblingsOf, String descendantsOf, Integer first,
      String after, Integer last, String before) {
    TaxonomyCategoryConnectionProjection<TaxonomyProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryConnectionProjection<>(this, getRoot());    
    getFields().put("categories", projection);
    getInputArguments().computeIfAbsent("categories", k -> new ArrayList<>());                      
    InputArgument searchArg = new InputArgument("search", search);
    getInputArguments().get("categories").add(searchArg);
    InputArgument childrenOfArg = new InputArgument("childrenOf", childrenOf);
    getInputArguments().get("categories").add(childrenOfArg);
    InputArgument siblingsOfArg = new InputArgument("siblingsOf", siblingsOf);
    getInputArguments().get("categories").add(siblingsOfArg);
    InputArgument descendantsOfArg = new InputArgument("descendantsOf", descendantsOf);
    getInputArguments().get("categories").add(descendantsOfArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("categories").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("categories").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("categories").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("categories").add(beforeArg);
    return projection;
  }
}
