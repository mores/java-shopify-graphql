package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DiscountRedeemCodeBulkCreationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeBulkCreationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountRedeemCodeBulkCreation"));
  }

  public DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationCodeConnectionProjection<DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT>, ROOT> codes(
      ) {
     DiscountRedeemCodeBulkCreationCodeConnectionProjection<DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationCodeConnectionProjection<>(this, getRoot());
     getFields().put("codes", projection);
     return projection;
  }

  public DiscountRedeemCodeBulkCreationCodeConnectionProjection<DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT>, ROOT> codes(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountRedeemCodeBulkCreationCodeConnectionProjection<DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationCodeConnectionProjection<>(this, getRoot());    
    getFields().put("codes", projection);
    getInputArguments().computeIfAbsent("codes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("codes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("codes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("codes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("codes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("codes").add(reverseArg);
    return projection;
  }

  public DiscountCodeNodeProjection<DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT>, ROOT> discountCode(
      ) {
     DiscountCodeNodeProjection<DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());
     getFields().put("discountCode", projection);
     return projection;
  }

  public DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT> codesCount() {
    getFields().put("codesCount", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT> failedCount() {
    getFields().put("failedCount", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjection<PARENT, ROOT> importedCount() {
    getFields().put("importedCount", null);
    return this;
  }
}
