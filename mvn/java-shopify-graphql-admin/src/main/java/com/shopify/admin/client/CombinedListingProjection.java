package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CombinedListingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CombinedListingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CombinedListing"));
  }

  public CombinedListingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CombinedListingChildConnectionProjection<CombinedListingProjection<PARENT, ROOT>, ROOT> combinedListingChildren(
      ) {
     CombinedListingChildConnectionProjection<CombinedListingProjection<PARENT, ROOT>, ROOT> projection = new CombinedListingChildConnectionProjection<>(this, getRoot());
     getFields().put("combinedListingChildren", projection);
     return projection;
  }

  public CombinedListingChildConnectionProjection<CombinedListingProjection<PARENT, ROOT>, ROOT> combinedListingChildren(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CombinedListingChildConnectionProjection<CombinedListingProjection<PARENT, ROOT>, ROOT> projection = new CombinedListingChildConnectionProjection<>(this, getRoot());    
    getFields().put("combinedListingChildren", projection);
    getInputArguments().computeIfAbsent("combinedListingChildren", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("combinedListingChildren").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("combinedListingChildren").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("combinedListingChildren").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("combinedListingChildren").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("combinedListingChildren").add(reverseArg);
    return projection;
  }

  public ProductProjection<CombinedListingProjection<PARENT, ROOT>, ROOT> parentProduct() {
     ProductProjection<CombinedListingProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("parentProduct", projection);
     return projection;
  }
}
