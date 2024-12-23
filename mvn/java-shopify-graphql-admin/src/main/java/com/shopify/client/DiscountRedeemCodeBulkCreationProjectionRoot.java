package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DiscountRedeemCodeBulkCreationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeBulkCreationProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountRedeemCodeBulkCreation"));
  }

  public DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationCodeConnectionProjection<DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>> codes(
      ) {
    DiscountRedeemCodeBulkCreationCodeConnectionProjection<DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>> projection = new DiscountRedeemCodeBulkCreationCodeConnectionProjection<>(this, this);    
    getFields().put("codes", projection);
    return projection;
  }

  public DiscountRedeemCodeBulkCreationCodeConnectionProjection<DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>> codes(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountRedeemCodeBulkCreationCodeConnectionProjection<DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>> projection = new DiscountRedeemCodeBulkCreationCodeConnectionProjection<>(this, this);    
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

  public DiscountCodeNodeProjection<DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>> discountCode(
      ) {
    DiscountCodeNodeProjection<DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("discountCode", projection);
    return projection;
  }

  public DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT> codesCount() {
    getFields().put("codesCount", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT> failedCount() {
    getFields().put("failedCount", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjectionRoot<PARENT, ROOT> importedCount() {
    getFields().put("importedCount", null);
    return this;
  }
}
