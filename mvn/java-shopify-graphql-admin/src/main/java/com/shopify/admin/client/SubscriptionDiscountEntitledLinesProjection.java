package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionDiscountEntitledLinesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDiscountEntitledLinesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDiscountEntitledLines"));
  }

  public SubscriptionDiscountEntitledLinesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDiscountEntitledLinesProjection<PARENT, ROOT>, ROOT> lines(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionDiscountEntitledLinesProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDiscountEntitledLinesProjection<PARENT, ROOT>, ROOT> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDiscountEntitledLinesProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
    getFields().put("lines", projection);
    getInputArguments().computeIfAbsent("lines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lines").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountEntitledLinesProjection<PARENT, ROOT> all() {
    getFields().put("all", null);
    return this;
  }
}
